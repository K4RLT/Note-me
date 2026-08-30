package b8;
import l7.b;
import p.a;
import u7.c;
import u7.d;
import u7.m3;

/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final m3 f2196a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2198c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2199d;
    public final d2 e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2200f;

    /* renamed from: g, reason: collision with root package name */
    public int f2201g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2202h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2203j;

    public i4(m3 m3Var, int i, int i10, int i11, d2 d2Var, boolean z3) {
        float f10;
        float f11;
        m3Var.getClass();
        this.f2196a = m3Var;
        this.f2197b = i;
        this.f2198c = i10;
        this.f2199d = i11;
        this.e = d2Var;
        this.f2200f = z3;
        if (z3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f2202h = f10;
        if (z3) {
            f11 = 0.0f;
        } else {
            f11 = 0.5f * i11;
        }
        this.i = f11;
        this.f2203j = f10 * 2.0f;
    }

    public static void a(i4 i4Var, float f10, float f11, float f12, float f13, Integer num, Integer num2, float f14, float f15, float f16, String str, int i) {
        Integer num3;
        Integer num4;
        float f17;
        float f18;
        float f19;
        String str2;
        if ((i & 16) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 32) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 64) != 0) {
            f17 = 0.004f;
        } else {
            f17 = f14;
        }
        if ((i & 128) != 0) {
            f18 = 0.03f;
        } else {
            f18 = f15;
        }
        if ((i & 256) != 0) {
            f19 = 0.0f;
        } else {
            f19 = f16;
        }
        if ((i & 512) != 0) {
            str2 = "rect";
        } else {
            str2 = str;
        }
        float f20 = i4Var.f2203j;
        m3 m3Var = i4Var.f2196a;
        int i10 = i4Var.f2197b;
        int i11 = i4Var.f2198c;
        float f21 = 0.0f;
        String i12 = a.i();
        if (num4 != null) {
            f21 = f17 * f20;
        }
        m3Var.o(i10, i11, new c(i12, str2, num3, num4, f21, f18, f12 * f20, 1.5f * f13 * f20, (i4Var.f2202h * f10) + i4Var.i, f11, f19));
        i4Var.f2201g++;
    }

    public static float b(float f10, float f11, int i, i4 i4Var) {
        if ((i & 2) != 0) {
            i4Var.getClass();
            f11 = 0.07f;
        }
        i4Var.getClass();
        i4Var.getClass();
        return (((0.93f - f11) - f10) / 2.0f) + f11;
    }

    public static void c(i4 i4Var, float f10, float f11) {
        a(i4Var, f10, f11, 0.055f, 0.036666665f, null, Integer.valueOf(i4Var.e.f1965b), 0.005f, 0.18f, 0.0f, null, 784);
    }

    public static /* synthetic */ void e(i4 i4Var, float f10, float f11, float f12, Integer num, Integer num2, int i) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        i4Var.d(f10, f11, f12, num, num2);
    }

    public static void f(i4 i4Var, int i, float f10, int i10) {
        if ((i10 & 4) != 0) {
            f10 = i4Var.i();
        }
        t(i4Var, "Scraply", f10, 0.905f, 0.016f, i, "serif", null, 832);
    }

    public static void g(i4 i4Var, b bVar, float f10, float f11, float f12, float f13, int i) {
        float f14;
        if ((i & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f13;
        }
        i4Var.getClass();
        bVar.getClass();
        m3.n(i4Var.f2196a, i4Var.f2197b, i4Var.f2198c, new b(a.i(), "empty_frame", (i4Var.f2202h * f10) + i4Var.i, f11, i4Var.f2203j * f12, f14, bVar, false, null, null, 0.0f, null, 4192128), null, null, 56);
        i4Var.f2201g++;
    }

    public static void o(float f10, float f11, float f12, int i, int i10, i4 i4Var) {
        if ((i10 & 8) != 0) {
            i = i4Var.e.f1965b;
        }
        i4Var.n(f10, f11, f12, 0.0022f, i);
    }

    public static void p(i4 i4Var, float f10, float f11, float f12, Integer num, Integer num2, int i) {
        Integer num3;
        Integer num4;
        if ((i & 8) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 16) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        i4Var.getClass();
        a(i4Var, f10, f11, f12, f12 / 1.5f, num3, num4, 0.0f, 0.0f, 0.0f, "star", 448);
    }

    public static void r(float f10, float f11, float f12, int i, int i10, i4 i4Var) {
        float f13;
        if ((i10 & 4) != 0) {
            i = i4Var.e.f1966c;
        }
        int i11 = i;
        if ((i10 & 16) != 0) {
            f13 = 0.19f;
        } else {
            f13 = 0.24f;
        }
        i4Var.q(f10, f11, f12, f13, i11);
    }

    public static void s(i4 i4Var, float f10, float f11, float f12, float f13, boolean z3, int i, float f14, int i10) {
        float f15;
        if ((i10 & 32) != 0) {
            i = i4Var.e.f1966c;
        }
        i4Var.getClass();
        if (!z3) {
            f15 = -45.0f;
        } else {
            f15 = 45.0f;
        }
        if (!z3) {
            f12 = -f12;
        }
        i4Var.q(f10 + f12, f11 + ((-1.0f) * f13), f15, f14, i);
    }

    public static void t(i4 i4Var, String str, float f10, float f11, float f12, int i, String str2, Float f13, int i10) {
        boolean z3;
        boolean z9;
        float f14;
        Float f15;
        boolean z10;
        String str3;
        if ((i10 & 64) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i10 & 128) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((i10 & 256) != 0) {
            f14 = 0.0f;
        } else {
            f14 = -4.0f;
        }
        float f16 = f14;
        Float f17 = null;
        if ((i10 & 512) != 0) {
            f15 = null;
        } else {
            f15 = f13;
        }
        if ((i10 & 1024) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i10 & 2048) != 0) {
            str3 = null;
        } else {
            str3 = "Scraply";
        }
        i4Var.getClass();
        str.getClass();
        if (mf.f.u(str)) {
            return;
        }
        m3 m3Var = i4Var.f2196a;
        int i11 = i4Var.f2197b;
        int i12 = i4Var.f2198c;
        String i13 = a.i();
        float f18 = (i4Var.f2202h * f10) + i4Var.i;
        if (f15 != null) {
            f17 = Float.valueOf(f15.floatValue() * i4Var.f2203j);
        }
        m3Var.p(i11, i12, new d(i13, str, str2, i, f12, f18, f11, f16, z10, str3, z3, z9, f17, 460288));
        i4Var.f2201g++;
    }

    public final void d(float f10, float f11, float f12, Integer num, Integer num2) {
        a(this, f10, f11, f12, f12 / 1.5f, num, num2, 0.0f, 0.0f, 0.0f, "ellipse", 448);
    }

    public final float h() {
        if (this.f2200f) {
            return 0.19f;
        }
        if (this.f2199d == 0) {
            return 0.09f;
        }
        return 0.13f;
    }

    public final float i() {
        return (j() + h()) / 2.0f;
    }

    public final float j() {
        if (this.f2200f) {
            return 0.91f;
        }
        if (this.f2199d == 0) {
            return 0.87f;
        }
        return 0.90999997f;
    }

    public final float k() {
        return j() - h();
    }

    public final void l(String str, float f10, String str2, float f11) {
        str.getClass();
        float h3 = h();
        d2 d2Var = this.e;
        t(this, str, h3, f10, f11, d2Var.f1964a, str2, Float.valueOf(k()), 3456);
        o(i(), f10 + 0.028f, k(), d2Var.f1965b, 16, this);
    }

    public final boolean m() {
        if (!this.f2200f && this.f2199d == 0) {
            return true;
        }
        return false;
    }

    public final void n(float f10, float f11, float f12, float f13, int i) {
        a(this, f10, f11, f12, f13, Integer.valueOf(i), null, 0.0f, 0.0f, 0.0f, null, 864);
    }

    public final void q(float f10, float f11, float f12, float f13, int i) {
        a(this, f10, f11, f13, 0.035f, Integer.valueOf((i & 16777215) | (-1275068416)), null, 0.0f, 0.0f, f12, null, 608);
    }
}
