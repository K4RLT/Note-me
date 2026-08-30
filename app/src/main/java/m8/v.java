package m8;

/* loaded from: classes.dex */
public final class v extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f20754a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f20755b;

    public v(h0 h0Var, g0 g0Var) {
        this.f20754a = h0Var;
        this.f20755b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f20754a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f20754a) : ((v) i0Var).f20754a == null) {
                g0 g0Var = this.f20755b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f20755b) : ((v) i0Var).f20755b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        h0 h0Var = this.f20754a;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        g0 g0Var = this.f20755b;
        if (g0Var != null) {
            i = g0Var.hashCode();
        }
        return i ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20754a + ", mobileSubtype=" + this.f20755b + "}";
    }
}
