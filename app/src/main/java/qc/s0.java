package qc;

/* loaded from: classes.dex */
public final class s0 extends v1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23927a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23928b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23929c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23930d;

    public s0(long j10, long j11, String str, String str2) {
        this.f23927a = j10;
        this.f23928b = j11;
        this.f23929c = str;
        this.f23930d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            s0 s0Var = (s0) ((v1) obj);
            if (this.f23927a == s0Var.f23927a && this.f23928b == s0Var.f23928b && this.f23929c.equals(s0Var.f23929c)) {
                String str = s0Var.f23930d;
                String str2 = this.f23930d;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f23927a;
        long j11 = this.f23928b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f23929c.hashCode()) * 1000003;
        String str = this.f23930d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f23927a);
        sb2.append(", size=");
        sb2.append(this.f23928b);
        sb2.append(", name=");
        sb2.append(this.f23929c);
        sb2.append(", uuid=");
        return a5.a.k(sb2, this.f23930d, "}");
    }
}
