package yf;
import c.f;

import c4.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.b0;
import q.x;
import vd.n;

/* loaded from: classes.dex */
public final class c extends g implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z3) {
        super(1, z3 ? 1 : 0);
        s sVar;
        if (z3) {
            sVar = null;
        } else {
            sVar = d.f31642a;
        }
        this.owner$volatile = sVar;
    }

    public final boolean c() {
        if (Math.max(g.A.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.A;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f31649u;
            if (i10 > i11) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    B.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = yf.c.B;
        r3 = r0.f31641v;
        r2.set(r3, null);
        r2 = r0.f31640u;
        r2.B(r2.f22757w, new b8.e8(2, new w7.k8(r3, r0)), r1);
     */
    @Override // yf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(te.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.d()
            pe.z r1 = pe.z.f22715a
            if (r0 == 0) goto L9
            goto L50
        L9:
            te.c r7 = ya.rc.b(r7)
            pf.l r7 = pf.b0.q(r7)
            yf.b r0 = new yf.b     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = yf.g.A     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.f31649u     // Catch: java.lang.Throwable -> L51
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = yf.c.B     // Catch: java.lang.Throwable -> L51
            yf.c r3 = r0.f31641v     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L51
            pf.l r2 = r0.f31640u     // Catch: java.lang.Throwable -> L51
            w7.k8 r4 = new w7.k8     // Catch: java.lang.Throwable -> L51
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r2.f22757w     // Catch: java.lang.Throwable -> L51
            b8.e8 r3 = new b8.e8     // Catch: java.lang.Throwable -> L51
            r5 = 2
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L51
            r2.B(r0, r3, r1)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r7 = r7.r()
            ue.a r0 = ue.a.f27192u
            if (r7 != r0) goto L4c
            goto L4d
        L4c:
            r7 = r1
        L4d:
            if (r7 != r0) goto L50
            return r7
        L50:
            return r1
        L51:
            r0 = move-exception
            r7.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.f(te.c):java.lang.Object");
    }

    @Override // yf.a
    public final void j(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            s sVar = d.f31642a;
            if (obj2 != sVar) {
                if (obj2 != obj && obj != null) {
                    n.d("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        x.o("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + b0.o(this) + "[isLocked=" + c() + ",owner=" + B.get(this) + ']';
    }
}
