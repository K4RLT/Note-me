package r0;
import c1.c;
import n.a;
import r0.x1;
import r0.y1;

/* loaded from: classes.dex */
public final class x1 extends te.a implements pf.x {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f24434v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y1 f24435w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x1(c r2, y1 r3) {
        /*
            r1 = this;
            pf.w r0 = pf.w.f22802u
            r1.f24434v = r2
            r1.f24435w = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.x1.<init>(c, y1):void");
    }

    @Override // pf.x
    public final void o(Throwable th, te.g gVar) {
        c cVar = this.f24434v;
        y1 y1Var = this.f24435w;
        wa.a(th, new androidx.ink.brush.b(cVar, 5, y1Var));
        pf.x xVar = (pf.x) y1Var.f24439u.L(pf.w.f22802u);
        if (xVar != null) {
            xVar.o(th, gVar);
            return;
        }
        throw th;
    }
}
