package l1;

import q.x;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f19872a;

    /* renamed from: b, reason: collision with root package name */
    public final double f19873b;

    /* renamed from: c, reason: collision with root package name */
    public final double f19874c;

    /* renamed from: d, reason: collision with root package name */
    public final double f19875d;
    public final double e;

    /* renamed from: f, reason: collision with root package name */
    public final double f19876f;

    /* renamed from: g, reason: collision with root package name */
    public final double f19877g;

    public r(double d2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f19872a = d2;
        this.f19873b = d10;
        this.f19874c = d11;
        this.f19875d = d12;
        this.e = d13;
        this.f19876f = d14;
        this.f19877g = d15;
        if (!Double.isNaN(d10) && !Double.isNaN(d11) && !Double.isNaN(d12) && !Double.isNaN(d13) && !Double.isNaN(d14) && !Double.isNaN(d15) && !Double.isNaN(d2)) {
            if (d2 == -2.0d || d2 == -3.0d) {
                return;
            }
            if (d13 >= 0.0d && d13 <= 1.0d) {
                if (d13 == 0.0d && (d10 == 0.0d || d2 == 0.0d)) {
                    x.n("Parameter a or g is zero, the transfer function is constant");
                    throw null;
                }
                if (d13 >= 1.0d && d12 == 0.0d) {
                    x.n("Parameter c is zero, the transfer function is constant");
                    throw null;
                }
                if ((d10 == 0.0d || d2 == 0.0d) && d12 == 0.0d) {
                    x.n("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    throw null;
                }
                if (d12 >= 0.0d) {
                    if (d10 >= 0.0d && d2 >= 0.0d) {
                        return;
                    }
                    x.n("The transfer function must be positive or increasing");
                    throw null;
                }
                x.n("The transfer function must be increasing");
                throw null;
            }
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d13);
        }
        x.n("Parameters cannot be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Double.compare(this.f19872a, rVar.f19872a) == 0 && Double.compare(this.f19873b, rVar.f19873b) == 0 && Double.compare(this.f19874c, rVar.f19874c) == 0 && Double.compare(this.f19875d, rVar.f19875d) == 0 && Double.compare(this.e, rVar.e) == 0 && Double.compare(this.f19876f, rVar.f19876f) == 0 && Double.compare(this.f19877g, rVar.f19877g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19877g) + ((Double.hashCode(this.f19876f) + ((Double.hashCode(this.e) + ((Double.hashCode(this.f19875d) + ((Double.hashCode(this.f19874c) + ((Double.hashCode(this.f19873b) + (Double.hashCode(this.f19872a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f19872a + ", a=" + this.f19873b + ", b=" + this.f19874c + ", c=" + this.f19875d + ", d=" + this.e + ", e=" + this.f19876f + ", f=" + this.f19877g + ')';
    }

    public /* synthetic */ r(double d2, double d10, double d11, double d12, double d13) {
        this(d2, d10, d11, d12, d13, 0.0d, 0.0d);
    }
}
