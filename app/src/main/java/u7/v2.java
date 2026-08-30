package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26946a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26947b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26948c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26949d;

    public v2(float f10, float f11, float f12, float f13) {
        this.f26946a = f10;
        this.f26947b = f11;
        this.f26948c = f12;
        this.f26949d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        if (Float.compare(this.f26946a, v2Var.f26946a) == 0 && Float.compare(this.f26947b, v2Var.f26947b) == 0 && Float.compare(this.f26948c, v2Var.f26948c) == 0 && Float.compare(this.f26949d, v2Var.f26949d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26949d) + a.a(a.a(Float.hashCode(this.f26946a) * 31, 31, this.f26947b), 31, this.f26948c);
    }

    public final String toString() {
        return "CoverPreviewRect(cxFrac=" + this.f26946a + ", cyFrac=" + this.f26947b + ", wFrac=" + this.f26948c + ", hFrac=" + this.f26949d + ")";
    }
}
