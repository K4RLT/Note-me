package pf;
import a.a;
import b0.e;
import b0.i;
import b0.k;
import b0.o;
import b0.s;
import g0.u1;
import k1.u;
import q.x;

import b8.l2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ya.lc;
import ya.rc;

/* loaded from: classes.dex */
public class k1 implements d1 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22762u = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22763v = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k1(boolean z3) {
        p0 p0Var;
        if (z3) {
            p0Var = b0.f22731j;
        } else {
            p0Var = i;
        }
        this._state$volatile = p0Var;
    }

    public static p Z(uf.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uf.j.f27225v;
            uf.j d2 = jVar.d();
            if (d2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (uf.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = d2;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof n1) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (j1Var.c()) {
                return "Cancelling";
            }
            if (j1.f22758v.get(j1Var) == 0) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof a1) {
            if (((a1) obj).f()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof t) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // pf.d1
    public final n0 B(boolean z3, boolean z9, u1 u1Var) {
        g1 o0Var;
        if (z3) {
            o0Var = new c1(u1Var);
        } else {
            o0Var = new o0(1, u1Var);
        }
        return T(z9, o0Var);
    }

    public final void C(a1 a1Var, Object obj) {
        t tVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22763v;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, p1.f22779u);
        }
        ab.b bVar = null;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th = tVar.f22793a;
        } else {
            th = null;
        }
        if (a1Var instanceof g1) {
            try {
                ((g1) a1Var).l(th);
                return;
            } catch (Throwable th2) {
                Q(new ab.b(17, "Exception in completion handler " + a1Var + " for " + this, th2));
                return;
            }
        }
        n1 g8 = a1Var.g();
        if (g8 != null) {
            g8.c(new uf.i(1), 1);
            Object obj2 = uf.j.f27224u.get(g8);
            obj2.getClass();
            for (uf.j jVar = (uf.j) obj2; !jVar.equals(g8); jVar = jVar.h()) {
                if (jVar instanceof g1) {
                    try {
                        ((g1) jVar).l(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            pe.a(bVar, th3);
                        } else {
                            bVar = new ab.b(17, "Exception in completion handler " + jVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                Q(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    public final Throwable D(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) obj;
        Object obj2 = f22762u.get(k1Var);
        CancellationException cancellationException2 = null;
        if (obj2 instanceof j1) {
            cancellationException = ((j1) obj2).b();
        } else if (obj2 instanceof t) {
            cancellationException = ((t) obj2).f22793a;
        } else if (!(obj2 instanceof a1)) {
            cancellationException = null;
        } else {
            l4.a.n(obj2, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new e1("Parent job is ".concat(g0(obj2)), cancellationException, k1Var);
        }
        return cancellationException2;
    }

    public final Object E(j1 j1Var, Object obj) {
        t tVar;
        Throwable G;
        Object obj2;
        Throwable th = null;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th = tVar.f22793a;
        }
        synchronized (j1Var) {
            j1Var.c();
            ArrayList d2 = j1Var.d(th);
            G = G(j1Var, d2);
            if (G != null && d2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(d2.size()));
                int size = d2.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = d2.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != G && th2 != G && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        pe.a(G, th2);
                    }
                }
            }
        }
        if (G != null && G != th) {
            obj = new t(G, false);
        }
        if (G != null && (x(G) || P(G))) {
            obj.getClass();
            t.f22792b.compareAndSet((t) obj, 0, 1);
        }
        b0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22762u;
        if (obj instanceof a1) {
            obj2 = new b1((a1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, j1Var, obj2) && atomicReferenceFieldUpdater.get(this) == j1Var) {
        }
        C(j1Var, obj);
        return obj;
    }

    public final Object F() {
        Object obj = f22762u.get(this);
        if (!(obj instanceof a1)) {
            if (!(obj instanceof t)) {
                return b0.H(obj);
            }
            throw ((t) obj).f22793a;
        }
        x.o("This job has not completed yet");
        return null;
    }

    public final Throwable G(j1 j1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!j1Var.c()) {
                return null;
            }
            return new e1(y(), null, this);
        }
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = arrayList.get(i10);
                i10++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof v1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof v1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // te.g
    public final Object H(df.p pVar, Object obj) {
        return pVar.invoke(obj, this);
    }

    public boolean I() {
        return true;
    }

    public boolean J() {
        return this instanceof q;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [pf.n1, uf.j] */
    public final n1 K(a1 a1Var) {
        n1 g8 = a1Var.g();
        if (g8 == null) {
            if (a1Var instanceof p0) {
                return new uf.j();
            }
            if (a1Var instanceof g1) {
                e0((g1) a1Var);
                return null;
            }
            l4.a.n(a1Var, "State should have list: ");
            return null;
        }
        return g8;
    }

    @Override // te.g
    public final te.e L(te.f fVar) {
        return lc.a(this, fVar);
    }

    public Object M(l2 l2Var) {
        return t(l2Var);
    }

    @Override // te.g
    public final te.g N(te.f fVar) {
        return lc.b(this, fVar);
    }

    @Override // pf.d1
    public final o O(k1 k1Var) {
        t tVar;
        t tVar2;
        p pVar = new p(k1Var);
        pVar.f22749x = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22762u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (p0Var.f22778u) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                d0(p0Var);
            } else {
                boolean z3 = obj instanceof a1;
                p1 p1Var = p1.f22779u;
                Throwable th = null;
                if (z3) {
                    n1 g8 = ((a1) obj).g();
                    if (g8 == null) {
                        e0((g1) obj);
                    } else if (!g8.c(pVar, 7)) {
                        boolean c10 = g8.c(pVar, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof j1) {
                            th = ((j1) obj2).b();
                        } else {
                            if (obj2 instanceof t) {
                                tVar2 = (t) obj2;
                            } else {
                                tVar2 = null;
                            }
                            if (tVar2 != null) {
                                th = tVar2.f22793a;
                            }
                        }
                        pVar.l(th);
                        if (c10) {
                            break loop0;
                        }
                        return p1Var;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof t) {
                        tVar = (t) obj3;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        th = tVar.f22793a;
                    }
                    pVar.l(th);
                    return p1Var;
                }
            }
        }
        return pVar;
    }

    public boolean P(Throwable th) {
        return false;
    }

    public final void S(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22763v;
        p1 p1Var = p1.f22779u;
        if (d1Var == null) {
            atomicReferenceFieldUpdater.set(this, p1Var);
            return;
        }
        d1Var.start();
        o O = d1Var.O(this);
        atomicReferenceFieldUpdater.set(this, O);
        if (!(f22762u.get(this) instanceof a1)) {
            O.a();
            atomicReferenceFieldUpdater.set(this, p1Var);
        }
    }

    public final n0 T(boolean z3, g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p1 p1Var;
        boolean z9;
        Throwable th;
        t tVar;
        boolean c10;
        j1 j1Var;
        Throwable th2;
        g1Var.f22749x = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f22762u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof p0;
            p1Var = p1.f22779u;
            z9 = true;
            th = null;
            if (z10) {
                p0 p0Var = (p0) obj;
                if (p0Var.f22778u) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                d0(p0Var);
            } else if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                n1 g8 = a1Var.g();
                if (g8 == null) {
                    e0((g1) obj);
                } else {
                    if (g1Var.k()) {
                        if (a1Var instanceof j1) {
                            j1Var = (j1) a1Var;
                        } else {
                            j1Var = null;
                        }
                        if (j1Var != null) {
                            th2 = j1Var.b();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            c10 = g8.c(g1Var, 5);
                        } else if (z3) {
                            g1Var.l(th2);
                            return p1Var;
                        }
                    } else {
                        c10 = g8.c(g1Var, 1);
                    }
                    if (c10) {
                        break;
                    }
                }
            } else {
                z9 = false;
                break;
            }
        }
        if (z9) {
            return g1Var;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof t) {
                tVar = (t) obj2;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                th = tVar.f22793a;
            }
            g1Var.l(th);
        }
        return p1Var;
    }

    public boolean U() {
        return this instanceof g;
    }

    @Override // te.g
    public final te.g V(te.g gVar) {
        return lc.c(this, gVar);
    }

    public final boolean W(Object obj) {
        Object h02;
        do {
            h02 = h0(f22762u.get(this), obj);
            if (h02 == b0.f22727d) {
                return false;
            }
            if (h02 == e) {
                return true;
            }
        } while (h02 == b0.f22728f);
        q(h02);
        return true;
    }

    public final Object X(Object obj) {
        Object h02;
        t tVar;
        do {
            h02 = h0(f22762u.get(this), obj);
            if (h02 == b0.f22727d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof t) {
                    tVar = (t) obj;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    th = tVar.f22793a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (h02 == b0.f22728f);
        return h02;
    }

    public String Y() {
        return getClass().getSimpleName();
    }

    public final void a0(n1 n1Var, Throwable th) {
        n1Var.c(new uf.i(4), 4);
        Object obj = uf.j.f27224u.get(n1Var);
        obj.getClass();
        ab.b bVar = null;
        for (uf.j jVar = (uf.j) obj; !jVar.equals(n1Var); jVar = jVar.h()) {
            if ((jVar instanceof g1) && ((g1) jVar).k()) {
                try {
                    ((g1) jVar).l(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        pe.a(bVar, th2);
                    } else {
                        bVar = new ab.b(17, "Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            Q(bVar);
        }
        x(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.n1, uf.j] */
    public final void d0(p0 p0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        uf.j jVar = new uf.j();
        z0 z0Var = jVar;
        if (!p0Var.f22778u) {
            z0Var = new z0(jVar);
        }
        do {
            atomicReferenceFieldUpdater = f22762u;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, z0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p0Var);
    }

    public final void e0(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        uf.j jVar = new uf.j();
        g1Var.getClass();
        uf.j.f27225v.set(jVar, g1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = uf.j.f27224u;
        atomicReferenceFieldUpdater2.set(jVar, g1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(g1Var) != g1Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(g1Var, g1Var, jVar)) {
                if (atomicReferenceFieldUpdater2.get(g1Var) != g1Var) {
                    break;
                }
            }
            jVar.e(g1Var);
        }
        uf.j h3 = g1Var.h();
        do {
            atomicReferenceFieldUpdater = f22762u;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g1Var, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g1Var);
    }

    @Override // pf.d1
    public boolean f() {
        Object obj = f22762u.get(this);
        if ((obj instanceof a1) && ((a1) obj).f()) {
            return true;
        }
        return false;
    }

    public final int f0(Object obj) {
        boolean z3 = obj instanceof p0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22762u;
        if (z3) {
            if (!((p0) obj).f22778u) {
                p0 p0Var = b0.f22731j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                c0();
                return 1;
            }
            return 0;
        }
        if (obj instanceof z0) {
            n1 n1Var = ((z0) obj).f22813u;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            c0();
            return 1;
        }
        return 0;
    }

    @Override // te.e
    public final te.f getKey() {
        return w.f22803v;
    }

    public final Object h0(Object obj, Object obj2) {
        Object obj3;
        j1 j1Var;
        boolean z3;
        t tVar;
        if (!(obj instanceof a1)) {
            return b0.f22727d;
        }
        if (((obj instanceof p0) || (obj instanceof g1)) && !(obj instanceof p) && !(obj2 instanceof t)) {
            a1 a1Var = (a1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22762u;
            if (obj2 instanceof a1) {
                obj3 = new b1((a1) obj2);
            } else {
                obj3 = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, obj3)) {
                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                    return b0.f22728f;
                }
            }
            b0(obj2);
            C(a1Var, obj2);
            return obj2;
        }
        a1 a1Var2 = (a1) obj;
        n1 K = K(a1Var2);
        if (K == null) {
            return b0.f22728f;
        }
        Throwable th = null;
        if (a1Var2 instanceof j1) {
            j1Var = (j1) a1Var2;
        } else {
            j1Var = null;
        }
        if (j1Var == null) {
            j1Var = new j1(K, null);
        }
        synchronized (j1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j1.f22758v;
            if (atomicIntegerFieldUpdater.get(j1Var) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return b0.f22727d;
            }
            atomicIntegerFieldUpdater.set(j1Var, 1);
            if (j1Var != a1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22762u;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, a1Var2, j1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != a1Var2) {
                        return b0.f22728f;
                    }
                }
            }
            boolean c10 = j1Var.c();
            if (obj2 instanceof t) {
                tVar = (t) obj2;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                j1Var.a(tVar.f22793a);
            }
            Throwable b10 = j1Var.b();
            if (!c10) {
                th = b10;
            }
            if (th != null) {
                a0(K, th);
            }
            p Z = Z(K);
            if (Z != null && i0(j1Var, Z, obj2)) {
                return e;
            }
            K.c(new uf.i(2), 2);
            p Z2 = Z(K);
            if (Z2 != null && i0(j1Var, Z2, obj2)) {
                return e;
            }
            return E(j1Var, obj2);
        }
    }

    public final boolean i0(j1 j1Var, p pVar, Object obj) {
        while (s(pVar.f22777y, false, new i1(this, j1Var, pVar, obj)) == p1.f22779u) {
            pVar = Z(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // pf.d1
    public final boolean isCancelled() {
        Object obj = f22762u.get(this);
        if (!(obj instanceof t)) {
            if (!(obj instanceof j1) || !((j1) obj).c()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // pf.d1
    public void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new e1(y(), null, this);
        }
        v(cancellationException);
    }

    public Object k() {
        return F();
    }

    @Override // pf.d1
    public final Object m(ve.c cVar) {
        Object obj;
        pe.z zVar;
        do {
            obj = f22762u.get(this);
            boolean z3 = obj instanceof a1;
            zVar = pe.z.f22715a;
            if (!z3) {
                k(cVar.getContext());
                return zVar;
            }
        } while (f0(obj) < 0);
        l lVar = new l(1, rc.b(cVar));
        lVar.s();
        lVar.v(new i(2, s(this, true, new n(lVar, 1))));
        Object r8 = lVar.r();
        ue.a aVar = ue.a.f27192u;
        if (r8 != aVar) {
            r8 = zVar;
        }
        if (r8 == aVar) {
            return r8;
        }
        return zVar;
    }

    @Override // pf.d1
    public final n0 p(df.l lVar) {
        return T(true, new o0(1, lVar));
    }

    @Override // pf.d1
    public final CancellationException r() {
        Object obj = f22762u.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof j1) {
            Throwable b10 = ((j1) obj).b();
            if (b10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b10 instanceof CancellationException) {
                    cancellationException = (CancellationException) b10;
                }
                if (cancellationException == null) {
                    return new e1(concat, b10, this);
                }
                return cancellationException;
            }
            l4.a.n(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof a1)) {
            if (obj instanceof t) {
                Throwable th = ((t) obj).f22793a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new e1(y(), th, this);
                }
                return cancellationException;
            }
            return new e1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        l4.a.n(this, "Job is still new or active: ");
        return null;
    }

    public void s(Object obj) {
        q(obj);
    }

    @Override // pf.d1
    public final boolean start() {
        int f02;
        do {
            f02 = f0(f22762u.get(this));
            if (f02 == 0) {
                return false;
            }
        } while (f02 != 1);
        return true;
    }

    public final Object t(ve.c cVar) {
        Object obj;
        do {
            obj = f22762u.get(this);
            if (!(obj instanceof a1)) {
                if (!(obj instanceof t)) {
                    return b0.H(obj);
                }
                throw ((t) obj).f22793a;
            }
        } while (f0(obj) < 0);
        h1 h1Var = new h1(rc.b(cVar), this);
        h1Var.s();
        h1Var.v(new i(2, s(this, true, new o0(2, h1Var))));
        return h1Var.r();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Y() + '{' + g0(f22762u.get(this)) + '}');
        sb2.append('@');
        sb2.append(o(this));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r0 = pf.b0.f22727d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != pf.e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = h0(r0, new pf.t(D(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 == pf.b0.f22728f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0 != pf.b0.f22727d) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r4 = pf.k1.f22762u;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof pf.j1) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if ((r5 instanceof pf.a1) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r1 = D(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r6 = (pf.a1) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (J() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r6.f() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r4 = h0(r5, new pf.t(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r4 == pf.b0.f22727d) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r4 == pf.b0.f22728f) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = pf.k1.f22762u.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        l4.a.n(r5, "Cannot happen in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        r7 = K(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r7 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r8 = new pf.j1(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof pf.a1) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r4.get(r9) == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        a0(r7, r1);
        r10 = pf.b0.f22727d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        r10 = pf.b0.f22729g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004e, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005a, code lost:
    
        if (pf.j1.f22760x.get((pf.j1) r5) != pf.b0.f22730h) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        r10 = pf.b0.f22729g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005e, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0064, code lost:
    
        r4 = ((pf.j1) r5).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006b, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r1 = D(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof pf.j1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
    
        ((pf.j1) r5).a(r1);
        r10 = ((pf.j1) r5).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007e, code lost:
    
        if (r4 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0080, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0081, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0082, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0084, code lost:
    
        a0(((pf.j1) r5).f22761u, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008b, code lost:
    
        r10 = pf.b0.f22727d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e1, code lost:
    
        if (r0 != pf.b0.f22727d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        if (r0 != pf.e) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00eb, code lost:
    
        if (r0 != pf.b0.f22729g) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ee, code lost:
    
        q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (pf.j1.f22758v.get((pf.j1) r0) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.u(java.lang.Object):boolean");
    }

    public void v(CancellationException cancellationException) {
        u(cancellationException);
    }

    public final boolean x(Throwable th) {
        if (!U()) {
            boolean z3 = th instanceof CancellationException;
            o oVar = (o) f22763v.get(this);
            if (oVar != null && oVar != p1.f22779u) {
                if (!oVar.b(th) && !z3) {
                    return false;
                }
                return true;
            }
            return z3;
        }
        return true;
    }

    public String y() {
        return "Job was cancelled";
    }

    public boolean z(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (u(th) && I()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void c0() {
    }

    public void Q(ab.b bVar) {
        throw bVar;
    }

    public void b0(Object obj) {
    }

    public void q(Object obj) {
    }
}