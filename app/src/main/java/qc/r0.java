package qc;

import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends a2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23917a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f23918b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f23919c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f23920d;
    public final List e;

    public r0(List list, t0 t0Var, o1 o1Var, u0 u0Var, List list2) {
        this.f23917a = list;
        this.f23918b = t0Var;
        this.f23919c = o1Var;
        this.f23920d = u0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a2) {
                a2 a2Var = (a2) obj;
                List list = this.f23917a;
                if (list == null) {
                    if (((r0) a2Var).f23917a != null) {
                        return false;
                    }
                } else if (!list.equals(((r0) a2Var).f23917a)) {
                    return false;
                }
                w1 w1Var = this.f23918b;
                if (w1Var == null) {
                    if (((r0) a2Var).f23918b != null) {
                        return false;
                    }
                } else if (!w1Var.equals(((r0) a2Var).f23918b)) {
                    return false;
                }
                o1 o1Var = this.f23919c;
                if (o1Var == null) {
                    if (((r0) a2Var).f23919c != null) {
                        return false;
                    }
                } else if (!o1Var.equals(((r0) a2Var).f23919c)) {
                    return false;
                }
                r0 r0Var = (r0) a2Var;
                if (this.f23920d.equals(r0Var.f23920d) && this.e.equals(r0Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        List list = this.f23917a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        w1 w1Var = this.f23918b;
        if (w1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = w1Var.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        o1 o1Var = this.f23919c;
        if (o1Var != null) {
            i = o1Var.hashCode();
        }
        return ((((i ^ i11) * 1000003) ^ this.f23920d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f23917a + ", exception=" + this.f23918b + ", appExitInfo=" + this.f23919c + ", signal=" + this.f23920d + ", binaries=" + this.e + "}";
    }
}
