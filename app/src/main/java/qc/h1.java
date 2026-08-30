package qc;

/* loaded from: classes.dex */
public final class h1 extends j2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23783b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23784c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23785d;

    public h1(String str, int i, String str2, boolean z3) {
        this.f23782a = i;
        this.f23783b = str;
        this.f23784c = str2;
        this.f23785d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            h1 h1Var = (h1) ((j2) obj);
            if (this.f23782a == h1Var.f23782a && this.f23783b.equals(h1Var.f23783b) && this.f23784c.equals(h1Var.f23784c) && this.f23785d == h1Var.f23785d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f23782a ^ 1000003) * 1000003) ^ this.f23783b.hashCode()) * 1000003) ^ this.f23784c.hashCode()) * 1000003;
        if (this.f23785d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f23782a + ", version=" + this.f23783b + ", buildVersion=" + this.f23784c + ", jailbroken=" + this.f23785d + "}";
    }
}
