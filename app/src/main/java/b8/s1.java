package b8;
import a5.a;
import b8.h4;
import c2.d;
import c2.e;
import c2.f;
import c2.h;
import c2.i;
import c2.q;
import l7.b;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2694b;

    public /* synthetic */ s1(String str, int i) {
        this.f2693a = i;
        this.f2694b = str;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        int i;
        boolean z3;
        float f10;
        int i10;
        int d2;
        i4 i4Var2 = i4Var;
        switch (this.f2693a) {
            case 0:
                d2 d2Var = i4Var2.e;
                int i11 = d2Var.f1966c;
                int i12 = d2Var.f1964a;
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.08f, 0.034f, d2Var.f1964a, "josefin", null, 3968);
                i4.o(i4Var.i(), 0.12f, 0.6f * i4Var.k(), d(i11, 128), 16, i4Var);
                i4 i4Var3 = i4Var;
                float f11 = 0.2f;
                for (String str : qe.h("1. Primera vez que aprendió su nombre", "2. Primer paseo / salida al parque", "3. Su truco / habilidad favorita", "4. Su mejor amigo peludo", "5. Su rincón favorito para dormir", "6. Un momento super divertido")) {
                    c2.l(i4Var3, i4Var3.h() + 0.06f, 0.01f + f11, 0.045f, i11);
                    i4.t(i4Var3, str, i4Var3.i() + 0.04f, f11, 0.022f, d2Var.f1964a, "sans", a.e(i4Var3, 0.72f), 3456);
                    float f12 = f11;
                    i4.o(i4Var.i() + 0.04f, 0.035f + f12, i4Var.k() * 0.72f, d(i12, 38), 16, i4Var);
                    i4.o(i4Var.i() + 0.04f, 0.07f + f12, i4Var.k() * 0.72f, d(i12, 20), 16, i4Var);
                    f11 = f12 + 0.115f;
                    i4Var3 = i4Var;
                }
                return;
            case 1:
                int i13 = i4Var2.e.f1964a;
                f(i4Var2, this.f2694b, "");
                float k3 = (i4Var2.k() / 2.0f) - 0.02f;
                float f13 = k3 / 2.0f;
                float h3 = i4Var2.h() + f13;
                float j10 = i4Var2.j() - f13;
                float i14 = i4Var2.i();
                int i15 = c2.f1908c;
                i4.a(i4Var2, i14, 0.55f, 0.002f, 0.5f, Integer.valueOf(d(i15, 77)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, "Tú", h3, 0.27f, 0.038f, i15, "great-vibes", null, 4032);
                i4.t(i4Var, "Yo", j10, 0.27f, 0.038f, i15, "great-vibes", null, 4032);
                for (float f14 = 0.33f; f14 < 0.8f; f14 += 0.055f) {
                    float f15 = k3 * 0.92f;
                    i4.o(h3, f14, f15, d(i13, 38), 16, i4Var);
                    i4.o(j10, f14, f15, d(i13, 38), 16, i4Var);
                }
                float i16 = i4Var.i();
                float k4 = 0.85f * i4Var.k();
                int i17 = c2.f1908c;
                i4.o(i16, 0.835f, k4, d(i17, 128), 16, i4Var);
                float f16 = k3 * 0.7f;
                i4.o(h3, 0.885f, f16, d(i13, 64), 16, i4Var);
                i4.o(j10, 0.885f, f16, d(i13, 64), 16, i4Var);
                i4.a(i4Var, i4Var.i(), 0.885f, 0.05f, 0.033333335f, Integer.valueOf(i17), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                return;
            case 2:
                d2 d2Var2 = i4Var2.e;
                int i18 = d2Var2.f1966c;
                int i19 = d2Var2.f1964a;
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.08f, 0.034f, d2Var2.f1964a, "josefin", null, 3968);
                int i20 = 128;
                i4.o(i4Var.i(), 0.12f, 0.6f * i4Var.k(), d(i18, 128), 16, i4Var);
                List h10 = qe.h("Paseos diarios 🐕", "Cepillado / Baño 🛁", "Comida & Premios 🦴", "Medicación / Vet 💊", "Juegos & Ejercicio 🎾", "Cariño & Mimos ❤️");
                float h11 = i4Var.h() + 0.36f;
                int i21 = 14;
                float k10 = (i4Var.k() - 0.36f) / 14;
                int i22 = 0;
                while (i22 < i21) {
                    int i23 = i22 + 1;
                    i4.t(i4Var, String.valueOf(i23), (i22 * k10) + h11, 0.17f, 0.014f, d(i19, i20), "sans", null, 4032);
                    i21 = i21;
                    i22 = i23;
                    i20 = 128;
                }
                int i24 = i21;
                int size = h10.size();
                int i25 = 0;
                while (i25 < size) {
                    int i26 = i25;
                    float f17 = (i25 * 0.11f) + 0.2f;
                    int i27 = size;
                    i4.t(i4Var, (String) h10.get(i25), i4Var.h() + 0.16f, f17, 0.018f, d2Var2.f1964a, "sans", Float.valueOf(0.32f), 3456);
                    for (int i28 = 0; i28 < i24; i28++) {
                        float f18 = f17;
                        i4.e(i4Var, (i28 * k10) + h11, f18, 0.024f, null, Integer.valueOf(d(i18, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 8);
                        f17 = f18;
                    }
                    i4.o(i4Var.i(), 0.035f + f17, i4Var.k() * 0.9f, d(i19, 20), 16, i4Var);
                    i25 = i26 + 1;
                    size = i27;
                }
                return;
            case 3:
                float i29 = i4Var2.i();
                d2 d2Var3 = i4Var2.e;
                int i30 = d2Var3.f1966c;
                i4.a(i4Var2, i29, 0.34f, 0.055f, 0.004f, Integer.valueOf(i30), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.48f, 0.04f, d2Var3.f1964a, "serif", a.e(i4Var2, 0.8f), 3520);
                i4.a(i4Var, i4Var.i(), 0.62f, 0.055f, 0.004f, Integer.valueOf(i30), null, 0.0f, 0.0f, 0.0f, null, 864);
                return;
            case 4:
                f(i4Var2, "Nuestra banda sonora", this.f2694b);
                float i31 = i4Var2.i();
                float k11 = 0.9f * i4Var2.k();
                int i32 = c2.f1908c;
                i4.a(i4Var2, i31, 0.335f, k11, 0.19f, Integer.valueOf(d(i32, 26)), Integer.valueOf(d(i32, 128)), 0.0f, 0.03f, 0.0f, null, 832);
                float h12 = i4Var2.h() + 0.145f;
                d2 d2Var4 = i4Var2.e;
                int i33 = d2Var4.f1964a;
                i4.e(i4Var2, h12, 0.335f, 0.13f, Integer.valueOf(i33), null, 16);
                i4.e(i4Var, i4Var.h() + 0.145f, 0.335f, 0.045f, Integer.valueOf(i32), null, 16);
                float k12 = (i4Var.k() * 0.12f) + i4Var.i();
                i4.t(i4Var, "Título de la Canción", k12, 0.298f, 0.023f, d2Var4.f1964a, "cormorant", a.e(i4Var, 0.5f), 3456);
                i4.o(k12, 0.342f, 0.48f * i4Var.k(), d(i33, 51), 16, i4Var);
                for (int i34 = 0; i34 < 5; i34++) {
                    i4.p(i4Var, (i4Var.k() * i34 * 0.08f) + (k12 - (i4Var.k() * 0.16f)), 0.392f, 0.038f, Integer.valueOf(i32), null, 16);
                }
                b bVar = b.POLAROID;
                float e = e(bVar, 0.52f) / 2.0f;
                float f19 = e + 0.48000002f;
                i4.g(i4Var, bVar, i4Var.i(), f19, 0.52f, -2.0f, 32);
                i4.s(i4Var, i4Var.i(), f19, 0.182f, e, false, d2Var4.f1966c, 0.14f, 128);
                i4.s(i4Var, i4Var.i(), f19, 0.182f, e, true, d2Var4.f1967d, 0.14f, 128);
                i4.o(i4Var.i(), 0.045f + f19 + e, i4Var.k() * 0.5f, d(i33, 38), 16, i4Var);
                return;
            case 5:
                i(i4Var2, this.f2694b, false);
                int i35 = i4Var2.e.f1964a;
                float h13 = i4Var2.h() + 0.2f;
                float j11 = (i4Var2.j() - h13) / 31;
                float f20 = 0.66999996f / 7;
                int i36 = 0;
                while (true) {
                    int i37 = 51;
                    if (i36 < 32) {
                        float f21 = (i36 * j11) + h13;
                        if (i36 % 7 != 0) {
                            i37 = 18;
                        }
                        i4.a(i4Var2, f21, 0.57f, 0.0022f, 0.66999996f, Integer.valueOf(d(i35, i37)), null, 0.0f, 0.0f, 0.0f, null, 864);
                        i36++;
                        i4Var2 = i4Var;
                    } else {
                        for (int i38 = 0; i38 < 8; i38++) {
                            float i39 = i4Var.i();
                            float f22 = (i38 * f20) + 0.235f;
                            float k13 = i4Var.k();
                            if (i38 == 0) {
                                i = 51;
                            } else {
                                i = 26;
                            }
                            i4.o(i39, f22, k13, d(i35, i), 16, i4Var);
                        }
                        return;
                    }
                }
            case 6:
                String upperCase = this.f2694b.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                float h14 = i4Var2.h() + 0.11f;
                d2 d2Var5 = i4Var2.e;
                i4.t(i4Var2, upperCase, h14, 0.092f, 0.026f, d2Var5.f1966c, "sans", Float.valueOf(0.3f), 3456);
                i4.o(i4Var.i(), 0.128f, i4Var.k(), d(d2Var5.f1964a, 38), 16, i4Var);
                q(0.945f, 0.018f, d2Var5.f1966c, i4Var);
                return;
            case 7:
                float i40 = i4Var2.i();
                float k14 = i4Var2.k();
                d2 d2Var6 = i4Var2.e;
                i4.a(i4Var2, i40, 0.5f, k14, 0.86f, null, Integer.valueOf(d2Var6.f1965b), 0.0035f, 0.03f, 0.0f, null, 784);
                String str2 = this.f2694b;
                if (!mf.f.u(str2)) {
                    i4.t(i4Var, str2, 0.06f + i4Var.h(), 0.075f, 0.024f, d2Var6.f1965b, "sans", null, 4032);
                    return;
                }
                return;
            case 8:
                int i41 = i4Var2.e.f1964a;
                f(i4Var2, "Nuestra historia de amor", this.f2694b);
                float i42 = i4Var2.i();
                int i43 = c2.f1908c;
                i4.a(i4Var2, i42, 0.5825f, 0.003f, 0.695f, Integer.valueOf(d(i43, 128)), null, 0.0f, 0.0f, 0.0f, null, 864);
                float k15 = i4Var.k() * 0.31f;
                float k16 = i4Var.k() * 0.34f;
                int i44 = 0;
                while (i44 < 4) {
                    float f23 = 0.3f + (i44 * 0.16f);
                    if (i44 % 2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        f10 = -1.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    float f24 = f10;
                    if (z3) {
                        i10 = i44;
                        i4.a(i4Var, i4Var.i(), f23, 0.045f, 0.030000001f, Integer.valueOf(i43), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                    } else {
                        i10 = i44;
                        i4.p(i4Var, i4Var.i(), f23, 0.045f, Integer.valueOf(i43), null, 16);
                    }
                    i4.o(i4Var.i() + (0.075f * f24), f23, 0.08f, d(i43, 128), 16, i4Var);
                    float f25 = f24 * k15;
                    float f26 = k16;
                    i4Var.n(i4Var.i() + f25, f23 - 0.016f, f26, 0.0025f, d(i41, 64));
                    i4.o(i4Var.i() + f25, 0.028f + f23, f26, d(i41, 31), 16, i4Var);
                    i44 = i10 + 1;
                    k16 = f26;
                }
                return;
            case 9:
                d2 d2Var7 = i4Var2.e;
                int i45 = d2Var7.f1964a;
                String upperCase2 = this.f2694b.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                i4.t(i4Var2, upperCase2, i4Var2.h() + 0.11f, 0.092f, 0.026f, d2Var7.f1966c, "sans", Float.valueOf(0.3f), 3456);
                i4.o(i4Var.i(), 0.128f, i4Var.k(), d(i45, 38), 16, i4Var);
                float f27 = 0.7f / 6;
                float k17 = (i4Var.k() * 0.44f) + i4Var.h();
                float j12 = (i4Var.j() - k17) / 7.0f;
                for (int i46 = 0; i46 < 6; i46++) {
                    float f28 = (i46 * f27) + 0.2f;
                    float h15 = i4Var.h() + 0.01f;
                    float f29 = k17 - 0.03f;
                    i4.o((h15 + f29) / 2.0f, 0.022f + f28, f29 - h15, d(i45, 26), 16, i4Var);
                    int i47 = 0;
                    while (i47 < 7) {
                        float f30 = ((i47 + 0.5f) * j12) + k17;
                        float f31 = j12 * 0.52f;
                        if (i47 >= 5) {
                            d2 = d(d2Var7.f1966c, 89);
                        } else {
                            d2 = d(i45, 46);
                        }
                        Integer valueOf = Integer.valueOf(d2);
                        float f32 = f28;
                        i4.e(i4Var, f30, f32, f31, null, valueOf, 8);
                        i47++;
                        f28 = f32;
                    }
                }
                return;
            case 10:
                d2 d2Var8 = i4Var2.e;
                int i48 = d2Var8.f1966c;
                i4.a(i4Var2, i4Var2.i(), 0.5f, i4Var2.k() - 0.06f, 0.88f, null, Integer.valueOf(d(i48, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 0.0025f, 0.03f, 0.0f, null, 784);
                c2.l(i4Var2, i4Var2.i(), 0.22f, 0.14f, i48);
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.44f, 0.048f, d2Var8.f1964a, "josefin", a.e(i4Var2, 0.75f), 3456);
                i4Var.n(i4Var.i(), 0.52f, i4Var.k() * 0.4f, 0.003f, i48);
                i4.t(i4Var, "Historias, fotos y recuerdos de mi mejor amigo", i4Var.i(), 0.58f, 0.024f, d(d2Var8.f1964a, 153), "sans", null, 3904);
                i4Var.q(i4Var.i(), 0.76f, 0.0f, 0.3f, d2Var8.f1967d);
                i4.t(i4Var, "Nombre: ________________", i4Var.i(), 0.76f, 0.022f, d2Var8.f1964a, "casual", null, 4032);
                return;
            case 11:
                float h16 = i4Var2.h() + 0.055f;
                float j13 = i4Var2.j() - 0.055f;
                d2 d2Var9 = i4Var2.e;
                a(h16, 0.315f, j13, 0.685f, 0.05f, 0.0032f, d(d2Var9.f1966c, 128), i4Var2);
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.46f, 0.038f, d2Var9.f1964a, "serif", a.e(i4Var2, 0.68f), 3392);
                return;
            case 12:
                d2 d2Var10 = i4Var2.e;
                int i49 = d2Var10.f1966c;
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.08f, 0.034f, d2Var10.f1964a, "josefin", null, 3968);
                i4.o(i4Var.i(), 0.12f, 0.6f * i4Var.k(), d(i49, 128), 16, i4Var);
                i4.a(i4Var, i4Var.i(), 0.18f, i4Var.k() * 0.92f, 0.045f, Integer.valueOf(d(i49, 51)), null, 0.0f, 0.01f, 0.0f, null, 864);
                i4.t(i4Var, "Fecha", i4Var.h() + 0.1f, 0.18f, 0.02f, d2Var10.f1964a, "sans", Float.valueOf(0.16f), 3456);
                i4.t(i4Var, "Motivo / Vacuna", i4Var.h() + 0.34f, 0.18f, 0.02f, d2Var10.f1964a, "sans", Float.valueOf(0.28f), 3456);
                i4.t(i4Var, "Peso", i4Var.h() + 0.58f, 0.18f, 0.02f, d2Var10.f1964a, "sans", Float.valueOf(0.14f), 3456);
                i4.t(i4Var, "Notas del Vet", i4Var.h() + 0.78f, 0.18f, 0.02f, d2Var10.f1964a, "sans", Float.valueOf(0.22f), 3456);
                float f33 = 0.24f;
                for (int i50 = 0; i50 < 10; i50++) {
                    i4.o(i4Var.i(), f33, i4Var.k() * 0.92f, d(d2Var10.f1964a, 38), 16, i4Var);
                    f33 += 0.062f;
                }
                return;
            case 13:
                int i51 = i4Var2.e.f1964a;
                b bVar2 = b.FILM;
                float e8 = e(bVar2, 0.56f);
                float b10 = i4.b(0.075f + e8, 0.0f, 6, i4Var2);
                float h17 = i4Var2.h() + 0.196f + 0.015f;
                i4.g(i4Var2, bVar2, h17, (e8 / 2.0f) + b10, 0.56f, 0.0f, 48);
                float f34 = h17 + 0.196f + 0.045f;
                for (int i52 = 0; i52 < 3; i52++) {
                    float f35 = (((i52 + 0.5f) * e8) / 3.0f) + b10;
                    i4.o((i4Var.j() + f34) / 2.0f, f35, i4Var.j() - f34, d(i51, 46), 16, i4Var);
                    i4.o((i4Var.j() + f34) / 2.0f, f35 + 0.048f, i4Var.j() - f34, d(i51, 20), 16, i4Var);
                }
                i4.t(i4Var, this.f2694b, i4Var.i(), b10 + e8 + 0.055f, 0.026f, d(i51, 153), "serif", a.e(i4Var, 0.7f), 3520);
                return;
            case 14:
                i(i4Var2, this.f2694b, false);
                d2 d2Var11 = i4Var2.e;
                h(i4Var2, 0.932f, 0.02f, d(d2Var11.f1964a, 79), d2Var11.f1967d, qe.k.u(new Integer[]{2, 5}), 288);
                return;
            case 15:
                f(i4Var2, this.f2694b, "");
                b bVar3 = b.SCALLOPED;
                float e10 = e(bVar3, 0.42f);
                float k18 = i4Var2.k() * 0.25f;
                float f36 = e10 + 0.03f;
                float f37 = ((0.695f - ((f36 * 2.0f) + 0.06f)) / 2.0f) + 0.235f;
                float f38 = e10 / 2.0f;
                float f39 = f37 + f38;
                b bVar4 = b.HEART;
                i4.g(i4Var2, bVar4, i4Var2.i() - k18, f39, 0.42f, 0.0f, 48);
                i4.g(i4Var, bVar3, i4Var.i() + k18, f39, 0.42f, 0.0f, 48);
                float i53 = i4Var.i() - k18;
                float f40 = f39 + f38 + 0.03f;
                int i54 = i4Var.e.f1964a;
                i4.o(i53, f40, 0.24990001f, d(i54, 38), 16, i4Var);
                i4.o(i4Var.i() + k18, f40, 0.24990001f, d(i54, 38), 16, i4Var);
                float f41 = f37 + f36 + 0.06f + f38;
                i4.g(i4Var, bVar3, i4Var.i() - k18, f41, 0.42f, 0.0f, 48);
                i4.g(i4Var, bVar4, i4Var.i() + k18, f41, 0.42f, 0.0f, 48);
                float f42 = f41 + f38 + 0.03f;
                i4.o(i4Var.i() - k18, f42, 0.24990001f, d(i54, 38), 16, i4Var);
                i4.o(i4Var.i() + k18, f42, 0.24990001f, d(i54, 38), 16, i4Var);
                return;
            case 16:
                f(i4Var2, this.f2694b, "");
                b bVar5 = b.GOLD;
                float e11 = e(bVar5, 0.52f);
                float k19 = (i4Var2.k() * 0.08f) + i4Var2.i();
                float f43 = e11 / 2.0f;
                float f44 = 0.235f + f43 + 0.02f;
                i4.g(i4Var2, bVar5, k19, f44, 0.52f, 3.0f, 32);
                d2 d2Var12 = i4Var2.e;
                i4.s(i4Var2, k19, f44, 0.182f, f43, true, d2Var12.f1966c, 0.15f, 128);
                b bVar6 = b.HEART;
                float e12 = (e(bVar6, 0.34f) / 2.0f) + f43 + f44 + 0.045f;
                i4.g(i4Var, bVar6, i4Var.h() + 0.119f + 0.02f, e12, 0.34f, -6.0f, 32);
                float i55 = i4Var.i() + (i4Var.k() * 0.17f);
                float k20 = 0.48f * i4Var.k();
                int i56 = d2Var12.f1964a;
                i4.o(i55, e12 - 0.03f, k20, d(i56, 64), 16, i4Var);
                i4.o(i55, e12 + 0.02f, k20, d(i56, 31), 16, i4Var);
                float h18 = i4Var.h() + 0.045f;
                int i57 = c2.f1908c;
                i4.a(i4Var, h18, 0.305f, 0.05f, 0.033333335f, Integer.valueOf(i57), null, 0.0f, 0.0f, 15.0f, "heart", 224);
                i4.p(i4Var, i4Var.j() - 0.045f, 0.295f, 0.05f, Integer.valueOf(i57), null, 16);
                i4.p(i4Var, i4Var.j() - 0.05f, 0.87f, 0.045f, null, Integer.valueOf(i57), 8);
                return;
            case 17:
                i(i4Var2, this.f2694b, false);
                int i58 = i4Var2.e.f1964a;
                float f45 = 0.66999996f / 12;
                for (int i59 = 0; i59 < 12; i59++) {
                    float f46 = ((i59 + 0.5f) * f45) + 0.235f;
                    i4.a(i4Var2, i4Var2.h() + 0.032f, f46, 0.052f, 0.03466667f, null, Integer.valueOf(d(i58, 61)), 0.004f, 0.2f, 0.0f, null, 784);
                    float h19 = i4Var.h() + 0.085f;
                    i4.o((i4Var.j() + h19) / 2.0f, f46 + 0.026f, i4Var.j() - h19, d(i58, 26), 16, i4Var);
                    i4Var2 = i4Var;
                }
                return;
            case 18:
                String valueOf2 = String.valueOf(3);
                float j14 = i4Var2.j() - 0.075f;
                d2 d2Var13 = i4Var2.e;
                i4.t(i4Var2, valueOf2, j14, 0.072f, 0.085f, d(d2Var13.f1967d, 64), "sans", null, 3968);
                float h20 = i4Var.h() + 0.16f;
                int i60 = d2Var13.f1964a;
                i4.t(i4Var, this.f2694b, h20, 0.085f, 0.024f, d(i60, 115), "casual", Float.valueOf(0.32f), 3520);
                b bVar7 = b.CLASSIC_CORNERS;
                float e13 = e(bVar7, 0.52f);
                b bVar8 = b.POLAROID;
                float e14 = e(bVar8, 0.52f);
                float b11 = i4.b(e13 + 0.075f + e14, 0.17f, 4, i4Var);
                float f47 = e13 / 2.0f;
                float f48 = b11 + f47;
                i4.g(i4Var, bVar7, i4Var.i(), f48, 0.52f, 0.0f, 48);
                i4.o(i4Var.i(), 0.032f + f48 + f47, 0.31304f, d(i60, 46), 16, i4Var);
                i4.g(i4Var, bVar8, i4Var.i(), (e14 / 2.0f) + b11 + e13 + 0.075f, 0.52f, 2.0f, 32);
                return;
            case 19:
                d2 d2Var14 = i4Var2.e;
                int i61 = d2Var14.f1966c;
                i4.t(i4Var2, this.f2694b, i4Var2.i(), 0.08f, 0.034f, d2Var14.f1964a, "josefin", null, 3968);
                i4.o(i4Var.i(), 0.12f, i4Var.k(), d(i61, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), 16, i4Var);
                b bVar9 = b.ROUNDED;
                float e15 = e(bVar9, 0.44f);
                float f49 = e15 + 0.1f;
                float b12 = i4.b(f49 + e15 + 0.03f, 0.16f, 4, i4Var);
                float f50 = e15 / 2.0f;
                float f51 = b12 + f50;
                i4.g(i4Var, bVar9, i4Var.i() - 0.22f, f51, 0.44f, 0.0f, 48);
                b bVar10 = b.CIRCLE;
                i4.g(i4Var, bVar10, i4Var.i() + 0.22f, f51, 0.44f, 0.0f, 48);
                float i62 = i4Var.i() - 0.22f;
                float f52 = f51 + f50 + 0.03f;
                int i63 = d2Var14.f1964a;
                i4.o(i62, f52, 0.2618f, d(i63, 38), 16, i4Var);
                i4.o(i4Var.i() + 0.22f, f52, 0.2618f, d(i63, 38), 16, i4Var);
                float f53 = b12 + f49 + f50;
                i4.g(i4Var, bVar10, i4Var.i() - 0.22f, f53, 0.44f, 0.0f, 48);
                i4.g(i4Var, bVar9, i4Var.i() + 0.22f, f53, 0.44f, 0.0f, 48);
                float f54 = f53 + f50 + 0.03f;
                i4.o(i4Var.i() - 0.22f, f54, 0.2618f, d(i63, 38), 16, i4Var);
                i4.o(i4Var.i() + 0.22f, f54, 0.2618f, d(i63, 38), 16, i4Var);
                return;
            default:
                float i64 = i4Var2.i();
                float k21 = i4Var2.k() * 0.92f;
                d2 d2Var15 = i4Var2.e;
                i4.a(i4Var2, i64, 0.42f, k21, 0.44f, Integer.valueOf(d2Var15.f1967d), null, 0.0f, 0.03f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.3f, i4Var.k() * 0.92f, 0.16f, Integer.valueOf((d2Var15.f1966c & 16777215) | 1711276032), null, 0.0f, 0.02f, 180.0f, "triangle", 96);
                i4.t(i4Var, this.f2694b, i4Var.i(), 0.7f, 0.026f, d2Var15.f1964a, "casual", null, 4032);
                i4.r(i4Var.i(), 0.19f, 0.0f, 0, 4, i4Var);
                return;
        }
    }
}
