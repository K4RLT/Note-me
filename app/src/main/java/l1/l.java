package l1;
import j.c;
import j.f;
import j.g;
import p.a;

import k1.l0;

/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f19848d;
    public static final float[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f19849f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f19850g;

    static {
        float[] g8 = g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, c(a.f19804b.f19805a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f19848d = g8;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f19849f = f(g8);
        f19850g = f(fArr);
    }

    @Override // l1.c
    public final float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // l1.c
    public final float b(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // l1.c
    public final long d(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f19850g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f19849f;
        float f20 = (fArr2[6] * f19) + (fArr2[3] * f18) + (fArr2[0] * f17);
        float f21 = (fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17);
        return (Float.floatToRawIntBits(f21) & 4294967295L) | (Float.floatToRawIntBits(f20) << 32);
    }

    @Override // l1.c
    public final float e(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f13 = 0.5f;
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 <= 0.5f) {
            f13 = f12;
        }
        float[] fArr = f19850g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f19849f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // l1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = f19848d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float a10 = c7.a(f14);
        float a11 = c7.a(f15);
        float a12 = c7.a(f16);
        float[] fArr2 = e;
        return l0.b((fArr2[6] * a12) + (fArr2[3] * a11) + (fArr2[0] * a10), (fArr2[7] * a12) + (fArr2[4] * a11) + (fArr2[1] * a10), (fArr2[8] * a12) + (fArr2[5] * a11) + (fArr2[2] * a10), f13, cVar);
    }
}
