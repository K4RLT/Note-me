package r0;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final r f24444a;

    public /* synthetic */ z1(r rVar) {
        this.f24444a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z1) {
            if (!this.f24444a.equals(((z1) obj).f24444a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24444a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f24444a + ')';
    }
}
