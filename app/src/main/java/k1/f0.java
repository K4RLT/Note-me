package k1;

/* loaded from: classes.dex */
public final class f0 extends l0 {
    public final j1.c e;

    public f0(j1.c cVar) {
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                if (!this.e.equals(((f0) obj).e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // k1.l0
    public final j1.c r() {
        return this.e;
    }
}
