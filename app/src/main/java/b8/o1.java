package b8;
import a5.a;
import b8.h4;
import c2.d;
import c2.e;
import c2.f;
import c2.g;
import c2.h;
import c2.i;
import c2.q;
import l7.b;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2471a;

    public /* synthetic */ o1(int i) {
        this.f2471a = i;
    }

    private final void b(i4 i4Var) {
    }

    private final void c(i4 i4Var) {
        d2 d2Var = i4Var.e;
        int i = d2Var.f1966c;
        i4.t(i4Var, "Fiestas de Cumpleaños", i4Var.i(), 0.08f, 0.036f, d2Var.f1964a, "josefin", null, 3968);
        i4.o(i4Var.i(), 0.12f, 0.6f * i4Var.k(), d(i, 128), 16, i4Var);
        b bVar = b.CLASSIC_CORNERS;
        float e = e(bVar, 0.54f);
        i4.g(i4Var, bVar, i4Var.i(), 0.34f, 0.54f, 0.0f, 48);
        i4.s(i4Var, i4Var.i(), 0.34f, 0.18900001f, e / 2.0f, true, d2Var.f1967d, 0.14f, 128);
        i4.p(i4Var, i4Var.h() + 0.1f, 0.18f, 0.05f, Integer.valueOf(i), null, 16);
        i4.p(i4Var, i4Var.j() - 0.1f, 0.18f, 0.05f, Integer.valueOf(i), null, 16);
        i4.t(i4Var, "Cómo celebramos tu cumpleaños & Tus regalos", i4Var.i(), 0.56f, 0.024f, i, "serif", null, 3904);
        for (float f10 = 0.62f; f10 < 0.88f; f10 += 0.046f) {
            i4.o(i4Var.i(), f10, i4Var.k() * 0.84f, d(d2Var.f1964a, 38), 16, i4Var);
        }
    }

    private final void d(i4 i4Var) {
        f(i4Var, "Bolsillo de recuerdos", "");
        b bVar = b.STAMP;
        float e = 0.02f + (e(bVar, 0.3f) / 2.0f) + 0.235f;
        i4.g(i4Var, bVar, i4Var.i() - (i4Var.k() * 0.18f), e, 0.3f, -4.0f, 32);
        i4.g(i4Var, bVar, (i4Var.k() * 0.18f) + i4Var.i(), e, 0.3f, 4.0f, 32);
        float i = i4Var.i();
        float k3 = i4Var.k() * 0.88f;
        d2 d2Var = i4Var.e;
        Integer valueOf = Integer.valueOf(d(d2Var.f1967d, 64));
        int i10 = c2.f1908c;
        i4.a(i4Var, i, 0.72f, k3, 0.4f, valueOf, Integer.valueOf(d(i10, 128)), 0.0f, 0.03f, 0.0f, null, 832);
        i4.a(i4Var, i4Var.i(), 0.58500004f, i4Var.k() * 0.88f, 0.13f, Integer.valueOf(d(d2Var.f1966c, 85)), null, 0.0f, 0.02f, 180.0f, "triangle", 96);
        i4Var.d(i4Var.i(), 0.625f, 0.095f, Integer.valueOf(d(e, 221)), Integer.valueOf(i10));
        i4.a(i4Var, i4Var.i(), 0.625f, 0.042f, 0.027999999f, Integer.valueOf(i10), null, 0.0f, 0.0f, 0.0f, "heart", 480);
        i4.t(i4Var, "Guarda aquí tus entradas y notas", i4Var.i(), 0.81000006f, 0.022f, d2Var.f1964a, "cormorant", a.e(i4Var, 0.7f), 3392);
    }

    @Override // h4
    public final void a(i4 i4Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i;
        int i10;
        int i11;
        Integer num;
        switch (this.f2471a) {
            case 0:
                return;
            case 1:
                d2 d2Var = i4Var.e;
                int i12 = d2Var.f1966c;
                a(i4Var.h() + 0.05f, 0.22f, i4Var.j() - 0.05f, 0.78f, 0.055f, 0.0032f, d(i12, 153), i4Var);
                c2.l(i4Var, i4Var.i(), 0.22f, 0.1f, d(i12, 128));
                i4.t(i4Var, "Los animales no son toda nuestra vida, pero hacen que nuestra vida sea completa.", i4Var.i(), 0.48f, 0.038f, d2Var.f1964a, "serif", a.e(i4Var, 0.78f), 3392);
                c2.l(i4Var, i4Var.i(), 0.74f, 0.1f, d(i12, 128));
                return;
            case 2:
                f(i4Var, "Sueños por cumplir juntos", "");
                for (int i13 = 0; i13 < 6; i13++) {
                    float f16 = 0.29f + (i13 * 0.105f);
                    i4.a(i4Var, i4Var.h() + 0.055f, f16, 0.045f, 0.030000001f, Integer.valueOf(c2.f1908c), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                    g(i4Var, f16, 51);
                    g(i4Var, f16 + 0.033f, 20);
                }
                return;
            case 3:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.9f, null, Integer.valueOf(d(-790554, 82)), 0.005f, 0.015f, 0.0f, null, 784);
                float i14 = i4Var.i();
                float k3 = i4Var.k() * 0.28f;
                int d2 = d(-790554, 138);
                i4.a(i4Var, i14, 0.215f, k3, 0.0032f, Integer.valueOf(d2), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.425f, i4Var.k() * 0.28f, 0.0032f, Integer.valueOf(d2), null, 0.0f, 0.0f, 0.0f, null, 864);
                h(i4Var, 0.635f, 0.055f, d(-790554, FacebookMediationAdapter.ERROR_NULL_CONTEXT), d(-2310006, 219), null, 480);
                i4.f(i4Var, d(-790554, 112), 0.0f, 6);
                return;
            case 4:
                int i15 = c2.f1913j;
                if (i4Var.m()) {
                    f10 = 1.0f;
                } else {
                    f10 = -1.0f;
                }
                float f17 = f10;
                if (i4Var.m()) {
                    f11 = 0.10080001f;
                } else {
                    f11 = 0.89919996f;
                }
                float f18 = f11;
                double radians = Math.toRadians(52.0d);
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float f19 = 0.9300749f - (((4.86f * sin) * 0.048f) / 1.5f);
                int i16 = 0;
                while (i16 < 4) {
                    float f20 = i16 * 1.62f;
                    int i17 = i16 % 2;
                    if (i17 == 1) {
                        f12 = 0.26f;
                    } else {
                        f12 = -0.26f;
                    }
                    i4.a(i4Var, (((f12 * sin) + (f20 * cos)) * f17 * 0.048f) + f18, ((((f20 * sin) - (f12 * cos)) * 0.048f) / 1.5f) + f19, 0.048f, 0.027850302f, Integer.valueOf(d(i15, c2.f1910f[i16])), null, 0.0f, 0.0f, (-((52.0f * f17) * 0.55f)) - ((i17 * f17) * 5.0f), "paw", 96);
                    i16++;
                    cos = cos;
                    sin = sin;
                }
                return;
            case 5:
                d2 d2Var2 = i4Var.e;
                int i18 = d2Var2.f1966c;
                int i19 = d2Var2.f1964a;
                i4.t(i4Var, "Lo Que Ama & Lo Que Asusta", i4Var.i(), 0.08f, 0.034f, d2Var2.f1964a, "josefin", null, 3968);
                i4.o(i4Var.i(), 0.12f, 0.6f * i4Var.k(), d(i18, 128), 16, i4Var);
                i4.a(i4Var, i4Var.i(), 0.5f, 0.002f, 0.68f, Integer.valueOf(d(i18, 77)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, "Le Encanta ❤️", i4Var.i() - 0.22f, 0.17f, 0.028f, i18, "sans", null, 3968);
                i4.t(i4Var, "Le Asusta / Odia ⚡", i4Var.i() + 0.22f, 0.17f, 0.028f, i18, "sans", null, 3968);
                for (float f21 = 0.24f; f21 < 0.85f; f21 += 0.06f) {
                    i4.o(i4Var.i() - 0.22f, f21, 0.36f, d(i19, 38), 16, i4Var);
                    i4.o(i4Var.i() + 0.22f, f21, 0.36f, d(i19, 38), 16, i4Var);
                }
                return;
            case 6:
                d2 d2Var3 = i4Var.e;
                int i20 = d2Var3.f1966c;
                i4.t(i4Var, "Ficha de Mi Mascota", i4Var.i(), 0.08f, 0.036f, d2Var3.f1964a, "josefin", null, 3968);
                i4.o(i4Var.i(), 0.12f, 0.6f * i4Var.k(), d(i20, 128), 16, i4Var);
                b bVar = b.CIRCLE;
                float e = e(bVar, 0.48f);
                i4.g(i4Var, bVar, i4Var.i(), 0.27f, 0.48f, 0.0f, 48);
                i4.s(i4Var, i4Var.i(), 0.27f, 0.168f, e / 2.0f, true, d2Var3.f1967d, 0.14f, 128);
                Iterator it = qe.h("Nombre:", "Raza / Especie:", "Fecha Nacimiento:", "Llegada a Casa:", "Color Pelo / Ojos:", "Comida Favorita:", "Juguete Favorito:").iterator();
                float f22 = 0.46f;
                while (it.hasNext()) {
                    int i21 = i20;
                    i4.t(i4Var, (String) it.next(), 0.18f + i4Var.h(), f22, 0.019f, i21, "sans", Float.valueOf(0.34f), 3456);
                    float f23 = f22;
                    i4.o(i4Var.i() + 0.1f, 0.005f + f23, 0.42f, d(d2Var3.f1964a, 51), 16, i4Var);
                    f22 = f23 + 0.058f;
                    i20 = i21;
                }
                return;
            case 7:
                int i22 = i;
                List<float[]> list = c2.f1911g;
                float f24 = ((float[]) qe.l.w(list))[0];
                float f25 = ((float[]) qe.l.C(list))[0];
                if (i4Var.m()) {
                    f13 = 1.0f;
                } else {
                    f13 = -1.0f;
                }
                float f26 = f13;
                double radians2 = Math.toRadians(58.0d);
                float cos2 = (float) Math.cos(radians2);
                float sin2 = (float) Math.sin(radians2);
                if (i4Var.m()) {
                    f14 = (f24 * 0.6f) + 0.072000004f;
                } else {
                    f14 = 0.928f - (f24 * 0.6f);
                }
                float f27 = f14;
                float f28 = (0.944f - ((f25 / 1.5f) * 0.5f)) - (((((float[]) qe.l.C(list))[1] * sin2) * 0.07f) / 1.5f);
                for (float[] fArr : list) {
                    float f29 = fArr[0];
                    float f30 = fArr[1];
                    float f31 = sin2;
                    int d10 = d(i22, (int) fArr[3]);
                    i4.a(i4Var, (f30 * cos2 * f26 * 0.07f) + f27, (((f30 * f31) * 0.07f) / 1.5f) + f28, f29, f29 / 1.5f, Integer.valueOf(d10), null, 0.0f, 0.0f, (-(58.0f * f26 * 0.55f)) + (fArr[2] * f26), "butterfly", 96);
                    sin2 = f31;
                    cos2 = cos2;
                }
                return;
            case 8:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.9f, null, Integer.valueOf(d(-856349, 92)), 0.005f, 0.015f, 0.0f, null, 784);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.045f, 0.874f, null, Integer.valueOf(d(-856349, 36)), 0.0035f, 0.012f, 0.0f, null, 784);
                float i23 = i4Var.i();
                float k4 = i4Var.k() * 0.26f;
                int d11 = d(-856349, 147);
                i4.a(i4Var, i23, 0.252f, k4, 0.003f, Integer.valueOf(d11), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.452f, i4Var.k() * 0.26f, 0.003f, Integer.valueOf(d11), null, 0.0f, 0.0f, 0.0f, null, 864);
                q(0.8f, 0.03f, -856349, i4Var);
                return;
            case 9:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.92f, null, Integer.valueOf(d(-2847894, 179)), 0.004f, 0.03f, 0.0f, null, 784);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.05f, 0.88f, null, Integer.valueOf(d(-2847894, 77)), 0.002f, 0.02f, 0.0f, null, 784);
                float i24 = (i4Var.i() - (i4Var.k() / 2.0f)) + 0.06f;
                int d12 = d(-2847894, 204);
                c2.l(i4Var, i24, 0.1f, 0.05f, d12);
                c2.l(i4Var, ((i4Var.k() / 2.0f) + i4Var.i()) - 0.06f, 0.1f, 0.05f, d12);
                c2.l(i4Var, (i4Var.i() - (i4Var.k() / 2.0f)) + 0.06f, 0.9f, 0.05f, d12);
                c2.l(i4Var, ((i4Var.k() / 2.0f) + i4Var.i()) - 0.06f, 0.9f, 0.05f, d12);
                float i25 = i4Var.i();
                int d13 = d(-2847894, 153);
                i4Var.d(i25, 0.22f, 0.16f, Integer.valueOf(d(-519, 238)), Integer.valueOf(d13));
                c2.l(i4Var, i4Var.i(), 0.22f, 0.1f, -2847894);
                i4.a(i4Var, i4Var.i(), 0.53f, i4Var.k() * 0.45f, 0.0025f, Integer.valueOf(d13), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.74f, i4Var.k() * 0.45f, 0.0025f, Integer.valueOf(d13), null, 0.0f, 0.0f, 0.0f, null, 864);
                return;
            case 10:
                d2 d2Var4 = i4Var.e;
                int i26 = d2Var4.f1966c;
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.06f, 0.88f, null, Integer.valueOf(d(i26, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 0.0025f, 0.03f, 0.0f, null, 784);
                c2.l(i4Var, i4Var.i(), 0.22f, 0.14f, i26);
                i4.t(i4Var, "Para Siempre en Mi Corazón", i4Var.i(), 0.36f, 0.044f, d2Var4.f1964a, "josefin", null, 3968);
                i4.t(i4Var, "No importa cuántos años pasen, siempre serás mi peludito favorito.", i4Var.i(), 0.48f, 0.036f, d2Var4.f1964a, "serif", a.e(i4Var, 0.75f), 3392);
                i4.o(i4Var.i(), 0.72f, 0.65f * i4Var.k(), d(i26, 128), 16, i4Var);
                i4.t(i4Var, "Con todo mi amor, ________________", i4Var.i(), 0.78f, 0.024f, d2Var4.f1964a, "casual", null, 4032);
                return;
            case 11:
                float h3 = i4Var.h();
                float j10 = i4Var.j();
                int d14 = d(-594979, 140);
                a(h3, 0.075f, j10, 0.925f, 0.075f, 0.0032f, d14, i4Var);
                float k10 = (i4Var.k() * 0.92f) / 0.7f;
                b bVar2 = b.CLASSIC_CORNERS;
                i4.g(i4Var, bVar2, i4Var.i(), 0.115f + (e(bVar2, k10) / 2.0f), k10, 0.0f, 48);
                i4.a(i4Var, i4Var.i(), 0.635f, i4Var.k() * 0.22f, 0.0028f, Integer.valueOf(d14), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.805f, i4Var.k() * 0.22f, 0.0028f, Integer.valueOf(d14), null, 0.0f, 0.0f, 0.0f, null, 864);
                return;
            case 12:
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k(), 0.9f, null, Integer.valueOf(d(-527900, 89)), 0.0045f, 0.015f, 0.0f, null, 784);
                i4.a(i4Var, i4Var.i(), 0.36f, 0.42f, 0.34f, -527900, null, 0.0f, 0.025f, -3.0f, null, 608);
                float i27 = i4Var.i() - 0.085f;
                d2 d2Var5 = i4Var.e;
                i4.a(i4Var, i27, 0.295f, 0.085f, 0.05666667f, Integer.valueOf(d2Var5.f1967d), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i() + 0.085f, 0.295f, 0.075f, null, Integer.valueOf(d2Var5.f1966c), 8);
                i4.o(i4Var.i(), 0.4f, 0.26f, 771751936, 16, i4Var);
                i4.o(i4Var.i(), 0.44f, 0.26f, 771751936, 16, i4Var);
                i4.s(i4Var, i4Var.i(), 0.36f, 0.21f, 0.17f, false, d2Var5.f1966c, 0.13f, 128);
                i4.s(i4Var, i4Var.i(), 0.36f, 0.21f, 0.17f, true, d2Var5.f1967d, 0.13f, 128);
                float i28 = i4Var.i();
                float k11 = i4Var.k() * 0.22f;
                int d15 = d(-527900, 140);
                i4.a(i4Var, i28, 0.635f, k11, 0.0028f, Integer.valueOf(d15), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.805f, i4Var.k() * 0.22f, 0.0028f, Integer.valueOf(d15), null, 0.0f, 0.0f, 0.0f, null, 864);
                return;
            case 13:
                Integer num2 = -2495756;
                u4 u4Var = new u4(0);
                u4Var.f2825v = 7;
                int i29 = 0;
                while (true) {
                    int i30 = 9;
                    if (i29 < 9) {
                        int i31 = 0;
                        while (i31 < 6) {
                            float f32 = i31 + 0.5f;
                            if (i29 % 2 == 1) {
                                f15 = 0.5f;
                            } else {
                                f15 = 0.0f;
                            }
                            float e8 = u4Var.e(-0.055f, 0.055f) + ((f32 + f15) / 6);
                            float e10 = u4Var.e(-0.038f, 0.038f) + ((i29 + 0.5f) / i30);
                            if (e8 < 0.02f || e8 > 0.99f) {
                                i = i29;
                                i10 = i30;
                                i11 = i31;
                            } else {
                                int i32 = ((u4Var.f2825v * 1103515245) + 12345) & Integer.MAX_VALUE;
                                u4Var.f2825v = i32;
                                float f33 = i32 / 2.14748365E9f;
                                float e11 = u4Var.e(-180.0f, 180.0f);
                                if (f33 < 0.52f) {
                                    float e12 = u4Var.e(0.075f, 0.15f);
                                    i10 = i30;
                                    i11 = i31;
                                    i = i29;
                                    i4.a(i4Var, e8, e10, e12, e12 / 1.5f, -525573, null, 0.0f, 0.0f, e11, "flower", 96);
                                    if (e12 > 0.1f) {
                                        float f34 = e12 * 0.3f;
                                        i4.a(i4Var, e8, e10, f34, f34 / 1.5f, -12683602, null, 0.0f, 0.0f, e11, "berries", 96);
                                    }
                                } else {
                                    i = i29;
                                    i10 = i30;
                                    i11 = i31;
                                    if (f33 < 0.8f) {
                                        float e13 = u4Var.e(0.13f, 0.21f);
                                        num = num2;
                                        i4.a(i4Var, e8, e10, 0.62f * e13, e13 / 1.5f, num, null, 0.0f, 0.0f, e11, "sprig", 96);
                                    } else {
                                        num = num2;
                                        float e14 = u4Var.e(0.045f, 0.075f);
                                        i4.a(i4Var, e8, e10, e14, e14 / 1.5f, num, null, 0.0f, 0.0f, e11, "berries", 96);
                                    }
                                    i31 = i11 + 1;
                                    num2 = num;
                                    i29 = i;
                                    i30 = i10;
                                }
                            }
                            num = num2;
                            i31 = i11 + 1;
                            num2 = num;
                            i29 = i;
                            i30 = i10;
                        }
                        i29++;
                    } else {
                        return;
                    }
                }
                break;
            case 14:
                float i33 = i4Var.i();
                float k12 = i4Var.k();
                int i34 = c2.f1908c;
                i4.a(i4Var, i33, 0.5f, k12, 0.86f, null, Integer.valueOf(d(i34, 179)), 0.004f, 0.02f, 0.0f, null, 784);
                i4.a(i4Var, i4Var.i(), 0.5f, i4Var.k() - 0.045f, 0.83f, null, Integer.valueOf(d(i34, 77)), 0.002f, 0.015f, 0.0f, null, 784);
                a(i4Var.h() + 0.035f, 0.105f, i4Var.j() - 0.035f, 0.895f, 0.055f, 0.003f, d(i34, 204), i4Var);
                i4.e(i4Var, i4Var.i(), 0.2f, 0.15f, null, Integer.valueOf(d(i34, 153)), 8);
                i4.e(i4Var, i4Var.i(), 0.2f, 0.12f, null, Integer.valueOf(d(i34, 77)), 8);
                i4.a(i4Var, i4Var.i(), 0.2f, 0.058f, 0.038666666f, Integer.valueOf(i34), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                float i35 = i4Var.i() - (i4Var.k() * 0.22f);
                int i36 = c2.f1909d;
                i4.p(i4Var, i35, 0.2f, 0.045f, Integer.valueOf(i36), null, 16);
                i4.p(i4Var, (i4Var.k() * 0.22f) + i4Var.i(), 0.2f, 0.045f, Integer.valueOf(i36), null, 16);
                i4Var.n(i4Var.i(), 0.275f, i4Var.k() * 0.42f, 0.0025f, d(i34, 128));
                i4.a(i4Var, i4Var.i(), 0.55f, i4Var.k() * 0.46f, 0.0025f, Integer.valueOf(d(i34, 153)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, i4Var.i(), 0.75f, i4Var.k() * 0.46f, 0.0025f, Integer.valueOf(d(i34, 153)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4Var.d(i4Var.i(), 0.845f, 0.15f, Integer.valueOf(d(e, 204)), Integer.valueOf(i34));
                i4.e(i4Var, i4Var.i(), 0.845f, 0.12f, null, Integer.valueOf(d(i34, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), 8);
                i4.a(i4Var, i4Var.i(), 0.845f, 0.06f, 0.04f, Integer.valueOf(i34), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i() - (i4Var.k() * 0.24f), 0.845f, 0.038f, Integer.valueOf(i34), null, 16);
                i4.p(i4Var, (i4Var.k() * 0.24f) + i4Var.i(), 0.845f, 0.038f, Integer.valueOf(i34), null, 16);
                return;
            case 15:
                i4 i4Var2 = i4Var;
                d2 d2Var6 = i4Var2.e;
                b bVar3 = b.POLAROID;
                float f35 = 0.66f;
                float e15 = e(bVar3, 0.66f);
                float b10 = i4.b((e15 * 2.0f) + 0.05f, 0.0f, 6, i4Var2);
                int i37 = 0;
                while (i37 < 2) {
                    float f36 = e15 / 2.0f;
                    float f37 = ((e15 + 0.05f) * i37) + b10 + f36;
                    i4.g(i4Var2, bVar3, i4Var2.i(), f37, f35, 0.0f, 48);
                    i4.s(i4Var, i4Var.i(), f37, 0.231f, f36, false, 0, 0.13f, 160);
                    i4.s(i4Var, i4Var.i(), f37, 0.231f, f36, true, d2Var6.f1967d, 0.13f, 128);
                    i4.o(i4Var.i(), 0.154f + f37, 0.2772f, d(d2Var6.f1964a, 64), 16, i4Var);
                    i37++;
                    i4Var2 = i4Var;
                    bVar3 = bVar3;
                    f35 = f35;
                }
                return;
            case 16:
                d2 d2Var7 = i4Var.e;
                int i38 = d2Var7.f1966c;
                i4.t(i4Var, "El Día que Llegaste a Mi Vida", i4Var.i(), 0.08f, 0.034f, d2Var7.f1964a, "josefin", null, 3968);
                i4.o(i4Var.i(), 0.12f, i4Var.k() * 0.6f, d(i38, 128), 16, i4Var);
                b bVar4 = b.POLAROID;
                float e16 = e(bVar4, 0.52f);
                i4.g(i4Var, bVar4, i4Var.i(), 0.32f, 0.52f, -2.0f, 32);
                i4.s(i4Var, i4Var.i(), 0.32f, 0.182f, e16 / 2.0f, false, d2Var7.f1966c, 0.14f, 128);
                i4.t(i4Var, "Cómo nos conocimos & Tu primer día en casa", i4Var.i(), 0.54f, 0.024f, i38, "serif", null, 3904);
                for (float f38 = 0.6f; f38 < 0.88f; f38 += 0.046f) {
                    i4.o(i4Var.i(), f38, i4Var.k() * 0.84f, d(d2Var7.f1964a, 38), 16, i4Var);
                }
                return;
            case 17:
                c(i4Var);
                return;
            case 18:
                d(i4Var);
                return;
            default:
                float f39 = c2.f1907b;
                i4.a(i4Var, f39, 0.5f, 1.16f, 0.3f, -725020, null, 0.0f, 0.0f, 0.0f, null, 864);
                i4Var.n(f39, 0.58f, 1.16f, 0.0016f, d(-13946559, 40));
                i4.a(i4Var, f39, 0.615f, 1.16f, 0.07f, -5258018, null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.t(i4Var, "SCRAPLY", 0.235f, 0.38f, 0.021f, -13946559, "sans", null, 3968);
                int d16 = d(-13946559, 136);
                i4.a(i4Var, 0.235f, 0.484f, 0.1955f, 0.09f, Integer.valueOf(d(-13946559, 48)), null, 0.0f, 0.07f, 0.0f, null, 864);
                i4.a(i4Var, 0.18924999f, 0.482f, 0.088f, 0.082f, -1, Integer.valueOf(d16), 0.0018f, 0.05f, 0.0f, null, 768);
                i4.a(i4Var, 0.28075f, 0.482f, 0.088f, 0.082f, -1, Integer.valueOf(d16), 0.0018f, 0.05f, 0.0f, null, 768);
                i4.a(i4Var, 0.235f, 0.482f, 0.0024f, 0.08364f, Integer.valueOf(d(-13946559, 96)), null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, 0.235f, 0.49199998f, 0.0055f, 0.106000006f, -14340022, null, 0.0f, 0.0f, 0.0f, null, 864);
                i4.a(i4Var, 0.234f, 0.542f, 0.006f, 0.007f, -14340022, null, 0.0f, 0.0f, -12.0f, null, 608);
                i4.t(i4Var, "CLASSIC", 0.535f, 0.442f, 0.064f, -13946559, "serif", null, 4032);
                int d17 = d(-13946559, 80);
                i4Var.n(0.535f, 0.49f, 0.2f, 0.0016f, d17);
                i4.t(i4Var, "COLLECTION", 0.535f, 0.513f, 0.0155f, d(-13946559, 208), "sans", null, 3968);
                i4Var.n(0.535f, 0.536f, 0.2f, 0.0016f, d17);
                i4.t(i4Var, "Observe, imagine, sketch & write", 0.535f, 0.56f, 0.011f, d(-13946559, 153), "sans", null, 3904);
                i4.t(i4Var, "Plain Notebook · Carnet pages blanches", 0.265f, 0.615f, 0.0135f, -13946559, "serif", null, 3904);
                i4.t(i4Var, "100 g/m² · 68 lb", 0.635f, 0.615f, 0.0125f, d(-13946559, 204), "sans", null, 3968);
                i4.f(i4Var, d(-725020, 153), f39, 2);
                return;
        }
    }
}
