package y2;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final float f30805u;

    public static final boolean a(float f10, float f11) {
        if (Float.compare(f10, f11) == 0) {
            return true;
        }
        return false;
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f30805u, ((f) obj).f30805u);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (Float.compare(this.f30805u, ((f) obj).f30805u) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30805u);
    }

    public final String toString() {
        return b(this.f30805u);
    }
}
