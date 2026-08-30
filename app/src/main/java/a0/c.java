package a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f26a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f26a != ((c) obj).f26a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f26a + ')';
    }
}
