package a6;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: a, reason: collision with root package name */
    public final g f280a = g.f273c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.f280a.equals(((l) obj).f280a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f280a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f280a + '}';
    }
}
