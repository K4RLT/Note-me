package qc;

/* loaded from: classes.dex */
public final class n0 extends u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23877b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23878c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23879d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23881g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23882h;
    public final String i;

    public n0(int i, String str, int i10, long j10, long j11, boolean z3, int i11, String str2, String str3) {
        this.f23876a = i;
        this.f23877b = str;
        this.f23878c = i10;
        this.f23879d = j10;
        this.e = j11;
        this.f23880f = z3;
        this.f23881g = i11;
        this.f23882h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            n0 n0Var = (n0) ((u1) obj);
            if (this.f23876a == n0Var.f23876a && this.f23877b.equals(n0Var.f23877b) && this.f23878c == n0Var.f23878c && this.f23879d == n0Var.f23879d && this.e == n0Var.e && this.f23880f == n0Var.f23880f && this.f23881g == n0Var.f23881g && this.f23882h.equals(n0Var.f23882h) && this.i.equals(n0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f23876a ^ 1000003) * 1000003) ^ this.f23877b.hashCode()) * 1000003) ^ this.f23878c) * 1000003;
        long j10 = this.f23879d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.e;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f23880f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((i11 ^ i) * 1000003) ^ this.f23881g) * 1000003) ^ this.f23882h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f23876a);
        sb2.append(", model=");
        sb2.append(this.f23877b);
        sb2.append(", cores=");
        sb2.append(this.f23878c);
        sb2.append(", ram=");
        sb2.append(this.f23879d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f23880f);
        sb2.append(", state=");
        sb2.append(this.f23881g);
        sb2.append(", manufacturer=");
        sb2.append(this.f23882h);
        sb2.append(", modelClass=");
        return a5.a.k(sb2, this.i, "}");
    }
}
