package com.google.android.gms.internal.measurement;
import g3.a;
import j6.e;
import j6.n;
import o0.b;
import o0.l;
import q.x;
import x.n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13905a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13906b;

    public s(int i) {
        this.f13906b = i;
    }

    public static n a(b0 b0Var, Iterator it, n nVar) {
        if (it != null) {
            while (it.hasNext()) {
                n r8 = b0Var.a((n) it.next()).r((d) nVar);
                if (r8 instanceof h) {
                    h hVar = (h) r8;
                    String str = hVar.f13765v;
                    if ("break".equals(str)) {
                        return n.f13848h;
                    }
                    if ("return".equals(str)) {
                        return hVar;
                    }
                }
            }
        }
        return n.f13848h;
    }

    public static o b(j6.n nVar, List list) {
        o0.l(e0.FN, 2, list);
        n k3 = ((j6.e) nVar.f18939w).k(nVar, (n) list.get(0));
        n k4 = ((j6.e) nVar.f18939w).k(nVar, (n) list.get(1));
        if (k4 instanceof d) {
            ArrayList x9 = ((d) k4).x();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new o(k3.b(), x9, arrayList, nVar);
        }
        q.x.n(g3.a.k("FN requires an ArrayValue of parameter names found ", k4.getClass().getCanonicalName()));
        return null;
    }

    public static boolean d(n nVar, n nVar2) {
        n gVar;
        n gVar2;
        while (!nVar.getClass().equals(nVar2.getClass())) {
            if (((nVar instanceof t) || (nVar instanceof l)) && ((nVar2 instanceof t) || (nVar2 instanceof l))) {
                return true;
            }
            boolean z3 = nVar instanceof g;
            if (z3 && (nVar2 instanceof p)) {
                gVar2 = new g(nVar2.a());
            } else {
                boolean z9 = nVar instanceof p;
                if (z9 && (nVar2 instanceof g)) {
                    gVar = new g(nVar.a());
                } else if (nVar instanceof e) {
                    gVar = new g(nVar.a());
                } else if (nVar2 instanceof e) {
                    gVar2 = new g(nVar2.a());
                } else if ((z9 || z3) && (nVar2 instanceof i)) {
                    gVar2 = new p(nVar2.b());
                } else {
                    if (!(nVar instanceof i) || (!(nVar2 instanceof p) && !(nVar2 instanceof g))) {
                        return false;
                    }
                    gVar = new p(nVar.b());
                }
                nVar = gVar;
            }
            nVar2 = gVar2;
        }
        if ((nVar instanceof t) || (nVar instanceof l)) {
            return true;
        }
        if (nVar instanceof g) {
            if (Double.isNaN(nVar.a().doubleValue()) || Double.isNaN(nVar2.a().doubleValue()) || nVar.a().doubleValue() != nVar2.a().doubleValue()) {
                return false;
            }
            return true;
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

    public static n e(b0 b0Var, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return a(b0Var, ((Iterable) nVar).iterator(), nVar2);
        }
        q.x.n("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar instanceof i) {
            nVar = new p(nVar.b());
        }
        if (nVar2 instanceof i) {
            nVar2 = new p(nVar2.b());
        }
        if ((nVar instanceof p) && (nVar2 instanceof p)) {
            if (((p) nVar).f13877u.compareTo(((p) nVar2).f13877u) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = nVar.a().doubleValue();
        double doubleValue2 = nVar2.a().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != -0.0d) && ((doubleValue != -0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static boolean g(n nVar, n nVar2) {
        if (nVar instanceof i) {
            nVar = new p(nVar.b());
        }
        if (nVar2 instanceof i) {
            nVar2 = new p(nVar2.b());
        }
        if (((!(nVar instanceof p) || !(nVar2 instanceof p)) && (Double.isNaN(nVar.a().doubleValue()) || Double.isNaN(nVar2.a().doubleValue()))) || f(nVar2, nVar)) {
            return false;
        }
        return true;
    }

    public final void c(String str) {
        if (this.f13905a.contains(o0.b(str))) {
            throw new UnsupportedOperationException(g3.a.k("Command not implemented: ", str));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
