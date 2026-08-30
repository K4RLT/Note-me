package t;
import j1.b;
import p.a;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25528a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25529b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25530c;

    public u0(long j10, long j11, boolean z3) {
        this.f25528a = j10;
        this.f25529b = j11;
        this.f25530c = z3;
    }

    public final u0 a(u0 u0Var) {
        return new u0(b.h(this.f25528a, u0Var.f25528a), Math.max(this.f25529b, u0Var.f25529b), this.f25530c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u0) {
                u0 u0Var = (u0) obj;
                if (!b.c(this.f25528a, u0Var.f25528a) || this.f25529b != u0Var.f25529b || this.f25530c != u0Var.f25530c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25530c) + a.d(this.f25529b, Long.hashCode(this.f25528a) * 31, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) b.j(this.f25528a)) + ", timeMillis=" + this.f25529b + ", shouldApplyImmediately=" + this.f25530c + ')';
    }
}
