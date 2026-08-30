package w7;
import o8.a;
import w7.o8;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final sf.n0 f28851a;

    /* renamed from: b, reason: collision with root package name */
    public static final sf.a0 f28852b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28853c;

    static {
        sf.n0 b10 = sf.e0.b(qe.s.f24023u);
        f28851a = b10;
        f28852b = new sf.a0(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.o8.a(android.content.Context):void");
    }

    public static void b(Context context, String str) {
        context.getClass();
        str.getClass();
        a(context);
        String str2 = "remote:" + str + "/";
        String concat = str.concat("/");
        sf.n0 n0Var = f28851a;
        Iterable iterable = (Iterable) n0Var.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            p8 p8Var = (p8) next;
            q8 q8Var = p8Var.f28913a;
            String str3 = p8Var.f28914b;
            int i = n8.f28801a[q8Var.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    z3 = mf.m.j(str3, concat);
                }
            } else {
                z3 = mf.m.j(str3, str2);
            }
            if (!z3) {
                arrayList.add(next);
            }
        }
        if (arrayList.equals(n0Var.getValue())) {
            return;
        }
        n0Var.k(null, arrayList);
        context.getApplicationContext().getSharedPreferences("scraply_recent_inserts", 0).edit().putString("items", qe.l.B(arrayList, "\n", null, null, new f3(23), 30)).apply();
    }

    public static void c(Context context, q8 q8Var, String str) {
        context.getClass();
        q8Var.getClass();
        str.getClass();
        if (!mf.f.u(str)) {
            a(context);
            p8 p8Var = new p8(q8Var, str);
            List g8 = qe.m.g(p8Var);
            sf.n0 n0Var = f28851a;
            Iterable iterable = (Iterable) n0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!kotlin.jvm.internal.l.a((p8) obj, p8Var)) {
                    arrayList.add(obj);
                }
            }
            List L = qe.l.L(qe.l.E(g8, arrayList), 12);
            if (L.equals(n0Var.getValue())) {
                return;
            }
            n0Var.k(null, L);
            context.getApplicationContext().getSharedPreferences("scraply_recent_inserts", 0).edit().putString("items", qe.l.B(L, "\n", null, null, new f3(22), 30)).apply();
        }
    }
}
