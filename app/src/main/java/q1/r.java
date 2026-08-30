package q1;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class r extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23300b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23301c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23302d;
    public final float e;

    public r(float f10, float f11, float f12, float f13) {
        super(2);
        this.f23300b = f10;
        this.f23301c = f11;
        this.f23302d = f12;
        this.e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(this.f23300b, rVar.f23300b) == 0 && Float.compare(this.f23301c, rVar.f23301c) == 0 && Float.compare(this.f23302d, rVar.f23302d) == 0 && Float.compare(this.e, rVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + a.a(a.a(Float.hashCode(this.f23300b) * 31, 31, this.f23301c), 31, this.f23302d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f23300b);
        sb2.append(", dy1=");
        sb2.append(this.f23301c);
        sb2.append(", dx2=");
        sb2.append(this.f23302d);
        sb2.append(", dy2=");
        return a.m(sb2, this.e, ')');
    }
}
