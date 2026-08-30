package s6;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f24966a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24967b;

    public l(float f10, float f11) {
        this.f24966a = f10;
        this.f24967b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Float.compare(this.f24966a, lVar.f24966a) == 0 && Float.compare(this.f24967b, lVar.f24967b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24967b) + (Float.hashCode(this.f24966a) * 31);
    }

    public final String toString() {
        return "Progress(min=" + this.f24966a + ", max=" + this.f24967b + ")";
    }
}
