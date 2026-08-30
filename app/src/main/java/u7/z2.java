package u7;
import m3.g;
import q.x;

/* loaded from: classes.dex */
public final class z2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27085u;

    /* renamed from: v, reason: collision with root package name */
    public int f27086v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f27087w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f27088x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(m3 m3Var, int i, te.c cVar, int i10) {
        super(2, cVar);
        this.f27085u = i10;
        this.f27087w = m3Var;
        this.f27088x = i;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27085u) {
            case 0:
                return new z2(this.f27087w, this.f27088x, cVar, 0);
            default:
                return new z2(this.f27087w, this.f27088x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27085u) {
            case 0:
                return ((z2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((z2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27085u) {
            case 0:
                int i = this.f27086v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f27086v = 1;
                    Object g8 = g(this.f27087w, this.f27088x, this);
                    ue.a aVar = ue.a.f27192u;
                    if (g8 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f27086v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f27086v = 1;
                    Object g10 = g(this.f27087w, this.f27088x, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (g10 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
