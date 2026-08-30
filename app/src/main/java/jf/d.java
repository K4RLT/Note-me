package jf;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: x, reason: collision with root package name */
    public static final d f19196x = new b(1, 0, 1);

    @Override // jf.b
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f19189u == dVar.f19189u && this.f19190v == dVar.f19190v) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // jf.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f19189u * 31) + this.f19190v;
    }

    @Override // jf.b
    public final boolean isEmpty() {
        if (this.f19189u > this.f19190v) {
            return true;
        }
        return false;
    }

    @Override // jf.b
    public final String toString() {
        return this.f19189u + ".." + this.f19190v;
    }
}
