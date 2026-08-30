package q;
import r0.i1;
import r0.y;

import r0.n2;

/* loaded from: classes.dex */
public final class l implements n2 {

    /* renamed from: u, reason: collision with root package name */
    public final l1 f22936u;

    /* renamed from: v, reason: collision with root package name */
    public final i1 f22937v;

    /* renamed from: w, reason: collision with root package name */
    public q f22938w;

    /* renamed from: x, reason: collision with root package name */
    public long f22939x;

    /* renamed from: y, reason: collision with root package name */
    public long f22940y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22941z;

    public l(l1 l1Var, Object obj, q qVar, long j10, long j11, boolean z3) {
        q qVar2;
        this.f22936u = l1Var;
        this.f22937v = y.B(obj);
        if (qVar != null) {
            qVar2 = e.j(qVar);
        } else {
            qVar2 = (q) l1Var.f22943a.invoke(obj);
            qVar2.d();
        }
        this.f22938w = qVar2;
        this.f22939x = j10;
        this.f22940y = j11;
        this.f22941z = z3;
    }

    public final Object a() {
        return this.f22936u.f22944b.invoke(this.f22938w);
    }

    @Override // n2
    public final Object getValue() {
        return this.f22937v.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f22937v.getValue() + ", velocity=" + a() + ", isRunning=" + this.f22941z + ", lastFrameTimeNanos=" + this.f22939x + ", finishedTimeNanos=" + this.f22940y + ')';
    }

    public /* synthetic */ l(l1 l1Var, Object obj, q qVar, int i) {
        this(l1Var, obj, (i & 4) != 0 ? null : qVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
