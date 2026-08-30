package qc;
import p.a;

/* loaded from: classes.dex */
public final class x0 extends y1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23965c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23966d;
    public final int e;

    public x0(int i, long j10, long j11, String str, String str2) {
        this.f23963a = j10;
        this.f23964b = str;
        this.f23965c = str2;
        this.f23966d = j11;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            x0 x0Var = (x0) ((y1) obj);
            if (this.f23963a == x0Var.f23963a && this.f23964b.equals(x0Var.f23964b)) {
                String str = x0Var.f23965c;
                String str2 = this.f23965c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f23966d == x0Var.f23966d && this.e == x0Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f23963a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f23964b.hashCode()) * 1000003;
        String str = this.f23965c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 ^ hashCode) * 1000003;
        long j11 = this.f23966d;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f23963a);
        sb2.append(", symbol=");
        sb2.append(this.f23964b);
        sb2.append(", file=");
        sb2.append(this.f23965c);
        sb2.append(", offset=");
        sb2.append(this.f23966d);
        sb2.append(", importance=");
        return a.j(this.e, "}", sb2);
    }
}
