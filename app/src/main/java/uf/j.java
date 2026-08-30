package uf;
import j.d;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.b0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27224u = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27225v = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27226w = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(j jVar, int i) {
        while (true) {
            j d2 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27225v;
            if (d2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d2 = (j) obj;
                    if (!d2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d2);
                }
            }
            if (d2 instanceof i) {
                if ((((i) d2).f27223x & i) == 0 && d2.c(jVar, i)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(jVar, d2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f27224u;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(d2, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(d2) != this) {
                    break;
                }
            }
            jVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((uf.o) r6).f27236a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final uf.j d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = uf.j.f27225v
            java.lang.Object r1 = r0.get(r9)
            uf.j r1 = (uf.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = uf.j.f27224u
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof uf.o
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            uf.o r6 = (uf.o) r6
            uf.j r6 = r6.f27236a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            uf.j r3 = (uf.j) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            uf.j r4 = (uf.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.d():uf.j");
    }

    public final void e(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27225v;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f27224u.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (i()) {
                jVar.d();
                return;
            }
            return;
        }
    }

    public final j h() {
        o oVar;
        Object obj = f27224u.get(this);
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar.f27236a;
        }
        obj.getClass();
        return (j) obj;
    }

    public boolean i() {
        return f27224u.get(this) instanceof o;
    }

    public String toString() {
        return new a0.m(1, 3, b0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + b0.o(this);
    }
}
