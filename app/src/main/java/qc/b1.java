package qc;

/* loaded from: classes.dex */
public final class b1 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f23713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23714b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23716d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23717f;

    public b1(Double d2, int i, boolean z3, int i10, long j10, long j11) {
        this.f23713a = d2;
        this.f23714b = i;
        this.f23715c = z3;
        this.f23716d = i10;
        this.e = j10;
        this.f23717f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            Double d2 = this.f23713a;
            if (d2 != null ? d2.equals(((b1) d2Var).f23713a) : ((b1) d2Var).f23713a == null) {
                b1 b1Var = (b1) d2Var;
                if (this.f23714b == b1Var.f23714b && this.f23715c == b1Var.f23715c && this.f23716d == b1Var.f23716d && this.e == b1Var.e && this.f23717f == b1Var.f23717f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Double d2 = this.f23713a;
        if (d2 == null) {
            hashCode = 0;
        } else {
            hashCode = d2.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f23714b) * 1000003;
        if (this.f23715c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i11 = (((i10 ^ i) * 1000003) ^ this.f23716d) * 1000003;
        long j10 = this.e;
        long j11 = this.f23717f;
        return ((i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f23713a + ", batteryVelocity=" + this.f23714b + ", proximityOn=" + this.f23715c + ", orientation=" + this.f23716d + ", ramUsed=" + this.e + ", diskUsed=" + this.f23717f + "}";
    }
}
