package xa;

/* loaded from: classes.dex */
public final class e0 extends b0 {

    /* renamed from: u, reason: collision with root package name */
    public final b1 f30407u = new b1(false);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e0) && ((e0) obj).f30407u.equals(this.f30407u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30407u.hashCode();
    }
}
