package g0;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17198a;

    public final boolean equals(Object obj) {
        if (obj instanceof l1) {
            if (this.f17198a != ((l1) obj).f17198a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17198a);
    }

    public final String toString() {
        return "MenuItemsAvailability(value=" + this.f17198a + ')';
    }
}
