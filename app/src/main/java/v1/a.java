package v1;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public final int f27286b;

    public a(int i) {
        this.f27286b = i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (a.class.equals(cls)) {
                obj.getClass();
                if (this.f27286b != ((a) obj).f27286b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f27286b;
    }

    public final String toString() {
        return a5.a.i(new StringBuilder("AndroidPointerIcon(type="), this.f27286b, ')');
    }
}
