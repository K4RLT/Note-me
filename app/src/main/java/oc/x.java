package oc;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements ib.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21953u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ib.h f21954v;

    public /* synthetic */ x(ib.h hVar, int i) {
        this.f21953u = i;
        this.f21954v = hVar;
    }

    @Override // ib.a
    public final Object g(ib.o oVar) {
        switch (this.f21953u) {
            case 0:
                boolean l10 = oVar.l();
                ib.h hVar = this.f21954v;
                if (l10) {
                    hVar.d(oVar.j());
                    return null;
                }
                if (oVar.i() != null) {
                    hVar.c(oVar.i());
                    return null;
                }
                return null;
            case 1:
                boolean l11 = oVar.l();
                ib.h hVar2 = this.f21954v;
                if (l11) {
                    hVar2.d(oVar.j());
                    return null;
                }
                if (oVar.i() != null) {
                    hVar2.c(oVar.i());
                    return null;
                }
                return null;
            default:
                boolean l12 = oVar.l();
                ib.h hVar3 = this.f21954v;
                if (l12) {
                    hVar3.b(oVar.j());
                    return null;
                }
                if (oVar.i() != null) {
                    hVar3.a(oVar.i());
                    return null;
                }
                return null;
        }
    }
}
