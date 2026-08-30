package a1;
import p.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n.i0;
import n.p0;
import q.x;
import ya.x0;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: u, reason: collision with root package name */
    public final df.l f216u;

    /* renamed from: v, reason: collision with root package name */
    public final i0 f217v;

    /* renamed from: w, reason: collision with root package name */
    public i0 f218w;

    public p(Map map, df.l lVar) {
        i0 i0Var;
        this.f216u = lVar;
        if (map != null && !map.isEmpty()) {
            i0Var = new i0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                i0Var.m(entry.getKey(), entry.getValue());
            }
        } else {
            i0Var = null;
        }
        this.f217v = i0Var;
    }

    @Override // a1.o
    public final boolean b(Object obj) {
        return ((Boolean) this.f216u.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // a1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c():java.util.Map");
    }

    @Override // a1.o
    public final n d(String str, df.a aVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!x0.c(str.charAt(i))) {
                i0 i0Var = this.f218w;
                if (i0Var == null) {
                    long[] jArr = p0.f20923a;
                    i0Var = new i0();
                    this.f218w = i0Var;
                }
                Object g8 = i0Var.g(str);
                if (g8 == null) {
                    g8 = new ArrayList();
                    i0Var.m(str, g8);
                }
                ((List) g8).add(aVar);
                return new ra.e(1, i0Var, str, aVar);
            }
        }
        x.n("Registered key is empty or blank");
        return null;
    }

    @Override // a1.o
    public final Object e(String str) {
        List list;
        i0 i0Var = this.f217v;
        if (i0Var != null) {
            list = (List) i0Var.k(str);
        } else {
            list = null;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && i0Var != null) {
            List subList = list.subList(1, list.size());
            int f10 = i0Var.f(str);
            if (f10 < 0) {
                f10 = ~f10;
            }
            Object[] objArr = i0Var.f20894c;
            Object obj = objArr[f10];
            i0Var.f20893b[f10] = str;
            objArr[f10] = subList;
        }
        return list.get(0);
    }
}
