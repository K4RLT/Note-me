package q;

import r0.n2;

/* loaded from: classes.dex */
public final class b1 implements n2 {

    /* renamed from: u, reason: collision with root package name */
    public final f1 f22851u;

    /* renamed from: v, reason: collision with root package name */
    public df.l f22852v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.m f22853w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c1 f22854x;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(c1 c1Var, f1 f1Var, df.l lVar, df.l lVar2) {
        this.f22854x = c1Var;
        this.f22851u = f1Var;
        this.f22852v = lVar;
        this.f22853w = (kotlin.jvm.internal.m) lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.m, df.l] */
    public final void a(d1 d1Var) {
        Object invoke = this.f22853w.invoke(d1Var.c());
        boolean g8 = this.f22854x.f22862c.g();
        f1 f1Var = this.f22851u;
        if (g8) {
            f1Var.f(this.f22853w.invoke(d1Var.a()), invoke, (z) this.f22852v.invoke(d1Var));
        } else {
            f1Var.g(invoke, (z) this.f22852v.invoke(d1Var));
        }
    }

    @Override // r0.n2
    public final Object getValue() {
        a(this.f22854x.f22862c.f());
        return this.f22851u.B.getValue();
    }
}
