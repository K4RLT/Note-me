package w7;
import r0.e1;

/* loaded from: classes.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28889a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28891c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28892d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28893f;

    /* renamed from: g, reason: collision with root package name */
    public final float f28894g;

    /* renamed from: h, reason: collision with root package name */
    public final float f28895h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final float f28896j;

    /* renamed from: k, reason: collision with root package name */
    public final float f28897k;

    /* renamed from: l, reason: collision with root package name */
    public final float f28898l;

    /* renamed from: m, reason: collision with root package name */
    public final e1 f28899m;

    /* renamed from: n, reason: collision with root package name */
    public final e1 f28900n;

    /* renamed from: o, reason: collision with root package name */
    public final e1 f28901o;

    /* renamed from: p, reason: collision with root package name */
    public final e1 f28902p;

    /* renamed from: q, reason: collision with root package name */
    public final e1 f28903q;

    /* renamed from: r, reason: collision with root package name */
    public final e1 f28904r;

    /* renamed from: s, reason: collision with root package name */
    public final e1 f28905s;

    public p4(String str, int i, int i10, int i11, int i12, float f10, float f11, float f12, boolean z3, float f13, float f14, float f15) {
        str.getClass();
        this.f28889a = str;
        this.f28890b = i;
        this.f28891c = i10;
        this.f28892d = i11;
        this.e = i12;
        this.f28893f = f10;
        this.f28894g = f11;
        this.f28895h = f12;
        this.i = z3;
        this.f28896j = f13;
        this.f28897k = f14;
        this.f28898l = f15;
        this.f28899m = new e1(1.0f);
        this.f28900n = new e1(0.0f);
        this.f28901o = new e1(0.0f);
        this.f28902p = new e1(0.0f);
        this.f28903q = new e1(0.0f);
        this.f28904r = new e1(0.0f);
        this.f28905s = new e1(0.0f);
    }

    public final void a() {
        float f10;
        float f11;
        float f12 = this.f28892d;
        e1 e1Var = this.f28899m;
        float h3 = (e1Var.h() * f12) / 2.0f;
        float h10 = (e1Var.h() * this.e) / 2.0f;
        e1 e1Var2 = this.f28900n;
        float h11 = e1Var2.h();
        float h12 = this.f28904r.h() - h3;
        float h13 = this.f28902p.h() + h3;
        if (h12 <= h13) {
            f10 = wa.b9.d(h11, h12, h13);
        } else {
            f10 = (h12 + h13) / 2.0f;
        }
        e1Var2.i(f10);
        e1 e1Var3 = this.f28901o;
        float h14 = e1Var3.h();
        float h15 = this.f28905s.h() - h10;
        float h16 = this.f28903q.h() + h10;
        if (h15 <= h16) {
            f11 = wa.b9.d(h14, h15, h16);
        } else {
            f11 = (h15 + h16) / 2.0f;
        }
        e1Var3.i(f11);
    }

    public final float b() {
        return this.f28893f;
    }

    public final float c() {
        return this.f28894g;
    }

    public final float d() {
        return Math.max(28.0f, this.f28899m.h() * this.f28892d * 0.05f);
    }

    public final float e() {
        return ((this.f28899m.h() * this.e) / 2.0f) + this.f28901o.h();
    }

    public final float f() {
        return this.f28900n.h() - ((this.f28899m.h() * this.f28892d) / 2.0f);
    }

    public final float g() {
        return ((this.f28899m.h() * this.f28892d) / 2.0f) + this.f28900n.h();
    }

    public final float h() {
        return this.f28901o.h() - ((this.f28899m.h() * this.e) / 2.0f);
    }

    public final float i() {
        return this.f28895h;
    }

    public final float j() {
        return this.f28905s.h();
    }

    public final float k() {
        return this.f28902p.h();
    }

    public final float l() {
        return this.f28904r.h();
    }

    public final float m() {
        return this.f28903q.h();
    }

    public final pe.j n(float f10, float f11) {
        double d2 = this.f28895h * 0.017453292519943295d;
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        float f12 = f10 - this.f28893f;
        double d10 = f11 - this.f28894g;
        return new pe.j(Float.valueOf((float) ((d10 * sin) + (f12 * cos))), Float.valueOf((float) ((d10 * cos) + ((-f12) * sin))));
    }
}
