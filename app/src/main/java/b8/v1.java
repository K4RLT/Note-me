package b8;
import a5.a;
import b8.h4;
import c2.d;
import c2.e;
import c2.h;
import c2.q;
import c2.r;
import c2.s;
import c2.t;
import l7.b;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2863c;

    public /* synthetic */ v1(String str, String str2, int i) {
        this.f2861a = i;
        this.f2862b = str;
        this.f2863c = str2;
    }

    private final void b(i4 i4Var) {
        float f10;
        float k3 = i4Var.k();
        float min = k3 - ((Math.min(k3, 0.555f) * 0.03f) * 2.0f);
        float f11 = k3 * 0.72f;
        i4.a(i4Var, i4Var.i(), 0.3605f, min, 0.259f, -12646382, null, 0.0f, 0.0f, 0.0f, "triangle", 480);
        i4.a(i4Var, i4Var.i(), 0.675f, k3, 0.37f, -10416098, null, 0.0f, 0.03f, 0.0f, null, 864);
        float i = i4Var.i() - 0.29f;
        int d2 = d(-10416098, 230);
        i4.a(i4Var, i, 0.14f, 0.05f, 0.033333335f, Integer.valueOf(d2), null, 0.0f, 0.0f, -18.0f, "heart", 224);
        float i10 = i4Var.i() - 0.16f;
        int d10 = d(-7463889, 217);
        i4.a(i4Var, i10, 0.096f, 0.038f, 0.025333332f, Integer.valueOf(d10), null, 0.0f, 0.0f, 12.0f, "heart", 224);
        i4.a(i4Var, i4Var.i() - 0.02f, 0.168f, 0.032f, 0.021333335f, Integer.valueOf(d(-7463889, 204)), null, 0.0f, 0.0f, -6.0f, "heart", 224);
        i4.a(i4Var, i4Var.i() + 0.14f, 0.104f, 0.046f, 0.030666666f, Integer.valueOf(d2), null, 0.0f, 0.0f, 15.0f, "heart", 224);
        i4.a(i4Var, i4Var.i() + 0.28f, 0.155f, 0.036f, 0.023999998f, Integer.valueOf(d10), null, 0.0f, 0.0f, -12.0f, "heart", 224);
        i4.a(i4Var, i4Var.i(), 0.5619f, f11, 0.26380002f, -132105, 436207616, 0.0016f, 0.0f, 0.0f, null, 768);
        i4.a(i4Var, i4Var.i(), 0.6998f, f11, 0.011f, 1073741824, null, 0.0f, 0.0f, 0.0f, null, 864);
        float f12 = f11 * 0.32f;
        i4.t(i4Var, this.f2862b, i4Var.i() + f12, 0.455f, 0.012f, -7697782, "cormorant", null, 4032);
        i4.o(i4Var.i() + f12, 0.468f, f11 * 0.24f, 520093696, 16, i4Var);
        float f13 = f11 * 0.86f;
        i4.t(i4Var, this.f2863c, i4Var.i(), 0.5f, 0.03f, -13102052, "great-vibes", Float.valueOf(f13), 3520);
        if (!mf.f.u("")) {
            i4.t(i4Var, "", i4Var.i(), 0.532f, 0.015f, -13102052, "cormorant", Float.valueOf(f13), 3392);
        }
        if (!mf.f.u("")) {
            f10 = 0.565f;
        } else {
            f10 = 0.545f;
        }
        for (float f14 = f10; f14 < 0.6248f; f14 += 0.03f) {
            i4.o(i4Var.i(), f14, f11 * 0.82f, 570425344, 16, i4Var);
        }
        i4.t(i4Var, "Con todo mi amor,", (f11 * 0.2f) + i4Var.i(), 0.6338f, 0.018f, -13102052, "great-vibes", null, 4032);
        i4.a(i4Var, i4Var.i(), 0.7749f, min, 0.17019999f, -7463889, null, 0.0f, 0.0f, 0.0f, "triangle", 480);
        float i11 = i4Var.i();
        int i12 = c2.f1908c;
        i4.e(i4Var, i11, 0.69780004f, 0.092f, Integer.valueOf(d(i12, 77)), null, 16);
        i4.e(i4Var, i4Var.i() - 0.022f, 0.7238f, 0.026f, Integer.valueOf(d(i12, 179)), null, 16);
        i4.e(i4Var, i4Var.i() + 0.019f, 0.7288f, 0.02f, Integer.valueOf(d(i12, 153)), null, 16);
        float i13 = i4Var.i();
        Integer valueOf = Integer.valueOf(i12);
        int i14 = e;
        i4Var.d(i13, 0.6898f, 0.072f, valueOf, Integer.valueOf(d(i14, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)));
        i4.e(i4Var, i4Var.i(), 0.6898f, 0.056f, null, Integer.valueOf(d(i14, 85)), 8);
        i4.a(i4Var, i4Var.i(), 0.6898f, 0.03f, 0.02f, Integer.valueOf(d(i14, 204)), null, 0.0f, 0.0f, 0.0f, "heart", 480);
    }

    @Override // h4
    public final void a(i4 i4Var) {
        switch (this.f2861a) {
            case 0:
                float i = i4Var.i();
                d2 d2Var = i4Var.e;
                i4Var.q(i, 0.14f, -8.0f, 0.24f, d2Var.f1967d);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.26f, 0.047f, d2Var.f1966c, "serif", a.e(i4Var, 0.84f), 3456);
                float i10 = i4Var.i();
                int i11 = d2Var.f1964a;
                i4.t(i4Var, this.f2863c, i10, 0.36f, 0.026f, d(i11, 179), "sans", a.e(i4Var, 0.8f), 3520);
                i4.a(i4Var, i4Var.i() - 0.16f, 0.47f, 0.075f, 0.05f, Integer.valueOf(d2Var.f1967d), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i(), 0.47f, 0.068f, null, Integer.valueOf(d2Var.f1966c), 8);
                i4.e(i4Var, i4Var.i() + 0.16f, 0.47f, 0.06f, null, Integer.valueOf(d(i11, 89)), 8);
                return;
            case 1:
                float j10 = i4Var.j() - 0.1f;
                d2 d2Var2 = i4Var.e;
                i4.t(i4Var, this.f2862b, j10, 0.1f, 0.024f, d2Var2.f1965b, "sans", null, 4032);
                i4.o(i4Var.j() - 0.1f, 0.135f, 0.26f, 0, 24, i4Var);
                i4.t(i4Var, this.f2863c, (i4Var.k() * 0.42f) + i4Var.h(), 0.2f, 0.038f, d2Var2.f1966c, "serif-bold", a.e(i4Var, 0.86f), 3456);
                i4.a(i4Var, 0.012f + i4Var.h(), 0.2f, 0.012f, 0.1f, Integer.valueOf(d2Var2.f1966c), null, 0.0f, 0.3f, 0.0f, null, 864);
                return;
            case 2:
                float i12 = i4Var.i();
                float k3 = i4Var.k();
                d2 d2Var3 = i4Var.e;
                i4.a(i4Var, i12, 0.265f, k3, 0.39f, Integer.valueOf(d2Var3.f1966c), null, 0.0f, 0.02f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.265f, i4Var.k() - 0.05f, 0.352f, null, Integer.valueOf(d(-1, 51)), 0.003f, 0.015f, 0.0f, null, 784);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.215f, 0.048f, -1, "bodoni", a.e(i4Var, 0.74f), 3520);
                i4.a(i4Var, i4Var.i(), 0.3f, i4Var.k() * 0.18f, 0.003f, Integer.valueOf(d(-1, 115)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, this.f2863c, i4Var.i(), 0.352f, 0.022f, d(-1, 184), "dm-sans", a.e(i4Var, 0.62f), 3520);
                h(i4Var, 0.66f, 0.052f, d(d2Var3.f1964a, 79), d2Var3.f1967d, null, 480);
                return;
            case 3:
                float h3 = 0.13f + i4Var.h();
                d2 d2Var4 = i4Var.e;
                int i13 = d2Var4.f1966c;
                int i14 = d2Var4.f1964a;
                i4.t(i4Var, this.f2862b, h3, 0.092f, 0.03f, i13, "serif", Float.valueOf(0.34f), 3456);
                String str = this.f2863c;
                if (!mf.f.u(str)) {
                    i4.t(i4Var, str, i4Var.j() - 0.3f, 0.098f, 0.019f, d(i14, 140), "sans", Float.valueOf(0.18f), 3520);
                    i4.o(i4Var.j() - 0.105f, 0.112f, 0.17f, d(i14, 51), 16, i4Var);
                }
                i4.o(i4Var.i(), 0.128f, i4Var.k(), d(i14, 38), 16, i4Var);
                int i15 = 0;
                while (true) {
                    float f10 = 0.205f + (i15 * 0.0455f);
                    if (f10 <= 0.93f) {
                        i4.o(i4Var.i(), f10, i4Var.k(), d(i14, 26), 16, i4Var);
                        i15++;
                    } else {
                        return;
                    }
                }
            case 4:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.86f, Integer.valueOf(i4Var.e.f1966c), null, 0.0f, 0.02f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.055f, 0.826f, null, Integer.valueOf(d(-1, 61)), 0.003f, 0.015f, 0.0f, null, 784);
                a(i4Var.i() - 0.27f, 0.375f, i4Var.i() + 0.27f, 0.635f, 0.048f, 0.0032f, d(-1, 122), i4Var);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.44f, 0.05f, -1, "serif", a.e(i4Var, 0.72f), 3520);
                i4.a(i4Var, i4Var.i(), 0.515f, i4Var.k() * 0.2f, 0.003f, Integer.valueOf(d(-1, 115)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, this.f2863c, i4Var.i(), 0.565f, 0.023f, d(-1, 184), "sans", a.e(i4Var, 0.64f), 3520);
                return;
            case 5:
                s(i4Var, 1, this.f2862b);
                r(i4Var, this.f2863c);
                float i16 = i4Var.i();
                d2 d2Var5 = i4Var.e;
                i4.a(i4Var, i16, 0.52f, 0.46f, 0.34f, -527640, Integer.valueOf(d(d2Var5.f1964a, 31)), 0.0f, 0.03f, -2.0f, null, 576);
                i4.a(i4Var, i4Var.i() - 0.09f, 0.455f, 0.075f, 0.05f, Integer.valueOf(d2Var5.f1967d), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i() + 0.09f, 0.455f, 0.065f, null, Integer.valueOf(d2Var5.f1966c), 8);
                i4.o(i4Var.i(), 0.545f, 0.28f, 603979776, 16, i4Var);
                i4.o(i4Var.i(), 0.585f, 0.28f, 603979776, 16, i4Var);
                t(i4Var, i4Var.i() + 0.155f, 0.645f);
                return;
            case 6:
                s(i4Var, 5, this.f2862b);
                r(i4Var, this.f2863c);
                float i17 = i4Var.i();
                d2 d2Var6 = i4Var.e;
                int i18 = d2Var6.f1964a;
                i4.a(i4Var, i17, 0.475f, 0.52f, 0.38f, -527640, Integer.valueOf(d(i18, 31)), 0.0f, 0.02f, 0.0f, null, 832);
                i4.a(i4Var, i4Var.i() - 0.13f, 0.475f, 0.26f, 0.38f, Integer.valueOf(d(d2Var6.f1967d, 89)), null, 0.0f, 0.02f, 0.0f, null, 864);
                float i19 = i4Var.i() - 0.13f;
                int i20 = d2Var6.f1966c;
                i4.a(i4Var, i19, 0.25f, 0.16f, 0.03f, Integer.valueOf(i20), null, 0.0f, 0.4f, 0.0f, null, 864);
                i4.a(i4Var, 0.1f + (i4Var.i() - 0.13f), 0.21f, 0.095f, 0.011f, Integer.valueOf(d(i20, 179)), null, 0.0f, 0.5f, -38.0f, null, 608);
                for (int i21 = 0; i21 < 4; i21++) {
                    for (int i22 = 0; i22 < 3; i22++) {
                        i4.e(i4Var, ((i22 * 0.52f) / 6.0f) + i4Var.i() + 0.043333333f, 0.285f + (((i21 + 1.0f) * 0.38f) / 5.0f), 0.018f, Integer.valueOf(d(i18, 64)), null, 16);
                    }
                }
                i4.a(i4Var, i4Var.i(), 0.815f, i4Var.k(), 0.2f, null, Integer.valueOf(d(i18, 46)), 0.0035f, 0.03f, 0.0f, null, 784);
                return;
            case 7:
                int i23 = c2.f1908c;
                int d2 = d(i23, 77);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.86f, null, Integer.valueOf(d(i23, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 0.0025f, 0.02f, 0.0f, null, 784);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.045f, 0.83f, null, Integer.valueOf(d2), 0.0015f, 0.015f, 0.0f, null, 784);
                a(i4Var.h() + 0.035f, 0.105f, i4Var.j() - 0.035f, 0.895f, 0.05f, 0.0032f, i23, i4Var);
                i4.e(i4Var, i4Var.i(), 0.26f, 0.155f, null, Integer.valueOf(d(i23, 140)), 8);
                i4.e(i4Var, i4Var.i(), 0.26f, 0.125f, null, Integer.valueOf(d2), 8);
                i4.a(i4Var, i4Var.i(), 0.26f, 0.065f, 0.043333333f, Integer.valueOf(i23), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                float i24 = i4Var.i();
                d2 d2Var7 = i4Var.e;
                i4.t(i4Var, this.f2862b, i24, 0.47f, 0.075f, d2Var7.f1964a, "great-vibes", a.e(i4Var, 0.85f), 3520);
                i4Var.n(i4Var.i(), 0.545f, i4Var.k() * 0.38f, 0.003f, i23);
                i4.t(i4Var, this.f2863c, i4Var.i(), 0.6f, 0.023f, d(d2Var7.f1964a, 153), "cormorant", a.e(i4Var, 0.8f), 3392);
                i4.p(i4Var, i4Var.i(), 0.8f, 0.05f, Integer.valueOf(i23), null, 16);
                i4.o(i4Var.i() - (i4Var.k() * 0.2f), 0.8f, i4Var.k() * 0.22f, d2, 16, i4Var);
                i4.o(i4Var.i() + (i4Var.k() * 0.2f), 0.8f, i4Var.k() * 0.22f, d2, 16, i4Var);
                return;
            case 8:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.86f, Integer.valueOf(i4Var.e.f1966c), null, 0.0f, 0.02f, 0.0f, null, 864);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.46f, 0.058f, -1, "serif-bold", a.e(i4Var, 0.82f), 3456);
                i4.a(i4Var, i4Var.i(), 0.56f, i4Var.k() * 0.28f, 0.0035f, 1728053247, null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, this.f2863c, i4Var.i(), 0.62f, 0.028f, -855638017, "sans", a.e(i4Var, 0.7f), 3520);
                return;
            case 9:
                d2 d2Var8 = i4Var.e;
                int i25 = d2Var8.f1964a;
                String upperCase = this.f2862b.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                float h10 = i4Var.h() + 0.11f;
                int i26 = d2Var8.f1966c;
                Float valueOf = Float.valueOf(0.3f);
                i4.t(i4Var, upperCase, h10, 0.092f, 0.026f, i26, "sans", valueOf, 3456);
                i4.o(i4Var.i(), 0.128f, i4Var.k(), d(i25, 38), 16, i4Var);
                int i27 = 0;
                while (i27 < 3) {
                    float f11 = (i27 * 0.115f) + 0.2f;
                    i4.e(i4Var, i4Var.h() + 0.04f, f11, 0.058f, null, Integer.valueOf(d(d2Var8.f1966c, 112)), 8);
                    int i28 = i27 + 1;
                    i4.t(i4Var, String.valueOf(i28), i4Var.h() + 0.04f, f11, 0.02f, d2Var8.f1966c, "sans", null, 3968);
                    float h11 = i4Var.h() + 0.11f;
                    i4.o((i4Var.j() + h11) / 2.0f, f11 + 0.032f, i4Var.j() - h11, d(i25, 38), 16, i4Var);
                    i27 = i28;
                }
                String upperCase2 = this.f2863c.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                i4.t(i4Var, upperCase2, i4Var.h() + 0.11f, 0.585f, 0.026f, d2Var8.f1966c, "sans", valueOf, 3456);
                i4.o(i4Var.i(), 0.621f, i4Var.k(), d(i25, 38), 16, i4Var);
                for (int i29 = 0; i29 < 7; i29++) {
                    float f12 = (i29 * 0.037f) + 0.685f;
                    i4.a(i4Var, 0.03f + i4Var.h(), f12, 0.03f, 0.02f, null, Integer.valueOf(d(i25, 61)), 0.004f, 0.25f, 0.0f, null, 784);
                    float h12 = i4Var.h() + 0.08f;
                    i4.o((i4Var.j() + h12) / 2.0f, f12 + 0.022f, i4Var.j() - h12, d(i25, 20), 16, i4Var);
                }
                return;
            case 10:
                float h13 = i4Var.h() + 0.04f;
                float j11 = i4Var.j() - 0.04f;
                int i30 = c2.f1908c;
                a(h13, 0.24f, j11, 0.78f, 0.055f, 0.0032f, d(i30, 153), i4Var);
                i4.p(i4Var, i4Var.i(), 0.24f, 0.045f, Integer.valueOf(i30), null, 16);
                i4.o(i4Var.i(), 0.285f, 0.35f * i4Var.k(), d(i30, 128), 16, i4Var);
                float i31 = i4Var.i();
                d2 d2Var9 = i4Var.e;
                i4.t(i4Var, this.f2862b, i31, 0.46f, 0.045f, d2Var9.f1964a, "great-vibes", a.e(i4Var, 0.78f), 3520);
                String str2 = this.f2863c;
                if (!mf.f.u(str2)) {
                    i4.t(i4Var, str2, i4Var.i(), 0.62f, 0.042f, d2Var9.f1964a, "great-vibes", a.e(i4Var, 0.78f), 3520);
                }
                i4.e(i4Var, i4Var.i(), 0.76f, 0.1f, null, Integer.valueOf(d(i30, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 8);
                i4.a(i4Var, i4Var.i(), 0.76f, 0.048f, 0.032f, Integer.valueOf(i30), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                return;
            case 11:
                float i32 = i4Var.i();
                float k4 = i4Var.k();
                d2 d2Var10 = i4Var.e;
                i4.a(i4Var, i32, 0.5f, k4, 0.86f, Integer.valueOf(d2Var10.f1966c), null, 0.0f, 0.02f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.055f, 0.826f, null, Integer.valueOf(d(-1, 61)), 0.003f, 0.015f, 0.0f, null, 784);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.43f, 0.05f, -1, "serif", a.e(i4Var, 0.72f), 3520);
                i4.a(i4Var, i4Var.i(), 0.505f, i4Var.k() * 0.2f, 0.003f, Integer.valueOf(d(-1, 115)), null, 0.0f, 0.0f, 0.0f, null, 864);
                float i33 = i4Var.i();
                int d10 = d(-1, 184);
                i4.t(i4Var, this.f2863c, i33, 0.555f, 0.023f, d10, "sans", a.e(i4Var, 0.64f), 3520);
                i4.a(i4Var, i4Var.i() - 0.14f, 0.72f, 0.062f, 0.041333333f, Integer.valueOf(d2Var10.f1967d), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i(), 0.72f, 0.058f, null, Integer.valueOf(d10), 8);
                i4.e(i4Var, i4Var.i() + 0.14f, 0.72f, 0.052f, null, Integer.valueOf(d10), 8);
                return;
            case 12:
                s(i4Var, 6, this.f2862b);
                r(i4Var, this.f2863c);
                float i34 = i4Var.i() - 0.14f;
                d2 d2Var11 = i4Var.e;
                int i35 = d2Var11.f1966c;
                i4.a(i4Var, i34, 0.33f, 0.075f, 0.05f, Integer.valueOf(i35), null, 0.0f, 0.0f, -90.0f, "triangle", 224);
                i4.a(i4Var, 0.02f + i4Var.i(), 0.33f, 0.24f, 0.016f, Integer.valueOf(i35), null, 0.0f, 0.5f, 0.0f, null, 864);
                float i36 = i4Var.i() - 0.16f;
                int i37 = d2Var11.f1964a;
                i4.a(i4Var, i36, 0.455f, 0.2f, 0.012f, Integer.valueOf(d(i37, 179)), null, 0.0f, 0.5f, -1.0f, null, 608);
                i4.a(i4Var, i4Var.i() + 0.16f, 0.455f, 0.2f, 0.012f, Integer.valueOf(d(i37, 179)), null, 0.0f, 0.5f, -1.0f, null, 608);
                for (int i38 = 0; i38 < 3; i38++) {
                    float f13 = i38;
                    i4.a(i4Var, (0.05f * f13) + (i4Var.i() - 0.05f), (f13 * 0.022f) + 0.585f, 0.2f, 0.085f, Integer.valueOf(d(i35, (i38 * 46) + 51)), null, 0.0f, 0.06f, 0.0f, null, 864);
                }
                i4.a(i4Var, i4Var.i(), 0.83f, i4Var.k(), 0.17f, null, Integer.valueOf(d(i37, 46)), 0.0035f, 0.03f, 0.0f, null, 784);
                return;
            case 13:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.86f, Integer.valueOf(i4Var.e.f1966c), null, 0.0f, 0.02f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.055f, 0.826f, null, Integer.valueOf(d(-1, 61)), 0.003f, 0.015f, 0.0f, null, 784);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.43f, 0.05f, -1, "serif", a.e(i4Var, 0.72f), 3520);
                i4.a(i4Var, i4Var.i(), 0.505f, i4Var.k() * 0.2f, 0.003f, Integer.valueOf(d(-1, 115)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, this.f2863c, i4Var.i(), 0.555f, 0.023f, d(-1, 184), "sans", a.e(i4Var, 0.64f), 3520);
                q(0.8f, 0.026f, -1, i4Var);
                return;
            case 14:
                b(i4Var);
                return;
            case 15:
                s(i4Var, 3, this.f2862b);
                r(i4Var, this.f2863c);
                b bVar = b.POLAROID;
                float e = e(bVar, 0.62f);
                float f14 = e / 2.0f;
                float f15 = ((0.69f - e) / 2.0f) + 0.24f + f14;
                i4.g(i4Var, bVar, i4Var.i(), f15, 0.62f, 0.0f, 48);
                i4.s(i4Var, i4Var.i(), f15, 0.217f, f14, false, 0, 0.13f, 160);
                i4.s(i4Var, i4Var.i(), f15, 0.217f, f14, true, i4Var.e.f1967d, 0.13f, 128);
                t(i4Var, i4Var.i(), f15 - 0.028933333f);
                return;
            default:
                float i39 = i4Var.i();
                float k10 = i4Var.k();
                int i40 = c2.f1908c;
                i4.a(i4Var, i39, 0.5f, k10, 0.86f, null, Integer.valueOf(d(i40, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 0.0025f, 0.02f, 0.0f, null, 784);
                float i41 = i4Var.i();
                d2 d2Var12 = i4Var.e;
                i4Var.q(i41, 0.155f, -4.0f, 0.24f, d2Var12.f1967d);
                i4.t(i4Var, this.f2862b, i4Var.i(), 0.29f, 0.07f, d2Var12.f1964a, "great-vibes", a.e(i4Var, 0.85f), 3520);
                i4.t(i4Var, this.f2863c, i4Var.i(), 0.47f, 0.038f, d2Var12.f1964a, "cormorant", a.e(i4Var, 0.74f), 3392);
                i4Var.d(i4Var.i(), 0.72f, 0.16f, Integer.valueOf(d(e, 221)), Integer.valueOf(i40));
                i4.e(i4Var, i4Var.i(), 0.72f, 0.13f, null, Integer.valueOf(d(i40, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 8);
                i4.a(i4Var, i4Var.i(), 0.72f, 0.065f, 0.043333333f, Integer.valueOf(i40), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i() - (i4Var.k() * 0.23f), 0.72f, 0.045f, Integer.valueOf(i40), null, 16);
                i4.p(i4Var, (i4Var.k() * 0.23f) + i4Var.i(), 0.72f, 0.045f, Integer.valueOf(i40), null, 16);
                return;
        }
    }
}
