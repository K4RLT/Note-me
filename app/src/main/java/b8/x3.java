package b8;

import java.util.List;

/* loaded from: classes.dex */
public final class x3 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2966u;

    /* renamed from: v, reason: collision with root package name */
    public int f2967v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2968w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z3 f2969x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(z3 z3Var, te.c cVar, int i) {
        super(2, cVar);
        this.f2966u = i;
        this.f2969x = z3Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2966u) {
            case 0:
                x3 x3Var = new x3(this.f2969x, cVar, 0);
                x3Var.f2968w = obj;
                return x3Var;
            default:
                x3 x3Var2 = new x3(this.f2969x, cVar, 1);
                x3Var2.f2968w = obj;
                return x3Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2966u) {
            case 0:
                return ((x3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((x3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        Object kVar2;
        switch (this.f2966u) {
            case 0:
                int i = this.f2967v;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            pe.a.e(obj);
                        } else {
                            q.x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        pe.a.e(obj);
                        d1 d1Var = this.f2969x.f3067b;
                        this.f2968w = null;
                        this.f2967v = 1;
                        obj = d1Var.i(this);
                        ue.a aVar = ue.a.f27192u;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    kVar = (List) obj;
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (kVar instanceof pe.k) {
                    return qe.s.f24023u;
                }
                return kVar;
            default:
                int i10 = this.f2967v;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            pe.a.e(obj);
                        } else {
                            q.x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        pe.a.e(obj);
                        u3 u3Var = this.f2969x.f3066a;
                        this.f2968w = null;
                        this.f2967v = 1;
                        obj = u3Var.i(this);
                        ue.a aVar2 = ue.a.f27192u;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    kVar2 = (List) obj;
                } catch (Throwable th2) {
                    kVar2 = new pe.k(th2);
                }
                if (kVar2 instanceof pe.k) {
                    return qe.s.f24023u;
                }
                return kVar2;
        }
    }
}
