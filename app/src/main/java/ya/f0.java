package ya;
import m.c;
import m.d;
import m.e;
import e0.a;
import eb.u1;
import l5.h;
import qe.l;
import qe.m;
import re.b;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f0 {
    public static final List a(c cVar) {
        int a10 = a(cVar, FacebookMediationAdapter.KEY_ID);
        int a11 = a(cVar, "seq");
        int a12 = a(cVar, "from");
        int a13 = a(cVar, "to");
        b e = m.e();
        while (cVar.P()) {
            e.add(new e(cVar.D(a12), (int) cVar.getLong(a10), (int) cVar.getLong(a11), cVar.D(a13)));
        }
        return l.J(m.c(e));
    }

    public static final h b(a aVar, String str, boolean z3) {
        String str2;
        c T = aVar.T("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int a10 = a(T, "seqno");
            int a11 = a(T, "cid");
            int a12 = a(T, "name");
            int a13 = a(T, "desc");
            if (a10 != -1 && a11 != -1 && a12 != -1 && a13 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (T.P()) {
                    if (((int) T.getLong(a11)) >= 0) {
                        int i = (int) T.getLong(a10);
                        String D = T.D(a12);
                        if (T.getLong(a13) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i), D);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List K = l.K(linkedHashMap.entrySet(), new u1(3));
                ArrayList arrayList = new ArrayList(m.d(K, 10));
                Iterator it = K.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List P = l.P(arrayList);
                List K2 = l.K(linkedHashMap2.entrySet(), new u1(4));
                ArrayList arrayList2 = new ArrayList(m.d(K2, 10));
                Iterator it2 = K2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                h hVar = new h(str, z3, P, l.P(arrayList2));
                ug.a.b(T, null);
                return hVar;
            }
            ug.a.b(T, null);
            return null;
        } finally {
        }
    }
}
