package p7;

import pf.q1;

/* loaded from: classes.dex */
public final class g implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22478u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pf.l f22479v;

    public /* synthetic */ g(pf.l lVar, int i) {
        this.f22478u = i;
        this.f22479v = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f22478u) {
            case 0:
                String str = (String) obj;
                pf.l lVar = this.f22479v;
                lVar.getClass();
                if (pf.l.A.get(lVar) instanceof q1) {
                    lVar.resumeWith(str);
                }
                return pe.z.f22715a;
            default:
                pf.l lVar2 = this.f22479v;
                pe.z zVar = pe.z.f22715a;
                lVar2.resumeWith(zVar);
                return zVar;
        }
    }
}
