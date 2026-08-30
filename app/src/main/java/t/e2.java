package t;

/* loaded from: classes.dex */
public final class e2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25386u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c1 f25387v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(c1 c1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f25386u = i;
        this.f25387v = c1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25386u) {
            case 0:
                return new e2(this.f25387v, cVar, 0);
            case 1:
                return new e2(this.f25387v, cVar, 1);
            case 2:
                return new e2(this.f25387v, cVar, 2);
            case 3:
                return new e2(this.f25387v, cVar, 3);
            case 4:
                return new e2(this.f25387v, cVar, 4);
            case 5:
                return new e2(this.f25387v, cVar, 5);
            case 6:
                return new e2(this.f25387v, cVar, 6);
            default:
                return new e2(this.f25387v, cVar, 7);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25386u) {
            case 0:
                e2 e2Var = (e2) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                e2Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                e2 e2Var2 = (e2) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                e2Var2.invokeSuspend(zVar3);
                return zVar3;
            case 2:
                e2 e2Var3 = (e2) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                e2Var3.invokeSuspend(zVar4);
                return zVar4;
            case 3:
                e2 e2Var4 = (e2) create(zVar, cVar);
                pe.z zVar5 = pe.z.f22715a;
                e2Var4.invokeSuspend(zVar5);
                return zVar5;
            case 4:
                e2 e2Var5 = (e2) create(zVar, cVar);
                pe.z zVar6 = pe.z.f22715a;
                e2Var5.invokeSuspend(zVar6);
                return zVar6;
            case 5:
                e2 e2Var6 = (e2) create(zVar, cVar);
                pe.z zVar7 = pe.z.f22715a;
                e2Var6.invokeSuspend(zVar7);
                return zVar7;
            case 6:
                e2 e2Var7 = (e2) create(zVar, cVar);
                pe.z zVar8 = pe.z.f22715a;
                e2Var7.invokeSuspend(zVar8);
                return zVar8;
            default:
                e2 e2Var8 = (e2) create(zVar, cVar);
                pe.z zVar9 = pe.z.f22715a;
                e2Var8.invokeSuspend(zVar9);
                return zVar9;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25386u) {
            case 0:
                pe.a.e(obj);
                this.f25387v.b();
                return pe.z.f22715a;
            case 1:
                pe.a.e(obj);
                this.f25387v.c();
                return pe.z.f22715a;
            case 2:
                pe.a.e(obj);
                this.f25387v.c();
                return pe.z.f22715a;
            case 3:
                pe.a.e(obj);
                this.f25387v.b();
                return pe.z.f22715a;
            case 4:
                pe.a.e(obj);
                this.f25387v.c();
                return pe.z.f22715a;
            case 5:
                pe.a.e(obj);
                this.f25387v.c();
                return pe.z.f22715a;
            case 6:
                pe.a.e(obj);
                this.f25387v.b();
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                this.f25387v.c();
                return pe.z.f22715a;
        }
    }
}
