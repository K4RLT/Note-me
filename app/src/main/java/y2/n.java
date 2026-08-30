package y2;
import p.a;

/* loaded from: classes.dex */
public final class n implements z2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f30817a;

    public n(float f10) {
        this.f30817a = f10;
    }

    @Override // z2.a
    public final float a(float f10) {
        return f10 / this.f30817a;
    }

    @Override // z2.a
    public final float b(float f10) {
        return f10 * this.f30817a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && Float.compare(this.f30817a, ((n) obj).f30817a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30817a);
    }

    public final String toString() {
        return a.m(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f30817a, ')');
    }
}
