package yb;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: u, reason: collision with root package name */
    public final Object f31631u;

    public c(Object obj) {
        this.f31631u = obj;
    }

    @Override // yb.b
    public final Object a() {
        return this.f31631u;
    }

    @Override // yb.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f31631u.equals(((c) obj).f31631u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31631u.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31631u);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
