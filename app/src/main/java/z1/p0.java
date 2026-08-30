package z1;
import b.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface p0 {
    default int a(t tVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new b2.m1((o0) list.get(i10), u.f31893u, v.f31898u, 1));
        }
        return g(new w(tVar, tVar.getLayoutDirection()), arrayList, y2.b(0, i, 7)).getWidth();
    }

    default int d(t tVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new b2.m1((o0) list.get(i10), u.f31894v, v.f31898u, 1));
        }
        return g(new w(tVar, tVar.getLayoutDirection()), arrayList, y2.b(0, i, 7)).getWidth();
    }

    default int f(t tVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new b2.m1((o0) list.get(i10), u.f31894v, v.f31899v, 1));
        }
        return g(new w(tVar, tVar.getLayoutDirection()), arrayList, y2.b(i, 0, 13)).getHeight();
    }

    q0 g(r0 r0Var, List list, long j10);

    default int i(t tVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new b2.m1((o0) list.get(i10), u.f31893u, v.f31899v, 1));
        }
        return g(new w(tVar, tVar.getLayoutDirection()), arrayList, y2.b(i, 0, 13)).getHeight();
    }
}
