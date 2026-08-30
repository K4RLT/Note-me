package k1;
import a0.f0;
import r.c;
import r.d;
import r.i;
import u.a;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class r0 extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f19524a;

    public r0(long j10) {
        this.f19524a = j10;
    }

    @Override // k1.n
    public final void a(float f10, long j10, f0 f0Var) {
        f0Var.F(1.0f);
        long j11 = this.f19524a;
        if (f10 != 1.0f) {
            j11 = c(j11, d(j11) * f10);
        }
        f0Var.H(j11);
        if (((Shader) f0Var.f49d) != null) {
            f0Var.L(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r0) {
                long j10 = ((r0) obj).f19524a;
                int i = r.f19522m;
                if (!pe.a(this.f19524a, j10)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Long.hashCode(this.f19524a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) i(this.f19524a)) + ')';
    }
}
