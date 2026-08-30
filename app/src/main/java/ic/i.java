package ic;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f18405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18406b;

    public i(r rVar, boolean z3) {
        this.f18405a = rVar;
        this.f18406b = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f18405a.equals(this.f18405a) && iVar.f18406b == this.f18406b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18405a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f18406b).hashCode();
    }
}
