package p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f22100a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22101b;

    public b(float f10, float f11) {
        this.f22100a = f10;
        this.f22101b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.compare(this.f22100a, bVar.f22100a) == 0 && Float.compare(this.f22101b, bVar.f22101b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22101b) + (Float.hashCode(this.f22100a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f22100a);
        sb2.append(", velocityCoefficient=");
        return a.m(sb2, this.f22101b, ')');
    }
}
