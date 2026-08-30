package q;
import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f22860a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f22861b = y.B(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22862c;

    public c1(g1 g1Var, l1 l1Var, String str) {
        this.f22862c = g1Var;
        this.f22860a = l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b1 a(df.l lVar, df.l lVar2) {
        i1 i1Var = this.f22861b;
        b1 b1Var = (b1) i1Var.getValue();
        g1 g1Var = this.f22862c;
        if (b1Var == null) {
            Object invoke = lVar2.invoke(g1Var.c());
            Object invoke2 = lVar2.invoke(g1Var.c());
            l1 l1Var = this.f22860a;
            q qVar = (q) l1Var.f22943a.invoke(invoke2);
            qVar.d();
            f1 f1Var = new f1(g1Var, invoke, qVar, l1Var);
            b1Var = new b1(this, f1Var, lVar, lVar2);
            i1Var.setValue(b1Var);
            g1Var.i.add(f1Var);
        }
        b1Var.f22853w = (kotlin.jvm.internal.m) lVar2;
        b1Var.f22852v = lVar;
        b1Var.a(g1Var.f());
        return b1Var;
    }
}
