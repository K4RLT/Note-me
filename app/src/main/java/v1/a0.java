package v1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27287a;

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            if (this.f27287a != ((a0) obj).f27287a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27287a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f27287a + ')';
    }
}
