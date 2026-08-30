package p7;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7.n f22603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22604b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22605c;

    public w0(v7.n nVar, int i, boolean z3) {
        nVar.getClass();
        this.f22603a = nVar;
        this.f22604b = i;
        this.f22605c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (w0Var.f22603a == this.f22603a && w0Var.f22604b == this.f22604b && w0Var.f22605c == this.f22605c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((System.identityHashCode(this.f22603a) * 31) + this.f22604b) * 31) + (this.f22605c ? 1 : 0);
    }
}
