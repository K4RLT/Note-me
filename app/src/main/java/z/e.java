package z;

import b0.e1;
import b0.f0;

/* loaded from: classes.dex */
public final class e extends f0 {

    /* renamed from: b */
    public final e1 f31669b = new e1(0, (byte) 0);

    public e(df.l lVar) {
        lVar.invoke(this);
    }

    public static void n(e eVar, String str, z0.c cVar, int i) {
        int i10 = 1;
        p.f fVar = null;
        if ((i & 1) != 0) {
            str = null;
        }
        e1 e1Var = eVar.f31669b;
        if (str != null) {
            fVar = new p.f(1, str);
        }
        e1Var.a(1, new d(fVar, new h(i10, 3), new z0.c(-1010194746, new e1.m(2, cVar), true)));
    }

    public static /* synthetic */ void p(e eVar, int i, df.l lVar, z0.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        eVar.o(i, lVar, h.f31686w, cVar);
    }

    @Override // b0.f0
    public final e1 k() {
        return this.f31669b;
    }

    public final void o(int i, df.l lVar, df.l lVar2, z0.c cVar) {
        this.f31669b.a(i, new d(lVar, lVar2, cVar));
    }
}
