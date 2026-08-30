package q;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f22979a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22980b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22981c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22982d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22983f;

    /* renamed from: g, reason: collision with root package name */
    public final float f22984g;

    /* renamed from: h, reason: collision with root package name */
    public float f22985h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f22986j;

    /* renamed from: k, reason: collision with root package name */
    public final float f22987k;

    /* renamed from: l, reason: collision with root package name */
    public final float f22988l;

    /* renamed from: m, reason: collision with root package name */
    public final float f22989m;

    /* renamed from: n, reason: collision with root package name */
    public final float f22990n;

    /* renamed from: o, reason: collision with root package name */
    public final float f22991o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f22992p;

    /* renamed from: q, reason: collision with root package name */
    public final float f22993q;

    /* renamed from: r, reason: collision with root package name */
    public final float f22994r;

    public s(int i, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z3;
        float f16;
        boolean z9;
        boolean z10;
        float f17;
        float f18;
        int i10;
        float f19;
        float f20;
        this.f22979a = f10;
        this.f22980b = f11;
        this.f22981c = f12;
        this.f22982d = f13;
        this.e = f14;
        this.f22983f = f15;
        float f21 = f14 - f12;
        float f22 = f15 - f13;
        float f23 = 0.0f;
        int i11 = 1;
        if (i != 1 && (i == 4 ? f22 <= 0.0f : i != 5 || f22 >= 0.0f)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            f16 = -1.0f;
        } else {
            f16 = 1.0f;
        }
        this.f22989m = f16;
        float f24 = 1 / (f11 - f10);
        this.f22987k = f24;
        float[] fArr = new float[FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS];
        this.f22986j = fArr;
        if (i == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && Math.abs(f21) >= 0.001f && Math.abs(f22) >= 0.001f) {
            this.f22990n = f21 * f16;
            this.f22991o = f22 * (-f16);
            if (z3) {
                f17 = f14;
            } else {
                f17 = f12;
            }
            this.f22993q = f17;
            if (z3) {
                f18 = f13;
            } else {
                f18 = f15;
            }
            this.f22994r = f18;
            float f25 = f14 - f12;
            float f26 = f13 - f15;
            float[] fArr2 = e.i;
            int i12 = 90;
            float f27 = 90;
            float f28 = f26;
            float f29 = 0.0f;
            float f30 = 0.0f;
            int i13 = 1;
            while (true) {
                i10 = i11;
                f19 = f23;
                double radians = (float) Math.toRadians((i13 * 90.0d) / i12);
                float sin = ((float) Math.sin(radians)) * f25;
                float cos = ((float) Math.cos(radians)) * f26;
                float f31 = sin - f30;
                f20 = f27;
                f29 += (float) Math.hypot(f31, cos - f28);
                fArr2[i13] = f29;
                i12 = 90;
                if (i13 == 90) {
                    break;
                }
                i13++;
                f28 = cos;
                f27 = f20;
                f23 = f19;
                f30 = sin;
                i11 = i10;
            }
            this.f22984g = f29;
            int i14 = i10;
            while (true) {
                fArr2[i14] = fArr2[i14] / f29;
                if (i14 == 90) {
                    break;
                } else {
                    i14++;
                }
            }
            int length = fArr.length;
            for (int i15 = 0; i15 < length; i15++) {
                float f32 = i15 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f32);
                if (binarySearch >= 0) {
                    fArr[i15] = binarySearch / f20;
                } else if (binarySearch == -1) {
                    fArr[i15] = f19;
                } else {
                    int i16 = -binarySearch;
                    int i17 = i16 - 2;
                    float f33 = i17;
                    float f34 = fArr2[i17];
                    fArr[i15] = (((f32 - f34) / (fArr2[i16 - 1] - f34)) + f33) / f20;
                }
            }
            this.f22988l = this.f22984g * this.f22987k;
            z10 = z9;
        } else {
            float hypot = (float) Math.hypot(f22, f21);
            this.f22984g = hypot;
            this.f22988l = hypot * f24;
            this.f22993q = f21 * f24;
            this.f22994r = f22 * f24;
            this.f22990n = Float.NaN;
            this.f22991o = Float.NaN;
            z10 = true;
        }
        this.f22992p = z10;
    }

    public final float a() {
        float f10 = this.f22990n * this.i;
        return f10 * this.f22989m * (this.f22988l / ((float) Math.hypot(f10, (-this.f22991o) * this.f22985h)));
    }

    public final float b() {
        float f10 = this.f22990n * this.i;
        float f11 = (-this.f22991o) * this.f22985h;
        return f11 * this.f22989m * (this.f22988l / ((float) Math.hypot(f10, f11)));
    }

    public final void c(float f10) {
        float f11;
        if (this.f22989m == -1.0f) {
            f11 = this.f22980b - f10;
        } else {
            f11 = f10 - this.f22979a;
        }
        float f12 = f11 * this.f22987k;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            f13 = 1.0f;
            if (f12 < 1.0f) {
                float f14 = f12 * 100;
                int i = (int) f14;
                float[] fArr = this.f22986j;
                float f15 = fArr[i];
                f13 = g3.a.x(fArr[i + 1], f15, f14 - i, f15);
            }
        }
        double d2 = f13 * 1.5707964f;
        this.f22985h = (float) Math.sin(d2);
        this.i = (float) Math.cos(d2);
    }
}
