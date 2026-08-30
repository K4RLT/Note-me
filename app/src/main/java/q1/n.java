package q1;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class n extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23289b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23290c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23291d;
    public final float e;

    public n(float f10, float f11, float f12, float f13) {
        super(2);
        this.f23289b = f10;
        this.f23290c = f11;
        this.f23291d = f12;
        this.e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Float.compare(this.f23289b, nVar.f23289b) == 0 && Float.compare(this.f23290c, nVar.f23290c) == 0 && Float.compare(this.f23291d, nVar.f23291d) == 0 && Float.compare(this.e, nVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + a.a(a.a(Float.hashCode(this.f23289b) * 31, 31, this.f23290c), 31, this.f23291d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f23289b);
        sb2.append(", y1=");
        sb2.append(this.f23290c);
        sb2.append(", x2=");
        sb2.append(this.f23291d);
        sb2.append(", y2=");
        return a.m(sb2, this.e, ')');
    }
}
