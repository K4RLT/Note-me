package r;
import b0.x;
import v.f;
import v.g;
import v.i;

/* loaded from: classes.dex */
public final class c extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24050u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f24051v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, te.c cVar, int i) {
        super(2, cVar);
        this.f24050u = i;
        this.f24051v = dVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f24050u) {
            case 0:
                return new c(this.f24051v, cVar, 0);
            default:
                return new c(this.f24051v, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f24050u) {
            case 0:
                c cVar2 = (c) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                cVar2.invokeSuspend(zVar2);
                return zVar2;
            default:
                c cVar3 = (c) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                cVar3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f] */
    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24050u) {
            case 0:
                pe.a.e(obj);
                d dVar = this.f24051v;
                if (dVar.U == null) {
                    Object obj2 = new Object();
                    i iVar = dVar.K;
                    if (iVar != null) {
                        pf.x(dVar.M0(), null, new l5.a(iVar, obj2, null, 3), 3);
                    }
                    dVar.U = obj2;
                }
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                d dVar2 = this.f24051v;
                f fVar = dVar2.U;
                if (fVar != null) {
                    g gVar = new g(fVar);
                    i iVar2 = dVar2.K;
                    te.c cVar = null;
                    if (iVar2 != null) {
                        pf.x(dVar2.M0(), null, new l5.a(iVar2, gVar, cVar, 4), 3);
                    }
                    dVar2.U = null;
                }
                return pe.z.f22715a;
        }
    }
}