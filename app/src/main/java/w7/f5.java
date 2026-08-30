package w7;
import a5.a;
import p.a;

/* loaded from: classes.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28218a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f28219b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28220c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28221d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28222f;

    /* renamed from: g, reason: collision with root package name */
    public final float f28223g;

    /* renamed from: h, reason: collision with root package name */
    public final float f28224h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f28225j;

    public f5(String str, g5 g5Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        str.getClass();
        g5Var.getClass();
        this.f28218a = str;
        this.f28219b = g5Var;
        this.f28220c = f10;
        this.f28221d = f11;
        this.e = f12;
        this.f28222f = f13;
        this.f28223g = f14;
        this.f28224h = f15;
        this.i = f16;
        this.f28225j = f17;
    }

    public final String a() {
        return this.f28218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        if (kotlin.jvm.internal.l.a(this.f28218a, f5Var.f28218a) && this.f28219b == f5Var.f28219b && Float.compare(this.f28220c, f5Var.f28220c) == 0 && Float.compare(this.f28221d, f5Var.f28221d) == 0 && Float.compare(this.e, f5Var.e) == 0 && Float.compare(this.f28222f, f5Var.f28222f) == 0 && Float.compare(this.f28223g, f5Var.f28223g) == 0 && Float.compare(this.f28224h, f5Var.f28224h) == 0 && Float.compare(this.i, f5Var.i) == 0 && Float.compare(this.f28225j, f5Var.f28225j) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28225j) + a.a(a.a(a.a(a.a(a.a(a.a(a.a((this.f28219b.hashCode() + (this.f28218a.hashCode() * 31)) * 31, 31, this.f28220c), 31, this.f28221d), 31, this.e), 31, this.f28222f), 31, this.f28223g), 31, this.f28224h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupElemGeom(id=");
        sb2.append(this.f28218a);
        sb2.append(", kind=");
        sb2.append(this.f28219b);
        sb2.append(", cx=");
        a.s(sb2, this.f28220c, ", cy=", this.f28221d, ", hw=");
        a.s(sb2, this.e, ", hh=", this.f28222f, ", rotDeg=");
        a.s(sb2, this.f28223g, ", x=", this.f28224h, ", y=");
        sb2.append(this.i);
        sb2.append(", scale=");
        sb2.append(this.f28225j);
        sb2.append(")");
        return sb2.toString();
    }
}
