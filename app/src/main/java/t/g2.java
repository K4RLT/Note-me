package t;
import x.o;
import j1.b;
import q.x;
import v1.t;

/* loaded from: classes.dex */
public final class g2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25400u;

    /* renamed from: v, reason: collision with root package name */
    public int f25401v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.q f25402w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c1 f25403x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f25404y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(df.q qVar, c1 c1Var, t tVar, te.c cVar, int i) {
        super(2, cVar);
        this.f25400u = i;
        this.f25402w = qVar;
        this.f25403x = c1Var;
        this.f25404y = tVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25400u) {
            case 0:
                return new g2(this.f25402w, this.f25403x, this.f25404y, cVar, 0);
            default:
                return new g2(this.f25402w, this.f25403x, this.f25404y, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25400u) {
            case 0:
                return ((g2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25400u) {
            case 0:
                int i = this.f25401v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    b bVar = new b(this.f25404y.f27343c);
                    this.f25401v = 1;
                    Object b10 = this.f25402w.b(this.f25403x, bVar, this);
                    ue.a aVar = ue.a.f27192u;
                    if (b10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f25401v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    b bVar2 = new b(this.f25404y.f27343c);
                    this.f25401v = 1;
                    Object b11 = this.f25402w.b(this.f25403x, bVar2, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (b11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
