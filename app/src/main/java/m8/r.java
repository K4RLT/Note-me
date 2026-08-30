package m8;

/* loaded from: classes.dex */
public final class r extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f20740a;

    public r(q qVar) {
        this.f20740a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f20740a.equals(((r) ((d0) obj)).f20740a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20740a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f20740a + "}";
    }
}
