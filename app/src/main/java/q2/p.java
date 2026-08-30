package q2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f23362a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.f23362a != ((p) obj).f23362a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23362a);
    }

    public final String toString() {
        int i = this.f23362a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        if (i == 65535) {
            return "All";
        }
        return "Invalid";
    }
}
