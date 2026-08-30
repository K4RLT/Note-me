package ya;
import d1.r;
import k1.n;
import k1.p0;
import k1.r0;

import androidx.compose.foundation.BorderModifierNodeElement;

/* loaded from: classes.dex */
public abstract class sa {
    public static final r a(r rVar, float f10, long j10, p0 p0Var) {
        return b(rVar, f10, new r0(j10), p0Var);
    }

    public static final r b(r rVar, float f10, n nVar, p0 p0Var) {
        return rVar.d(new BorderModifierNodeElement(f10, nVar, p0Var));
    }

    public static final long c(long j10, float f10) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) - f10);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }
}
