package wa;
import n.j;
import q.b;
import s.e;
import a3.a;
import g5.q;
import j1.b;
import j2.n;
import j2.s;
import r3.e;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a6 {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j10;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = qe.s.f24023u;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    n nVar = (n) obj2;
                    n nVar2 = (n) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (nVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (nVar.g().b() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (nVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (nVar.g().b() & 4294967295L)));
                    arrayList2.add(new b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j10 = ((b) qe.l.w(list)).f18762a;
            } else {
                if (list.isEmpty()) {
                    a.b("Empty collection can't be reduced.");
                }
                Object w10 = qe.l.w(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i10 = 1;
                    while (true) {
                        w10 = new b(b.h(((b) w10).f18762a, ((b) list.get(i10)).f18762a));
                        if (i10 == size2) {
                            break;
                        }
                        i10++;
                    }
                }
                j10 = ((b) w10).f18762a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j10)) >= Float.intBitsToFloat((int) (j10 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void b(n nVar, e eVar) {
        int i;
        int i10;
        Object g8 = nVar.k().f18813u.g(s.f18844g);
        Object obj = null;
        if (g8 == null) {
            g8 = null;
        }
        if (g8 == null) {
            n l10 = nVar.l();
            if (l10 != null) {
                Object g10 = l10.k().f18813u.g(s.e);
                if (g10 == null) {
                    g10 = null;
                }
                if (g10 != null) {
                    Object g11 = l10.k().f18813u.g(s.f18843f);
                    if (g11 != null) {
                        obj = g11;
                    }
                    b bVar = (b) obj;
                    if (bVar == null || (bVar.f18777a >= 0 && bVar.f18778b >= 0)) {
                        if (nVar.k().f18813u.c(s.H)) {
                            ArrayList arrayList = new ArrayList();
                            List j10 = n.j(4, l10);
                            int size = j10.size();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size; i12++) {
                                n nVar2 = (n) j10.get(i12);
                                if (nVar2.k().f18813u.c(s.H)) {
                                    arrayList.add(nVar2);
                                    if (nVar2.f18822c.w() < nVar.f18822c.w()) {
                                        i11++;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                boolean a10 = a(arrayList);
                                if (a10) {
                                    i = 0;
                                } else {
                                    i = i11;
                                }
                                if (a10) {
                                    i10 = i11;
                                } else {
                                    i10 = 0;
                                }
                                Object g12 = nVar.k().f18813u.g(s.H);
                                if (g12 == null) {
                                    g12 = Boolean.FALSE;
                                }
                                eVar.f24537a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i10, 1, false, ((Boolean) g12).booleanValue()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        q.b();
    }
}
