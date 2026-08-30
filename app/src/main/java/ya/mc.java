package ya;
import a0.a0;
import t.z0;

/* loaded from: classes.dex */
public abstract class mc {
    public static final int a(a0 a0Var, z0 z0Var) {
        long j10;
        if (z0Var == z0.f25597u) {
            j10 = a0Var.f15o & 4294967295L;
        } else {
            j10 = a0Var.f15o >> 32;
        }
        return (int) j10;
    }
}
