package b8;
import a5.a;
import b8.h4;
import c2.d;
import c2.i;
import g3.a;
import l7.b;
import m.h;

import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f1906a = qe.k.u(new Integer[]{1, 11, 20, 23});

    /* renamed from: b, reason: collision with root package name */
    public static final float f1907b = 0.5148515f;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1908c = -2838729;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1909d = -1521504;
    public static final int e = -9760220;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1910f = {230, 204, 176, 147};

    /* renamed from: g, reason: collision with root package name */
    public static final List f1911g = qe.h(new float[]{0.038f, 0.0f, -6.0f, 158.0f}, new float[]{0.052f, 1.55f, 7.0f, 204.0f}, new float[]{0.07f, 2.95f, -4.0f, 242.0f});

    /* renamed from: h, reason: collision with root package name */
    public static final int f1912h = -7683875;
    public static final int i = -7683875;

    /* renamed from: j, reason: collision with root package name */
    public static final int f1913j = -15066598;

    public static final void a(float f10, float f11, float f12, float f13, float f14, float f15, int i10, i4 i4Var) {
        float f16;
        float f17 = f14 / 1.5f;
        float f18 = f15 * 1.5f;
        for (pe.j jVar : qe.h(new pe.j(Float.valueOf(f10), Float.valueOf(f11)), new pe.j(Float.valueOf(f12), Float.valueOf(f11)), new pe.j(Float.valueOf(f10), Float.valueOf(f13)), new pe.j(Float.valueOf(f12), Float.valueOf(f13)))) {
            float floatValue = ((Number) jVar.f22693u).floatValue();
            float floatValue2 = ((Number) jVar.f22694v).floatValue();
            float f19 = -1.0f;
            if (floatValue == f10) {
                f16 = 1.0f;
            } else {
                f16 = -1.0f;
            }
            if (floatValue2 == f11) {
                f19 = 1.0f;
            }
            i4.a(i4Var, ((f16 * f14) / 2.0f) + floatValue, floatValue2, f14, f15, Integer.valueOf(i10), null, 0.0f, 0.0f, 0.0f, null, 864);
            i4.a(i4Var, floatValue, ((f19 * f17) / 2.0f) + floatValue2, f18, f17, Integer.valueOf(i10), null, 0.0f, 0.0f, 0.0f, null, 864);
        }
    }

    public static y1 c(String str, b bVar) {
        bVar.getClass();
        return new y1(bVar, str, 1);
    }

    public static final int d(int i10, int i11) {
        return (i10 & 16777215) | (i11 << 24);
    }

    public static final float e(b bVar, float f10) {
        int i10;
        float f11 = f10 * 0.7f;
        if (bVar == null) {
            i10 = -1;
        } else {
            i10 = w7.b5.f27984a[bVar.ordinal()];
        }
        float f12 = 1.1f;
        switch (i10) {
            case 4:
                f12 = 1.3f;
                break;
            case 5:
            case 7:
            case 10:
            case 15:
                f12 = 1.2f;
                break;
            case 6:
                f12 = 0.8f;
                break;
            case 8:
            case 13:
            case 14:
                break;
            case 9:
            case 16:
            case 17:
            default:
                f12 = 1.0f;
                break;
            case 11:
                f12 = 2.7f;
                break;
            case 12:
                f12 = 1.8f;
                break;
            case 18:
                f12 = 3.35f;
                break;
            case 19:
                f12 = 0.85f;
                break;
        }
        return (f11 * f12) / 1.5f;
    }

    public static final void f(i4 i4Var, String str, String str2) {
        float i10 = i4Var.i();
        d2 d2Var = i4Var.e;
        i4.t(i4Var, str, i10, 0.105f, 0.042f, d2Var.f1964a, "great-vibes", Float.valueOf(i4Var.k()), 3520);
        if (!mf.f.u(str2)) {
            i4.t(i4Var, str2, i4Var.i(), 0.155f, 0.019f, d(d2Var.f1964a, 153), "cormorant", a.e(i4Var, 0.8f), 3392);
        }
        i4Var.n(i4Var.i(), 0.185f, i4Var.k() * 0.55f, 0.0026f, d(f1908c, 128));
    }

    public static final void g(i4 i4Var, float f10, int i10) {
        i4.o(i4Var.i() + 0.07f, f10, i4Var.k() - 0.14f, d(i4Var.e.f1964a, i10), 16, i4Var);
    }

    public static void h(i4 i4Var, float f10, float f11, int i10, int i11, Set set, int i12) {
        int i13;
        Set set2;
        Integer num;
        if ((i12 & 64) != 0) {
            i13 = 4;
        } else {
            i13 = 1;
        }
        if ((i12 & 128) != 0) {
            set2 = f1906a;
        } else {
            set2 = set;
        }
        float f12 = 1.4f * f11;
        float f13 = f12 / 1.5f;
        float i14 = i4Var.i() - ((6 * f12) / 2.0f);
        float f14 = f10 - (((i13 - 1) * f13) / 2.0f);
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < 7; i16++) {
                boolean contains = set2.contains(Integer.valueOf((i15 * 7) + i16));
                float f15 = (i16 * f12) + i14;
                float f16 = (i15 * f13) + f14;
                float f17 = f11 / 1.5f;
                Integer num2 = null;
                if (contains) {
                    num = Integer.valueOf(i11);
                } else {
                    num = null;
                }
                if (!contains) {
                    num2 = Integer.valueOf(i10);
                }
                i4.a(i4Var, f15, f16, f11, f17, num, num2, 0.0035f, 0.22f, 0.0f, null, 768);
            }
        }
    }

    public static final void i(i4 i4Var, String str, boolean z3) {
        if (z3) {
            i4.t(i4Var, str, i4Var.i(), 0.098f, 0.046f, i4Var.e.f1964a, "bodoni", a.e(i4Var, 0.92f), 3520);
        } else {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            i4.t(i4Var, upperCase, i4Var.i(), 0.098f, 0.024f, i4Var.e.f1966c, "dm-sans", a.e(i4Var, 0.92f), 3456);
        }
        k(i4Var);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [b8.w1] */
    public static w1 j(final List list, final int i10, final String str, final int i11, final String str2, final String str3, int i12) {
        if ((i12 & 4) != 0) {
            str = "";
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 16) != 0) {
            str2 = "";
        }
        if ((i12 & 32) != 0) {
            str3 = "";
        }
        list.getClass();
        str.getClass();
        return new h4() { // from class: b8.w1
            @Override // h4
            public final void a(i4 i4Var) {
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                boolean z3;
                float f10;
                int i18;
                boolean z9;
                int i19;
                int i20;
                Object obj;
                d2 d2Var = i4Var.e;
                int i21 = d2Var.f1964a;
                float k3 = i4Var.k() / 4.0f;
                int i22 = i10;
                if (i22 == 0) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                float h3 = (i13 * k3) + i4Var.h();
                if (i22 == 0) {
                    i14 = 0;
                } else {
                    i14 = 3;
                }
                int i23 = 4 - i13;
                if (i22 == 0) {
                    i(i4Var, str, true);
                    i15 = i23;
                } else {
                    int i24 = i11;
                    if (i24 > 0) {
                        i15 = i23;
                        i4.t(i4Var, mf.f.x(2, String.valueOf(i24)), i4Var.i(), 0.098f, 0.046f, d(d2Var.f1966c, 48), "bodoni", null, 4032);
                    } else {
                        i15 = i23;
                    }
                    c2.k(i4Var);
                }
                if (i22 == 1) {
                    z3 = true;
                    i17 = i22;
                    f10 = k3;
                    i18 = 3;
                    i16 = 31;
                    i4.a(i4Var, i4Var.h() + (3.0f * k3), 0.575f, k3 * 2.0f, 0.65999997f, Integer.valueOf(d(d2Var.f1967d, 31)), null, 0.0f, 0.02f, 0.0f, null, 864);
                } else {
                    i16 = 31;
                    i17 = i22;
                    z3 = true;
                    f10 = k3;
                    i18 = 3;
                }
                float f11 = 0.575f;
                float f12 = 0.65999997f;
                int i25 = i15;
                for (int i26 = 0; i26 < i25; i26++) {
                    int i27 = i14 + i26;
                    if (i27 >= 0) {
                        List list2 = list;
                        if (i27 < list2.size()) {
                            obj = list2.get(i27);
                            i4.t(i4Var, (String) obj, ((i26 + 0.5f) * f10) + h3, 0.205f, 0.019f, d(i21, 138), "dm-sans", Float.valueOf(0.9f * f10), 3456);
                        }
                    }
                    obj = "";
                    i4.t(i4Var, (String) obj, ((i26 + 0.5f) * f10) + h3, 0.205f, 0.019f, d(i21, 138), "dm-sans", Float.valueOf(0.9f * f10), 3456);
                }
                for (int i28 = 0; i28 < 7; i28++) {
                    float j10 = (i4Var.j() + h3) / 2.0f;
                    float f13 = (0.10999999f * i28) + 0.245f;
                    float j11 = i4Var.j() - h3;
                    if (i28 == 0) {
                        i20 = 71;
                    } else {
                        i20 = i16;
                    }
                    i4.o(j10, f13, j11, d(i21, i20), 16, i4Var);
                }
                int i29 = 0;
                while (i29 < i18) {
                    if (i17 == 0 && i29 == 0) {
                        z9 = z3;
                    } else {
                        z9 = false;
                    }
                    int i30 = i29 + 1;
                    float h10 = (i30 * f10) + i4Var.h();
                    if (z9) {
                        i19 = 51;
                    } else {
                        i19 = 20;
                    }
                    float f14 = f12;
                    float f15 = f11;
                    i4.a(i4Var, h10, f15, 0.0022f, f14, Integer.valueOf(d(i21, i19)), null, 0.0f, 0.0f, 0.0f, null, 864);
                    f11 = f15;
                    f12 = f14;
                    i29 = i30;
                }
                if (i17 == 0) {
                    float f16 = f10 - 0.038f;
                    float h11 = (f16 / 2.0f) + i4Var.h() + 0.019f;
                    int i31 = 0;
                    for (Object obj2 : qe.h(str2, str3)) {
                        int i32 = i31 + 1;
                        if (i31 >= 0) {
                            float f17 = (0.32999998f * i31) + 0.245f;
                            String upperCase = ((String) obj2).toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            i4.t(i4Var, upperCase, (f10 / 2.0f) + i4Var.h(), f17 + 0.038f, 0.019f, d2Var.f1966c, "dm-sans", Float.valueOf(0.84f * f10), 3456);
                            for (int i33 = 0; i33 < 4; i33++) {
                                i4.o(h11, (i33 * 0.055f) + f17 + 0.105f, f16, d(i21, 26), 16, i4Var);
                            }
                            i31 = i32;
                        } else {
                            qe.m.l();
                            throw null;
                        }
                    }
                }
            }
        };
    }

    public static final void k(i4 i4Var) {
        float i10 = i4Var.i();
        float k3 = i4Var.k();
        d2 d2Var = i4Var.e;
        i4.o(i10, 0.15f, k3, d(d2Var.f1964a, 51), 16, i4Var);
        i4.a(i4Var, i4Var.i(), 0.15f, i4Var.k() * 0.13f, 0.0042f, Integer.valueOf(d2Var.f1966c), null, 0.0f, 0.0f, 0.0f, null, 864);
    }

    public static final void l(i4 i4Var, float f10, float f11, float f12, int i10) {
        m(f12, f10, ((0.2f * f12) / 1.5f) + f11, 0.64f, 0.5f, 0.0f, i10, i4Var);
        float f13 = 0.165f * f12;
        float f14 = (((-0.275f) * f12) / 1.5f) + f11;
        m(f12, f10 - f13, f14, 0.25f, 0.31f, -10.0f, i10, i4Var);
        m(f12, f10 + f13, f14, 0.25f, 0.31f, 10.0f, i10, i4Var);
        float f15 = 0.385f * f12;
        float f16 = (((-0.085f) * f12) / 1.5f) + f11;
        m(f12, f10 - f15, f16, 0.25f, 0.31f, -45.0f, i10, i4Var);
        m(f12, f10 + f15, f16, 0.25f, 0.31f, 45.0f, i10, i4Var);
    }

    public static final void m(float f10, float f11, float f12, float f13, float f14, float f15, int i10, i4 i4Var) {
        i4.a(i4Var, f11, f12, f13 * f10, (f10 * f14) / 1.5f, Integer.valueOf(i10), null, 0.0f, 0.0f, f15, "ellipse", 224);
    }

    public static y1 n(b bVar) {
        bVar.getClass();
        return new y1("", bVar);
    }

    public static u1 o(int i10, String str, List list) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return new u1(list, str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [b8.z1] */
    public static z1 p(final List list, final int i10, String str, int i11, String str2, int i12) {
        if ((i12 & 4) != 0) {
            str = "";
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 16) != 0) {
            str2 = "";
        }
        list.getClass();
        final String str3 = str2;
        final String str4 = str;
        final int i13 = i11;
        return new h4() { // from class: b8.z1
            @Override // h4
            public final void a(i4 i4Var) {
                boolean z3;
                int i14;
                int i15;
                String str5;
                int i16;
                Object obj;
                String str6;
                d2 d2Var = i4Var.e;
                int i17 = d2Var.f1964a;
                String str7 = str4;
                if (!mf.f.u(str7)) {
                    String upperCase = str7.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    i4.t(i4Var, upperCase, i4Var.h() + 0.11f, 0.092f, 0.026f, d2Var.f1966c, "sans", Float.valueOf(0.3f), 3456);
                    float h3 = i4Var.h() + 0.3f;
                    i4.o((i4Var.j() + h3) / 2.0f, 0.108f, i4Var.j() - h3, d(i17, 46), 16, i4Var);
                }
                int i18 = i13;
                if (i18 > 0) {
                    i4.t(i4Var, mf.f.x(2, String.valueOf(i18)), i4Var.j() - 0.07f, 0.088f, 0.062f, d(d2Var.f1966c, 43), "sans", null, 3968);
                }
                int i19 = 4;
                float f10 = 0.755f / 4;
                int i20 = 0;
                while (i20 < i19) {
                    float f11 = (i20 * f10) + 0.175f;
                    String str8 = str3;
                    if (!mf.f.u(str8) && i20 == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i21 = i10 + i20;
                    if (!z3 && i21 >= 5) {
                        str5 = str8;
                        i15 = i19;
                        i16 = i21;
                        i14 = i20;
                        i4.a(i4Var, i4Var.i(), (0.45f * f10) + f11, i4Var.k(), 0.86f * f10, Integer.valueOf(d(d2Var.f1967d, 31)), null, 0.0f, 0.03f, 0.0f, null, 864);
                    } else {
                        i14 = i20;
                        i15 = i19;
                        str5 = str8;
                        i16 = i21;
                    }
                    if (z3) {
                        str6 = str5;
                    } else {
                        if (i16 >= 0) {
                            List list2 = list;
                            if (i16 < list2.size()) {
                                obj = list2.get(i16);
                                str6 = (String) obj;
                            }
                        }
                        obj = "";
                        str6 = (String) obj;
                    }
                    String upperCase2 = str6.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    i4.t(i4Var, upperCase2, 0.08f + i4Var.h(), f11 + 0.022f, 0.021f, d2Var.f1966c, "sans", Float.valueOf(0.16f), 3456);
                    if (!z3) {
                        i4.o(i4Var.h() + 0.215f, f11 + 0.034f, 0.07f, d(i17, 51), 16, i4Var);
                    }
                    i4.o(i4Var.i(), f11 + 0.055f, i4Var.k(), d(i17, 38), 16, i4Var);
                    for (int i22 = 0; i22 < 2; i22++) {
                        i4.o(i4Var.i(), f11 + 0.105f + (i22 * 0.045f), i4Var.k(), d(i17, 20), 16, i4Var);
                    }
                    i20 = i14 + 1;
                    i19 = i15;
                }
            }
        };
    }

    public static final void q(float f10, float f11, int i10, i4 i4Var) {
        float f12;
        float f13;
        i4 i4Var2;
        float k3 = i4Var.k() * 0.088f;
        int i11 = 0;
        while (i11 < 7) {
            float x9 = a.x(i11, 3.0f, k3, i4Var.i());
            if (i11 < 5) {
                f12 = f10;
                f13 = f11;
                i4Var2 = i4Var;
                i4.e(i4Var2, x9, f12, f13, Integer.valueOf(d(i10, 158)), null, 16);
            } else {
                f12 = f10;
                f13 = f11;
                i4Var2 = i4Var;
                i4.e(i4Var2, x9, f12, f13, null, Integer.valueOf(d(i10, 158)), 8);
            }
            i11++;
            i4Var = i4Var2;
            f10 = f12;
            f11 = f13;
        }
    }

    public static final void r(i4 i4Var, String str) {
        i4.t(i4Var, str, i4Var.i(), 0.175f, 0.0245f, d(i4Var.e.f1964a, 179), "sans", a.e(i4Var, 0.96f), 3520);
    }

    public static final void s(i4 i4Var, int i10, String str) {
        String valueOf = String.valueOf(i10);
        float j10 = i4Var.j() - 0.075f;
        d2 d2Var = i4Var.e;
        i4.t(i4Var, valueOf, j10, 0.072f, 0.085f, d(d2Var.f1967d, 89), "sans", null, 3968);
        i4.t(i4Var, str, i4Var.h() + 0.24f, 0.095f, 0.033f, d2Var.f1966c, "sans", Float.valueOf(0.48f), 3456);
        i4.o(i4Var.i(), 0.148f, i4Var.k(), d(d2Var.f1964a, 38), 16, i4Var);
    }

    public static final void t(i4 i4Var, float f10, float f11) {
        d2 d2Var = i4Var.e;
        i4.e(i4Var, f10, f11, 0.14f, null, Integer.valueOf(d(d2Var.f1966c, 51)), 8);
        int i10 = d2Var.f1966c;
        i4.e(i4Var, f10, f11, 0.095f, null, Integer.valueOf(d(i10, 115)), 8);
        i4.e(i4Var, f10, f11, 0.05f, Integer.valueOf(d(i10, 217)), null, 16);
    }
}
