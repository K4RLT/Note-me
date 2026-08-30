package i5;
import a.a;
import c0.c;
import c0.e;
import c0.f;
import c0.g;
import q.q;
import q.x;

import g5.e0;
import g5.f0;
import ya.n9;

/* loaded from: classes.dex */
public final class c0 implements f0, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final eb.w f18224a;

    /* renamed from: b, reason: collision with root package name */
    public final h f18225b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18226c;

    /* renamed from: d, reason: collision with root package name */
    public final qe.j f18227d;
    public volatile boolean e;

    public c0(eb.w wVar, h hVar, boolean z3) {
        wVar.getClass();
        this.f18224a = wVar;
        this.f18225b = hVar;
        this.f18226c = z3;
        this.f18227d = new qe.j();
    }

    @Override // g5.f0
    public final Boolean a(te.c cVar) {
        boolean z3;
        if (!this.e) {
            a aVar = (a) cVar.getContext().L(this.f18224a);
            if (aVar != null && aVar.f18208v == this) {
                if (this.f18227d.isEmpty() && !this.f18225b.f18244u.J()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            }
            n9.b(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        n9.b(21, "Connection is recycled");
        throw null;
    }

    @Override // i5.d0
    public final p5.a b() {
        return this.f18225b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // g5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, df.l r8, ve.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof i5.b0
            if (r0 == 0) goto L13
            r0 = r9
            i5.b0 r0 = (i5.b0) r0
            int r1 = r0.f18220z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18220z = r1
            goto L18
        L13:
            i5.b0 r0 = new i5.b0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f18218x
            ue.a r1 = ue.a.f27192u
            int r2 = r0.f18220z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            i5.h r7 = r0.f18217w
            df.l r8 = r0.f18216v
            java.lang.String r0 = r0.f18215u
            pe.a.e(r9)
            r9 = r7
            r7 = r0
            goto L65
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L37:
            pe.a.e(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8e
            te.g r9 = r0.getContext()
            eb.w r5 = r6.f18224a
            te.e r9 = r9.L(r5)
            i5.a r9 = (i5.a) r9
            if (r9 == 0) goto L88
            i5.c0 r9 = r9.f18208v
            if (r9 != r6) goto L88
            i5.h r9 = r6.f18225b
            r0.f18215u = r7
            r0.f18216v = r8
            r0.f18217w = r9
            r0.f18220z = r3
            yf.a r2 = r9.f18245v
            java.lang.Object r0 = r2.f(r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            i5.w r0 = new i5.w     // Catch: java.lang.Throwable -> L7b
            i5.h r1 = r6.f18225b     // Catch: java.lang.Throwable -> L7b
            p5.c r7 = r1.T(r7)     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7d
            ug.a.b(r0, r4)     // Catch: java.lang.Throwable -> L7b
            r9.j(r4)
            return r7
        L7b:
            r7 = move-exception
            goto L84
        L7d:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L7f
        L7f:
            r8 = move-exception
            ug.a.b(r0, r7)     // Catch: java.lang.Throwable -> L7b
            throw r8     // Catch: java.lang.Throwable -> L7b
        L84:
            r9.j(r4)
            throw r7
        L88:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            ya.n9.b(r2, r7)
            throw r4
        L8e:
            java.lang.String r7 = "Connection is recycled"
            ya.n9.b(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.c(java.lang.String, df.l, ve.c):java.lang.Object");
    }

    @Override // g5.f0
    public final Object d(e0 e0Var, df.p pVar, ve.i iVar) {
        if (!this.e) {
            a aVar = (a) iVar.getContext().L(this.f18224a);
            if (aVar != null && aVar.f18208v == this) {
                return g(e0Var, pVar, iVar);
            }
            n9.b(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        n9.b(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004e, B:14:0x0056, B:19:0x0061, B:20:0x0090, B:24:0x0069, B:25:0x006f, B:26:0x0070, B:27:0x0076, B:28:0x007c), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004e, B:14:0x0056, B:19:0x0061, B:20:0x0090, B:24:0x0069, B:25:0x006f, B:26:0x0070, B:27:0x0076, B:28:0x007c), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(g5.e0 r8, ve.c r9) {
        /*
            r7 = this;
            qe.j r0 = r7.f18227d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof i5.y
            if (r2 == 0) goto L17
            r2 = r9
            i5.y r2 = (i5.y) r2
            int r3 = r2.f18312y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18312y = r3
            goto L1c
        L17:
            i5.y r2 = new i5.y
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f18310w
            int r3 = r2.f18312y
            r4 = 1
            i5.h r5 = r7.f18225b
            if (r3 == 0) goto L38
            if (r3 != r4) goto L31
            i5.h r8 = r2.f18309v
            g5.e0 r2 = r2.f18308u
            pe.a.e(r9)
            r9 = r8
            r8 = r2
            goto L4d
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L38:
            pe.a.e(r9)
            r2.f18308u = r8
            r2.f18309v = r5
            r2.f18312y = r4
            yf.a r9 = r5.f18245v
            java.lang.Object r9 = r9.f(r2)
            ue.a r2 = ue.a.f27192u
            if (r9 != r2) goto L4c
            return r2
        L4c:
            r9 = r5
        L4d:
            r2 = 0
            int r3 = r0.f24021w     // Catch: java.lang.Throwable -> L67
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L7c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto L76
            if (r8 == r4) goto L70
            r1 = 2
            if (r8 != r1) goto L69
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            ya.n9.a(r5, r8)     // Catch: java.lang.Throwable -> L67
            goto L90
        L67:
            r8 = move-exception
            goto L9e
        L69:
            ab.b r8 = new ab.b     // Catch: java.lang.Throwable -> L67
            r0 = 0
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L67
            throw r8     // Catch: java.lang.Throwable -> L67
        L70:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            ya.n9.a(r5, r8)     // Catch: java.lang.Throwable -> L67
            goto L90
        L76:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            ya.n9.a(r5, r8)     // Catch: java.lang.Throwable -> L67
            goto L90
        L7c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r8.append(r3)     // Catch: java.lang.Throwable -> L67
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L67
            ya.n9.a(r5, r8)     // Catch: java.lang.Throwable -> L67
        L90:
            i5.x r8 = new i5.x     // Catch: java.lang.Throwable -> L67
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L67
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L67
            pe.z r8 = pe.z.f22715a     // Catch: java.lang.Throwable -> L67
            r9.j(r2)
            return r8
        L9e:
            r9.j(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e(g5.e0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x004e, B:14:0x0054, B:16:0x005e, B:18:0x0067, B:19:0x00a4, B:23:0x006f, B:24:0x0084, B:26:0x008a, B:27:0x0090, B:28:0x00aa, B:29:0x00b1), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x004e, B:14:0x0054, B:16:0x005e, B:18:0x0067, B:19:0x00a4, B:23:0x006f, B:24:0x0084, B:26:0x008a, B:27:0x0090, B:28:0x00aa, B:29:0x00b1), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r8, ve.c r9) {
        /*
            r7 = this;
            qe.j r0 = r7.f18227d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r9 instanceof i5.z
            if (r3 == 0) goto L19
            r3 = r9
            i5.z r3 = (i5.z) r3
            int r4 = r3.f18317y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f18317y = r4
            goto L1e
        L19:
            i5.z r3 = new i5.z
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.f18315w
            int r4 = r3.f18317y
            r5 = 1
            i5.h r6 = r7.f18225b
            if (r4 == 0) goto L38
            if (r4 != r5) goto L31
            boolean r8 = r3.f18313u
            i5.h r3 = r3.f18314v
            pe.a.e(r9)
            goto L4d
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L38:
            pe.a.e(r9)
            r3.f18314v = r6
            r3.f18313u = r8
            r3.f18317y = r5
            yf.a r9 = r6.f18245v
            java.lang.Object r9 = r9.f(r3)
            ue.a r3 = ue.a.f27192u
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r3 = r6
        L4d:
            r9 = 0
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto Laa
            java.lang.Object r4 = qe.q(r0)     // Catch: java.lang.Throwable -> L6d
            i5.x r4 = (i5.x) r4     // Catch: java.lang.Throwable -> L6d
            r5 = 39
            if (r8 == 0) goto L84
            r4.getClass()     // Catch: java.lang.Throwable -> L6d
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L6f
            java.lang.String r8 = "END TRANSACTION"
            ya.n9.a(r6, r8)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L6d:
            r8 = move-exception
            goto Lb2
        L6f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.f18307a     // Catch: java.lang.Throwable -> L6d
            r8.append(r0)     // Catch: java.lang.Throwable -> L6d
            r8.append(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6d
            ya.n9.a(r6, r8)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L84:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L90
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            ya.n9.a(r6, r8)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L90:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.f18307a     // Catch: java.lang.Throwable -> L6d
            r8.append(r0)     // Catch: java.lang.Throwable -> L6d
            r8.append(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6d
            ya.n9.a(r6, r8)     // Catch: java.lang.Throwable -> L6d
        La4:
            pe.z r8 = pe.z.f22715a     // Catch: java.lang.Throwable -> L6d
            r3.j(r9)
            return r8
        Laa:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8     // Catch: java.lang.Throwable -> L6d
        Lb2:
            r3.j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.f(boolean, ve.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(1:(2:12|(1:(2:15|16)(3:18|19|20))(2:21|22))(2:23|24))(5:25|26|(1:28)|29|(1:32)(1:31)))(1:34))(3:38|(1:40)|41)|35|(4:37|(0)|29|(0))|32))|55|6|7|(0)(0)|35|(0)|32|(3:(0)|(1:47)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (e(r9, r0) == r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if (f(false, r0) != r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0042, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
    
        if (r10 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        pe.a(r10, r11);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        throw r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [df.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, i5.c0] */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(g5.e0 r9, df.p r10, ve.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof i5.a0
            if (r0 == 0) goto L13
            r0 = r11
            i5.a0 r0 = (i5.a0) r0
            int r1 = r0.f18214z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18214z = r1
            goto L18
        L13:
            i5.a0 r0 = new i5.a0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f18212x
            int r1 = r0.f18214z
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            ue.a r7 = ue.a.f27192u
            if (r1 == 0) goto L62
            if (r1 == r6) goto L59
            if (r1 == r5) goto L50
            if (r1 == r4) goto L4a
            r9 = 4
            if (r1 == r9) goto L44
            if (r1 == r3) goto L37
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L37:
            java.lang.Throwable r9 = r0.f18210v
            java.lang.Object r10 = r0.f18209u
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            pe.a.e(r11)     // Catch: android.database.SQLException -> L42
            goto Lac
        L42:
            r11 = move-exception
            goto La7
        L44:
            java.lang.Object r9 = r0.f18209u
            pe.a.e(r11)
            return r9
        L4a:
            java.lang.Object r9 = r0.f18209u
            pe.a.e(r11)
            return r9
        L50:
            int r9 = r0.f18211w
            pe.a.e(r11)     // Catch: java.lang.Throwable -> L56
            goto L89
        L56:
            r9 = move-exception
            r10 = r9
            goto L98
        L59:
            java.lang.Object r9 = r0.f18209u
            r10 = r9
            df.p r10 = (df.p) r10
            pe.a.e(r11)
            goto L74
        L62:
            pe.a.e(r11)
            if (r9 != 0) goto L69
            g5.e0 r9 = g5.e0.f17434u
        L69:
            r0.f18209u = r10
            r0.f18214z = r6
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r7) goto L74
            goto La6
        L74:
            i5.l r9 = new i5.l     // Catch: java.lang.Throwable -> L56
            r11 = 1
            r9.<init>(r11, r8)     // Catch: java.lang.Throwable -> L56
            r11 = 0
            r0.f18209u = r11     // Catch: java.lang.Throwable -> L56
            r0.f18211w = r6     // Catch: java.lang.Throwable -> L56
            r0.f18214z = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L56
            if (r11 != r7) goto L88
            goto La6
        L88:
            r9 = r6
        L89:
            if (r9 == 0) goto L8c
            r2 = r6
        L8c:
            r0.f18209u = r11
            r0.f18214z = r4
            java.lang.Object r9 = r8.f(r2, r0)
            if (r9 != r7) goto L97
            goto La6
        L97:
            return r11
        L98:
            throw r10     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            r0.f18209u = r10     // Catch: android.database.SQLException -> L42
            r0.f18210v = r9     // Catch: android.database.SQLException -> L42
            r0.f18214z = r3     // Catch: android.database.SQLException -> L42
            java.lang.Object r10 = r8.f(r2, r0)     // Catch: android.database.SQLException -> L42
            if (r10 != r7) goto Lac
        La6:
            return r7
        La7:
            if (r10 == 0) goto Lad
            pe.a(r10, r11)
        Lac:
            throw r9
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.g(g5.e0, df.p, ve.c):java.lang.Object");
    }
}
