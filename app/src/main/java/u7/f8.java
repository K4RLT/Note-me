package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26196a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26197b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26198c;

    public f8(float f10, float f11, float f12) {
        this.f26196a = f10;
        this.f26197b = f11;
        this.f26198c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        if (Float.compare(this.f26196a, f8Var.f26196a) == 0 && Float.compare(this.f26197b, f8Var.f26197b) == 0 && Float.compare(this.f26198c, f8Var.f26198c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26198c) + a.a(Float.hashCode(this.f26196a) * 31, 31, this.f26197b);
    }

    public final String toString() {
        return "V3(x=" + this.f26196a + ", y=" + this.f26197b + ", z=" + this.f26198c + ")";
    }
}
