package q;
import l.a;
import q.k;

/* loaded from: classes.dex */
public final class s0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f22995a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22996b;

    public s0(z zVar, long j10) {
        this.f22995a = zVar;
        this.f22996b = j10;
    }

    @Override // k
    public final n1 a(l1 l1Var) {
        return new t0(this.f22995a.a(l1Var), this.f22996b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (s0Var.f22996b != this.f22996b || !kotlin.jvm.internal.a(s0Var.f22995a, this.f22995a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22996b) + (this.f22995a.hashCode() * 31);
    }
}
