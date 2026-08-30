package rf;
import j.i;
import p.h;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class p extends uf.r {

    /* renamed from: y, reason: collision with root package name */
    public final h f24814y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f24815z;

    public p(long j10, p pVar, h hVar, int i) {
        super(j10, pVar, i);
        this.f24814y = hVar;
        this.f24815z = new AtomicReferenceArray(j.f24792b * 2);
    }

    @Override // uf.r
    public final int g() {
        return j.f24792b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // uf.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, te.g r6) {
        /*
            r4 = this;
            int r6 = rf.j.f24792b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f24815z
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof pf.b2
            rf.h r2 = r4.f24814y
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof rf.w
            if (r1 == 0) goto L21
            goto L50
        L21:
            c4.s r1 = rf.j.f24798j
            if (r6 == r1) goto L47
            c4.s r1 = rf.j.f24799k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            c4.s r1 = rf.j.f24796g
            if (r6 == r1) goto L11
            c4.s r1 = rf.j.f24795f
            if (r6 != r1) goto L33
            goto L11
        L33:
            c4.s r5 = rf.i
            if (r6 == r5) goto L6a
            c4.s r5 = rf.j.f24794d
            if (r6 != r5) goto L3c
            goto L6a
        L3c:
            c4.s r5 = rf.j.f24800l
            if (r6 != r5) goto L41
            goto L6a
        L41:
            java.lang.String r5 = "unexpected state: "
            l4.a.n(r6, r5)
            return
        L47:
            r4.n(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            c4.s r1 = rf.j.f24798j
            goto L57
        L55:
            c4.s r1 = rf.j.f24799k
        L57:
            boolean r6 = r4.k(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h(int, te.g):void");
    }

    public final boolean k(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f24815z;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f24815z.get((i * 2) + 1);
    }

    public final void m(int i, boolean z3) {
        if (z3) {
            h hVar = this.f24814y;
            hVar.getClass();
            hVar.J((this.f27239w * j.f24792b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f24815z.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f24815z.set((i * 2) + 1, obj);
    }
}
