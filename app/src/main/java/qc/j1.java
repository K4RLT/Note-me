package qc;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f23827a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f23828b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f23829c;

    public j1(k1 k1Var, m1 m1Var, l1 l1Var) {
        this.f23827a = k1Var;
        this.f23828b = m1Var;
        this.f23829c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j1) {
                j1 j1Var = (j1) obj;
                if (this.f23827a.equals(j1Var.f23827a) && this.f23828b.equals(j1Var.f23828b) && this.f23829c.equals(j1Var.f23829c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f23827a.hashCode() ^ 1000003) * 1000003) ^ this.f23828b.hashCode()) * 1000003) ^ this.f23829c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f23827a + ", osData=" + this.f23828b + ", deviceData=" + this.f23829c + "}";
    }
}
