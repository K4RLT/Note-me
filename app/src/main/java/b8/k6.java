package b8;
import b0.u;
import r0.y;
import t.e;

/* loaded from: classes.dex */
public final class k6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2317u;

    /* renamed from: v, reason: collision with root package name */
    public int f2318v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2319w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f2317u = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2317u) {
            case 0:
                k6 k6Var = new k6(2, cVar, 0);
                k6Var.f2319w = obj;
                return k6Var;
            default:
                k6 k6Var2 = new k6(2, cVar, 1);
                k6Var2.f2319w = obj;
                return k6Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2317u) {
            case 0:
                return ((k6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((k6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        String str;
        pf.z zVar;
        int i = this.f2317u;
        Object obj2 = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f2318v;
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
                        p6 p6Var = p6.f2523a;
                        this.f2319w = null;
                        this.f2318v = 1;
                        obj = p6.h(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    str = (String) obj;
                } catch (Throwable th) {
                    obj2 = new pe.k(th);
                }
                if (str != null) {
                    p6 p6Var2 = p6.f2523a;
                    pe.a.e(c8.a.f("rest/v1/profiles?id=eq.".concat(p6.i()), "{\"accepted_terms_at\":\"now()\"}", str));
                    return new pe.l(obj2);
                }
                throw new IllegalStateException("sin sesión");
            default:
                int i11 = this.f2318v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        zVar = (pf.z) this.f2319w;
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    zVar = (pf.z) this.f2319w;
                }
                while (pf.u(zVar.A())) {
                    e eVar = e.f25373z;
                    this.f2319w = zVar;
                    this.f2318v = 1;
                    if (y.u(getContext()).R(eVar, this) == aVar) {
                        return aVar;
                    }
                }
                return obj2;
        }
    }
}
