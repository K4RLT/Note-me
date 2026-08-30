package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class or1 {

    /* renamed from: j, reason: collision with root package name */
    public static final or1 f9197j = new or1(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final or1 f9198k = new or1(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final or1 f9199l = new or1(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final or1 f9200m = new or1(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f9201a;

    /* renamed from: b, reason: collision with root package name */
    public final double f9202b;

    /* renamed from: c, reason: collision with root package name */
    public final double f9203c;

    /* renamed from: d, reason: collision with root package name */
    public final double f9204d;
    public final double e;

    /* renamed from: f, reason: collision with root package name */
    public final double f9205f;

    /* renamed from: g, reason: collision with root package name */
    public final double f9206g;

    /* renamed from: h, reason: collision with root package name */
    public final double f9207h;
    public final double i;

    public or1(double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f9201a = d13;
        this.f9202b = d14;
        this.f9203c = d15;
        this.f9204d = d2;
        this.e = d10;
        this.f9205f = d11;
        this.f9206g = d12;
        this.f9207h = d16;
        this.i = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || or1.class != obj.getClass()) {
            return false;
        }
        or1 or1Var = (or1) obj;
        if (Double.compare(or1Var.f9204d, this.f9204d) == 0 && Double.compare(or1Var.e, this.e) == 0 && Double.compare(or1Var.f9205f, this.f9205f) == 0 && Double.compare(or1Var.f9206g, this.f9206g) == 0 && Double.compare(or1Var.f9207h, this.f9207h) == 0 && Double.compare(or1Var.i, this.i) == 0 && Double.compare(or1Var.f9201a, this.f9201a) == 0 && Double.compare(or1Var.f9202b, this.f9202b) == 0 && Double.compare(or1Var.f9203c, this.f9203c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9201a);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9202b);
        long j11 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f9203c);
        long j12 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f9204d);
        long j13 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long j14 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f9205f);
        long j15 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f9206g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f9207h);
        long j16 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f9197j)) {
            return "Rotate 0°";
        }
        if (equals(f9198k)) {
            return "Rotate 90°";
        }
        if (equals(f9199l)) {
            return "Rotate 180°";
        }
        if (equals(f9200m)) {
            return "Rotate 270°";
        }
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(this.f9201a);
        sb2.append(", v=");
        sb2.append(this.f9202b);
        sb2.append(", w=");
        sb2.append(this.f9203c);
        sb2.append(", a=");
        sb2.append(this.f9204d);
        sb2.append(", b=");
        sb2.append(this.e);
        sb2.append(", c=");
        sb2.append(this.f9205f);
        sb2.append(", d=");
        sb2.append(this.f9206g);
        sb2.append(", tx=");
        sb2.append(this.f9207h);
        sb2.append(", ty=");
        sb2.append(this.i);
        sb2.append("}");
        return sb2.toString();
    }
}
