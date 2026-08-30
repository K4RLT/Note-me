package q1;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class o extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23292b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23293c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23294d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23295f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23296g;

    public o(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f23292b = f10;
        this.f23293c = f11;
        this.f23294d = f12;
        this.e = f13;
        this.f23295f = f14;
        this.f23296g = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (Float.compare(this.f23292b, oVar.f23292b) == 0 && Float.compare(this.f23293c, oVar.f23293c) == 0 && Float.compare(this.f23294d, oVar.f23294d) == 0 && Float.compare(this.e, oVar.e) == 0 && Float.compare(this.f23295f, oVar.f23295f) == 0 && Float.compare(this.f23296g, oVar.f23296g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23296g) + a.a(a.a(a.a(a.a(Float.hashCode(this.f23292b) * 31, 31, this.f23293c), 31, this.f23294d), 31, this.e), 31, this.f23295f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f23292b);
        sb2.append(", dy1=");
        sb2.append(this.f23293c);
        sb2.append(", dx2=");
        sb2.append(this.f23294d);
        sb2.append(", dy2=");
        sb2.append(this.e);
        sb2.append(", dx3=");
        sb2.append(this.f23295f);
        sb2.append(", dy3=");
        return a.m(sb2, this.f23296g, ')');
    }
}
