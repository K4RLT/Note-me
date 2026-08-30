package n0;
import p.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f20976a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20977b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20978c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20979d;

    public e(float f10, float f11, float f12, float f13) {
        this.f20976a = f10;
        this.f20977b = f11;
        this.f20978c = f12;
        this.f20979d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f20976a == eVar.f20976a && this.f20977b == eVar.f20977b && this.f20978c == eVar.f20978c && this.f20979d == eVar.f20979d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20979d) + a.a(a.a(Float.hashCode(this.f20976a) * 31, 31, this.f20977b), 31, this.f20978c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f20976a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f20977b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f20978c);
        sb2.append(", pressedAlpha=");
        return a.m(sb2, this.f20979d, ')');
    }
}
