package vd;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f27548a;

    /* renamed from: b, reason: collision with root package name */
    public final b f27549b;

    public b0(i0 i0Var, b bVar) {
        this.f27548a = i0Var;
        this.f27549b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f27548a.equals(b0Var.f27548a) || !this.f27549b.equals(b0Var.f27549b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f27549b.hashCode() + ((this.f27548a.hashCode() + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f27548a + ", applicationInfo=" + this.f27549b + ')';
    }
}
