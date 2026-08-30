package k0;

/* loaded from: classes.dex */
public final class i1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19308u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j1 f19309v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(j1 j1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f19308u = i;
        this.f19309v = j1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f19308u) {
            case 0:
                return new i1(this.f19309v, cVar, 0);
            case 1:
                return new i1(this.f19309v, cVar, 1);
            default:
                return new i1(this.f19309v, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f19308u) {
            case 0:
                i1 i1Var = (i1) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                i1Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                i1 i1Var2 = (i1) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                i1Var2.invokeSuspend(zVar3);
                return zVar3;
            default:
                i1 i1Var3 = (i1) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                i1Var3.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19308u) {
            case 0:
                pe.a.e(obj);
                this.f19309v.b(true);
                return pe.z.f22715a;
            case 1:
                pe.a.e(obj);
                this.f19309v.d();
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                this.f19309v.m();
                return pe.z.f22715a;
        }
    }
}
