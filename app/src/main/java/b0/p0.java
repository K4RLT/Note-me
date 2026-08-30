package b0;
import q.e;
import q.l;
import q.r0;
import q.x;

/* loaded from: classes.dex */
public final class p0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1239u;

    /* renamed from: v, reason: collision with root package name */
    public int f1240v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z5.h f1241w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(z5.h hVar, te.c cVar, int i) {
        super(2, cVar);
        this.f1239u = i;
        this.f1241w = hVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1239u) {
            case 0:
                return new p0(this.f1241w, cVar, 0);
            default:
                return new p0(this.f1241w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1239u) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1239u) {
            case 0:
                int i = this.f1240v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    l lVar = (l) this.f1241w.f31922v;
                    Float f10 = new Float(0.0f);
                    r0 r8 = e.r(0.0f, 400.0f, new Float(0.5f), 1);
                    this.f1240v = 1;
                    Object h3 = e.h(lVar, f10, r8, true, null, this, 8);
                    ue.a aVar = ue.a.f27192u;
                    if (h3 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f1240v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    l lVar2 = (l) this.f1241w.f31922v;
                    Float f11 = new Float(0.0f);
                    r0 r10 = e.r(0.0f, 400.0f, new Float(0.5f), 1);
                    this.f1240v = 1;
                    Object h10 = e.h(lVar2, f11, r10, true, null, this, 8);
                    ue.a aVar2 = ue.a.f27192u;
                    if (h10 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
