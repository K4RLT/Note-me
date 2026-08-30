package w7;
import a5.a;
import y2.f;

/* loaded from: classes.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f27879a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27880b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27881c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27882d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27883f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27884g;

    /* renamed from: h, reason: collision with root package name */
    public final float f27885h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f27886j;

    /* renamed from: k, reason: collision with root package name */
    public final float f27887k;

    /* renamed from: l, reason: collision with root package name */
    public final float f27888l;

    /* renamed from: m, reason: collision with root package name */
    public final float f27889m;

    /* renamed from: n, reason: collision with root package name */
    public final float f27890n;

    public a7(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        this.f27879a = f10;
        this.f27880b = f11;
        this.f27881c = f12;
        this.f27882d = f13;
        this.e = f14;
        this.f27883f = f15;
        this.f27884g = f16;
        this.f27885h = f17;
        this.i = f18;
        this.f27886j = f19;
        this.f27887k = f20;
        this.f27888l = f21;
        this.f27889m = f22;
        this.f27890n = f23;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a7) {
                a7 a7Var = (a7) obj;
                if (!f.a(this.f27879a, a7Var.f27879a) || !f.a(this.f27880b, a7Var.f27880b) || !f.a(this.f27881c, a7Var.f27881c) || !f.a(this.f27882d, a7Var.f27882d) || !f.a(this.e, a7Var.e) || Float.compare(this.f27883f, a7Var.f27883f) != 0 || Float.compare(this.f27884g, a7Var.f27884g) != 0 || Float.compare(this.f27885h, a7Var.f27885h) != 0 || !f.a(this.i, a7Var.i) || !f.a(this.f27886j, a7Var.f27886j) || !f.a(this.f27887k, a7Var.f27887k) || !f.a(this.f27888l, a7Var.f27888l) || !f.a(this.f27889m, a7Var.f27889m) || !f.a(this.f27890n, a7Var.f27890n)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27890n) + a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(Float.hashCode(this.f27879a) * 31, 31, this.f27880b), 31, this.f27881c), 31, this.f27882d), 31, this.e), 31, this.f27883f), 31, this.f27884g), 31, this.f27885h), 31, this.i), 31, this.f27886j), 31, this.f27887k), 31, this.f27888l), 31, this.f27889m);
    }

    public final String toString() {
        String b10 = f.b(this.f27879a);
        String b11 = f.b(this.f27880b);
        String b12 = f.b(this.f27881c);
        String b13 = f.b(this.f27882d);
        String b14 = f.b(this.e);
        String b15 = f.b(this.i);
        String b16 = f.b(this.f27886j);
        String b17 = f.b(this.f27887k);
        String b18 = f.b(this.f27888l);
        String b19 = f.b(this.f27889m);
        String b20 = f.b(this.f27890n);
        StringBuilder q10 = a.q("LayersMetrics(panelW=", b10, ", rowH=", b11, ", rowGap=");
        a.t(q10, b12, ", thumb=", b13, ", gripW=");
        q10.append(b14);
        q10.append(", titleSp=");
        q10.append(this.f27883f);
        q10.append(", nameSp=");
        a.s(q10, this.f27884g, ", typeSp=", this.f27885h, ", headerBtn=");
        a.t(q10, b15, ", eyeBtn=", b16, ", eyeIcon=");
        a.t(q10, b17, ", menuBtn=", b18, ", menuIcon=");
        return a.l(q10, b19, ", vPad=", b20, ")");
    }
}
