package c7;
import m.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f3974a;

    public n(h6.j jVar) {
        jVar.getClass();
        g6.a aVar = new g6.a(jVar.f17865a, 0);
        g6.a aVar2 = new g6.a(jVar.f17866b);
        g6.a aVar3 = new g6.a(jVar.f17868d, 4);
        h6.e eVar = jVar.f17867c;
        this.f3974a = qe.h(aVar, aVar2, aVar3, new g6.a(eVar, 2), new g6.a(eVar, 3), new g6.e(eVar), new g6.d(eVar));
    }

    public boolean a(j6.p pVar) {
        List list = this.f3974a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g6.c cVar = (g6.c) obj;
            cVar.getClass();
            if (cVar.b(pVar) && cVar.c(cVar.f17555a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            a6.q.d().a(f6.j.f16773a, "Work " + pVar.f18944a + " constrained by " + qe.l.B(arrayList, null, null, null, f6.f.f16763u, 31));
        }
        return arrayList.isEmpty();
    }

    public n(List list) {
        this.f3974a = list;
    }
}
