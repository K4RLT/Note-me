package m2;

/* loaded from: classes.dex */
public final class s0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20567a;

    public s0(String str) {
        this.f20567a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s0) {
                if (!this.f20567a.equals(((s0) obj).f20567a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20567a.hashCode();
    }

    public final String toString() {
        return p.a.n(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f20567a, ')');
    }
}
