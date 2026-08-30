package t;
import q.x;

/* loaded from: classes.dex */
public final class f2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25389u;

    /* renamed from: v, reason: collision with root package name */
    public int f25390v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f25391w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(c1 c1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f25389u = i;
        this.f25391w = c1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25389u) {
            case 0:
                return new f2(this.f25391w, cVar, 0);
            default:
                return new f2(this.f25391w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25389u) {
            case 0:
                return ((f2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((f2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25389u) {
            case 0:
                int i = this.f25390v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f25390v = 1;
                    Object d2 = this.f25391w.d(this);
                    ue.a aVar = ue.a.f27192u;
                    if (d2 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f25390v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f25390v = 1;
                    Object d10 = this.f25391w.d(this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (d10 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
