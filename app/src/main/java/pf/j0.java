package pf;
import b0.r;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class j0 extends wf.h {

    /* renamed from: w, reason: collision with root package name */
    public int f22757w;

    public j0(int i) {
        super(0L, false);
        this.f22757w = i;
    }

    public abstract te.c c();

    public Throwable d(Object obj) {
        t tVar;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            return null;
        }
        return tVar.f22793a;
    }

    public final void f(Throwable th) {
        r(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (pf.d1) r5.L(pf.w.f22803v);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            te.c r0 = r11.c()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            uf.f r0 = (uf.f) r0     // Catch: java.lang.Throwable -> L1f
            ve.c r1 = r0.f27214y     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.A     // Catch: java.lang.Throwable -> L1f
            te.g r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = uf.a.l(r2, r0)     // Catch: java.lang.Throwable -> L1f
            c4.s r3 = uf.a.f27205d     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            pf.z1 r3 = pf.b0.I(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8b
        L22:
            r3 = r4
        L23:
            te.g r5 = r1.getContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.j()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.d(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.f22757w     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            pf.w r4 = pf.w.f22803v     // Catch: java.lang.Throwable -> L46
            te.e r4 = r5.L(r4)     // Catch: java.lang.Throwable -> L46
            pf.d1 r4 = (pf.d1) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L7f
        L48:
            if (r4 == 0) goto L5f
            boolean r5 = r4.f()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L5f
            java.util.concurrent.CancellationException r4 = r4.r()     // Catch: java.lang.Throwable -> L46
            r11.b(r4)     // Catch: java.lang.Throwable -> L46
            pe.k r4 = pe.a.b(r4)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L5f:
            if (r7 == 0) goto L6a
            pe.k r4 = new pe.k     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L6a:
            java.lang.Object r4 = r11.e(r6)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
        L71:
            if (r3 == 0) goto L7b
            boolean r1 = r3.m0()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            uf.a.g(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L7f:
            if (r3 == 0) goto L87
            boolean r3 = r3.m0()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8a
        L87:
            uf.a.g(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8b:
            r11.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.j0.run():void");
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
