package u7;
import q.d;
import q.k1;
import q.x;

/* loaded from: classes.dex */
public final class f6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26188u;

    /* renamed from: v, reason: collision with root package name */
    public int f26189v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f26190w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k1 f26191x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(d dVar, k1 k1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26188u = i;
        this.f26190w = dVar;
        this.f26191x = k1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26188u) {
            case 0:
                return new f6(this.f26190w, this.f26191x, cVar, 0);
            default:
                return new f6(this.f26190w, this.f26191x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26188u) {
            case 0:
                return ((f6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((f6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26188u) {
            case 0:
                int i = this.f26189v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f10 = new Float(0.0f);
                    this.f26189v = 1;
                    Object c10 = d.c(this.f26190w, f10, this.f26191x, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f26189v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f11 = new Float(0.0f);
                    this.f26189v = 1;
                    Object c11 = d.c(this.f26190w, f11, this.f26191x, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
