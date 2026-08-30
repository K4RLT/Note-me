package r0;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class k2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24280u;

    /* renamed from: v, reason: collision with root package name */
    public int f24281v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24282w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.p f24283x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f24284y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(df.p pVar, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f24280u = i;
        this.f24283x = pVar;
        this.f24284y = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f24280u) {
            case 0:
                k2 k2Var = new k2(this.f24283x, this.f24284y, cVar, 0);
                k2Var.f24282w = obj;
                return k2Var;
            case 1:
                k2 k2Var2 = new k2(this.f24283x, this.f24284y, cVar, 1);
                k2Var2.f24282w = obj;
                return k2Var2;
            default:
                k2 k2Var3 = new k2(this.f24283x, this.f24284y, cVar, 2);
                k2Var3.f24282w = obj;
                return k2Var3;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f24280u) {
            case 0:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24280u) {
            case 0:
                int i = this.f24281v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    o1 o1Var = new o1(this.f24284y, ((pf.z) this.f24282w).A());
                    this.f24281v = 1;
                    Object invoke = this.f24283x.invoke(o1Var, this);
                    ue.a aVar = ue.a.f27192u;
                    if (invoke == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f24281v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    o1 o1Var2 = new o1(this.f24284y, ((pf.z) this.f24282w).A());
                    this.f24281v = 1;
                    Object invoke2 = this.f24283x.invoke(o1Var2, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (invoke2 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            default:
                int i11 = this.f24281v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    o1 o1Var3 = new o1(this.f24284y, ((pf.z) this.f24282w).A());
                    this.f24281v = 1;
                    Object invoke3 = this.f24283x.invoke(o1Var3, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (invoke3 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
