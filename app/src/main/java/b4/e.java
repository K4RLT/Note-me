package b4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1706a;

    public e(String str) {
        this.f1706a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f1706a.equals(((e) obj).f1706a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1706a.hashCode();
    }

    public final String toString() {
        return this.f1706a;
    }
}
