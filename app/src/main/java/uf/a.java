package uf;
import a.a;
import l.a;
import q.x;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.a0;
import pf.b0;
import pf.d1;
import pf.q0;
import pf.u1;
import pf.z1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c4.s f27202a;

    /* renamed from: b, reason: collision with root package name */
    public static final c4.s f27203b;

    /* renamed from: c, reason: collision with root package name */
    public static final c4.s f27204c;

    /* renamed from: d, reason: collision with root package name */
    public static final c4.s f27205d;
    public static final a0 e = new a0(29);

    /* renamed from: f, reason: collision with root package name */
    public static final u f27206f = new u(0);

    /* renamed from: g, reason: collision with root package name */
    public static final u f27207g = new u(1);

    static {
        int i = 8;
        f27202a = new c4.s("CLOSED", i);
        f27203b = new c4.s("UNDEFINED", i);
        f27204c = new c4.s("REUSABLE_CLAIMED", i);
        f27205d = new c4.s("NO_THREAD_ELEMENTS", i);
    }

    public static final void a(int i) {
        if (i >= 1) {
            return;
        }
        x.j(g3.a.g(i, "Expected positive parallelism level, but got "));
    }

    public static final Object b(r rVar, long j10, df.p pVar) {
        while (true) {
            if (rVar.f27239w >= j10 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f27208u;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            c4.s sVar = f27202a;
            if (obj == sVar) {
                return sVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.f27239w + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f27202a) {
            return (r) obj;
        }
        x.o("Does not contain segment");
        return null;
    }

    public static final void d(Throwable th, te.g gVar) {
        Throwable runtimeException;
        Iterator it = d.f27211a.iterator();
        while (it.hasNext()) {
            try {
                ((pf.x) it.next()).o(th, gVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    pe.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            pe.a.a(th, new e(gVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == f27202a) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(te.g gVar, Object obj) {
        if (obj != f27205d) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                v[] vVarArr = yVar.f27251c;
                int length = vVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    v vVar = vVarArr[length];
                    vVar.getClass();
                    vVar.f27244v.set(yVar.f27250b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object H = gVar.H(f27206f, null);
                H.getClass();
                ((v) H).f27244v.set(obj);
            }
        }
    }

    public static final void h(Object obj, te.c cVar) {
        Object tVar;
        z1 z1Var;
        if (cVar instanceof f) {
            f fVar = (f) cVar;
            pf.v vVar = fVar.f27213x;
            ve.c cVar2 = fVar.f27214y;
            Throwable a10 = pe.l.a(obj);
            if (a10 == null) {
                tVar = obj;
            } else {
                tVar = new pf.t(a10, false);
            }
            if (vVar.Y(cVar2.getContext())) {
                fVar.f27215z = tVar;
                fVar.f22757w = 1;
                vVar.W(cVar2.getContext(), fVar);
                return;
            }
            q0 a11 = u1.a();
            if (a11.f22781w >= 4294967296L) {
                fVar.f27215z = tVar;
                fVar.f22757w = 1;
                a11.b0(fVar);
                return;
            }
            a11.c0(true);
            try {
                d1 d1Var = (d1) cVar2.getContext().L(pf.w.f22803v);
                if (d1Var != null && !d1Var.f()) {
                    fVar.resumeWith(pe.a.b(d1Var.r()));
                } else {
                    Object obj2 = fVar.A;
                    te.g context = cVar2.getContext();
                    Object l10 = l(context, obj2);
                    if (l10 != f27205d) {
                        z1Var = b0.I(cVar2, context, l10);
                    } else {
                        z1Var = null;
                    }
                    try {
                        cVar2.resumeWith(obj);
                    } finally {
                        if (z1Var == null || z1Var.m0()) {
                            g(context, l10);
                        }
                    }
                }
                do {
                } while (a11.e0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.resumeWith(obj);
    }

    public static final long i(long j10, String str, long j11, long j12) {
        String str2;
        int i = t.f27241a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j10;
        }
        Long l10 = mf.m.l(str2);
        if (l10 != null) {
            long longValue = l10.longValue();
            if (j11 <= longValue && longValue <= j12) {
                return longValue;
            }
            StringBuilder sb2 = new StringBuilder("System property '");
            sb2.append(str);
            sb2.append("' should be in range ");
            sb2.append(j11);
            g3.a.s(sb2, "..", j12, ", but is '");
            sb2.append(longValue);
            sb2.append('\'');
            throw new IllegalStateException(sb2.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int j(String str, int i, int i10) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = 2097150;
        }
        return (int) i(i, str, 1, i11);
    }

    public static final Object k(te.g gVar) {
        Object H = gVar.H(e, 0);
        H.getClass();
        return H;
    }

    public static final Object l(te.g gVar, Object obj) {
        if (obj == null) {
            obj = k(gVar);
        }
        if (obj == 0) {
            return f27205d;
        }
        if (obj instanceof Integer) {
            return gVar.H(f27207g, new y(((Number) obj).intValue(), gVar));
        }
        v vVar = (v) obj;
        ThreadLocal threadLocal = vVar.f27244v;
        Object obj2 = threadLocal.get();
        threadLocal.set(vVar.f27243u);
        return obj2;
    }
}
