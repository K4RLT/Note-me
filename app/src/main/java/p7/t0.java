package p7;
import p.a;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22572a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22573b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22574c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22575d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22576f;

    public t0(int i, float f10, float f11, float f12, float f13, boolean z3) {
        this.f22572a = i;
        this.f22573b = f10;
        this.f22574c = f11;
        this.f22575d = f12;
        this.e = f13;
        this.f22576f = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t0) {
                t0 t0Var = (t0) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(1.0f, 1.0f) != 0 || this.f22572a != t0Var.f22572a || Float.compare(this.f22573b, t0Var.f22573b) != 0 || Float.compare(this.f22574c, t0Var.f22574c) != 0 || Float.compare(this.f22575d, t0Var.f22575d) != 0 || Float.compare(this.e, t0Var.e) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.f22576f != t0Var.f22576f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22576f) + a.a(a.a(a.a(a.a(a.a(a.b(this.f22572a, a.a(a.a(Integer.hashCode(1) * 31, 31, 0.0f), 31, 1.0f), 31), 31, this.f22573b), 31, this.f22574c), 31, this.f22575d), 31, this.e), 31, 0.0f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Profile(bristles=1, bristleSpread=0.0, bristleWidthFrac=1.0, stampAlpha=");
        sb2.append(this.f22572a);
        sb2.append(", spacingFrac=");
        sb2.append(this.f22573b);
        sb2.append(", softness=");
        a5.a.s(sb2, this.f22574c, ", speedThin=", this.f22575d, ", speedFade=");
        sb2.append(this.e);
        sb2.append(", jitter=0.0, watercolor=");
        sb2.append(this.f22576f);
        sb2.append(")");
        return sb2.toString();
    }
}
