package i3;
import a.a;
import b.b;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f18168a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18169b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18170c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18171d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18172f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18168a = f10;
        this.f18169b = f11;
        this.f18170c = f12;
        this.f18171d = f13;
        this.e = f14;
        this.f18172f = f15;
    }

    public static a a(int i) {
        float f10;
        k kVar = k.f18196k;
        float b10 = b(Color.red(i));
        float b11 = b(Color.green(i));
        float b12 = b(Color.blue(i));
        float[][] fArr = b.f18176d;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * b12) + (fArr2[1] * b11) + (fArr2[0] * b10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * b12) + (fArr3[1] * b11) + (fArr3[0] * b10);
        float[] fArr4 = fArr[2];
        float f13 = (b12 * fArr4[2]) + (b11 * fArr4[1]) + (b10 * fArr4[0]);
        float[][] fArr5 = b.f18173a;
        float[] fArr6 = fArr5[0];
        float f14 = (fArr6[2] * f13) + (fArr6[1] * f12) + (fArr6[0] * f11);
        float[] fArr7 = fArr5[1];
        float f15 = (fArr7[2] * f13) + (fArr7[1] * f12) + (fArr7[0] * f11);
        float[] fArr8 = fArr5[2];
        float f16 = (f13 * fArr8[2]) + (f12 * fArr8[1]) + (f11 * fArr8[0]);
        float[] fArr9 = kVar.f18202g;
        float f17 = kVar.i;
        float f18 = kVar.f18200d;
        float f19 = kVar.f18197a;
        float f20 = fArr9[0] * f14;
        float f21 = fArr9[1] * f15;
        float f22 = fArr9[2] * f16;
        float f23 = kVar.f18203h;
        float pow = (float) Math.pow((Math.abs(f20) * f23) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f21) * f23) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f22) * f23) / 100.0d, 0.42d);
        float signum = ((Math.signum(f20) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f21) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f22) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f24 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f25 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f26 = signum2 * 20.0f;
        float f27 = ((21.0f * signum3) + ((signum * 20.0f) + f26)) / 20.0f;
        float f28 = (((signum * 40.0f) + f26) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f29 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f28 * kVar.f18198b) / f19, kVar.f18204j * f18)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f30 = f19 + 4.0f;
        if (atan2 < 20.14d) {
            f10 = 360.0f + atan2;
        } else {
            f10 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f18201f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f10 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.e) * kVar.f18199c) * ((float) Math.sqrt((f25 * f25) + (f24 * f24)))) / (f27 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f18) / f30);
        float f31 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f17 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f29;
        return new a(atan2, pow5, pow4, f31, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f10, float f11, float f12) {
        k kVar = k.f18196k;
        float f13 = kVar.f18200d;
        Math.sqrt(f10 / 100.0d);
        float f14 = kVar.f18197a + 4.0f;
        float f15 = kVar.i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * kVar.f18200d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int c(k kVar) {
        float f10;
        float f11 = this.f18169b;
        double d2 = f11;
        float f12 = this.f18170c;
        if (d2 != 0.0d) {
            double d10 = f12;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float f13 = kVar.f18201f;
                float f14 = kVar.f18203h;
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, f13), 0.73d), 1.1111111111111112d);
                double d11 = (this.f18168a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = kVar.f18197a * ((float) Math.pow(f12 / 100.0d, (1.0d / kVar.f18200d) / kVar.f18204j));
                float f15 = cos * 3846.1538f * kVar.e * kVar.f18199c;
                float f16 = pow2 / kVar.f18198b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float c10 = (((0.305f + f16) * 23.0f) * pow) / (((pow * 108.0f) * sin) + g3.a.c(pow, 11.0f, cos2, f15 * 23.0f));
                float f17 = cos2 * c10;
                float f18 = c10 * sin;
                float f19 = f16 * 460.0f;
                float f20 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
                float u9 = g3.a.u(f18, 261.0f, f19 - (891.0f * f17), 1403.0f);
                float u10 = g3.a.u(f18, 6300.0f, f19 - (f17 * 220.0f), 1403.0f);
                float f21 = 100.0f / f14;
                float signum = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum2 = Math.signum(u9) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u9) * 27.13d) / (400.0d - Math.abs(u9))), 2.380952380952381d));
                float signum3 = Math.signum(u10) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u10) * 27.13d) / (400.0d - Math.abs(u10))), 2.380952380952381d));
                float[] fArr = kVar.f18202g;
                float f22 = signum / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.f18174b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return j3.a.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f10 = 0.0f;
        float f132 = kVar.f18201f;
        float f142 = kVar.f18203h;
        float pow3 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, f132), 0.73d), 1.1111111111111112d);
        double d112 = (this.f18168a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = kVar.f18197a * ((float) Math.pow(f12 / 100.0d, (1.0d / kVar.f18200d) / kVar.f18204j));
        float f152 = cos3 * 3846.1538f * kVar.e * kVar.f18199c;
        float f162 = pow22 / kVar.f18198b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float c102 = (((0.305f + f162) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + g3.a.c(pow3, 11.0f, cos22, f152 * 23.0f));
        float f172 = cos22 * c102;
        float f182 = c102 * sin2;
        float f192 = f162 * 460.0f;
        float f202 = ((288.0f * f182) + ((451.0f * f172) + f192)) / 1403.0f;
        float u92 = g3.a.u(f182, 261.0f, f192 - (891.0f * f172), 1403.0f);
        float u102 = g3.a.u(f182, 6300.0f, f192 - (f172 * 220.0f), 1403.0f);
        float f212 = 100.0f / f142;
        float signum4 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum22 = Math.signum(u92) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u92) * 27.13d) / (400.0d - Math.abs(u92))), 2.380952380952381d));
        float signum32 = Math.signum(u102) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(u102) * 27.13d) / (400.0d - Math.abs(u102))), 2.380952380952381d));
        float[] fArr6 = kVar.f18202g;
        float f222 = signum4 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.f18174b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return j3.a.a(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
