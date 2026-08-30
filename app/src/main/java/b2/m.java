package b2;
import a.a;
import f.b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f1536a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1537b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1538c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1539d;

    public m(float f10, float f11, float f12, float f13) {
        this.f1536a = f10;
        this.f1537b = f11;
        this.f1538c = f12;
        this.f1539d = f13;
        if (f10 < 0.0f) {
            a.a("Left must be non-negative");
        }
        if (f11 < 0.0f) {
            a.a("Top must be non-negative");
        }
        if (f12 < 0.0f) {
            a.a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (y2.a(this.f1536a, mVar.f1536a) && y2.a(this.f1537b, mVar.f1537b) && y2.a(this.f1538c, mVar.f1538c) && y2.a(this.f1539d, mVar.f1539d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.a(a.a(a.a(Float.hashCode(this.f1536a) * 31, 31, this.f1537b), 31, this.f1538c), 31, this.f1539d);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) y2.b(this.f1536a)) + ", top=" + ((Object) y2.b(this.f1537b)) + ", end=" + ((Object) y2.b(this.f1538c)) + ", bottom=" + ((Object) y2.b(this.f1539d)) + ", isLayoutDirectionAware=true)";
    }
}
