package r;
import q.x;
import v.i;
import v.j;
import v.k;
import v.l;

/* loaded from: classes.dex */
public final class b extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24046u;

    /* renamed from: v, reason: collision with root package name */
    public int f24047v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f24048w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f24049x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, k kVar, te.c cVar, int i) {
        super(2, cVar);
        this.f24046u = i;
        this.f24048w = dVar;
        this.f24049x = kVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f24046u) {
            case 0:
                return new b(this.f24048w, this.f24049x, cVar, 0);
            case 1:
                return new b(this.f24048w, this.f24049x, cVar, 1);
            default:
                return new b(this.f24048w, this.f24049x, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f24046u) {
            case 0:
                return ((b) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((b) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((b) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24046u) {
            case 0:
                int i = this.f24047v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    i iVar = this.f24048w.K;
                    if (iVar != null) {
                        j jVar = new j(this.f24049x);
                        this.f24047v = 1;
                        Object a10 = iVar.a(jVar, this);
                        ue.a aVar = ue.a.f27192u;
                        if (a10 == aVar) {
                            return aVar;
                        }
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f24047v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    i iVar2 = this.f24048w.K;
                    if (iVar2 != null) {
                        this.f24047v = 1;
                        Object a11 = iVar2.a(this.f24049x, this);
                        ue.a aVar2 = ue.a.f27192u;
                        if (a11 == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return pe.z.f22715a;
            default:
                int i11 = this.f24047v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    i iVar3 = this.f24048w.K;
                    if (iVar3 != null) {
                        l lVar = new l(this.f24049x);
                        this.f24047v = 1;
                        Object a12 = iVar3.a(lVar, this);
                        ue.a aVar3 = ue.a.f27192u;
                        if (a12 == aVar3) {
                            return aVar3;
                        }
                    }
                }
                return pe.z.f22715a;
        }
    }
}
