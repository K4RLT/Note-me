package qc;

/* loaded from: classes.dex */
public final class z0 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23979c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23980d;

    public z0(String str, boolean z3, int i, int i10) {
        this.f23977a = str;
        this.f23978b = i;
        this.f23979c = i10;
        this.f23980d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f23977a.equals(z0Var.f23977a) && this.f23978b == z0Var.f23978b && this.f23979c == z0Var.f23979c && this.f23980d == z0Var.f23980d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f23977a.hashCode() ^ 1000003) * 1000003) ^ this.f23978b) * 1000003) ^ this.f23979c) * 1000003;
        if (this.f23980d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f23977a + ", pid=" + this.f23978b + ", importance=" + this.f23979c + ", defaultProcess=" + this.f23980d + "}";
    }
}
