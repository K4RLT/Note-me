package b8;
import a5.a;
import b8.h4;
import c2.d;
import c2.i;
import c2.r;
import c2.s;
import g3.a;
import l7.b;

import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2749d;

    public /* synthetic */ t1(String str, int i, String str2, String str3) {
        this.f2746a = i;
        this.f2747b = str;
        this.f2748c = str2;
        this.f2749d = str3;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        i4 i4Var2 = i4Var;
        switch (this.f2746a) {
            case 0:
                i4.g(i4Var, b.SCRAP, i4Var.i(), 0.22f, 0.72f, -1.5f, 32);
                float h3 = i4Var.h();
                d2 d2Var = i4Var.e;
                i4.t(i4Var, this.f2747b, h3, 0.42f, 0.03f, d2Var.f1965b, "sans", Float.valueOf(i4Var.k()), 3520);
                i4.o(i4Var.i(), 0.47f, i4Var.k(), 0, 24, i4Var);
                i4.t(i4Var, this.f2748c, i4Var.h() + 0.02f, 0.54f, 0.026f, d2Var.f1966c, "sans", null, 3968);
                for (int i = 0; i < 5; i++) {
                    i4.o(i4Var.h() + (i4Var.k() * 0.22f), (i * 0.055f) + 0.6f, i4Var.k() * 0.4f, 0, 24, i4Var);
                }
                i4.t(i4Var, this.f2749d, i4Var.i() + 0.1f, 0.54f, 0.026f, d2Var.f1966c, "sans", null, 3968);
                for (int i10 = 0; i10 < 5; i10++) {
                    i4.o(i4Var.i() + (i4Var.k() * 0.27f), (i10 * 0.055f) + 0.6f, i4Var.k() * 0.4f, 0, 24, i4Var);
                }
                return;
            case 1:
                s(i4Var2, 4, this.f2747b);
                r(i4Var2, this.f2748c);
                float i11 = i4Var2.i();
                d2 d2Var2 = i4Var2.e;
                i4.t(i4Var2, this.f2749d, i11, 0.36f, 0.04f, d2Var2.f1966c, "casual", null, 3776);
                i4.a(i4Var, i4Var.i() - 0.15f, 0.51f, 0.095f, 0.06333333f, Integer.valueOf(d2Var2.f1967d), null, 0.0f, 0.0f, 0.0f, "heart", 480);
                i4.p(i4Var, i4Var.i() + 0.15f, 0.51f, 0.085f, null, Integer.valueOf(d2Var2.f1966c), 8);
                i4Var.q(i4Var.i() - 0.1f, 0.615f, -7.0f, 0.26f, d2Var2.f1966c);
                i4Var.q(0.13f + i4Var.i(), 0.615f, 5.0f, 0.2f, -3380393);
                i4.a(i4Var, i4Var.i(), 0.815f, i4Var.k(), 0.2f, null, Integer.valueOf(d(d2Var2.f1964a, 46)), 0.0035f, 0.03f, 0.0f, null, 784);
                return;
            case 2:
                s(i4Var2, 2, this.f2747b);
                r(i4Var2, this.f2748c);
                float i12 = i4Var2.i();
                d2 d2Var3 = i4Var2.e;
                int i13 = d2Var3.f1964a;
                i4.a(i4Var2, i12, 0.3f, 0.54f, 0.007f, Integer.valueOf(d(i13, 217)), null, 0.0f, 0.5f, -2.0f, null, 608);
                i4.a(i4Var, i4Var.i(), 0.385f, 0.54f, 0.02f, Integer.valueOf(d2Var3.f1966c), null, 0.0f, 0.5f, 1.5f, null, 608);
                i4.a(i4Var, i4Var.i(), 0.47f, 0.54f, 0.048f, Integer.valueOf(d(d2Var3.f1967d, 115)), null, 0.0f, 0.15f, -1.0f, null, 608);
                i4.a(i4Var, i4Var.i(), 0.755f, i4Var.k(), 0.32f, null, Integer.valueOf(d(i13, 46)), 0.0035f, 0.03f, 0.0f, null, 784);
                i4.t(i4Var, this.f2749d, i4Var.h() + 0.15f, 0.615f, 0.021f, d(i13, 115), "casual", Float.valueOf(0.3f), 3520);
                return;
            case 3:
                d2 d2Var4 = i4Var2.e;
                i4Var2.l(this.f2747b, 0.11f, "sans", 0.036f);
                float f10 = 0.65999997f / 3;
                for (int i14 = 0; i14 < 3; i14++) {
                    float f11 = (i14 * f10) + 0.24f;
                    i4.g(i4Var2, b.ROUNDED, i4Var2.h() + 0.11f, (0.28f * f10) + f11, 0.28f, 0.0f, 48);
                    i4.t(i4Var, this.f2748c, i4Var.h() + 0.24f, f11 + 0.02f, 0.022f, d2Var4.f1965b, "sans", null, 4032);
                    i4.o(i4Var.h() + 0.24f + ((i4Var.k() - 0.3f) / 2.0f), f11 + 0.07f, i4Var.k() - 0.3f, 0, 24, i4Var);
                    for (int i15 = 0; i15 < 5; i15++) {
                        i4.p(i4Var, (i15 * 0.055f) + i4Var.h() + 0.26f, f11 + 0.13f, 0.042f, null, Integer.valueOf(d2Var4.f1966c), 8);
                    }
                    i4.t(i4Var, this.f2749d, i4Var.h() + 0.24f, f11 + 0.19f, 0.02f, d2Var4.f1965b, "sans", null, 4032);
                    i4.o(i4Var.h() + 0.24f + ((i4Var.k() - 0.3f) / 2.0f), f11 + 0.245f, i4Var.k() - 0.3f, 0, 24, i4Var);
                    i4Var2 = i4Var;
                }
                return;
            default:
                i(i4Var2, this.f2747b, false);
                d2 d2Var5 = i4Var2.e;
                int i16 = d2Var5.f1964a;
                i4.t(i4Var2, this.f2748c, i4Var2.i(), 0.262f, 0.03f, d(i16, 204), "bodoni", a.e(i4Var2, 0.86f), 3392);
                for (int i17 = 0; i17 < 5; i17++) {
                    i4.o(i4Var.i(), (i17 * 0.055f) + 0.345f, i4Var.k(), d(i16, 26), 16, i4Var);
                }
                String upperCase = this.f2749d.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                i4.t(i4Var, upperCase, i4Var.i(), 0.635f, 0.021f, d2Var5.f1966c, "dm-sans", a.e(i4Var, 0.9f), 3456);
                i4.o(i4Var.i(), 0.672f, i4Var.k(), d(i16, 51), 16, i4Var);
                for (int i18 = 0; i18 < 3; i18++) {
                    i4.o(i4Var.i(), (i18 * 0.055f) + 0.73f, i4Var.k(), d(i16, 26), 16, i4Var);
                }
                for (int i19 = 0; i19 < 5; i19++) {
                    i4.p(i4Var, a.x(i19, 2.0f, 0.052f, i4Var.i()), 0.888f, 0.034f, null, Integer.valueOf(d(d2Var5.f1967d, 196)), 8);
                }
                return;
        }
    }
}
