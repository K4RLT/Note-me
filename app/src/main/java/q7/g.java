package q7;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23569a;

    public g(boolean z3) {
        this.f23569a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.f23569a == ((g) obj).f23569a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23569a);
    }

    public final String toString() {
        return "NotifySettings(master=" + this.f23569a + ")";
    }
}
