package c3;
import p.a;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3747a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3748b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3749c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3750d;
    public final boolean e;

    public b0(boolean z3, c0 c0Var, boolean z9) {
        int i;
        boolean z10;
        r0.c0 c0Var2 = n.f3795a;
        if (!z3) {
            i = 262152;
        } else {
            i = 262144;
        }
        i = c0Var == c0.f3758v ? i | 8192 : i;
        i = z9 ? i : i | 512;
        if (c0Var == c0.f3757u) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3747a = i;
        this.f3748b = z10;
        this.f3749c = true;
        this.f3750d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f3747a == b0Var.f3747a && this.f3748b == b0Var.f3748b && this.f3749c == b0Var.f3749c && this.f3750d == b0Var.f3750d && this.e == b0Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + a.c(a.c(a.c(a.c(this.f3747a * 31, 31, this.f3748b), 31, this.f3749c), 31, this.f3750d), 31, this.e);
    }

    public b0(int i, boolean z3) {
        this((i & 1) != 0 ? false : z3, c0.f3757u, true);
    }
}
