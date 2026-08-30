package gg;
import q.x;

import a0.f0;
import c7.x;
import pe.z;

/* loaded from: classes.dex */
public final class q extends ve.h implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public int f17786u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ pe.b f17787v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f17788w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, te.c cVar) {
        super(3, cVar);
        this.f17788w = xVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f17788w, (te.c) obj3);
        qVar.f17787v = (pe.b) obj;
        return qVar.invokeSuspend(z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        x xVar = this.f17788w;
        f0 f0Var = (f0) xVar.f4003w;
        pe.b bVar = this.f17787v;
        int i = this.f17786u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            byte D = f0Var.D();
            if (D == 1) {
                return xVar.k(true);
            }
            if (D == 0) {
                return xVar.k(false);
            }
            if (D == 6) {
                this.f17787v = null;
                this.f17786u = 1;
                obj = x.a(xVar, bVar, this);
                ue.a aVar = ue.a.f27192u;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (D == 8) {
                    return xVar.j();
                }
                f0.u(f0Var, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
        }
        return (fg.m) obj;
    }
}
