package o0;
import k1.r;
import u.a;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21491a = r.f19521l;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g1) {
                long j10 = ((g1) obj).f21491a;
                int i = r.f19522m;
                if (!pe.a(this.f21491a, j10)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Long.hashCode(this.f21491a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) r.i(this.f21491a)) + ", rippleAlpha=null)";
    }
}
