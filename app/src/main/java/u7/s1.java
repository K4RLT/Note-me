package u7;
import p.a;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26808a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26809b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26810c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26811d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26812f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26813g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26814h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f26815j;

    /* renamed from: k, reason: collision with root package name */
    public final float f26816k;

    /* renamed from: l, reason: collision with root package name */
    public final float f26817l;

    /* renamed from: m, reason: collision with root package name */
    public final int f26818m;

    /* renamed from: n, reason: collision with root package name */
    public final int f26819n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26820o;

    /* renamed from: p, reason: collision with root package name */
    public final float f26821p;

    /* renamed from: q, reason: collision with root package name */
    public final float f26822q;

    /* renamed from: r, reason: collision with root package name */
    public final float f26823r;

    /* renamed from: s, reason: collision with root package name */
    public final float f26824s;

    /* renamed from: t, reason: collision with root package name */
    public final float f26825t;

    /* renamed from: u, reason: collision with root package name */
    public final float f26826u;

    public s1(boolean z3, boolean z9, boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i, int i10, boolean z11, float f19, float f20, float f21, float f22, float f23, float f24) {
        this.f26808a = z3;
        this.f26809b = z9;
        this.f26810c = z10;
        this.f26811d = f10;
        this.e = f11;
        this.f26812f = f12;
        this.f26813g = f13;
        this.f26814h = f14;
        this.i = f15;
        this.f26815j = f16;
        this.f26816k = f17;
        this.f26817l = f18;
        this.f26818m = i;
        this.f26819n = i10;
        this.f26820o = z11;
        this.f26821p = f19;
        this.f26822q = f20;
        this.f26823r = f21;
        this.f26824s = f22;
        this.f26825t = f23;
        this.f26826u = f24;
    }

    public final float a() {
        return this.e;
    }

    public final float b() {
        return this.f26813g;
    }

    public final float c() {
        return this.f26811d;
    }

    public final float d() {
        return this.f26812f;
    }

    public final float e() {
        return this.f26814h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f26808a == s1Var.f26808a && this.f26809b == s1Var.f26809b && this.f26810c == s1Var.f26810c && Float.compare(this.f26811d, s1Var.f26811d) == 0 && Float.compare(this.e, s1Var.e) == 0 && Float.compare(this.f26812f, s1Var.f26812f) == 0 && Float.compare(this.f26813g, s1Var.f26813g) == 0 && Float.compare(this.f26814h, s1Var.f26814h) == 0 && Float.compare(this.i, s1Var.i) == 0 && Float.compare(this.f26815j, s1Var.f26815j) == 0 && Float.compare(this.f26816k, s1Var.f26816k) == 0 && Float.compare(this.f26817l, s1Var.f26817l) == 0 && this.f26818m == s1Var.f26818m && this.f26819n == s1Var.f26819n && this.f26820o == s1Var.f26820o && Float.compare(this.f26821p, s1Var.f26821p) == 0 && Float.compare(this.f26822q, s1Var.f26822q) == 0 && Float.compare(this.f26823r, s1Var.f26823r) == 0 && Float.compare(this.f26824s, s1Var.f26824s) == 0 && Float.compare(this.f26825t, s1Var.f26825t) == 0 && Float.compare(this.f26826u, s1Var.f26826u) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26826u) + a.a(a.a(a.a(a.a(a.a(a.c(a.b(this.f26819n, a.b(this.f26818m, a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.c(a.c(Boolean.hashCode(this.f26808a) * 31, 31, this.f26809b), 31, this.f26810c), 31, this.f26811d), 31, this.e), 31, this.f26812f), 31, this.f26813g), 31, this.f26814h), 31, this.i), 31, this.f26815j), 31, this.f26816k), 31, this.f26817l), 31), 31), 31, this.f26820o), 31, this.f26821p), 31, this.f26822q), 31, this.f26823r), 31, this.f26824s), 31, this.f26825t);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeafLayout(isCover=");
        sb2.append(this.f26808a);
        sb2.append(", isLeft=");
        sb2.append(this.f26809b);
        sb2.append(", isRight=");
        sb2.append(this.f26810c);
        sb2.append(", frontAxisDirection=");
        sb2.append(this.f26811d);
        sb2.append(", coverShiftX=");
        a5.a.s(sb2, this.e, ", frontX=", this.f26812f, ", frontAngle=");
        a5.a.s(sb2, this.f26813g, ", frontZ=", this.f26814h, ", backX=");
        a5.a.s(sb2, this.i, ", backAngle=", this.f26815j, ", backZ=");
        a5.a.s(sb2, this.f26816k, ", shade=", this.f26817l, ", frontNum=");
        a5.a.n(this.f26818m, this.f26819n, ", backNum=", ", roundRightSide=", sb2);
        sb2.append(this.f26820o);
        sb2.append(", frontAxisX=");
        sb2.append(this.f26821p);
        sb2.append(", backAxisX=");
        a5.a.s(sb2, this.f26822q, ", anverseRotationY=", this.f26823r, ", reverseRotationY=");
        a5.a.s(sb2, this.f26824s, ", zFront=", this.f26825t, ", zBack=");
        sb2.append(this.f26826u);
        sb2.append(")");
        return sb2.toString();
    }
}
