package lb;
import p.a;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20078b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20079c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20080d;
    public final int e;

    public a0(int i, String str, long j10, long j11, int i10) {
        this.f20077a = i;
        this.f20078b = str;
        this.f20079c = j10;
        this.f20080d = j11;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f20077a == a0Var.f20077a) {
                String str = a0Var.f20078b;
                String str2 = this.f20078b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f20079c == a0Var.f20079c && this.f20080d == a0Var.f20080d && this.e == a0Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f20078b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f20080d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f20079c;
        return ((((((hashCode ^ ((this.f20077a ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ ((int) j11)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(this.f20077a);
        sb2.append(", filePath=");
        sb2.append(this.f20078b);
        sb2.append(", fileOffset=");
        sb2.append(this.f20079c);
        sb2.append(", remainingBytes=");
        sb2.append(this.f20080d);
        sb2.append(", previousChunk=");
        return a.j(this.e, "}", sb2);
    }
}
