package r;
import b0.i;
import j1.b;
import q.x;
import t.c1;

/* loaded from: classes.dex */
public final class p extends ve.i implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24135u;

    /* renamed from: v, reason: collision with root package name */
    public int f24136v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ c1 f24137w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ long f24138x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f24139y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(d dVar, te.c cVar, int i) {
        super(3, cVar);
        this.f24135u = i;
        this.f24139y = dVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        c1 c1Var = (c1) obj;
        b bVar = (b) obj2;
        switch (this.f24135u) {
            case 0:
                long j10 = bVar.f18762a;
                p pVar = new p((q) this.f24139y, (te.c) obj3, 0);
                pVar.f24137w = c1Var;
                pVar.f24138x = j10;
                return pVar.invokeSuspend(pe.z.f22715a);
            default:
                long j11 = bVar.f18762a;
                p pVar2 = new p((v) this.f24139y, (te.c) obj3, 1);
                pVar2.f24137w = c1Var;
                pVar2.f24138x = j11;
                return pVar2.invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f24135u) {
            case 0:
                int i = this.f24136v;
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
                c1 c1Var = this.f24137w;
                long j10 = this.f24138x;
                q qVar = (q) this.f24139y;
                if (qVar.O) {
                    this.f24136v = 1;
                    i iVar = qVar.K;
                    ue.a aVar = ue.a.f27192u;
                    if (iVar == null || (obj2 = pf.i(new a(c1Var, j10, iVar, qVar, null), this)) != aVar) {
                        obj2 = zVar;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    return zVar;
                }
                return zVar;
            default:
                int i10 = this.f24136v;
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
                c1 c1Var2 = this.f24137w;
                long j11 = this.f24138x;
                v vVar = (v) this.f24139y;
                if (vVar.O) {
                    this.f24136v = 1;
                    i iVar2 = vVar.K;
                    ue.a aVar2 = ue.a.f27192u;
                    if (iVar2 == null || (obj3 = pf.i(new a(c1Var2, j11, iVar2, vVar, null), this)) != aVar2) {
                        obj3 = zVar2;
                    }
                    if (obj3 == aVar2) {
                        return aVar2;
                    }
                    return zVar2;
                }
                return zVar2;
        }
    }
}
