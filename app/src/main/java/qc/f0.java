package qc;

/* loaded from: classes.dex */
public final class f0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23766b;

    public f0(String str, String str2) {
        this.f23765a = str;
        this.f23766b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p1) {
                f0 f0Var = (f0) ((p1) obj);
                if (this.f23765a.equals(f0Var.f23765a) && this.f23766b.equals(f0Var.f23766b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f23765a.hashCode() ^ 1000003) * 1000003) ^ this.f23766b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f23765a);
        sb2.append(", value=");
        return a5.a.k(sb2, this.f23766b, "}");
    }
}
