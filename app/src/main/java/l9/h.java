package l9;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f20049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20050b;

    /* renamed from: c, reason: collision with root package name */
    public final double f20051c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20052d;

    public h(int i, int i10, double d2, boolean z3) {
        this.f20049a = i;
        this.f20050b = i10;
        this.f20051c = d2;
        this.f20052d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f20049a == hVar.f20049a && this.f20050b == hVar.f20050b && Double.doubleToLongBits(this.f20051c) == Double.doubleToLongBits(hVar.f20051c) && this.f20052d == hVar.f20052d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        double d2 = this.f20051c;
        long doubleToLongBits = Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32);
        if (true != this.f20052d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((int) doubleToLongBits) ^ ((((this.f20049a ^ 1000003) * 1000003) ^ this.f20050b) * 1000003)) * 1000003) ^ i;
    }

    public final String toString() {
        int i = this.f20049a;
        int length = String.valueOf(i).length();
        int i10 = this.f20050b;
        int length2 = String.valueOf(i10).length();
        double d2 = this.f20051c;
        int length3 = String.valueOf(d2).length();
        boolean z3 = this.f20052d;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z3).length() + 1);
        g3.a.r(i, i10, "PingStrategy{maxAttempts=", ", initialBackoffMs=", sb2);
        sb2.append(", backoffMultiplier=");
        sb2.append(d2);
        sb2.append(", bufferAfterMaxAttempts=");
        sb2.append(z3);
        sb2.append("}");
        return sb2.toString();
    }
}
