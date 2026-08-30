package c2;
import a0.k0;
import b0.b;
import b0.x;
import b1.p;
import b2.i0;
import c2.a;
import c2.g3;
import c2.h3;
import c2.x1;
import c2.x;
import c2.y0;
import r0.u;
import r0.x;
import z0.c;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f3552a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g3 a(a r6, u r7, c r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = x1.f3719a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L43
            r0 = 6
            rf.h r0 = ya.jb.a(r2, r0, r3)
            pe.n r2 = y0.G
            java.lang.Object r2 = r2.getValue()
            te.g r2 = (te.g) r2
            uf.c r2 = pf.b(r2)
            a6.f r4 = new a6.f
            r5 = 10
            r4.<init>(r0, r3, r5)
            r5 = 3
            pf.x(r2, r3, r4, r5)
            k0 r2 = new k0
            r4 = 12
            r2.<init>(r4, r0)
            java.lang.Object r0 = p.f1387c
            monitor-enter(r0)
            java.lang.Object r4 = p.i     // Catch: java.lang.Throwable -> L40
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r2 = qe.l.F(r4, r2)     // Catch: java.lang.Throwable -> L40
            p.i = r2     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            p.a()
            goto L43
        L40:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L43:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L56
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof x
            if (r1 == 0) goto L54
            x r0 = (x) r0
            goto L5a
        L54:
            r0 = r3
            goto L5a
        L56:
            r6.removeAllViews()
            goto L54
        L5a:
            if (r0 != 0) goto L72
            x r0 = new x
            android.content.Context r1 = r6.getContext()
            te.g r2 = r7.i()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = c2.h3.f3552a
            r6.addView(r1, r2)
        L72:
            android.view.View r6 = r0.getView()
            r1 = 2131362016(0x7f0a00e0, float:1.83438E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof g3
            if (r2 == 0) goto L84
            r3 = r6
            g3 r3 = (g3) r3
        L84:
            if (r3 != 0) goto La0
            g3 r3 = new g3
            ra.e r6 = new ra.e
            i0 r2 = r0.getRoot()
            r6.<init>(r2)
            x r2 = new x
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        La0:
            r3.b(r8)
            te.g r6 = r0.getCoroutineContext()
            te.g r8 = r7.i()
            boolean r6 = kotlin.jvm.internal.l.a(r6, r8)
            if (r6 != 0) goto Lb8
            te.g r6 = r7.i()
            r0.setCoroutineContext(r6)
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h3.a(a, u, c):g3");
    }
}
