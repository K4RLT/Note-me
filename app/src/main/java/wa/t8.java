package wa;
import j1.d;

/* loaded from: classes.dex */
public abstract class t8 {
    public static final d a(long j10, float f10, float f11, float f12, float f13) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new d(f10, f11, f12, f13, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final boolean b(d dVar) {
        long j10 = dVar.e;
        if ((j10 >>> 32) == (4294967295L & j10) && j10 == dVar.f18771f && j10 == dVar.f18772g && j10 == dVar.f18773h) {
            return true;
        }
        return false;
    }
}
