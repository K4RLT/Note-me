package pf;
import a.a;
import b0.b;
import b0.f;
import b0.v;
import g0.u1;
import l.a;
import q.x;
import u1.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ya.bd;
import ya.rc;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public static final c4.s f22724a = new c4.s("RESUME_TOKEN", 8);

    /* renamed from: b */
    public static final c4.s f22725b = new c4.s("REMOVED_TASK", 8);

    /* renamed from: c */
    public static final c4.s f22726c = new c4.s("CLOSED_EMPTY", 8);

    /* renamed from: d */
    public static final c4.s f22727d = new c4.s("COMPLETING_ALREADY", 8);
    public static final c4.s e = new c4.s("COMPLETING_WAITING_CHILDREN", 8);

    /* renamed from: f */
    public static final c4.s f22728f = new c4.s("COMPLETING_RETRY", 8);

    /* renamed from: g */
    public static final c4.s f22729g = new c4.s("TOO_LATE_TO_CANCEL", 8);

    /* renamed from: h */
    public static final c4.s f22730h = new c4.s("SEALED", 8);
    public static final p0 i = new p0(false);

    /* renamed from: j */
    public static final p0 f22731j = new p0(true);

    public static final Object A(Object obj) {
        if (obj instanceof t) {
            return pe.a.b(((t) obj).f22793a);
        }
        return obj;
    }

    public static final void B(l lVar, te.c cVar, boolean z3) {
        Object e8;
        z1 z1Var;
        Object obj = l.A.get(lVar);
        Throwable d2 = lVar.d(obj);
        if (d2 != null) {
            e8 = new pe.k(d2);
        } else {
            e8 = lVar.e(obj);
        }
        if (z3) {
            cVar.getClass();
            uf.f fVar = (uf.f) cVar;
            ve.c cVar2 = fVar.f27214y;
            Object obj2 = fVar.A;
            te.g context = cVar2.getContext();
            Object l10 = uf.a.l(context, obj2);
            if (l10 != uf.a.f27205d) {
                z1Var = I(cVar2, context, l10);
            } else {
                z1Var = null;
            }
            try {
                cVar2.resumeWith(e8);
                if (z1Var != null && !z1Var.m0()) {
                    return;
                }
                uf.a.g(context, l10);
                return;
            } catch (Throwable th) {
                if (z1Var == null || z1Var.m0()) {
                    uf.a.g(context, l10);
                }
                throw th;
            }
        }
        cVar.resumeWith(e8);
    }

    public static final Object C(te.g gVar, df.p pVar) {
        q0 q0Var;
        te.g l10;
        long j10;
        t tVar;
        Thread currentThread = Thread.currentThread();
        te.f fVar = te.d.f25706u;
        v vVar = (v) gVar.L(fVar);
        te.h hVar = te.h.f25707u;
        if (vVar == null) {
            q0Var = a();
            l10 = l(hVar, gVar.V(q0Var), true);
            wf.e eVar = l0.f22767a;
            if (l10 != eVar && l10.L(fVar) == null) {
                l10 = l10.V(eVar);
            }
        } else {
            if (vVar instanceof q0) {
            }
            q0Var = (q0) u1.f22799a.get();
            l10 = l(hVar, gVar, true);
            wf.e eVar2 = l0.f22767a;
            if (l10 != eVar2 && l10.L(fVar) == null) {
                l10 = l10.V(eVar2);
            }
        }
        g gVar2 = new g(l10, currentThread, q0Var);
        gVar2.l0(a0.f22717u, gVar2, pVar);
        q0 q0Var2 = gVar2.f22748y;
        if (q0Var2 != null) {
            int i10 = q0.f22780z;
            q0Var2.c0(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (q0Var2 != null) {
                    j10 = q0Var2.d0();
                } else {
                    j10 = Long.MAX_VALUE;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f22762u;
                if (atomicReferenceFieldUpdater.get(gVar2) instanceof a1) {
                    LockSupport.parkNanos(gVar2, j10);
                } else {
                    if (q0Var2 != null) {
                        int i11 = q0.f22780z;
                        q0Var2.a0(false);
                    }
                    Object H = H(atomicReferenceFieldUpdater.get(gVar2));
                    if (H instanceof t) {
                        tVar = (t) H;
                    } else {
                        tVar = null;
                    }
                    if (tVar == null) {
                        return H;
                    }
                    throw tVar.f22793a;
                }
            } catch (Throwable th) {
                if (q0Var2 != null) {
                    int i12 = q0.f22780z;
                    q0Var2.a0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        gVar2.u(interruptedException);
        throw interruptedException;
    }

    public static final Object E(w1 w1Var, df.p pVar) {
        Object tVar;
        Object X;
        s(w1Var, true, new o0(0, n(w1Var.f27237x.getContext()).A(w1Var.f22804y, w1Var, w1Var.f22716w)));
        try {
            if (!(pVar instanceof ve.a)) {
                tVar = rc.c(pVar, w1Var, w1Var);
            } else {
                kotlin.jvm.internal.b(2, pVar);
                tVar = pVar.invoke(w1Var, w1Var);
            }
        } catch (Throwable th) {
            tVar = new t(th, false);
        }
        ue.a aVar = ue.a.f27192u;
        if (tVar != aVar && (X = w1Var.X(tVar)) != e) {
            if (X instanceof t) {
                Throwable th2 = ((t) X).f22793a;
                if (th2 instanceof v1) {
                    if (((v1) th2).f22801u == w1Var) {
                        if (tVar instanceof t) {
                            throw ((t) tVar).f22793a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
            } else {
                tVar = H(X);
            }
            return tVar;
        }
        return aVar;
    }

    public static final String F(te.c cVar) {
        Object kVar;
        if (cVar instanceof uf.f) {
            return ((uf.f) cVar).toString();
        }
        try {
            kVar = cVar + '@' + o(cVar);
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (pe.a(kVar) != null) {
            kVar = cVar.getClass().getName() + '@' + o(cVar);
        }
        return (String) kVar;
    }

    public static final long G(long j10) {
        boolean z3;
        nf.a aVar = nf.b.f21330v;
        if (j10 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long f10 = nf.b.f(j10, nf.f.j(999999L, nf.d.NANOSECONDS));
            if ((((int) f10) & 1) == 1 && !nf.b.e(f10)) {
                return f10 >> 1;
            }
            return nf.b.g(f10, nf.d.MILLISECONDS);
        }
        if (!z3) {
            return 0L;
        }
        l4.a.o();
        return 0L;
    }

    public static final Object H(Object obj) {
        b1 b1Var;
        a1 a1Var;
        if (obj instanceof b1) {
            b1Var = (b1) obj;
        } else {
            b1Var = null;
        }
        if (b1Var != null && (a1Var = b1Var.f22732a) != null) {
            return a1Var;
        }
        return obj;
    }

    public static final z1 I(te.c cVar, te.g gVar, Object obj) {
        z1 z1Var = null;
        if ((cVar instanceof ve.d) && gVar.L(a2.f22722u) != null) {
            ve.d dVar = (ve.d) cVar;
            while (true) {
                if ((dVar instanceof i0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof z1) {
                    z1Var = (z1) dVar;
                    break;
                }
            }
            if (z1Var != null) {
                z1Var.n0(gVar, obj);
            }
        }
        return z1Var;
    }

    public static final Object J(te.g gVar, df.p pVar, te.c cVar) {
        te.g l10;
        te.g context = cVar.getContext();
        if (!((Boolean) gVar.H(new m2.a0(15), Boolean.FALSE)).booleanValue()) {
            l10 = context.V(gVar);
        } else {
            l10 = l(context, gVar, false);
        }
        k(l10);
        if (l10 == context) {
            uf.q qVar = new uf.q(cVar, l10);
            return bd.a(qVar, qVar, pVar);
        }
        te.d dVar = te.d.f25706u;
        if (kotlin.jvm.internal.a(l10.L(dVar), context.L(dVar))) {
            z1 z1Var = new z1(cVar, l10);
            te.g gVar2 = z1Var.f22716w;
            Object l11 = uf.a.l(gVar2, null);
            try {
                return bd.a(z1Var, z1Var, pVar);
            } finally {
                uf.a.g(gVar2, l11);
            }
        }
        uf.q qVar2 = new uf.q(cVar, l10);
        try {
            uf.a.h(pe.z.f22715a, rc.b(rc.a(pVar, qVar2, qVar2)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0.f22754y;
            do {
                int i10 = atomicIntegerFieldUpdater.get(qVar2);
                if (i10 != 0) {
                    if (i10 == 2) {
                        Object H = H(k1.f22762u.get(qVar2));
                        if (H instanceof t) {
                            throw ((t) H).f22793a;
                        }
                        return H;
                    }
                    x.o("Already suspended");
                    return null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1));
            return ue.a.f27192u;
        } catch (Throwable th) {
            qVar2.resumeWith(new pe.k(th));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(long r5, df.p r7, ve.c r8) {
        /*
            boolean r0 = r8 instanceof pf.x1
            if (r0 == 0) goto L13
            r0 = r8
            pf.x1 r0 = (pf.x1) r0
            int r1 = r0.f22808w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22808w = r1
            goto L18
        L13:
            pf.x1 r0 = new pf.x1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f22807v
            int r1 = r0.f22808w
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            kotlin.jvm.internal.y r5 = r0.f22806u
            pe.a.e(r8)     // Catch: pf.v1 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L56
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L30:
            pe.a.e(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3a
            goto L5c
        L3a:
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            r0.f22806u = r8     // Catch: pf.v1 -> L54
            r0.f22808w = r2     // Catch: pf.v1 -> L54
            pf.w1 r1 = new pf.w1     // Catch: pf.v1 -> L54
            r1.<init>(r5, r0)     // Catch: pf.v1 -> L54
            r8.f19787u = r1     // Catch: pf.v1 -> L54
            java.lang.Object r5 = E(r1, r7)     // Catch: pf.v1 -> L54
            ue.a r6 = ue.a.f27192u
            if (r5 != r6) goto L53
            return r6
        L53:
            return r5
        L54:
            r6 = move-exception
            r5 = r8
        L56:
            pf.d1 r7 = r6.f22801u
            java.lang.Object r5 = r5.f19787u
            if (r7 != r5) goto L5e
        L5c:
            r5 = 0
            return r5
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.b0.K(long, df.p, ve.c):java.lang.Object");
    }

    public static final Object L(ve.c cVar) {
        uf.f fVar;
        Object obj;
        te.g context = cVar.getContext();
        k(context);
        te.c b10 = rc.b(cVar);
        if (b10 instanceof uf.f) {
            fVar = (uf.f) b10;
        } else {
            fVar = null;
        }
        Object obj2 = ue.a.f27192u;
        Object obj3 = pe.z.f22715a;
        if (fVar == null) {
            obj = obj3;
        } else {
            v vVar = fVar.f27213x;
            if (vVar.Y(context)) {
                fVar.f27215z = obj3;
                fVar.f22757w = 1;
                vVar.X(context, fVar);
            } else {
                te.g V = context.V(new te.a(c2.f22737v));
                fVar.f27215z = obj3;
                fVar.f22757w = 1;
                vVar.X(V, fVar);
            }
            obj = obj2;
        }
        if (obj == obj2) {
            return obj;
        }
        return obj3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.k1, pf.q] */
    public static q a() {
        k1 k1Var = new k1(true);
        k1Var.S(null);
        return k1Var;
    }

    public static final uf.c b(te.g gVar) {
        if (gVar.L(w.f22803v) == null) {
            gVar = gVar.V(c());
        }
        return new uf.c(gVar);
    }

    public static f1 c() {
        return new f1(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.f1, pf.t1] */
    public static t1 d() {
        return new f1(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [pf.f0, pf.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static f0 e(z zVar, df.p pVar, int i10) {
        a0 a0Var;
        Object r02;
        if ((i10 & 2) != 0) {
            a0Var = a0.f22717u;
        } else {
            a0Var = a0.f22720x;
        }
        te.g y10 = y(zVar, te.h.f25707u);
        if (a0Var == a0.f22718v) {
            r02 = new l1(y10, pVar);
        } else {
            r02 = new a(y10, true);
        }
        r02.l0(a0Var, r02, pVar);
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(ve.c r4) {
        /*
            boolean r0 = r4 instanceof pf.h0
            if (r0 == 0) goto L13
            r0 = r4
            pf.h0 r0 = (pf.h0) r0
            int r1 = r0.f22751v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22751v = r1
            goto L18
        L13:
            pf.h0 r0 = new pf.h0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f22750u
            int r1 = r0.f22751v
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            return
        L27:
            pe.a.e(r4)
            goto L45
        L2b:
            pe.a.e(r4)
            r0.f22751v = r2
            pf.l r4 = new pf.l
            te.c r0 = ya.rc.b(r0)
            r4.<init>(r2, r0)
            r4.s()
            java.lang.Object r4 = r4.r()
            ue.a r0 = ue.a.f27192u
            if (r4 != r0) goto L45
            return
        L45:
            l4.a.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.f(ve.c):void");
    }

    public static final void g(z zVar, CancellationException cancellationException) {
        d1 d1Var = (d1) zVar.A().L(w.f22803v);
        if (d1Var != null) {
            d1Var.j(cancellationException);
        } else {
            l4.a.n(zVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void h(te.g gVar, CancellationException cancellationException) {
        d1 d1Var = (d1) gVar.L(w.f22803v);
        if (d1Var != null) {
            d1Var.j(cancellationException);
        }
    }

    public static final Object i(df.p pVar, te.c cVar) {
        uf.q qVar = new uf.q(cVar, cVar.getContext());
        return bd.a(qVar, qVar, pVar);
    }

    public static final Object j(long j10, te.c cVar) {
        if (j10 > 0) {
            l lVar = new l(1, rc.b(cVar));
            lVar.s();
            if (j10 < Long.MAX_VALUE) {
                n(lVar.f22766y).K(j10, lVar);
            }
            Object r8 = lVar.r();
            if (r8 == ue.a.f27192u) {
                return r8;
            }
        }
        return pe.z.f22715a;
    }

    public static final void k(te.g gVar) {
        d1 d1Var = (d1) gVar.L(w.f22803v);
        if (d1Var != null && !d1Var.f()) {
            throw d1Var.r();
        }
    }

    public static final te.g l(te.g gVar, te.g gVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) gVar.H(new m2.a0(15), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) gVar2.H(new m2.a0(15), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return gVar.V(gVar2);
        }
        m2.a0 a0Var = new m2.a0(16);
        te.h hVar = te.h.f25707u;
        te.g gVar3 = (te.g) gVar.H(a0Var, hVar);
        Object obj = gVar2;
        if (booleanValue2) {
            obj = gVar2.H(new m2.a0(17), hVar);
        }
        return gVar3.V((te.g) obj);
    }

    public static final v m(Executor executor) {
        return new x0(executor);
    }

    public static final g0 n(te.g gVar) {
        g0 g0Var;
        te.e L = gVar.L(te.d.f25706u);
        if (L instanceof g0) {
            g0Var = (g0) L;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            return d0.f22739a;
        }
        return g0Var;
    }

    public static final String o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final d1 p(te.g gVar) {
        d1 d1Var = (d1) gVar.L(w.f22803v);
        if (d1Var != null) {
            return d1Var;
        }
        l4.a.n(gVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final l q(te.c cVar) {
        l lVar;
        l lVar2;
        if (!(cVar instanceof uf.f)) {
            return new l(1, cVar);
        }
        uf.f fVar = (uf.f) cVar;
        c4.s sVar = uf.a.f27204c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uf.f.B;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, sVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                lVar2 = (l) obj;
                break loop0;
            }
            if (obj != sVar && !(obj instanceof Throwable)) {
                l4.a.n(obj, "Inconsistent state ");
                return null;
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.A;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if ((obj2 instanceof s) && ((s) obj2).f22789d != null) {
                lVar2.o();
            } else {
                l.f22764z.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f22723u);
                lVar = lVar2;
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, cVar);
    }

    public static final void r(Throwable th, te.g gVar) {
        try {
            x xVar = (x) gVar.L(w.f22802u);
            if (xVar != null) {
                xVar.o(th, gVar);
            } else {
                uf.a.d(th, gVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                pe.a(runtimeException, th);
                th = runtimeException;
            }
            uf.a.d(th, gVar);
        }
    }

    public static final n0 s(d1 d1Var, boolean z3, g1 g1Var) {
        if (d1Var instanceof k1) {
            return ((k1) d1Var).T(z3, g1Var);
        }
        return d1Var.B(g1Var.k(), z3, new u1(1, g1Var, g1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 2));
    }

    public static final boolean t(z zVar) {
        d1 d1Var = (d1) zVar.A().L(w.f22803v);
        if (d1Var != null) {
            return d1Var.f();
        }
        return true;
    }

    public static final boolean u(te.g gVar) {
        d1 d1Var = (d1) gVar.L(w.f22803v);
        if (d1Var != null) {
            return d1Var.f();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(java.util.Collection r4, ve.c r5) {
        /*
            boolean r0 = r5 instanceof pf.f
            if (r0 == 0) goto L13
            r0 = r5
            pf.f r0 = (pf.f) r0
            int r1 = r0.f22745w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22745w = r1
            goto L18
        L13:
            pf.f r0 = new pf.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22744v
            int r1 = r0.f22745w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r4 = r0.f22743u
            pe.a.e(r5)
            goto L37
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L2e:
            pe.a.e(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            pf.d1 r5 = (pf.d1) r5
            r0.f22743u = r4
            r0.f22745w = r2
            java.lang.Object r5 = r5.m(r0)
            ue.a r1 = ue.a.f27192u
            if (r5 != r1) goto L37
            return r1
        L50:
            pe.z r4 = pe.z.f22715a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v(java.util.Collection, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [pf.a, pf.r1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final r1 w(z zVar, te.g gVar, a0 a0Var, df.p pVar) {
        Object r22;
        te.g y10 = y(zVar, gVar);
        a0Var.getClass();
        if (a0Var == a0.f22718v) {
            r22 = new m1(y10, pVar);
        } else {
            r22 = new a(y10, true);
        }
        r22.l0(a0Var, r22, pVar);
        return r22;
    }

    public static /* synthetic */ r1 x(z zVar, te.g gVar, df.p pVar, int i10) {
        a0 a0Var;
        if ((i10 & 1) != 0) {
            gVar = te.h.f25707u;
        }
        if ((i10 & 2) != 0) {
            a0Var = a0.f22717u;
        } else {
            a0Var = a0.f22720x;
        }
        return w(zVar, gVar, a0Var, pVar);
    }

    public static final te.g y(z zVar, te.g gVar) {
        te.g l10 = l(zVar.A(), gVar, true);
        wf.e eVar = l0.f22767a;
        if (l10 != eVar && l10.L(te.d.f25706u) == null) {
            return l10.V(eVar);
        }
        return l10;
    }

    public static final uf.c z(z zVar, te.g gVar) {
        return new uf.c(zVar.A().V(gVar));
    }
}