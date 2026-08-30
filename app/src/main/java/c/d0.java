package c;
import c.c;

/* loaded from: classes.dex */
public final class d0 implements androidx.lifecycle.u, c {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.y f3220u;

    /* renamed from: v, reason: collision with root package name */
    public final y f3221v;

    /* renamed from: w, reason: collision with root package name */
    public e0 f3222w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g0 f3223x;

    public d0(g0 g0Var, androidx.lifecycle.y yVar, y yVar2) {
        yVar2.getClass();
        this.f3223x = g0Var;
        this.f3220u = yVar;
        this.f3221v = yVar2;
        yVar.a(this);
    }

    @Override // c
    public final void cancel() {
        this.f3220u.f(this);
        y yVar = this.f3221v;
        yVar.getClass();
        yVar.f3275b.remove(this);
        e0 e0Var = this.f3222w;
        if (e0Var != null) {
            e0Var.cancel();
        }
        this.f3222w = null;
    }

    @Override // androidx.lifecycle.u
    public final void k(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_START) {
            y yVar = this.f3221v;
            yVar.getClass();
            g0 g0Var = this.f3223x;
            g0Var.f3233b.addLast(yVar);
            e0 e0Var = new e0(g0Var, yVar);
            yVar.f3275b.add(e0Var);
            g0Var.e();
            yVar.f3276c = new f0(0, g0Var, g0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
            this.f3222w = e0Var;
            return;
        }
        if (oVar == androidx.lifecycle.o.ON_STOP) {
            e0 e0Var2 = this.f3222w;
            if (e0Var2 != null) {
                e0Var2.cancel();
                return;
            }
            return;
        }
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            cancel();
        }
    }
}
