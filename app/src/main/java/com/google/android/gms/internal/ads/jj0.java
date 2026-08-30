package com.google.android.gms.internal.ads;
import r3.c;
import r6.d;
import r6.e;
import r6.f;
import r7.m;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class jj0 {

    /* renamed from: c, reason: collision with root package name */
    public final d91 f7455c;

    /* renamed from: f, reason: collision with root package name */
    public rj0 f7457f;

    /* renamed from: h, reason: collision with root package name */
    public final String f7459h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final qj0 f7460j;

    /* renamed from: k, reason: collision with root package name */
    public qp0 f7461k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7453a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7454b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7456d = new ArrayList();
    public final HashSet e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f7458g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7462l = false;

    public jj0(wp0 wp0Var, qj0 qj0Var, d91 d91Var) {
        this.i = ((sp0) wp0Var.f12313b.f11471w).f11105r;
        this.f7460j = qj0Var;
        this.f7455c = d91Var;
        this.f7459h = uj0.a(wp0Var);
        List list = (List) wp0Var.f12313b.f11470v;
        for (int i = 0; i < list.size(); i++) {
            this.f7453a.put((qp0) list.get(i), Integer.valueOf(i));
        }
        this.f7454b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.f9963v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.f7462l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6.f7456d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.qp0) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.qp0 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = d()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.ArrayList r1 = r6.f7454b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.qp0 r2 = (com.google.android.gms.internal.ads.qp0) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.f9959t0     // Catch: java.lang.Throwable -> L2b
            java.util.HashSet r4 = e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.f9963v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.f7462l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.ArrayList r3 = r6.f7456d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.qp0 r0 = (com.google.android.gms.internal.ads.qp0) r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r0
        L43:
            monitor-exit(r6)
            r0 = 0
            return r0
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj0.a():com.google.android.gms.internal.ads.qp0");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0009, B:8:0x0010, B:10:0x0013, B:14:0x001b, B:16:0x0028, B:17:0x002e, B:19:0x0032, B:22:0x0039, B:24:0x003d, B:25:0x0044, B:26:0x004a, B:48:0x007d, B:50:0x0085, B:59:0x0081, B:63:0x008e, B:68:0x0091, B:29:0x004c, B:31:0x0052, B:41:0x007a, B:47:0x007c, B:58:0x0080, B:7:0x000a), top: B:3:0x0002, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(com.google.android.gms.internal.ads.rj0 r7, com.google.android.gms.internal.ads.qp0 r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r6.f7462l = r0     // Catch: java.lang.Throwable -> L18
            java.util.ArrayList r1 = r6.f7456d     // Catch: java.lang.Throwable -> L18
            r1.remove(r8)     // Catch: java.lang.Throwable -> L18
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.d91 r1 = r6.f7455c     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            m()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r6)
            return
        L18:
            r7 = move-exception
            goto L92
        L1b:
            java.util.HashMap r1 = r6.f7453a     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L2d
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L18
            goto L2e
        L2d:
            r1 = r2
        L2e:
            int r3 = r6.f7458g     // Catch: java.lang.Throwable -> L18
            if (r1 <= r3) goto L39
            com.google.android.gms.internal.ads.qj0 r7 = r6.f7460j     // Catch: java.lang.Throwable -> L18
            r7.c(r8)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r6)
            return
        L39:
            com.google.android.gms.internal.ads.rj0 r3 = r6.f7457f     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L44
            com.google.android.gms.internal.ads.qj0 r3 = r6.f7460j     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.qp0 r4 = r6.f7461k     // Catch: java.lang.Throwable -> L18
            c(r4)     // Catch: java.lang.Throwable -> L18
        L44:
            r6.f7458g = r1     // Catch: java.lang.Throwable -> L18
            r6.f7457f = r7     // Catch: java.lang.Throwable -> L18
            r6.f7461k = r8     // Catch: java.lang.Throwable -> L18
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L18
            r7 = 1
            boolean r8 = e(r7)     // Catch: java.lang.Throwable -> L8c
            if (r8 != 0) goto L81
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r8 = r6.f7456d     // Catch: java.lang.Throwable -> L73
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L73
            r3 = r0
        L5a:
            if (r3 >= r1) goto L7c
            java.lang.Object r4 = r8.get(r3)     // Catch: java.lang.Throwable -> L73
            int r3 = r3 + 1
            com.google.android.gms.internal.ads.qp0 r4 = (com.google.android.gms.internal.ads.qp0) r4     // Catch: java.lang.Throwable -> L73
            java.util.HashMap r5 = r6.f7453a     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L75
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L73
            goto L76
        L73:
            r7 = move-exception
            goto L7f
        L75:
            r4 = r2
        L76:
            int r5 = r6.f7458g     // Catch: java.lang.Throwable -> L73
            if (r4 >= r5) goto L5a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8c
            goto L81
        L7c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            goto L83
        L7f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L73
            throw r7     // Catch: java.lang.Throwable -> L8c
        L81:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            r0 = r7
        L83:
            if (r0 != 0) goto L8a
            f()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r6)
            return
        L8a:
            monitor-exit(r6)
            return
        L8c:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8c
            throw r7     // Catch: java.lang.Throwable -> L18
        L8f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8f
            throw r7     // Catch: java.lang.Throwable -> L18
        L92:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj0.b(com.google.android.gms.internal.ads.rj0, com.google.android.gms.internal.ads.qp0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:5:0x0010, B:8:0x0017, B:10:0x001a, B:32:0x004f, B:34:0x0057, B:42:0x0053, B:46:0x0060, B:52:0x0065, B:7:0x0011, B:13:0x001c, B:15:0x0022, B:25:0x004c, B:31:0x004e, B:41:0x0052), top: B:3:0x0002, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(com.google.android.gms.internal.ads.qp0 r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r6.f7462l = r0     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r1 = r6.f7456d     // Catch: java.lang.Throwable -> L5c
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            java.util.HashSet r1 = e     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r7.f9959t0     // Catch: java.lang.Throwable -> L5c
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.d91 r7 = r6.f7455c     // Catch: java.lang.Throwable -> L63
            boolean r7 = r7.isDone()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            if (r7 != 0) goto L61
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            r7 = 1
            boolean r1 = e(r7)     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L53
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r1 = r6.f7456d     // Catch: java.lang.Throwable -> L43
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L43
            r3 = r0
        L2a:
            if (r3 >= r2) goto L4e
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L43
            int r3 = r3 + 1
            com.google.android.gms.internal.ads.qp0 r4 = (com.google.android.gms.internal.ads.qp0) r4     // Catch: java.lang.Throwable -> L43
            java.util.HashMap r5 = r6.f7453a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L45
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L43
            goto L48
        L43:
            r7 = move-exception
            goto L51
        L45:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L48:
            int r5 = r6.f7458g     // Catch: java.lang.Throwable -> L43
            if (r4 >= r5) goto L2a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            goto L53
        L4e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            goto L55
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L5e
        L53:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            r0 = r7
        L55:
            if (r0 != 0) goto L61
            f()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r6)
            return
        L5c:
            r7 = move-exception
            goto L66
        L5e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            throw r7     // Catch: java.lang.Throwable -> L5c
        L61:
            monitor-exit(r6)
            return
        L63:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7     // Catch: java.lang.Throwable -> L5c
        L66:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj0.c(com.google.android.gms.internal.ads.qp0):void");
    }

    public final synchronized boolean d() {
        if (this.f7462l) {
            return false;
        }
        ArrayList arrayList = this.f7454b;
        if (!arrayList.isEmpty() && ((qp0) arrayList.get(0)).f9963v0 && !this.f7456d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f7455c.isDone()) {
                ArrayList arrayList2 = this.f7456d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z3) {
        int i;
        try {
            ArrayList arrayList = this.f7454b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                qp0 qp0Var = (qp0) obj;
                Integer num = (Integer) this.f7453a.get(qp0Var);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                if (z3 || !this.e.contains(qp0Var.f9959t0)) {
                    int i11 = this.f7458g;
                    if (i < i11) {
                        return true;
                    }
                    if (i > i11) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        qj0 qj0Var = this.f7460j;
        qp0 qp0Var = this.f7461k;
        synchronized (qj0Var) {
            try {
                qj0Var.f9853a.getClass();
                qj0Var.f9859h = SystemClock.elapsedRealtime() - qj0Var.i;
                if (qp0Var != null) {
                    qj0Var.f9857f.a(qp0Var);
                }
                qj0Var.f9858g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        rj0 rj0Var = this.f7457f;
        d91 d91Var = this.f7455c;
        if (rj0Var != null) {
            d91Var.d(rj0Var);
        } else {
            d91Var.e(new cg0(3, this.f7459h));
        }
    }
}
