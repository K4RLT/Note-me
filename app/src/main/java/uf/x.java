package uf;
import x.b;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pf.t0;
import pf.u0;

/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27247b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public t0[] f27248a;

    public final void a(t0 t0Var) {
        t0Var.d((u0) this);
        t0[] t0VarArr = this.f27248a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27247b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f27248a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            t0VarArr = (t0[]) Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f27248a = t0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        t0VarArr[i] = t0Var;
        t0Var.f22795v = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pf.t0 b(int r9) {
        /*
            r8 = this;
            pf.t0[] r0 = r8.f27248a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = uf.x.f27247b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            pf.t0[] r5 = r8.f27248a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.f22795v = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.b(int):pf.t0");
    }

    public final void c(int i) {
        while (i > 0) {
            t0[] t0VarArr = this.f27248a;
            t0VarArr.getClass();
            int i10 = (i - 1) / 2;
            t0 t0Var = t0VarArr[i10];
            t0Var.getClass();
            t0 t0Var2 = t0VarArr[i];
            t0Var2.getClass();
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            d(i, i10);
            i = i10;
        }
    }

    public final void d(int i, int i10) {
        t0[] t0VarArr = this.f27248a;
        t0VarArr.getClass();
        t0 t0Var = t0VarArr[i10];
        t0Var.getClass();
        t0 t0Var2 = t0VarArr[i];
        t0Var2.getClass();
        t0VarArr[i] = t0Var;
        t0VarArr[i10] = t0Var2;
        t0Var.f22795v = i;
        t0Var2.f22795v = i10;
    }
}
