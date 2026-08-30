package p;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import wa.b9;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f22112a;

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float[] fArr = new float[FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS];
        f22112a = fArr;
        float[] fArr2 = new float[FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS];
        float f19 = 0.0f;
        int i = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i < 100) {
                float f22 = i / 100;
                float f23 = 1.0f;
                while (true) {
                    f10 = ((f23 - f19) / 2.0f) + f19;
                    f11 = f21 - f10;
                    f12 = f10 * 3.0f * f11;
                    f13 = f10 * f10 * f10;
                    float y10 = g3.a.y(f10, 0.35000002f, f11 * 0.175f, f12) + f13;
                    f14 = f21;
                    if (Math.abs(y10 - f22) < 1.0E-5d) {
                        break;
                    }
                    if (y10 > f22) {
                        f23 = f10;
                    } else {
                        f19 = f10;
                    }
                    f21 = f14;
                }
                float f24 = 0.5f;
                fArr[i] = (((f11 * 0.5f) + f10) * f12) + f13;
                float f25 = f14;
                while (true) {
                    f15 = ((f25 - f20) / 2.0f) + f20;
                    f16 = f14 - f15;
                    f17 = f15 * 3.0f * f16;
                    f18 = f15 * f15 * f15;
                    float y11 = g3.a.y(f16, f24, f15, f17) + f18;
                    float f26 = f25;
                    if (Math.abs(y11 - f22) >= 1.0E-5d) {
                        if (y11 > f22) {
                            f25 = f15;
                        } else {
                            f20 = f15;
                            f25 = f26;
                        }
                        f24 = 0.5f;
                    }
                }
                fArr2[i] = (((f15 * 0.35000002f) + (f16 * 0.175f)) * f17) + f18;
                i++;
            } else {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static b a(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float d2 = b9.d(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i = (int) (f13 * d2);
        if (i < 100) {
            float f14 = i / f13;
            int i10 = i + 1;
            float f15 = i10 / f13;
            float[] fArr = f22112a;
            float f16 = fArr[i];
            float f17 = (fArr[i10] - f16) / (f15 - f14);
            float x9 = g3.a.x(d2, f14, f17, f16);
            f11 = f17;
            f12 = x9;
        }
        return new b(f12, f11);
    }
}
