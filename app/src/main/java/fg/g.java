package fg;

import eg.h0;
import java.util.Iterator;
import java.util.List;
import wa.o6;

/* loaded from: classes.dex */
public final class g implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f16974a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f f16975b = f.f16971b;

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        o6.a(tVar);
        p pVar = p.f16992a;
        cg.d d2 = pVar.d();
        d2.getClass();
        h0 h0Var = new h0(d2);
        int size = eVar.size();
        gg.t a10 = tVar.a(h0Var);
        Iterator<m> it = eVar.iterator();
        for (int i = 0; i < size; i++) {
            a10.r(h0Var, i, pVar, it.next());
        }
        a10.w(h0Var);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        o6.b(bVar);
        return new e((List) new eg.c(p.f16992a).i(bVar));
    }

    @Override // ag.a
    public final cg.d d() {
        return f16975b;
    }
}
