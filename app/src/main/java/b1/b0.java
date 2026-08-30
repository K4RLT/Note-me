package b1;
import b0.b;
import n.c0;
import n.i0;
import p.f;
import s.d;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import r0.n1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f1307a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1309c;

    /* renamed from: h, reason: collision with root package name */
    public h f1313h;
    public a0 i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1308b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final a1.a f1310d = new a1.a(2, this);
    public final a1.f e = new a1.f(3, this);

    /* renamed from: f, reason: collision with root package name */
    public final t0.e f1311f = new t0.e(new a0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f1312g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f1314j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(df.l lVar) {
        this.f1307a = (kotlin.jvm.internal.m) lVar;
    }

    public final void a() {
        synchronized (this.f1312g) {
            t0.e eVar = this.f1311f;
            Object[] objArr = eVar.f25617u;
            int i = eVar.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                a0 a0Var = (a0) objArr[i10];
                a0Var.e.a();
                a0Var.f1299f.a();
                a0Var.f1303k.a();
                a0Var.f1304l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:8:0x0011, B:11:0x007a, B:13:0x0082, B:15:0x0092, B:17:0x0087, B:20:0x0022, B:23:0x002e, B:25:0x0043, B:27:0x0051, B:29:0x005b, B:31:0x0066, B:38:0x0073, B:41:0x0098), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.f1312g
            monitor-enter(r2)
            t0.e r3 = r1.f1311f     // Catch: java.lang.Throwable -> L90
            int r4 = r3.f25619w     // Catch: java.lang.Throwable -> L90
            r6 = 0
            r7 = 0
        Ld:
            java.lang.Object[] r8 = r3.f25617u
            if (r6 >= r4) goto L98
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L90
            b1.a0 r8 = (b1.a0) r8     // Catch: java.lang.Throwable -> L90
            i0 r9 = r8.f1299f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L90
            c0 r9 = (c0) r9     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f20850b     // Catch: java.lang.Throwable -> L90
            int[] r11 = r9.f20851c     // Catch: java.lang.Throwable -> L90
            long[] r9 = r9.f20849a     // Catch: java.lang.Throwable -> L90
            int r12 = r9.length     // Catch: java.lang.Throwable -> L90
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L90
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L90
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L90
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L90
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L90
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L90
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            i0 r1 = r8.f1299f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            int r7 = r7 + 1
            goto L92
        L85:
            if (r7 <= 0) goto L92
            java.lang.Object[] r1 = r3.f25617u     // Catch: java.lang.Throwable -> L90
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L90
            r1[r6] = r5     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La2
        L92:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L98:
            int r0 = r4 - r7
            r1 = 0
            java.util.Arrays.fill(r8, r0, r4, r1)     // Catch: java.lang.Throwable -> L90
            r3.f25619w = r0     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La2:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.b(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        boolean z3;
        Set set;
        Set set2;
        synchronized (this.f1312g) {
            z3 = this.f1309c;
        }
        if (z3) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            AtomicReference atomicReference = this.f1308b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                } else {
                    r0.d("Unexpected notification");
                    l4.a.p();
                    return false;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z9;
            }
            synchronized (this.f1312g) {
                t0.e eVar = this.f1311f;
                Object[] objArr = eVar.f25617u;
                int i = eVar.f25619w;
                for (int i10 = 0; i10 < i; i10++) {
                    if (!((a0) objArr[i10]).b(set) && !z9) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                }
            }
        }
    }

    public final void d(Object obj, df.l lVar, df.a aVar) {
        Object obj2;
        a0 a0Var;
        synchronized (this.f1312g) {
            t0.e eVar = this.f1311f;
            Object[] objArr = eVar.f25617u;
            int i = eVar.f25619w;
            int i10 = 0;
            while (true) {
                if (i10 < i) {
                    obj2 = objArr[i10];
                    if (((a0) obj2).f1295a == lVar) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            a0Var = (a0) obj2;
            if (a0Var == null) {
                lVar.getClass();
                kotlin.jvm.internal.b(1, lVar);
                a0Var = new a0(lVar);
                eVar.b(a0Var);
            }
        }
        a0 a0Var2 = this.i;
        long j10 = this.f1314j;
        if (j10 != -1 && j10 != z0.h.b()) {
            n1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + z0.h.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = a0Var;
            this.f1314j = z0.h.b();
            a0Var.a(obj, this.e, aVar);
        } finally {
            this.i = a0Var2;
            this.f1314j = j10;
        }
    }

    public final void e() {
        a1.a aVar = this.f1310d;
        f(p.f1385a);
        synchronized (p.f1387c) {
            p.f1391h = qe.l.F((Collection) p.f1391h, aVar);
        }
        this.f1313h = new h(0, aVar);
    }
}
