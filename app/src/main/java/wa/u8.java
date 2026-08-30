package wa;

/* loaded from: classes.dex */
public abstract class u8 {
    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
