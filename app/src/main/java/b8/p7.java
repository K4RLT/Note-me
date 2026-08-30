package b8;
import c7.f;
import c7.k;
import ib.c;
import ib.o;

import java.util.List;

/* loaded from: classes.dex */
public final class p7 implements k, c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pf.l f2528u;

    public /* synthetic */ p7(pf.l lVar) {
        this.f2528u = lVar;
    }

    @Override // k
    public void c(f fVar, List list) {
        fVar.getClass();
        list.getClass();
        this.f2528u.resumeWith(list);
    }

    @Override // c
    public void f(o oVar) {
        Exception i = oVar.i();
        if (i == null) {
            boolean z3 = oVar.f18384d;
            pf.l lVar = this.f2528u;
            if (z3) {
                lVar.i(null);
                return;
            } else {
                lVar.resumeWith(oVar.j());
                return;
            }
        }
        this.f2528u.resumeWith(new pe.k(i));
    }
}
