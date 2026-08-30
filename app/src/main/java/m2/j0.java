package m2;

/* loaded from: classes.dex */
public final class j0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20509a;

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            if (!this.f20509a.equals(((j0) obj).f20509a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20509a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f20509a + ')';
    }
}
