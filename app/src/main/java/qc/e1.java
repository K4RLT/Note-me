package qc;

/* loaded from: classes.dex */
public final class e1 extends g2 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f23758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23759b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23760c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23761d;

    public e1(f1 f1Var, String str, String str2, long j10) {
        this.f23758a = f1Var;
        this.f23759b = str;
        this.f23760c = str2;
        this.f23761d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            e1 e1Var = (e1) ((g2) obj);
            if (this.f23758a.equals(e1Var.f23758a) && this.f23759b.equals(e1Var.f23759b) && this.f23760c.equals(e1Var.f23760c) && this.f23761d == e1Var.f23761d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f23758a.hashCode() ^ 1000003) * 1000003) ^ this.f23759b.hashCode()) * 1000003) ^ this.f23760c.hashCode()) * 1000003;
        long j10 = this.f23761d;
        return hashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f23758a + ", parameterKey=" + this.f23759b + ", parameterValue=" + this.f23760c + ", templateVersion=" + this.f23761d + "}";
    }
}
