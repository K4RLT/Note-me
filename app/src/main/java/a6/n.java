package a6;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    public final g f281a;

    public n(g gVar) {
        this.f281a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.f281a.equals(((n) obj).f281a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f281a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f281a + '}';
    }
}
