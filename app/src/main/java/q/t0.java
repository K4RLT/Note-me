package q;
import l.a;
import q.n1;

/* loaded from: classes.dex */
public final class t0 implements n1 {

    /* renamed from: u, reason: collision with root package name */
    public final n1 f23009u;

    /* renamed from: v, reason: collision with root package name */
    public final long f23010v;

    public t0(n1 n1Var, long j10) {
        this.f23009u = n1Var;
        this.f23010v = j10;
    }

    @Override // n1
    public final boolean a() {
        return this.f23009u.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (t0Var.f23010v != this.f23010v || !kotlin.jvm.internal.a(t0Var.f23009u, this.f23009u)) {
            return false;
        }
        return true;
    }

    @Override // n1
    public final long f(q qVar, q qVar2, q qVar3) {
        return this.f23009u.f(qVar, qVar2, qVar3) + this.f23010v;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23010v) + (this.f23009u.hashCode() * 31);
    }

    @Override // n1
    public final q i(long j10, q qVar, q qVar2, q qVar3) {
        long j11 = this.f23010v;
        if (j10 < j11) {
            return qVar;
        }
        return this.f23009u.i(j10 - j11, qVar, qVar2, qVar3);
    }

    @Override // n1
    public final q m(long j10, q qVar, q qVar2, q qVar3) {
        long j11 = this.f23010v;
        if (j10 < j11) {
            return qVar3;
        }
        return this.f23009u.m(j10 - j11, qVar, qVar2, qVar3);
    }
}
