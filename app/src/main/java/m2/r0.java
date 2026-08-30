package m2;

/* loaded from: classes.dex */
public final class r0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20560a;

    public r0(String str) {
        this.f20560a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r0) {
                if (!this.f20560a.equals(((r0) obj).f20560a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20560a.hashCode();
    }

    public final String toString() {
        return p.a.n(new StringBuilder("UrlAnnotation(url="), this.f20560a, ')');
    }
}
