package qc;

/* loaded from: classes.dex */
public final class u0 extends x1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23943a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23944b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23945c;

    public u0(long j10, String str, String str2) {
        this.f23943a = str;
        this.f23944b = str2;
        this.f23945c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            u0 u0Var = (u0) ((x1) obj);
            if (this.f23943a.equals(u0Var.f23943a) && this.f23944b.equals(u0Var.f23944b) && this.f23945c == u0Var.f23945c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f23943a.hashCode() ^ 1000003) * 1000003) ^ this.f23944b.hashCode()) * 1000003;
        long j10 = this.f23945c;
        return hashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "Signal{name=" + this.f23943a + ", code=" + this.f23944b + ", address=" + this.f23945c + "}";
    }
}
