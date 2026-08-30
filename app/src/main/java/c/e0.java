package c;
import c.c;
import l.a;

/* loaded from: classes.dex */
public final class e0 implements c {

    /* renamed from: u, reason: collision with root package name */
    public final y f3226u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g0 f3227v;

    public e0(g0 g0Var, y yVar) {
        yVar.getClass();
        this.f3227v = g0Var;
        this.f3226u = yVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [df.a, kotlin.jvm.internal.j] */
    @Override // c
    public final void cancel() {
        g0 g0Var = this.f3227v;
        qe.j jVar = g0Var.f3233b;
        y yVar = this.f3226u;
        jVar.remove(yVar);
        if (kotlin.jvm.internal.a(g0Var.f3234c, yVar)) {
            yVar.getClass();
            g0Var.f3234c = null;
        }
        yVar.getClass();
        yVar.f3275b.remove(this);
        Object r02 = yVar.f3276c;
        if (r02 != 0) {
            r02.invoke();
        }
        yVar.f3276c = null;
    }
}