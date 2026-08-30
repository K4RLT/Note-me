package rf;
import h.a;
import j.a;
import j.e;
import j.i;

import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.b0;
import pe.z;
import pf.b2;
import q.x;
import ya.rc;

/* loaded from: classes.dex */
public class h implements l {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final int f24789u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24784v = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24785w = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24786x = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24787y = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24788z = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");

    public h(int i) {
        long j10;
        this.f24789u = i;
        if (i >= 0) {
            p pVar = j.f24791a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j10 = i;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd$volatile = j10;
            this.completedExpandBuffersAndPauseFlag$volatile = f24786x.get(this);
            p pVar2 = new p(0L, null, this, 3);
            this.sendSegment$volatile = pVar2;
            this.receiveSegment$volatile = pVar2;
            if (z()) {
                pVar2 = j.f24791a;
                pVar2.getClass();
            }
            this.bufferEndSegment$volatile = pVar2;
            this._closeCause$volatile = j.f24807s;
            return;
        }
        x.j(g3.a.i("Invalid channel capacity: ", i, ", should be >=0"));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(rf.h r13, ve.c r14) {
        /*
            boolean r0 = r14 instanceof rf.f
            if (r0 == 0) goto L14
            r0 = r14
            rf.f r0 = (rf.f) r0
            int r1 = r0.f24780w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f24780w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            rf.f r0 = new rf.f
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f24778u
            int r0 = r6.f24780w
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            pe.a.e(r14)
            rf.o r14 = (rf.o) r14
            java.lang.Object r13 = r14.f24813a
            return r13
        L2b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r13)
            r13 = 0
            return r13
        L32:
            pe.a.e(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = rf.h.A
            java.lang.Object r14 = r14.get(r13)
            rf.p r14 = (rf.p) r14
        L3d:
            boolean r0 = r13.w()
            if (r0 == 0) goto L4d
            java.lang.Throwable r13 = r13.q()
            rf.m r14 = new rf.m
            r14.<init>(r13)
            return r14
        L4d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = rf.h.f24785w
            long r4 = r0.getAndIncrement(r13)
            int r0 = rf.j.f24792b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f27239w
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6a
            rf.p r0 = r13.p(r7, r14)
            if (r0 != 0) goto L68
            goto L3d
        L68:
            r2 = r0
            goto L6b
        L6a:
            r2 = r14
        L6b:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.H(r8, r9, r10, r12)
            c4.s r14 = rf.j.f24801m
            if (r13 == r14) goto L9f
            c4.s r14 = rf.j.f24803o
            if (r13 != r14) goto L8a
            long r13 = r7.t()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L87
            r2.a()
        L87:
            r14 = r2
            r13 = r7
            goto L3d
        L8a:
            c4.s r14 = rf.j.f24802n
            if (r13 != r14) goto L9b
            r6.f24780w = r1
            r1 = r7
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            ue.a r14 = ue.a.f27192u
            if (r13 != r14) goto L9a
            return r14
        L9a:
            return r13
        L9b:
            r2.a()
            return r13
        L9f:
            java.lang.String r13 = "unexpected"
            x.o(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.C(rf.h, ve.c):java.lang.Object");
    }

    public static final p f(h hVar, long j10, p pVar) {
        Object b10;
        h hVar2;
        p pVar2 = j.f24791a;
        i iVar = i.f24790u;
        loop0: while (true) {
            b10 = uf.a.b(pVar, j10, iVar);
            if (!uf.a.e(b10)) {
                uf.r c10 = uf.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24788z;
                    uf.r rVar = (uf.r) atomicReferenceFieldUpdater.get(hVar);
                    if (rVar.f27239w >= c10.f27239w) {
                        break loop0;
                    }
                    if (!c10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, rVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != rVar) {
                            if (c10.f()) {
                                c10.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean e = uf.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24785w;
        if (e) {
            hVar.x();
            if (pVar.f27239w * j.f24792b < atomicLongFieldUpdater.get(hVar)) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) uf.a.c(b10);
            long j11 = pVar3.f27239w;
            if (j11 > j10) {
                long j12 = j.f24792b * j11;
                while (true) {
                    long j13 = f24784v.get(hVar);
                    long j14 = 1152921504606846975L & j13;
                    if (j14 >= j12) {
                        hVar2 = hVar;
                        break;
                    }
                    hVar2 = hVar;
                    if (f24784v.compareAndSet(hVar2, j13, (((int) (j13 >> 60)) << 60) + j14)) {
                        break;
                    }
                    hVar = hVar2;
                }
                if (j11 * j.f24792b < atomicLongFieldUpdater.get(hVar2)) {
                    pVar3.a();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public static final void g(h hVar, Object obj, pf.l lVar) {
        lVar.resumeWith(new pe.k(hVar.s()));
    }

    public static final int h(h hVar, p pVar, int i, Object obj, long j10, Object obj2, boolean z3) {
        pVar.n(i, obj);
        if (z3) {
            return hVar.I(pVar, i, obj, j10, obj2, z3);
        }
        Object l10 = pVar.l(i);
        if (l10 == null) {
            if (hVar.i(j10)) {
                if (pVar.k(null, i, j.f24794d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof b2) {
            pVar.n(i, null);
            if (hVar.F(l10, obj)) {
                pVar.o(i, i);
                return 0;
            }
            c4.s sVar = j.f24799k;
            if (pVar.f24815z.getAndSet((i * 2) + 1, sVar) != sVar) {
                pVar.m(i, true);
                return 5;
            }
            return 5;
        }
        return hVar.I(pVar, i, obj, j10, obj2, z3);
    }

    public static void u(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24787y;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r5, rf.p r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f27239w
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            uf.b r0 = r7.c()
            rf.p r0 = (rf.p) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            uf.b r5 = r7.c()
            rf.p r5 = (rf.p) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = rf.h.B
            java.lang.Object r6 = r5.get(r4)
            uf.r r6 = (uf.r) r6
            long r0 = r6.f27239w
            long r2 = r7.f27239w
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.A(long, rf.p):void");
    }

    public final Object B(Object obj, te.c cVar) {
        pf.l lVar = new pf.l(1, rc.b(cVar));
        lVar.s();
        lVar.resumeWith(new pe.k(s()));
        Object r8 = lVar.r();
        if (r8 == ue.a.f27192u) {
            return r8;
        }
        return z.f22715a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(rf.p r14, int r15, long r16, ve.c r18) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.D(rf.p, int, long, ve.c):java.lang.Object");
    }

    public final void E(b2 b2Var, boolean z3) {
        Throwable s10;
        if (b2Var instanceof pf.k) {
            te.c cVar = (te.c) b2Var;
            if (z3) {
                s10 = r();
            } else {
                s10 = s();
            }
            cVar.resumeWith(new pe.k(s10));
            return;
        }
        if (b2Var instanceof u) {
            ((u) b2Var).f24820u.resumeWith(new o(new m(q())));
            return;
        }
        if (b2Var instanceof c) {
            c cVar2 = (c) b2Var;
            pf.l lVar = cVar2.f24774v;
            lVar.getClass();
            cVar2.f24774v = null;
            cVar2.f24773u = j.f24800l;
            Throwable q10 = cVar2.f24775w.q();
            if (q10 == null) {
                lVar.resumeWith(Boolean.FALSE);
                return;
            } else {
                lVar.resumeWith(new pe.k(q10));
                return;
            }
        }
        if (b2Var instanceof xf.e) {
            ((xf.e) b2Var).g(this, j.f24800l);
        } else {
            l4.a.n(b2Var, "Unexpected waiter: ");
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof xf.e) {
            if (((xf.e) obj).g(this, obj2) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof u) {
            return a(((u) obj).f24820u, new o(obj2), null);
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            pf.l lVar = cVar.f24774v;
            lVar.getClass();
            cVar.f24774v = null;
            cVar.f24773u = obj2;
            Boolean bool = Boolean.TRUE;
            cVar.f24775w.getClass();
            return a(lVar, bool, null);
        }
        if (obj instanceof pf.k) {
            return a((pf.k) obj, obj2, null);
        }
        l4.a.n(obj, "Unexpected receiver type: ");
        return false;
    }

    public final boolean G(Object obj, p pVar, int i) {
        xf.h hVar;
        boolean z3 = obj instanceof pf.k;
        z zVar = z.f22715a;
        if (z3) {
            return a((pf.k) obj, zVar, null);
        }
        if (obj instanceof xf.e) {
            int g8 = ((xf.e) obj).g(this, zVar);
            xf.h hVar2 = xf.h.f30790u;
            xf.h hVar3 = xf.h.f30791v;
            if (g8 != 0) {
                if (g8 != 1) {
                    if (g8 != 2) {
                        if (g8 == 3) {
                            hVar = xf.h.f30793x;
                        } else {
                            throw new IllegalStateException(("Unexpected internal result: " + g8).toString());
                        }
                    } else {
                        hVar = xf.h.f30792w;
                    }
                } else {
                    hVar = hVar3;
                }
            } else {
                hVar = hVar2;
            }
            if (hVar == hVar3) {
                pVar.n(i, null);
            }
            if (hVar == hVar2) {
                return true;
            }
            return false;
        }
        l4.a.n(obj, "Unexpected waiter: ");
        return false;
    }

    public final Object H(p pVar, int i, long j10, Object obj) {
        Object l10 = pVar.l(i);
        AtomicReferenceArray atomicReferenceArray = pVar.f24815z;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24784v;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f24802n;
                }
                if (pVar.k(l10, i, obj)) {
                    o();
                    return j.f24801m;
                }
            }
        } else if (l10 == j.f24794d && pVar.k(l10, i, i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i * 2);
            pVar.n(i, null);
            return obj2;
        }
        while (true) {
            Object l11 = pVar.l(i);
            if (l11 != null && l11 != e) {
                if (l11 == j.f24794d) {
                    if (pVar.k(l11, i, i)) {
                        o();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        pVar.n(i, null);
                        return obj3;
                    }
                } else {
                    c4.s sVar = j.f24798j;
                    if (l11 == sVar) {
                        return j.f24803o;
                    }
                    if (l11 == j.f24797h) {
                        return j.f24803o;
                    }
                    if (l11 == j.f24800l) {
                        o();
                        return j.f24803o;
                    }
                    if (l11 != j.f24796g && pVar.k(l11, i, j.f24795f)) {
                        boolean z3 = l11 instanceof w;
                        if (z3) {
                            l11 = ((w) l11).f24821a;
                        }
                        if (G(l11, pVar, i)) {
                            pVar.o(i, i);
                            o();
                            Object obj4 = atomicReferenceArray.get(i * 2);
                            pVar.n(i, null);
                            return obj4;
                        }
                        pVar.o(i, sVar);
                        pVar.i();
                        if (z3) {
                            o();
                        }
                        return j.f24803o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (pVar.k(l11, i, j.f24797h)) {
                    o();
                    return j.f24803o;
                }
            } else {
                if (obj == null) {
                    return j.f24802n;
                }
                if (pVar.k(l11, i, obj)) {
                    o();
                    return j.f24801m;
                }
            }
        }
    }

    public final int I(p pVar, int i, Object obj, long j10, Object obj2, boolean z3) {
        while (true) {
            Object l10 = pVar.l(i);
            if (l10 == null) {
                if (i(j10) && !z3) {
                    if (pVar.k(null, i, j.f24794d)) {
                        break;
                    }
                } else if (z3) {
                    if (pVar.k(null, i, j.f24798j)) {
                        pVar.i();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (pVar.k(null, i, obj2)) {
                        return 2;
                    }
                }
            } else if (l10 == e) {
                if (pVar.k(l10, i, j.f24794d)) {
                    break;
                }
            } else {
                c4.s sVar = j.f24799k;
                if (l10 == sVar) {
                    pVar.n(i, null);
                    return 5;
                }
                if (l10 == j.f24797h) {
                    pVar.n(i, null);
                    return 5;
                }
                if (l10 == j.f24800l) {
                    pVar.n(i, null);
                    x();
                    return 4;
                }
                pVar.n(i, null);
                if (l10 instanceof w) {
                    l10 = ((w) l10).f24821a;
                }
                if (F(l10, obj)) {
                    pVar.o(i, i);
                    return 0;
                }
                if (pVar.f24815z.getAndSet((i * 2) + 1, sVar) != sVar) {
                    pVar.m(i, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void J(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z3;
        h hVar = this;
        if (!hVar.z()) {
            while (true) {
                atomicLongFieldUpdater = f24786x;
                if (atomicLongFieldUpdater.get(hVar) > j10) {
                    break;
                } else {
                    hVar = this;
                }
            }
            int i = j.f24793c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f24787y;
                if (i10 < i) {
                    long j11 = atomicLongFieldUpdater.get(hVar);
                    if (j11 != (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) || j11 != atomicLongFieldUpdater.get(hVar)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j12 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j13 = atomicLongFieldUpdater.get(hVar);
                        long j14 = atomicLongFieldUpdater2.get(hVar);
                        long j15 = j14 & 4611686018427387903L;
                        if ((j14 & 4611686018427387904L) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (j13 == j15 && j13 == atomicLongFieldUpdater.get(hVar)) {
                            break;
                        }
                        if (!z3) {
                            hVar = this;
                            atomicLongFieldUpdater2.compareAndSet(hVar, j14, 4611686018427387904L + j15);
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j16 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j16, j16 & 4611686018427387903L)) {
                            return;
                        } else {
                            hVar = this;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        g(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // rf.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object r23, te.c r24) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.a(java.lang.Object, te.c):java.lang.Object");
    }

    @Override // rf.l
    public final gw b() {
        b0.b(3, d.f24776u);
        b0.b(3, e.f24777u);
        return new gw(this, (b) null);
    }

    @Override // rf.l
    public final Object c() {
        p pVar;
        b2 b2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24785w;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = f24784v.get(this);
        if (v(j11, true)) {
            return new m(q());
        }
        long j12 = j11 & 1152921504606846975L;
        n nVar = o.f24812b;
        if (j10 >= j12) {
            return nVar;
        }
        Object obj = j.f24799k;
        p pVar2 = (p) A.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = j.f24792b;
            long j14 = andIncrement / j13;
            int i = (int) (andIncrement % j13);
            if (pVar2.f27239w != j14) {
                p p10 = p(j14, pVar2);
                if (p10 == null) {
                    continue;
                } else {
                    pVar = p10;
                }
            } else {
                pVar = pVar2;
            }
            Object H = H(pVar, i, andIncrement, obj);
            p pVar3 = pVar;
            if (H == j.f24801m) {
                if (obj instanceof b2) {
                    b2Var = (b2) obj;
                } else {
                    b2Var = null;
                }
                if (b2Var != null) {
                    b2Var.a(pVar3, i);
                }
                J(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (H == j.f24803o) {
                if (andIncrement < t()) {
                    pVar3.a();
                }
                pVar2 = pVar3;
            } else {
                if (H != j.f24802n) {
                    pVar3.a();
                    return H;
                }
                x.o("unexpected");
                return null;
            }
        }
        return new m(q());
    }

    @Override // rf.l
    public final Object d(tf.n nVar) {
        return C(this, nVar);
    }

    @Override // rf.v
    public Object e(Object obj) {
        boolean z3;
        b2 b2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24784v;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z9 = false;
        long j11 = 1152921504606846975L;
        if (v(j10, false)) {
            z3 = false;
        } else {
            z3 = !i(j10 & 1152921504606846975L);
        }
        n nVar = o.f24812b;
        if (z3) {
            return nVar;
        }
        za.c cVar = j.f24798j;
        p pVar = (p) f24788z.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = andIncrement & j11;
            boolean v2 = v(andIncrement, z9);
            int i = j.f24792b;
            long j13 = i;
            long j14 = j12 / j13;
            int i10 = (int) (j12 % j13);
            if (pVar.f27239w != j14) {
                p f10 = f(this, j14, pVar);
                if (f10 == null) {
                    if (v2) {
                        return new m(s());
                    }
                    z9 = false;
                    j11 = 1152921504606846975L;
                } else {
                    pVar = f10;
                }
            }
            int h3 = h(this, pVar, i10, obj, j12, cVar, v2);
            z zVar = z.f22715a;
            if (h3 != 0) {
                if (h3 != 1) {
                    if (h3 != 2) {
                        if (h3 != 3) {
                            if (h3 != 4) {
                                if (h3 == 5) {
                                    pVar.a();
                                }
                                z9 = false;
                                j11 = 1152921504606846975L;
                            } else {
                                if (j12 < f24785w.get(this)) {
                                    pVar.a();
                                }
                                return new m(s());
                            }
                        } else {
                            x.o("unexpected");
                            return null;
                        }
                    } else {
                        if (v2) {
                            pVar.i();
                            return new m(s());
                        }
                        if (cVar instanceof b2) {
                            b2Var = (b2) cVar;
                        } else {
                            b2Var = null;
                        }
                        if (b2Var != null) {
                            b2Var.a(pVar, i10 + i);
                        }
                        pVar.i();
                        return nVar;
                    }
                } else {
                    return zVar;
                }
            } else {
                pVar.a();
                return zVar;
            }
        }
    }

    public final boolean i(long j10) {
        if (j10 >= f24786x.get(this) && j10 >= f24785w.get(this) + this.f24789u) {
            return false;
        }
        return true;
    }

    @Override // rf.l
    public final c iterator() {
        return new c(this);
    }

    @Override // rf.l
    public final void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = rf.h.D;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = rf.j.f24805q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        kotlin.jvm.internal.b0.b(1, r14);
        ((df.l) r14).invoke(q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = rf.j.f24806r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = rf.j.f24791a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = rf.j.f24807s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = rf.h.C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = rf.h.f24784v
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            rf.p r4 = rf.j.f24791a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            c4.s r5 = rf.j.f24807s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = rf.h.C
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.x()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = rf.h.D
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            c4.s r0 = rf.j.f24805q
            goto L7b
        L79:
            c4.s r0 = rf.j.f24806r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            kotlin.jvm.internal.b0.b(r9, r14)
            df.l r14 = (df.l) r14
            java.lang.Throwable r13 = r12.q()
            r14.invoke(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.k(java.lang.Throwable, boolean):boolean");
    }

    @Override // rf.l
    public final Object l(ve.c cVar) {
        p pVar;
        Throwable th;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f24785w;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = j.f24792b;
            long j11 = andIncrement / j10;
            int i = (int) (andIncrement % j10);
            if (pVar3.f27239w != j11) {
                p p10 = p(j11, pVar3);
                if (p10 == null) {
                    continue;
                } else {
                    pVar = p10;
                }
            } else {
                pVar = pVar3;
            }
            Object H = H(pVar, i, andIncrement, null);
            c4.s sVar = j.f24801m;
            if (H != sVar) {
                c4.s sVar2 = j.f24803o;
                if (H == sVar2) {
                    if (andIncrement < t()) {
                        pVar.a();
                    }
                    pVar3 = pVar;
                } else if (H == j.f24802n) {
                    pf.l q10 = pf.b0.q(rc.b(cVar));
                    h hVar = this;
                    try {
                        Object H2 = hVar.H(pVar, i, andIncrement, q10);
                        if (H2 == sVar) {
                            q10.a(pVar, i);
                        } else {
                            if (H2 == sVar2) {
                                if (andIncrement < t()) {
                                    pVar.a();
                                }
                                p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (w()) {
                                        q10.resumeWith(new pe.k(r()));
                                        break;
                                    }
                                    pf.l lVar = q10;
                                    try {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j12 = j.f24792b;
                                        long j13 = andIncrement2 / j12;
                                        int i10 = (int) (andIncrement2 % j12);
                                        if (pVar4.f27239w != j13) {
                                            try {
                                                p p11 = p(j13, pVar4);
                                                if (p11 == null) {
                                                    q10 = lVar;
                                                } else {
                                                    pVar2 = p11;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                q10 = lVar;
                                                q10.A();
                                                throw th;
                                            }
                                        } else {
                                            pVar2 = pVar4;
                                        }
                                        H2 = hVar.H(pVar2, i10, andIncrement2, lVar);
                                        p pVar5 = pVar2;
                                        q10 = lVar;
                                        if (H2 == j.f24801m) {
                                            q10.a(pVar5, i10);
                                            break;
                                        }
                                        if (H2 == j.f24803o) {
                                            if (andIncrement2 < t()) {
                                                pVar5.a();
                                            }
                                            hVar = this;
                                            pVar4 = pVar5;
                                        } else if (H2 != j.f24802n) {
                                            pVar5.a();
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        q10 = lVar;
                                        th = th;
                                        q10.A();
                                        throw th;
                                    }
                                }
                            } else {
                                pVar.a();
                            }
                            q10.h(H2, null);
                        }
                        return q10.r();
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    pVar.a();
                    return H;
                }
            } else {
                x.o("unexpected");
                return null;
            }
        }
        Throwable r8 = r();
        int i11 = uf.s.f27240a;
        throw r8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (rf.p) ((uf.b) uf.b.f27209v.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rf.p m(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.m(long):rf.p");
    }

    public final void n(long j10) {
        p pVar = (p) A.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f24785w;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f24789u + j11, f24786x.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = j.f24792b;
                long j13 = j11 / j12;
                int i = (int) (j11 % j12);
                if (pVar.f27239w != j13) {
                    p p10 = p(j13, pVar);
                    if (p10 != null) {
                        pVar = p10;
                    }
                }
                p pVar2 = pVar;
                if (H(pVar2, i, j11, null) == j.f24803o) {
                    if (j11 < t()) {
                        pVar2.a();
                    }
                } else {
                    pVar2.a();
                }
                pVar = pVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.o():void");
    }

    public final p p(long j10, p pVar) {
        Object b10;
        long j11;
        p pVar2 = j.f24791a;
        i iVar = i.f24790u;
        loop0: while (true) {
            b10 = uf.a.b(pVar, j10, iVar);
            if (!uf.a.e(b10)) {
                uf.r c10 = uf.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                    uf.r rVar = (uf.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f27239w >= c10.f27239w) {
                        break loop0;
                    }
                    if (!c10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c10.f()) {
                                c10.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (uf.a.e(b10)) {
            x();
            if (pVar.f27239w * j.f24792b < t()) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) uf.a.c(b10);
            long j12 = pVar3.f27239w;
            if (!z() && j10 <= f24786x.get(this) / j.f24792b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                    uf.r rVar2 = (uf.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f27239w >= j12) {
                        break;
                    }
                    if (!pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j12 > j10) {
                long j13 = j12 * j.f24792b;
                do {
                    j11 = f24785w.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f24785w.compareAndSet(this, j11, j13));
                if (j12 * j.f24792b < t()) {
                    pVar3.a();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) C.get(this);
    }

    public final Throwable r() {
        Throwable q10 = q();
        if (q10 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return q10;
    }

    public final Throwable s() {
        Throwable q10 = q();
        if (q10 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return q10;
    }

    public final long t() {
        return f24784v.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b9, code lost:
    
        r16 = r7;
        r3 = (rf.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c2, code lost:
    
        if (r3 != null) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (rf.p) ((uf.b) uf.b.f27209v.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.v(long, boolean):boolean");
    }

    public final boolean w() {
        return v(f24784v.get(this), true);
    }

    public final boolean x() {
        return v(f24784v.get(this), false);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j10 = f24786x.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }
}
