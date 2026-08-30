package r0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final t f24423a;

    public w(t tVar) {
        this.f24423a = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            if (this.f24423a.equals(((w) obj).f24423a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24423a.hashCode() * 31;
    }
}
