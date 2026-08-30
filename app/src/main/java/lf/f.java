package lf;

import df.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qe.m;
import qe.s;

/* loaded from: classes.dex */
public abstract class f extends g {
    public static d b(Object obj, l lVar) {
        if (obj == null) {
            return b.f20355a;
        }
        return new af.j(new androidx.ink.authoring.compose.a(1, obj), lVar, 1);
    }

    public static List c(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return s.f24023u;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m.g(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
