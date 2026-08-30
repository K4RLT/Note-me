package i5;
import b0.q;
import m.c;
import m.e;
import q.x;
import v.a;
import v.b;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f18297a;

    /* renamed from: b, reason: collision with root package name */
    public final df.a f18298b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f18299c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f18300d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final h[] f18301f;

    /* renamed from: g, reason: collision with root package name */
    public final yf.h f18302g;

    /* renamed from: h, reason: collision with root package name */
    public final qe.j f18303h;

    /* JADX WARN: Type inference failed for: r3v4, types: [yf.g, yf.h] */
    public v(int i, df.a aVar) {
        this.f18297a = i;
        this.f18298b = aVar;
        this.f18301f = new h[i];
        int i10 = yf.i.f31651a;
        this.f18302g = new yf.g(i, 0);
        this.f18303h = new qe.j(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0061, code lost:
    
        r1.h(r4, r3.f31650v);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c1), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c1), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ve.c r7) {
        /*
            r6 = this;
            qe.j r0 = r6.f18303h
            boolean r1 = r7 instanceof i5.t
            if (r1 == 0) goto L15
            r1 = r7
            i5.t r1 = (i5.t) r1
            int r2 = r1.f18290w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f18290w = r2
            goto L1a
        L15:
            i5.t r1 = new i5.t
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f18288u
            int r2 = r1.f18290w
            yf.h r3 = r6.f18302g
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            pe.a.e(r7)
            goto L7b
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L30:
            pe.a.e(r7)
            r1.f18290w = r4
            r3.getClass()
            int r7 = r3.f31649u
        L3a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = yf.g.A
            int r2 = r2.getAndDecrement(r3)
            if (r2 > r7) goto L3a
            pe.z r4 = pe.z.f22715a
            ue.a r5 = ue.a.f27192u
            if (r2 <= 0) goto L49
            goto L78
        L49:
            te.c r1 = ya.rc.b(r1)
            pf.l r1 = pf.q(r1)
            boolean r2 = r3.a(r1)     // Catch: java.lang.Throwable -> Lca
            if (r2 != 0) goto L6d
        L57:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = yf.g.A     // Catch: java.lang.Throwable -> Lca
            int r2 = r2.getAndDecrement(r3)     // Catch: java.lang.Throwable -> Lca
            if (r2 > r7) goto L57
            if (r2 <= 0) goto L67
            b8.e8 r7 = r3.f31650v     // Catch: java.lang.Throwable -> Lca
            r1.h(r4, r7)     // Catch: java.lang.Throwable -> Lca
            goto L6d
        L67:
            boolean r2 = r3.a(r1)     // Catch: java.lang.Throwable -> Lca
            if (r2 == 0) goto L57
        L6d:
            java.lang.Object r7 = r1.r()
            if (r7 != r5) goto L74
            goto L75
        L74:
            r7 = r4
        L75:
            if (r7 != r5) goto L78
            r4 = r7
        L78:
            if (r4 != r5) goto L7b
            return r5
        L7b:
            java.util.concurrent.locks.ReentrantLock r7 = r6.f18299c     // Catch: java.lang.Throwable -> Lb5
            r7.lock()     // Catch: java.lang.Throwable -> Lb5
            boolean r1 = r6.e     // Catch: java.lang.Throwable -> Lb7
            if (r1 != 0) goto Lb9
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb7
            if (r1 == 0) goto Lab
            int r1 = r6.f18300d     // Catch: java.lang.Throwable -> Lb7
            int r2 = r6.f18297a     // Catch: java.lang.Throwable -> Lb7
            if (r1 < r2) goto L91
            goto Lab
        L91:
            i5.h r1 = new i5.h     // Catch: java.lang.Throwable -> Lb7
            df.a r2 = r6.f18298b     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> Lb7
            p5.a r2 = (p5.a) r2     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb7
            i5.h[] r2 = r6.f18301f     // Catch: java.lang.Throwable -> Lb7
            int r4 = r6.f18300d     // Catch: java.lang.Throwable -> Lb7
            int r5 = r4 + 1
            r6.f18300d = r5     // Catch: java.lang.Throwable -> Lb7
            r2[r4] = r1     // Catch: java.lang.Throwable -> Lb7
            r0.addLast(r1)     // Catch: java.lang.Throwable -> Lb7
        Lab:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> Lb7
            i5.h r0 = (i5.h) r0     // Catch: java.lang.Throwable -> Lb7
            r7.unlock()     // Catch: java.lang.Throwable -> Lb5
            return r0
        Lb5:
            r7 = move-exception
            goto Lc6
        Lb7:
            r0 = move-exception
            goto Lc2
        Lb9:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            ya.n9.b(r1, r0)     // Catch: java.lang.Throwable -> Lb7
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lb7
        Lc2:
            r7.unlock()     // Catch: java.lang.Throwable -> Lb5
            throw r0     // Catch: java.lang.Throwable -> Lb5
        Lc6:
            r3.b()
            throw r7
        Lca:
            r7 = move-exception
            r1.A()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.a(ve.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:38)(2:35|(1:37)))(1:16)|17|18|19|20|(3:22|23|(1:25)(10:27|12|13|14|(0)(0)|17|18|19|20|(2:28|29)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r13 = r13;
        r12 = r12;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:14:0x007f, B:16:0x0083, B:35:0x008b, B:38:0x0092), top: B:13:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:20:0x003d, B:22:0x0056, B:28:0x006b, B:29:0x0072), top: B:19:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:20:0x003d, B:22:0x0056, B:28:0x006b, B:29:0x0072), top: B:19:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v11, types: [df.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0064 -> B:12:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, i5.d r12, ve.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof i5.u
            if (r0 == 0) goto L13
            r0 = r13
            i5.u r0 = (i5.u) r0
            int r1 = r0.f18296z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18296z = r1
            goto L18
        L13:
            i5.u r0 = new i5.u
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f18294x
            int r1 = r0.f18296z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            long r10 = r0.f18291u
            kotlin.jvm.internal.y r12 = r0.f18293w
            df.a r1 = r0.f18292v
            pe.a.e(r13)     // Catch: java.lang.Throwable -> L2c
            goto L66
        L2c:
            r13 = move-exception
            goto L7a
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r10)
            r10 = 0
            return r10
        L35:
            pe.a.e(r13)
        L38:
            kotlin.jvm.internal.y r13 = new kotlin.jvm.internal.y
            r13.<init>()
            a6.f r1 = new a6.f     // Catch: java.lang.Throwable -> L78
            r4 = 16
            r1.<init>(r13, r9, r3, r4)     // Catch: java.lang.Throwable -> L78
            r0.f18292v = r12     // Catch: java.lang.Throwable -> L78
            r0.f18293w = r13     // Catch: java.lang.Throwable -> L78
            r0.f18291u = r10     // Catch: java.lang.Throwable -> L78
            r0.f18296z = r2     // Catch: java.lang.Throwable -> L78
            long r4 = pf.b0.G(r10)     // Catch: java.lang.Throwable -> L78
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L6b
            pf.w1 r6 = new pf.w1     // Catch: java.lang.Throwable -> L78
            r6.<init>(r4, r0)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = pf.b0.E(r6, r1)     // Catch: java.lang.Throwable -> L78
            ue.a r4 = ue.a.f27192u
            if (r1 != r4) goto L64
            return r4
        L64:
            r1 = r12
            r12 = r13
        L66:
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r3
            goto L7f
        L6b:
            pf.v1 r1 = new pf.v1     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = "Timed out immediately"
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L73:
            r8 = r1
            r1 = r12
            r12 = r13
            r13 = r8
            goto L7a
        L78:
            r1 = move-exception
            goto L73
        L7a:
            r8 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r8
        L7f:
            boolean r4 = r0 instanceof pf.v1     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L89
            r12.invoke()     // Catch: java.lang.Throwable -> L87
            goto L90
        L87:
            r10 = move-exception
            goto L93
        L89:
            if (r0 != 0) goto L92
            java.lang.Object r13 = r13.f19787u     // Catch: java.lang.Throwable -> L87
            if (r13 == 0) goto L90
            return r13
        L90:
            r0 = r1
            goto L38
        L92:
            throw r0     // Catch: java.lang.Throwable -> L87
        L93:
            java.lang.Object r11 = r13.f19787u
            i5.h r11 = (i5.h) r11
            if (r11 == 0) goto L9c
            r9.e(r11)
        L9c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.b(long, i5.d, ve.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f18299c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (h hVar : this.f18301f) {
                if (hVar != null) {
                    hVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        String str;
        qe.j jVar = this.f18303h;
        ReentrantLock reentrantLock = this.f18299c;
        reentrantLock.lock();
        try {
            re.b e = qe.e();
            int i = jVar.f24021w;
            for (int i10 = 0; i10 < i; i10++) {
                e.add(jVar.get(i10));
            }
            re.b c10 = qe.c(e);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f18297a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            yf.h hVar = this.f18302g;
            hVar.getClass();
            sb3.append(Math.max(yf.g.A.get(hVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + c10.a() + ")[" + qe.l.B(c10, null, null, null, null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            int i11 = 0;
            for (h hVar2 : this.f18301f) {
                i11++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i11);
                sb4.append("] - ");
                if (hVar2 != null) {
                    str = hVar2.f18244u.toString();
                } else {
                    str = null;
                }
                sb4.append(str);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (hVar2 != null) {
                    hVar2.k(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(h hVar) {
        hVar.getClass();
        ReentrantLock reentrantLock = this.f18299c;
        reentrantLock.lock();
        try {
            this.f18303h.addLast(hVar);
            reentrantLock.unlock();
            this.f18302g.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
