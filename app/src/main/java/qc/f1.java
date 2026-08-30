package qc;

/* loaded from: classes.dex */
public final class f1 extends f2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23767a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23768b;

    public f1(String str, String str2) {
        this.f23767a = str;
        this.f23768b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            f1 f1Var = (f1) ((f2) obj);
            if (this.f23767a.equals(f1Var.f23767a) && this.f23768b.equals(f1Var.f23768b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23767a.hashCode() ^ 1000003) * 1000003) ^ this.f23768b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f23767a);
        sb2.append(", variantId=");
        return a5.a.k(sb2, this.f23768b, "}");
    }
}
