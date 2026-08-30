package pf;
import q.x;

/* loaded from: classes.dex */
public abstract class t0 implements Runnable, Comparable, n0 {
    private volatile Object _heap;

    /* renamed from: u, reason: collision with root package name */
    public long f22794u;

    /* renamed from: v, reason: collision with root package name */
    public int f22795v = -1;

    public t0(long j10) {
        this.f22794u = j10;
    }

    @Override // pf.n0
    public final void a() {
        u0 u0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                c4.s sVar = b0.f22725b;
                if (obj == sVar) {
                    return;
                }
                uf.x xVar = null;
                if (obj instanceof u0) {
                    u0Var = (u0) obj;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    synchronized (u0Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof uf.x) {
                            xVar = (uf.x) obj2;
                        }
                        if (xVar != null) {
                            u0Var.b(this.f22795v);
                        }
                    }
                }
                this._heap = sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j10, u0 u0Var, v0 v0Var) {
        t0 t0Var;
        boolean z3;
        synchronized (this) {
            if (this._heap == b0.f22725b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f27248a;
                    if (t0VarArr != null) {
                        t0Var = t0VarArr[0];
                    } else {
                        t0Var = null;
                    }
                    if (v0.C.get(v0Var) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.f22798c = j10;
                    } else {
                        long j11 = t0Var.f22794u;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - u0Var.f22798c > 0) {
                            u0Var.f22798c = j10;
                        }
                    }
                    long j12 = this.f22794u;
                    long j13 = u0Var.f22798c;
                    if (j12 - j13 < 0) {
                        this.f22794u = j13;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f22794u - ((t0) obj).f22794u;
        if (j10 > 0) {
            return 1;
        }
        if (j10 < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(u0 u0Var) {
        if (this._heap != b0.f22725b) {
            this._heap = u0Var;
        } else {
            x.n("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f22794u + ']';
    }
}
