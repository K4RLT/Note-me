package q2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f23361a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (this.f23361a != ((o) obj).f23361a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23361a);
    }

    public final String toString() {
        int i = this.f23361a;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
