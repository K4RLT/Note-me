package x2;
import p.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f30067c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f30068a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30069b;

    public p(float f10, float f11) {
        this.f30068a = f10;
        this.f30069b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f30068a == pVar.f30068a && this.f30069b == pVar.f30069b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30069b) + (Float.hashCode(this.f30068a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f30068a);
        sb2.append(", skewX=");
        return a.m(sb2, this.f30069b, ')');
    }
}
