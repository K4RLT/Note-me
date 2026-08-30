package l1;
import p.a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f19878a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19879b;

    public s(float f10, float f11) {
        this.f19878a = f10;
        this.f19879b = f11;
    }

    public final float[] a() {
        float f10 = this.f19878a;
        float f11 = this.f19879b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (Float.compare(this.f19878a, sVar.f19878a) == 0 && Float.compare(this.f19879b, sVar.f19879b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19879b) + (Float.hashCode(this.f19878a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f19878a);
        sb2.append(", y=");
        return a.m(sb2, this.f19879b, ')');
    }
}
