package i3;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f18196k;

    /* renamed from: a, reason: collision with root package name */
    public final float f18197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18198b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18199c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18200d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18201f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f18202g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18203h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f18204j;

    static {
        float f10;
        float f11 = (float) ((b.f() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f18175c;
        float f12 = fArr[0];
        float[][] fArr2 = b.f18173a;
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = (fArr3[1] * f14) + f13;
        float f16 = fArr[2];
        float f17 = (fArr3[2] * f16) + f15;
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f14) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f19 = (f16 * fArr5[2]) + (f14 * fArr5[1]) + (f12 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.69f;
        } else {
            f10 = 0.655f;
        }
        float f20 = f10;
        float w10 = g3.a.w((float) Math.exp(((-f11) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d2 = w10;
        if (d2 > 1.0d) {
            w10 = 1.0f;
        } else if (d2 < 0.0d) {
            w10 = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * w10) + 1.0f) - w10, (((100.0f / f18) * w10) + 1.0f) - w10, (((100.0f / f19) * w10) + 1.0f) - w10};
        float f21 = 1.0f / ((5.0f * f11) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (0.1f * f23 * f23 * ((float) Math.cbrt(f11 * 5.0d))) + (f22 * f11);
        float f24 = b.f() / fArr[1];
        double d10 = f24;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f19) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        f18196k = new k(f24, g3.a.y(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow), pow, pow, f20, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f18201f = f10;
        this.f18197a = f11;
        this.f18198b = f12;
        this.f18199c = f13;
        this.f18200d = f14;
        this.e = f15;
        this.f18202g = fArr;
        this.f18203h = f16;
        this.i = f17;
        this.f18204j = f18;
    }
}
