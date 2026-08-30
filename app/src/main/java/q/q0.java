package q;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public float f22971a;

    /* renamed from: b, reason: collision with root package name */
    public double f22972b;

    /* renamed from: c, reason: collision with root package name */
    public float f22973c;

    public final long a(float f10, float f11, long j10) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f12 = f10 - this.f22971a;
        double d2 = j10 / 1000.0d;
        float f13 = this.f22973c;
        double d10 = f13 * f13;
        double d11 = this.f22972b;
        double d12 = (-f13) * d11;
        if (f13 > 1.0f) {
            double sqrt = Math.sqrt(d10 - 1) * d11;
            double d13 = d12 + sqrt;
            double d14 = d12 - sqrt;
            double d15 = f12;
            double d16 = ((d14 * d15) - f11) / (d14 - d13);
            double d17 = d15 - d16;
            double d18 = d14 * d2;
            double d19 = d2 * d13;
            sin = (Math.exp(d19) * d16) + (Math.exp(d18) * d17);
            exp = Math.exp(d18) * d17 * d14;
            exp2 = Math.exp(d19) * d16 * d13;
        } else if (f13 == 1.0f) {
            double d20 = f12;
            double d21 = (d11 * d20) + f11;
            double d22 = (-d11) * d2;
            double d23 = (d2 * d21) + d20;
            sin = Math.exp(d22) * d23;
            exp = Math.exp(d22) * d23 * (-this.f22972b);
            exp2 = Math.exp(d22) * d21;
        } else {
            double d24 = 1;
            double sqrt2 = Math.sqrt(d24 - d10) * d11;
            double d25 = f12;
            double d26 = (((-d12) * d25) + f11) * (d24 / sqrt2);
            double d27 = sqrt2 * d2;
            double d28 = d2 * d12;
            sin = ((Math.sin(d27) * d26) + (Math.cos(d27) * d25)) * Math.exp(d28);
            cos = (((Math.cos(d27) * sqrt2 * d26) + (Math.sin(d27) * (-sqrt2) * d25)) * Math.exp(d28)) + (d12 * sin);
            float f14 = (float) cos;
            return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f22971a)) << 32);
        }
        cos = exp2 + exp;
        float f142 = (float) cos;
        return (Float.floatToRawIntBits(f142) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f22971a)) << 32);
    }
}
