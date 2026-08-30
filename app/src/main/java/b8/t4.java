package b8;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2763b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2764c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2765d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2766f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2767g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2768h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2769j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2770k;

    /* renamed from: l, reason: collision with root package name */
    public final float f2771l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2772m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2773n;

    /* renamed from: o, reason: collision with root package name */
    public final float f2774o;

    /* renamed from: p, reason: collision with root package name */
    public final float f2775p;

    /* renamed from: q, reason: collision with root package name */
    public final float f2776q;

    /* renamed from: r, reason: collision with root package name */
    public final float f2777r;

    /* renamed from: s, reason: collision with root package name */
    public final float f2778s;

    /* renamed from: t, reason: collision with root package name */
    public final float f2779t;

    /* renamed from: u, reason: collision with root package name */
    public final float f2780u;

    /* renamed from: v, reason: collision with root package name */
    public final float f2781v;

    public t4(float f10, float f11) {
        this.f2762a = f10;
        this.f2763b = f11;
        float f12 = 0.395f * f10;
        this.f2764c = f12;
        float f13 = 1.2f * f12;
        this.f2765d = f13;
        float f14 = 0.56f * f12;
        this.e = f14;
        this.f2766f = 0.3f * f12;
        float f15 = 0.5f * f13;
        float f16 = (f10 * 0.5f) - f15;
        this.f2767g = f16;
        float f17 = (0.05f * f10) + f12;
        this.f2768h = f17;
        this.i = f16 + f13;
        this.f2769j = f15 + f16;
        this.f2770k = f17 - f12;
        this.f2771l = f17 + f12;
        double d2 = 0.0f;
        float sin = (((float) Math.sin(d2)) * f12) + f17;
        this.f2772m = sin;
        this.f2773n = f14 * ((float) Math.cos(d2));
        this.f2774o = 1.5707964f * f12;
        float f18 = (f11 - sin) - (f10 * 0.03f);
        float f19 = f18 >= 0.0f ? f18 : 0.0f;
        this.f2775p = f19;
        this.f2776q = f19 * 1.02f;
        this.f2777r = 0.06f * f12;
        this.f2778s = f13 * 0.14f;
        this.f2779t = f13 * 0.1f;
        this.f2780u = 0.14f;
        this.f2781v = (float) (f12 * 3.141592653589793d);
    }

    public final float a() {
        return this.f2771l;
    }

    public final float b() {
        return this.f2763b;
    }

    public final float c() {
        return this.f2762a;
    }

    public final float d() {
        return this.f2770k;
    }

    public final float e() {
        return this.f2775p;
    }

    public final float f() {
        return this.f2767g;
    }

    public final float g() {
        return this.i;
    }

    public final float h() {
        return this.f2768h;
    }

    public final float i() {
        return this.f2778s;
    }

    public final float j() {
        return this.f2765d;
    }

    public final float k() {
        return this.f2764c;
    }

    public final float l() {
        return this.e;
    }

    public final float m() {
        return this.f2774o;
    }

    public final float n() {
        return this.f2773n;
    }

    public final float o() {
        return this.f2772m;
    }

    public final float p() {
        return this.f2776q;
    }
}
