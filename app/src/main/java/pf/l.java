package pf;
import b0.o;
import b0.r;
import b0.s;
import l.a;
import q.x;
import s.a;
import u1.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l extends j0 implements k, ve.d, b2 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final te.c f22765x;

    /* renamed from: y, reason: collision with root package name */
    public final te.g f22766y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22764z = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");

    public l(int i, te.c cVar) {
        super(i);
        this.f22765x = cVar;
        this.f22766y = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f22723u;
    }

    public static Object D(q1 q1Var, Object obj, int i, df.q qVar) {
        j jVar;
        if (obj instanceof t) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (qVar == null && !(q1Var instanceof j)) {
            return obj;
        }
        if (q1Var instanceof j) {
            jVar = (j) q1Var;
        } else {
            jVar = null;
        }
        return new s(obj, jVar, qVar, (Throwable) null, 16);
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        uf.f fVar;
        te.c cVar = this.f22765x;
        Throwable th = null;
        if (cVar instanceof uf.f) {
            fVar = (uf.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uf.f.B;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                c4.s sVar = uf.a.f27204c;
                if (obj != sVar) {
                    if (!(obj instanceof Throwable)) {
                        l4.a.n(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            x.n("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, sVar, this)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != sVar) {
                        break;
                    }
                }
            }
            if (th != null) {
                o();
                i(th);
            }
        }
    }

    public final void B(int i, df.q qVar, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object D = D((q1) obj2, obj, i, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (m.f22769c.compareAndSet(mVar, 0, 1)) {
                    if (qVar != null) {
                        l(qVar, mVar.f22793a, obj);
                        return;
                    }
                    return;
                }
            }
            l4.a.n(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void C(v vVar) {
        uf.f fVar;
        v vVar2;
        int i;
        te.c cVar = this.f22765x;
        if (cVar instanceof uf.f) {
            fVar = (uf.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            vVar2 = fVar.f27213x;
        } else {
            vVar2 = null;
        }
        if (vVar2 == vVar) {
            i = 4;
        } else {
            i = this.f22757w;
        }
        B(i, null, pe.z.f22715a);
    }

    public final c4.s E(Object obj, df.q qVar) {
        c4.s sVar = b0.f22724a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object D = D((q1) obj2, obj, this.f22757w, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                return sVar;
            }
            return null;
        }
    }

    @Override // pf.b2
    public final void a(uf.r rVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f22764z;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                x.o("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i));
        v(rVar);
    }

    @Override // pf.j0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q1)) {
                if (!(obj instanceof t)) {
                    if (obj instanceof s) {
                        s sVar = (s) obj;
                        if (sVar.e == null) {
                            s a10 = a(sVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            j jVar = sVar.f22787b;
                            if (jVar != null) {
                                k(jVar, cancellationException);
                            }
                            df.q qVar = sVar.f22788c;
                            if (qVar != null) {
                                l(qVar, cancellationException, sVar.f22786a);
                                return;
                            }
                            return;
                        }
                        x.o("Must be called at most once");
                        return;
                    }
                    cancellationException2 = cancellationException;
                    s sVar2 = new s(obj, (j) null, (df.q) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                x.o("Not completed");
                return;
            }
        }
    }

    @Override // pf.j0
    public final te.c c() {
        return this.f22765x;
    }

    @Override // pf.j0
    public final Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    @Override // pf.j0
    public final Object e(Object obj) {
        if (obj instanceof s) {
            return ((s) obj).f22786a;
        }
        return obj;
    }

    @Override // pf.k
    public final c4.s g(Object obj, df.q qVar) {
        return E(obj, qVar);
    }

    @Override // ve.d
    public final ve.d getCallerFrame() {
        te.c cVar = this.f22765x;
        if (cVar instanceof ve.d) {
            return (ve.d) cVar;
        }
        return null;
    }

    @Override // te.c
    public final te.g getContext() {
        return this.f22766y;
    }

    @Override // pf.k
    public final void h(Object obj, df.q qVar) {
        B(this.f22757w, qVar, obj);
    }

    @Override // pf.k
    public final boolean i(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = false;
            if (!(obj instanceof q1)) {
                return false;
            }
            if ((obj instanceof j) || (obj instanceof uf.r)) {
                z3 = true;
            }
            m mVar = new m(this, th, z3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q1 q1Var = (q1) obj;
            if (q1Var instanceof j) {
                k((j) obj, th);
            } else if (q1Var instanceof uf.r) {
                m((uf.r) obj, th);
            }
            if (!x()) {
                o();
            }
            p(this.f22757w);
            return true;
        }
    }

    @Override // pf.j0
    public final Object j() {
        return A.get(this);
    }

    public final void k(j jVar, Throwable th) {
        try {
            jVar.b(th);
        } catch (Throwable th2) {
            r(new ab.b(17, "Exception in invokeOnCancellation handler for " + this, th2), this.f22766y);
        }
    }

    public final void l(df.q qVar, Throwable th, Object obj) {
        te.g gVar = this.f22766y;
        try {
            qVar.b(th, obj, gVar);
        } catch (Throwable th2) {
            r(new ab.b(17, "Exception in resume onCancellation handler for " + this, th2), gVar);
        }
    }

    public final void m(uf.r rVar, Throwable th) {
        te.g gVar = this.f22766y;
        int i = f22764z.get(this) & 536870911;
        if (i != 536870911) {
            try {
                rVar.h(i, gVar);
                return;
            } catch (Throwable th2) {
                r(new ab.b(17, "Exception in invokeOnCancellation handler for " + this, th2), gVar);
                return;
            }
        }
        x.o("The index for Segment.onCancellation(..) is broken");
    }

    @Override // pf.k
    public final void n(Object obj) {
        p(this.f22757w);
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        n0 n0Var = (n0) atomicReferenceFieldUpdater.get(this);
        if (n0Var == null) {
            return;
        }
        n0Var.a();
        atomicReferenceFieldUpdater.set(this, p1.f22779u);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z3;
        boolean z9;
        do {
            atomicIntegerFieldUpdater = f22764z;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z10 = false;
                    if (i == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    te.c cVar = this.f22765x;
                    if (!z3 && (cVar instanceof uf.f)) {
                        if (i != 1 && i != 2) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        int i12 = this.f22757w;
                        if (i12 == 1 || i12 == 2) {
                            z10 = true;
                        }
                        if (z9 == z10) {
                            uf.f fVar = (uf.f) cVar;
                            v vVar = fVar.f27213x;
                            te.g context = fVar.f27214y.getContext();
                            if (vVar.Y(context)) {
                                vVar.W(context, this);
                                return;
                            }
                            q0 a10 = a();
                            if (a10.f22781w >= 4294967296L) {
                                a10.b0(this);
                                return;
                            }
                            a10.c0(true);
                            try {
                                b0.B(this, cVar, true);
                                do {
                                } while (a10.e0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    b0.B(this, cVar, z3);
                    return;
                }
                x.o("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(k1 k1Var) {
        return k1Var.r();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        d1 d1Var;
        boolean x9 = x();
        do {
            atomicIntegerFieldUpdater = f22764z;
            i = atomicIntegerFieldUpdater.get(this);
            int i10 = i >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (x9) {
                        A();
                    }
                    Object obj = A.get(this);
                    if (!(obj instanceof t)) {
                        int i11 = this.f22757w;
                        if ((i11 == 1 || i11 == 2) && (d1Var = (d1) this.f22766y.L(w.f22803v)) != null && !d1Var.f()) {
                            CancellationException r8 = d1Var.r();
                            b(r8);
                            throw r8;
                        }
                        return e(obj);
                    }
                    throw ((t) obj).f22793a;
                }
                x.o("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((n0) B.get(this)) == null) {
            t();
        }
        if (x9) {
            A();
        }
        return ue.a.f27192u;
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        Throwable a10 = pe.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        B(this.f22757w, null, obj);
    }

    public final void s() {
        n0 t3 = t();
        if (t3 != null && w()) {
            t3.a();
            B.set(this, p1.f22779u);
        }
    }

    public final n0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d1 d1Var = (d1) this.f22766y.L(w.f22803v);
        if (d1Var == null) {
            return null;
        }
        n0 s10 = s(d1Var, true, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = B;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, s10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return s10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(b0.F(this.f22765x));
        sb2.append("){");
        Object obj = A.get(this);
        if (obj instanceof q1) {
            str = "Active";
        } else if (obj instanceof m) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(o(this));
        return sb2.toString();
    }

    public final void u(df.l lVar) {
        v(new i(1, lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00aa, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(pf.q1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = pf.l.A
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof pf.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof pf.j
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof uf.r
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof pf.t
            if (r1 == 0) goto L50
            r0 = r2
            pf.t r0 = (pf.t) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = pf.t.f22792b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4c
            boolean r1 = r2 instanceof pf.m
            if (r1 == 0) goto La1
            java.lang.Throwable r0 = r0.f22793a
            boolean r1 = r8 instanceof pf.j
            if (r1 == 0) goto L43
            pf.j r8 = (pf.j) r8
            r7.k(r8, r0)
            return
        L43:
            r8.getClass()
            uf.r r8 = (uf.r) r8
            r7.m(r8, r0)
            return
        L4c:
            y(r8, r2)
            throw r3
        L50:
            boolean r1 = r2 instanceof pf.s
            if (r1 == 0) goto L87
            r1 = r2
            pf.s r1 = (pf.s) r1
            pf.j r4 = r1.f22787b
            if (r4 != 0) goto L83
            boolean r4 = r8 instanceof uf.r
            if (r4 == 0) goto L60
            return
        L60:
            r8.getClass()
            r4 = r8
            pf.j r4 = (pf.j) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L6e
            r7.k(r4, r5)
            return
        L6e:
            r5 = 29
            pf.s r1 = pf.a(r1, r4, r3, r5)
        L74:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7b
            goto La1
        L7b:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L74
            goto L0
        L83:
            y(r8, r2)
            throw r3
        L87:
            boolean r1 = r8 instanceof uf.r
            if (r1 == 0) goto L8c
            return
        L8c:
            r8.getClass()
            r3 = r8
            pf.j r3 = (pf.j) r3
            pf.s r1 = new pf.s
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.l.v(pf.q1):void");
    }

    public final boolean w() {
        return !(A.get(this) instanceof q1);
    }

    public final boolean x() {
        if (this.f22757w == 2) {
            if (uf.f.B.get((uf.f) this.f22765x) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
