package z1;

import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends b2.f0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f31814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df.p f31815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, df.p pVar, String str) {
        super(str);
        this.f31814b = j0Var;
        this.f31815c = pVar;
    }

    @Override // z1.p0
    public final q0 g(r0 r0Var, List list, long j10) {
        j0 j0Var = this.f31814b;
        e0 e0Var = j0Var.B;
        e0Var.f31801u = r0Var.getLayoutDirection();
        e0Var.f31802v = r0Var.a();
        e0Var.f31803w = r0Var.i0();
        boolean j02 = r0Var.j0();
        df.p pVar = this.f31815c;
        if (!j02 && j0Var.f31828u.B != null) {
            j0Var.f31832y = 0;
            q0 q0Var = (q0) pVar.invoke(j0Var.C, new y2.a(j10));
            return new f0(q0Var, j0Var, j0Var.f31832y, q0Var, 0);
        }
        j0Var.f31831x = 0;
        q0 q0Var2 = (q0) pVar.invoke(e0Var, new y2.a(j10));
        return new f0(q0Var2, j0Var, j0Var.f31831x, q0Var2, 1);
    }
}
