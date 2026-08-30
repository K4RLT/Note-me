package b1;
import l.a;
import p.h;
import p.i;
import p.k;
import p.l;
import p.n;
import p.t;
import p.w;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1403a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1404b = new Object();

    public static final void a(int i, int i10) {
        if (i >= 0 && i < i10) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i10 + ')');
    }

    public static final boolean b(d0 d0Var, int i, v0.b bVar, boolean z3) {
        boolean z9;
        synchronized (f1403a) {
            try {
                int i10 = d0Var.f1329d;
                if (i10 == i) {
                    d0Var.f1328c = bVar;
                    z9 = true;
                    if (z3) {
                        d0Var.e++;
                    }
                    d0Var.f1329d = i10 + 1;
                } else {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    public static final int c(long j10, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i10 = (i + length) >>> 1;
            long j11 = jArr[i10];
            if (j10 > j11) {
                i = i10 + 1;
            } else if (j10 < j11) {
                length = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i + 1);
    }

    public static i d() {
        return (i) p.f1386b.b();
    }

    public static final d0 e(v vVar) {
        d0 d0Var = vVar.f1402u;
        d0Var.getClass();
        return (d0) t(d0Var, vVar);
    }

    public static final int f(v vVar) {
        d0 d0Var = vVar.f1402u;
        d0Var.getClass();
        return ((d0) i(d0Var)).e;
    }

    public static i g(i iVar) {
        if (iVar instanceof m0) {
            m0 m0Var = (m0) iVar;
            if (m0Var.f1376t == z0.h.b()) {
                m0Var.f1374r = null;
                return iVar;
            }
        }
        if (iVar instanceof n0) {
            n0 n0Var = (n0) iVar;
            if (n0Var.i == z0.h.b()) {
                n0Var.f1382h = null;
                return iVar;
            }
        }
        i h3 = h(iVar, null, false);
        h3.j();
        return h3;
    }

    public static final boolean h(v vVar, df.l lVar) {
        int i;
        v0.b bVar;
        Object invoke;
        i k3;
        boolean b10;
        do {
            synchronized (f1403a) {
                d0 d0Var = vVar.f1402u;
                d0Var.getClass();
                d0 d0Var2 = (d0) i(d0Var);
                i = d0Var2.f1329d;
                bVar = d0Var2.f1328c;
            }
            bVar.getClass();
            v0.e n10 = bVar.n();
            invoke = lVar.invoke(n10);
            v0.b g8 = n10.g();
            if (kotlin.jvm.internal.a(g8, bVar)) {
                break;
            }
            d0 d0Var3 = vVar.f1402u;
            d0Var3.getClass();
            synchronized (p.f1387c) {
                k3 = k();
                b10 = b((d0) p.w(d0Var3, vVar, k3), i, g8, true);
            }
            n(k3, vVar);
        } while (!b10);
        return ((Boolean) invoke).booleanValue();
    }

    public static Object i(df.a aVar, df.l lVar) {
        d dVar;
        i m0Var;
        if (lVar == null) {
            return aVar.invoke();
        }
        i iVar = (i) p.f1386b.b();
        if (iVar instanceof m0) {
            m0 m0Var2 = (m0) iVar;
            if (m0Var2.f1376t == z0.h.b()) {
                df.l lVar2 = m0Var2.f1374r;
                df.l lVar3 = m0Var2.f1375s;
                try {
                    ((m0) iVar).f1374r = l(lVar, lVar2, true);
                    ((m0) iVar).f1375s = lVar3;
                    return aVar.invoke();
                } finally {
                    m0Var2.f1374r = lVar2;
                    m0Var2.f1375s = lVar3;
                }
            }
        }
        if (iVar != null && !(iVar instanceof d)) {
            if (lVar == null) {
                return aVar.invoke();
            }
            m0Var = iVar.u(lVar);
        } else {
            if (iVar instanceof d) {
                dVar = (d) iVar;
            } else {
                dVar = null;
            }
            m0Var = new m0(dVar, lVar, null, true, false);
        }
        try {
            i j10 = m0Var.j();
            try {
                Object invoke = aVar.invoke();
                i.q(j10);
                m0Var.c();
                return invoke;
            } catch (Throwable th) {
                i.q(j10);
                throw th;
            }
        } catch (Throwable th2) {
            m0Var.c();
            throw th2;
        }
    }

    public static void j(i iVar, i iVar2, df.l lVar) {
        if (iVar == iVar2) {
            if (iVar instanceof m0) {
                ((m0) iVar).f1374r = lVar;
                return;
            } else if (iVar instanceof n0) {
                ((n0) iVar).f1382h = lVar;
                return;
            } else {
                l4.a.n(iVar, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        iVar2.getClass();
        i.q(iVar);
        iVar2.c();
    }

    public static final void k() {
        throw new UnsupportedOperationException();
    }
}
