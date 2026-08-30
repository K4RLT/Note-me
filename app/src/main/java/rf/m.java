package rf;
import l.a;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f24811a;

    public m(Throwable th) {
        this.f24811a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (kotlin.jvm.internal.a(this.f24811a, ((m) obj).f24811a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f24811a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // rf.n
    public final String toString() {
        return "Closed(" + this.f24811a + ')';
    }
}
