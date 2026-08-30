package sf;
import e0.c;

/* loaded from: classes.dex */
public final class b0 implements pf.n0 {

    /* renamed from: u, reason: collision with root package name */
    public final d0 f25145u;

    /* renamed from: v, reason: collision with root package name */
    public final long f25146v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25147w;

    /* renamed from: x, reason: collision with root package name */
    public final pf.l f25148x;

    public b0(d0 d0Var, long j10, Object obj, pf.l lVar) {
        this.f25145u = d0Var;
        this.f25146v = j10;
        this.f25147w = obj;
        this.f25148x = lVar;
    }

    @Override // pf.n0
    public final void a() {
        d0 d0Var = this.f25145u;
        synchronized (d0Var) {
            if (this.f25146v < d0Var.o()) {
                return;
            }
            Object[] objArr = d0Var.B;
            objArr.getClass();
            long j10 = this.f25146v;
            if (objArr[((int) j10) & (objArr.length - 1)] != this) {
                return;
            }
            c(objArr, j10, e0.f25165a);
            d0Var.j();
        }
    }
}
