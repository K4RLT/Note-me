package wa;
import b2.l;
import b2.s;
import g1.f;

/* loaded from: classes.dex */
public abstract class r6 {
    public static final boolean a(f fVar, long j10) {
        if (fVar.f15688u.H) {
            s sVar = (s) l.u(fVar).Z.f1458x;
            if (sVar.f1589k0.H) {
                long W = sVar.W(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (W >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (W & 4294967295L));
                long j11 = fVar.K;
                float f10 = ((int) (j11 >> 32)) + intBitsToFloat;
                float f11 = ((int) (j11 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f10) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f11) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
