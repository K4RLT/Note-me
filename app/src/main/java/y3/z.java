package y3;
import x.o;
import x.p;
import a.a;
import l.f;
import q.x;
import z.b;
import z.d;
import z.e;
import z.g;
import z.h;
import z.i;
import z.j;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p.c0;
import pf.d1;
import r.m1;
import sf.e0;
import sf.n0;
import ya.jb;

/* loaded from: classes.dex */
public final class z implements f {

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashSet f30898j = new LinkedHashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f30899k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final df.a f30900a;

    /* renamed from: b, reason: collision with root package name */
    public final i f30901b;

    /* renamed from: c, reason: collision with root package name */
    public final b f30902c;

    /* renamed from: d, reason: collision with root package name */
    public final f6.h f30903d;
    public final String e = ".tmp";

    /* renamed from: f, reason: collision with root package name */
    public final pe.n f30904f = new pe.n(new m1(8, this));

    /* renamed from: g, reason: collision with root package name */
    public final n0 f30905g = e0.b(b0.f30823a);

    /* renamed from: h, reason: collision with root package name */
    public List f30906h;
    public final j6.i i;

    /* JADX WARN: Type inference failed for: r2v7, types: [j6.i, java.lang.Object] */
    public z(df.a aVar, i iVar, List list, b bVar, pf.z zVar) {
        this.f30900a = aVar;
        this.f30901b = iVar;
        this.f30902c = bVar;
        te.c cVar = null;
        this.f30903d = new f6.h(new n(this, cVar, 1));
        this.f30906h = qe.l.P(list);
        c0 c0Var = new c0(12, this);
        n nVar = new n(this, cVar, 0);
        Object obj = new Object();
        obj.f18924u = zVar;
        obj.f18925v = nVar;
        obj.f18926w = jb.a(Integer.MAX_VALUE, 6, null);
        obj.f18927x = new AtomicInteger(0);
        d1 d1Var = (d1) zVar.A().L(pf.w.f22803v);
        if (d1Var != null) {
            d1Var.p(new k0.w(c0Var, 29, obj));
        }
        this.i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r8 != r5) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /* JADX WARN: Type inference failed for: r1v10, types: [df.p, ve.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [df.p, ve.i] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(y3.z r8, y3.k r9, ve.c r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.b(y3.z, y3.k, ve.c):java.lang.Object");
    }

    @Override // y3.f
    public final Object a(df.p pVar, ve.c cVar) {
        pf.q a10 = pf.a();
        this.i.j(new k(pVar, a10, (a0) this.f30905g.getValue(), cVar.getContext()));
        return a10.t(cVar);
    }

    public final File c() {
        return (File) this.f30904f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v9, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ve.c r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.d(ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ve.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof y3.t
            if (r0 == 0) goto L13
            r0 = r5
            y3.t r0 = (y3.t) r0
            int r1 = r0.f30871x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30871x = r1
            goto L18
        L13:
            y3.t r0 = new y3.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30869v
            int r1 = r0.f30871x
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            y3.z r0 = r0.f30868u
            pe.a.e(r5)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r5 = move-exception
            goto L45
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L30:
            pe.a.e(r5)
            r0.f30868u = r4     // Catch: java.lang.Throwable -> L43
            r0.f30871x = r2     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L43
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L40
            return r0
        L40:
            pe.z r5 = pe.z.f22715a
            return r5
        L43:
            r5 = move-exception
            r0 = r4
        L45:
            sf.n0 r0 = r0.f30905g
            y3.h r1 = new y3.h
            r1.<init>(r5)
            r0.getClass()
            r2 = 0
            r0.k(r2, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.e(ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ve.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof y3.u
            if (r0 == 0) goto L13
            r0 = r5
            y3.u r0 = (y3.u) r0
            int r1 = r0.f30875x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30875x = r1
            goto L18
        L13:
            y3.u r0 = new y3.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30873v
            int r1 = r0.f30875x
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            y3.z r0 = r0.f30872u
            pe.a.e(r5)     // Catch: java.lang.Throwable -> L27
            goto L50
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L30:
            pe.a.e(r5)
            r0.f30872u = r4     // Catch: java.lang.Throwable -> L40
            r0.f30875x = r2     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L40
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L50
            return r0
        L40:
            r5 = move-exception
            r0 = r4
        L42:
            sf.n0 r0 = r0.f30905g
            y3.h r1 = new y3.h
            r1.<init>(r5)
            r0.getClass()
            r5 = 0
            r0.k(r5, r1)
        L50:
            pe.z r5 = pe.z.f22715a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.f(ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [y3.z] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [y3.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [y3.z] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ve.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof y3.v
            if (r0 == 0) goto L13
            r0 = r5
            y3.v r0 = (y3.v) r0
            int r1 = r0.f30880y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30880y = r1
            goto L18
        L13:
            y3.v r0 = new y3.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30878w
            int r1 = r0.f30880y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.io.FileInputStream r1 = r0.f30877v
            y3.z r0 = r0.f30876u
            pe.a.e(r5)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r5 = move-exception
            goto L59
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L32:
            pe.a.e(r5)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5f
            java.io.File r5 = r4.c()     // Catch: java.io.FileNotFoundException -> L5f
            r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L5f
            y3.i r5 = r4.f30901b     // Catch: java.lang.Throwable -> L57
            r0.f30876u = r4     // Catch: java.lang.Throwable -> L57
            r0.f30877v = r1     // Catch: java.lang.Throwable -> L57
            r0.f30880y = r2     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c(r1)     // Catch: java.lang.Throwable -> L57
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L4f
            return r0
        L4f:
            r0 = r4
        L50:
            r2 = 0
            pa.a(r1, r2)     // Catch: java.io.FileNotFoundException -> L55
            return r5
        L55:
            r5 = move-exception
            goto L61
        L57:
            r5 = move-exception
            r0 = r4
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r2 = move-exception
            pa.a(r1, r5)     // Catch: java.io.FileNotFoundException -> L55
            throw r2     // Catch: java.io.FileNotFoundException -> L55
        L5f:
            r5 = move-exception
            r0 = r4
        L61:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L72
            y3.i r5 = r0.f30901b
            java.lang.Object r5 = r5.a()
            return r5
        L72:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.g(ve.c):java.lang.Object");
    }

    @Override // y3.f
    public final sf.g getData() {
        return this.f30903d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ve.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof y3.w
            if (r0 == 0) goto L13
            r0 = r8
            y3.w r0 = (y3.w) r0
            int r1 = r0.f30885y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30885y = r1
            goto L18
        L13:
            y3.w r0 = new y3.w
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f30883w
            int r1 = r0.f30885y
            r2 = 3
            r3 = 2
            r4 = 1
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L52
            if (r1 == r4) goto L48
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L35
            java.lang.Object r1 = r0.f30882v
            java.lang.Object r0 = r0.f30881u
            y3.a r0 = (y3.a) r0
            pe.a.e(r8)     // Catch: java.io.IOException -> L33
            return r1
        L33:
            r8 = move-exception
            goto L86
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L3c:
            java.lang.Object r1 = r0.f30882v
            y3.a r1 = (y3.a) r1
            java.lang.Object r3 = r0.f30881u
            y3.z r3 = (y3.z) r3
            pe.a.e(r8)
            goto L76
        L48:
            java.lang.Object r1 = r0.f30881u
            y3.z r1 = (y3.z) r1
            pe.a.e(r8)     // Catch: y3.a -> L50
            return r8
        L50:
            r8 = move-exception
            goto L63
        L52:
            pe.a.e(r8)
            r0.f30881u = r7     // Catch: y3.a -> L61
            r0.f30885y = r4     // Catch: y3.a -> L61
            java.lang.Object r8 = r7.g(r0)     // Catch: y3.a -> L61
            if (r8 != r5) goto L60
            goto L82
        L60:
            return r8
        L61:
            r8 = move-exception
            r1 = r7
        L63:
            y3.b r4 = r1.f30902c
            r0.f30881u = r1
            r0.f30882v = r8
            r0.f30885y = r3
            java.lang.Object r3 = r4.h(r8)
            if (r3 != r5) goto L72
            goto L82
        L72:
            r6 = r1
            r1 = r8
            r8 = r3
            r3 = r6
        L76:
            r0.f30881u = r1     // Catch: java.io.IOException -> L84
            r0.f30882v = r8     // Catch: java.io.IOException -> L84
            r0.f30885y = r2     // Catch: java.io.IOException -> L84
            java.lang.Object r0 = r3.j(r8, r0)     // Catch: java.io.IOException -> L84
            if (r0 != r5) goto L83
        L82:
            return r5
        L83:
            return r8
        L84:
            r8 = move-exception
            r0 = r1
        L86:
            pe.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h(ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(df.p r11, te.g r12, ve.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof y3.x
            if (r0 == 0) goto L13
            r0 = r13
            y3.x r0 = (y3.x) r0
            int r1 = r0.f30891z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30891z = r1
            goto L18
        L13:
            y3.x r0 = new y3.x
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f30889x
            int r1 = r0.f30891z
            java.lang.String r2 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            ue.a r7 = ue.a.f27192u
            if (r1 == 0) goto L46
            if (r1 == r5) goto L3a
            if (r1 != r4) goto L33
            java.lang.Object r11 = r0.f30887v
            y3.z r12 = r0.f30886u
            pe.a.e(r13)
            goto La1
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r11)
            r11 = 0
            return r11
        L3a:
            java.lang.Object r11 = r0.f30888w
            java.lang.Object r12 = r0.f30887v
            y3.c r12 = (y3.c) r12
            y3.z r1 = r0.f30886u
            pe.a.e(r13)
            goto L7b
        L46:
            pe.a.e(r13)
            sf.n0 r13 = r10.f30905g
            java.lang.Object r13 = r13.getValue()
            y3.c r13 = (y3.c) r13
            java.lang.Object r1 = r13.f30824a
            if (r1 == 0) goto L5a
            int r1 = r1.hashCode()
            goto L5b
        L5a:
            r1 = r3
        L5b:
            int r8 = r13.f30825b
            if (r1 != r8) goto Lba
            java.lang.Object r1 = r13.f30824a
            l5.a r8 = new l5.a
            r9 = 25
            r8.<init>(r11, r1, r6, r9)
            r0.f30886u = r10
            r0.f30887v = r13
            r0.f30888w = r1
            r0.f30891z = r5
            java.lang.Object r11 = pf.b0.J(r12, r8, r0)
            if (r11 != r7) goto L77
            goto L9e
        L77:
            r12 = r13
            r13 = r11
            r11 = r1
            r1 = r10
        L7b:
            java.lang.Object r5 = r12.f30824a
            if (r5 == 0) goto L84
            int r5 = r5.hashCode()
            goto L85
        L84:
            r5 = r3
        L85:
            int r12 = r12.f30825b
            if (r5 != r12) goto Lb5
            boolean r12 = kotlin.jvm.internal.a(r11, r13)
            if (r12 == 0) goto L90
            return r11
        L90:
            r0.f30886u = r1
            r0.f30887v = r13
            r0.f30888w = r6
            r0.f30891z = r4
            java.lang.Object r11 = r1.j(r13, r0)
            if (r11 != r7) goto L9f
        L9e:
            return r7
        L9f:
            r11 = r13
            r12 = r1
        La1:
            sf.n0 r12 = r12.f30905g
            y3.c r13 = new y3.c
            if (r11 == 0) goto Lab
            int r3 = r11.hashCode()
        Lab:
            r13.<init>(r3, r11)
            r12.getClass()
            r12.k(r6, r13)
            return r11
        Lb5:
            x.o(r2)
            r11 = 0
            return r11
        Lba:
            x.o(r2)
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.i(df.p, te.g, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:15:0x0092, B:19:0x00a0, B:20:0x00b6, B:27:0x00be, B:28:0x00c1, B:24:0x00bc), top: B:7:0x0021, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r8, ve.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r9 instanceof y3.y
            if (r1 == 0) goto L15
            r1 = r9
            y3.y r1 = (y3.y) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            y3.y r1 = new y3.y
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f30896y
            int r2 = r1.A
            pe.z r3 = pe.z.f22715a
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L34
            java.io.FileOutputStream r8 = r1.f30895x
            java.io.FileOutputStream r2 = r1.f30894w
            java.io.File r4 = r1.f30893v
            y3.z r1 = r1.f30892u
            pe.a.e(r9)     // Catch: java.lang.Throwable -> L31
            goto L8a
        L31:
            r8 = move-exception
            goto Lbc
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
        L39:
            r8 = 0
            return r8
        L3b:
            pe.a.e(r9)
            java.io.File r9 = r7.c()
            java.io.File r2 = r9.getCanonicalFile()
            java.io.File r2 = r2.getParentFile()
            if (r2 != 0) goto L4d
            goto L56
        L4d:
            r2.mkdirs()
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto Lcd
        L56:
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.c()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r5 = r7.e
            java.lang.String r2 = kotlin.jvm.internal.f(r5, r2)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc2
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc2
            y3.i r5 = r7.f30901b     // Catch: java.lang.Throwable -> Lba
            y3.m r6 = new y3.m     // Catch: java.lang.Throwable -> Lba
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lba
            r1.f30892u = r7     // Catch: java.lang.Throwable -> Lba
            r1.f30893v = r9     // Catch: java.lang.Throwable -> Lba
            r1.f30894w = r2     // Catch: java.lang.Throwable -> Lba
            r1.f30895x = r2     // Catch: java.lang.Throwable -> Lba
            r1.A = r4     // Catch: java.lang.Throwable -> Lba
            r5.b(r8, r6)     // Catch: java.lang.Throwable -> Lba
            ue.a r8 = ue.a.f27192u
            if (r3 != r8) goto L87
            return r8
        L87:
            r1 = r7
            r4 = r9
            r8 = r2
        L8a:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L31
            r8.sync()     // Catch: java.lang.Throwable -> L31
            r8 = 0
            pa.a(r2, r8)     // Catch: java.io.IOException -> Lb7
            java.io.File r8 = r1.c()     // Catch: java.io.IOException -> Lb7
            boolean r8 = r4.renameTo(r8)     // Catch: java.io.IOException -> Lb7
            if (r8 == 0) goto La0
            return r3
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lb7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb7
            r9.<init>(r0)     // Catch: java.io.IOException -> Lb7
            r9.append(r4)     // Catch: java.io.IOException -> Lb7
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lb7
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lb7
            r8.<init>(r9)     // Catch: java.io.IOException -> Lb7
            throw r8     // Catch: java.io.IOException -> Lb7
        Lb7:
            r8 = move-exception
            r9 = r4
            goto Lc3
        Lba:
            r8 = move-exception
            r4 = r9
        Lbc:
            throw r8     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r9 = move-exception
            pa.a(r2, r8)     // Catch: java.io.IOException -> Lb7
            throw r9     // Catch: java.io.IOException -> Lb7
        Lc2:
            r8 = move-exception
        Lc3:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Lcc
            r9.delete()
        Lcc:
            throw r8
        Lcd:
            java.lang.String r8 = "Unable to create parent directories of "
            java.lang.String r8 = kotlin.jvm.internal.f(r9, r8)
            x.p(r8)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.j(java.lang.Object, ve.c):java.lang.Object");
    }
}