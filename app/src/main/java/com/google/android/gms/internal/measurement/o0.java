package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c5 f13869a = new c5(5);

    public static double a(double d2) {
        int i;
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d2) && d2 != 0.0d && d2 != -0.0d) {
            if (d2 > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return Math.floor(Math.abs(d2)) * i;
        }
        return d2;
    }

    public static e0 b(String str) {
        e0 e0Var;
        if (str != null && !str.isEmpty()) {
            e0Var = (e0) e0.F0.get(Integer.valueOf(Integer.parseInt(str)));
        } else {
            e0Var = null;
        }
        if (e0Var != null) {
            return e0Var;
        }
        q.x.n(g3.a.k("Unsupported commandId ", str));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.q5] */
    public static q5 c(Object obj, Object obj2) {
        q5 q5Var = (q5) obj;
        q5 q5Var2 = (q5) obj2;
        if (!q5Var2.isEmpty()) {
            if (!q5Var.f13890u) {
                if (q5Var.isEmpty()) {
                    q5Var = new q5();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(q5Var);
                    linkedHashMap.f13890u = true;
                    q5Var = linkedHashMap;
                }
            }
            q5Var.b();
            if (!q5Var2.isEmpty()) {
                q5Var.putAll(q5Var2);
            }
        }
        return q5Var;
    }

    public static Object d(n nVar) {
        if (n.i.equals(nVar)) {
            return null;
        }
        if (n.f13848h.equals(nVar)) {
            return "";
        }
        if (nVar instanceof m) {
            return e((m) nVar);
        }
        if (nVar instanceof d) {
            ArrayList arrayList = new ArrayList();
            d dVar = (d) nVar;
            int i = 0;
            while (i < dVar.r()) {
                if (i < dVar.r()) {
                    int i10 = i + 1;
                    Object d2 = d(dVar.p(i));
                    if (d2 != null) {
                        arrayList.add(d2);
                    }
                    i = i10;
                } else {
                    l4.a.h(g3.a.g(i, "Out of bounds index: "));
                    return null;
                }
            }
            return arrayList;
        }
        if (!nVar.a().isNaN()) {
            return nVar.a();
        }
        return nVar.b();
    }

    public static HashMap e(m mVar) {
        HashMap hashMap = new HashMap();
        mVar.getClass();
        ArrayList arrayList = new ArrayList(mVar.f13839u.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object d2 = d(mVar.o(str));
            if (d2 != null) {
                hashMap.put(str, d2);
            }
        }
        return hashMap;
    }

    public static void f(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.f(i, list.size(), str, " operation requires ");
    }

    public static void g(e0 e0Var, int i, List list) {
        f(i, e0Var.name(), list);
    }

    public static void h(j6.n nVar) {
        int j10 = j(nVar.t("runtime.counter").a().doubleValue() + 1.0d);
        if (j10 <= 1000000) {
            nVar.y("runtime.counter", new g(Double.valueOf(j10)));
        } else {
            q.x.o("Instructions allowed exceeded");
        }
    }

    public static boolean i(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof t) || (nVar instanceof l)) {
            return true;
        }
        if (nVar instanceof g) {
            if (Double.isNaN(nVar.a().doubleValue()) || Double.isNaN(nVar2.a().doubleValue())) {
                return false;
            }
            return nVar.a().equals(nVar2.a());
        }
        if (nVar instanceof p) {
            return nVar.b().equals(nVar2.b());
        }
        if (nVar instanceof e) {
            return nVar.k().equals(nVar2.k());
        }
        if (nVar != nVar2) {
            return false;
        }
        return true;
    }

    public static int j(double d2) {
        int i;
        if (!Double.isNaN(d2) && !Double.isInfinite(d2) && d2 != 0.0d) {
            if (d2 > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return (int) ((Math.floor(Math.abs(d2)) * i) % 4.294967296E9d);
        }
        return 0;
    }

    public static void k(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.f(i, list.size(), str, " operation requires at least ");
    }

    public static void l(e0 e0Var, int i, List list) {
        k(i, e0Var.name(), list);
    }

    public static boolean m(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double a10 = nVar.a();
        if (a10.isNaN() || a10.doubleValue() < 0.0d || !a10.equals(Double.valueOf(Math.floor(a10.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static void n(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.f(i, arrayList.size(), str, " operation requires at most ");
    }
}
