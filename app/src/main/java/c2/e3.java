package c2;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class e3 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3513u;

    /* renamed from: v, reason: collision with root package name */
    public int f3514v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g3 f3515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(g3 g3Var, te.c cVar, int i) {
        super(2, cVar);
        this.f3513u = i;
        this.f3515w = g3Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f3513u) {
            case 0:
                return new e3(this.f3515w, cVar, 0);
            default:
                return new e3(this.f3515w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f3513u) {
            case 0:
                return ((e3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((e3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3513u) {
            case 0:
                int i = this.f3514v;
                pe.z zVar = pe.z.f22715a;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                x xVar = this.f3515w.f3542u;
                this.f3514v = 1;
                Object e = xVar.M.e(this);
                ue.a aVar = ue.a.f27192u;
                if (e != aVar) {
                    e = zVar;
                }
                if (e == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i10 = this.f3514v;
                pe.z zVar2 = pe.z.f22715a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar2;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                x xVar2 = this.f3515w.f3542u;
                this.f3514v = 1;
                Object a10 = xVar2.N.a(this);
                ue.a aVar2 = ue.a.f27192u;
                if (a10 != aVar2) {
                    a10 = zVar2;
                }
                if (a10 == aVar2) {
                    return aVar2;
                }
                return zVar2;
        }
    }
}
