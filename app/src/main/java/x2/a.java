package x2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f30042a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (Float.compare(this.f30042a, ((a) obj).f30042a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30042a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f30042a + ')';
    }
}
