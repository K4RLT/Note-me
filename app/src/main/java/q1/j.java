package q1;
import p.a;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23279b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23280c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23281d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23282f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23283g;

    public j(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f23279b = f10;
        this.f23280c = f11;
        this.f23281d = f12;
        this.e = f13;
        this.f23282f = f14;
        this.f23283g = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Float.compare(this.f23279b, jVar.f23279b) == 0 && Float.compare(this.f23280c, jVar.f23280c) == 0 && Float.compare(this.f23281d, jVar.f23281d) == 0 && Float.compare(this.e, jVar.e) == 0 && Float.compare(this.f23282f, jVar.f23282f) == 0 && Float.compare(this.f23283g, jVar.f23283g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23283g) + a.a(a.a(a.a(a.a(Float.hashCode(this.f23279b) * 31, 31, this.f23280c), 31, this.f23281d), 31, this.e), 31, this.f23282f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f23279b);
        sb2.append(", y1=");
        sb2.append(this.f23280c);
        sb2.append(", x2=");
        sb2.append(this.f23281d);
        sb2.append(", y2=");
        sb2.append(this.e);
        sb2.append(", x3=");
        sb2.append(this.f23282f);
        sb2.append(", y3=");
        return a.m(sb2, this.f23283g, ')');
    }
}
