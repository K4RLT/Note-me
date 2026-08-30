package s1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24906a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f24906a != ((a) obj).f24906a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24906a);
    }

    public final String toString() {
        int i = this.f24906a;
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
