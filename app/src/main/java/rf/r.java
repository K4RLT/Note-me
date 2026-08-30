package rf;
import q.j;

import kotlin.jvm.internal.z;
import q.x;

/* loaded from: classes.dex */
public final class r extends h {
    public final a E;

    public r(int i, a aVar) {
        super(i);
        this.E = aVar;
        if (aVar != a.f24769u) {
            if (i >= 1) {
                return;
            }
            x.j(g3.a.i("Buffered channel capacity must be at least 1, but ", i, " was specified"));
            throw null;
        }
        g5.j("This implementation does not support suspension for senders, use ", z.a(h.class).c(), " instead");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            rf.a r1 = r15.E
            rf.a r2 = rf.a.f24771w
            pe.z r8 = pe.z.f22715a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.e(r16)
            boolean r2 = r1 instanceof rf.n
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof rf.m
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            c4.s r6 = rf.j.f24794d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = rf.h.f24788z
            java.lang.Object r1 = r1.get(r15)
            rf.p r1 = (rf.p) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = rf.h.f24784v
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.v(r2, r7)
            int r9 = rf.j.f24792b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f27239w
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            rf.p r2 = rf.h.f(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.s()
            rf.m r2 = new rf.m
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = rf.h.h(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb6
            r3 = 1
            if (r12 == r3) goto Lb5
            r3 = 2
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = rf.h.f24785w
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.s()
            rf.m r2 = new rf.m
            r2.<init>(r1)
            return r2
        L88:
            java.lang.String r1 = "unexpected"
            x.o(r1)
            r1 = 0
            return r1
        L8f:
            if (r7 == 0) goto L9e
            r1.i()
            java.lang.Throwable r1 = r15.s()
            rf.m r2 = new rf.m
            r2.<init>(r1)
            return r2
        L9e:
            boolean r3 = r6 instanceof pf.b2
            if (r3 == 0) goto La5
            pf.b2 r6 = (pf.b2) r6
            goto La6
        La5:
            r6 = 0
        La6:
            if (r6 == 0) goto Lad
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lad:
            long r3 = r1.f27239w
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.n(r3)
        Lb5:
            return r8
        Lb6:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.r.K(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // rf.h, rf.v
    public final Object a(Object obj, te.c cVar) {
        if (!(K(obj, true) instanceof m)) {
            return pe.z.f22715a;
        }
        throw s();
    }

    @Override // rf.h, rf.v
    public final Object e(Object obj) {
        return K(obj, false);
    }

    @Override // rf.h
    public final boolean y() {
        if (this.E == a.f24770v) {
            return true;
        }
        return false;
    }
}
