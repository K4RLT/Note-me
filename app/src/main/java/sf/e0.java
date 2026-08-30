package sf;
import x.j;
import x.k;
import x.n;
import x.o;
import a.a;
import b0.w;
import q.x;

import b8.fb;
import b8.l2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c4.s f25165a;

    /* renamed from: b, reason: collision with root package name */
    public static final c4.s f25166b;

    /* renamed from: c, reason: collision with root package name */
    public static final c4.s f25167c;

    static {
        int i = 8;
        f25165a = new c4.s("NO_VALUE", i);
        f25166b = new c4.s("NONE", i);
        f25167c = new c4.s("PENDING", i);
    }

    public static final d0 a(int i, int i10, rf.a aVar) {
        if (i >= 0) {
            if (i10 >= 0) {
                if (i <= 0 && i10 <= 0 && aVar != rf.a.f24769u) {
                    x.k(aVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    return null;
                }
                int i11 = i10 + i;
                if (i11 < 0) {
                    i11 = Integer.MAX_VALUE;
                }
                return new d0(i, i11, aVar);
            }
            x.j(g3.a.g(i10, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        x.j(g3.a.g(i, "replay cannot be negative, but was "));
        return null;
    }

    public static final n0 b(Object obj) {
        if (obj == null) {
            obj = tf.c.f25716b;
        }
        return new n0(obj);
    }

    public static final void c(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    public static g d(g gVar, int i) {
        rf.a aVar;
        if (i < 0 && i != -2 && i != -1) {
            x.j(g3.a.g(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            aVar = rf.a.f24770v;
        } else {
            aVar = rf.a.f24769u;
        }
        boolean z3 = gVar instanceof tf.p;
        te.h hVar = te.h.f25707u;
        if (z3) {
            return ((tf.p) gVar).a(hVar, i, aVar);
        }
        return new tf.f(gVar, hVar, i, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e(sf.g r4, sf.h r5, ve.c r6) {
        /*
            boolean r0 = r6 instanceof sf.n
            if (r0 == 0) goto L13
            r0 = r6
            sf.n r0 = (sf.n) r0
            int r1 = r0.f25213w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25213w = r1
            goto L18
        L13:
            sf.n r0 = new sf.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25212v
            int r1 = r0.f25213w
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            kotlin.jvm.internal.y r4 = r0.f25211u
            pe.a.e(r6)     // Catch: java.lang.Throwable -> L27
            goto L4a
        L27:
            r5 = move-exception
            goto L4e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L30:
            pe.a.e(r6)
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            sf.e r1 = new sf.e     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4c
            r0.f25211u = r6     // Catch: java.lang.Throwable -> L4c
            r0.f25213w = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = r4.b(r1, r0)     // Catch: java.lang.Throwable -> L4c
            ue.a r5 = ue.a.f27192u
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = 0
            return r4
        L4c:
            r5 = move-exception
            r4 = r6
        L4e:
            java.lang.Object r4 = r4.f19787u
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5a
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7c
        L5a:
            te.g r6 = r0.getContext()
            pf.w r0 = pf.w.f22803v
            te.e r6 = r6.L(r0)
            pf.d1 r6 = (pf.d1) r6
            if (r6 == 0) goto L7d
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L6f
            goto L7d
        L6f:
            java.util.concurrent.CancellationException r6 = r6.r()
            if (r6 == 0) goto L7d
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7c
            goto L7d
        L7c:
            throw r5
        L7d:
            if (r4 != 0) goto L80
            return r5
        L80:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L88
            pe.a(r4, r5)
            throw r4
        L88:
            pe.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.e0.e(sf.g, sf.h, ve.c):java.io.Serializable");
    }

    public static final g f(g gVar, long j10) {
        if (j10 >= 0) {
            if (j10 == 0) {
                return gVar;
            }
            return new f6.h(3, new k(new fb(j10, 1), gVar, null));
        }
        x.n("Debounce timeout should not be negative");
        return null;
    }

    public static final g g(g gVar) {
        if (gVar instanceof l0) {
            return gVar;
        }
        if (gVar instanceof f) {
            return gVar;
        }
        return new f(gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r10 == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0051, B:20:0x0066, B:22:0x006e, B:32:0x0046, B:34:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(sf.h r7, rf.l r8, boolean r9, ve.c r10) {
        /*
            boolean r0 = r10 instanceof sf.i
            if (r0 == 0) goto L13
            r0 = r10
            sf.i r0 = (sf.i) r0
            int r1 = r0.f25182z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25182z = r1
            goto L18
        L13:
            sf.i r0 = new sf.i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25181y
            int r1 = r0.f25182z
            r2 = 0
            r3 = 2
            r4 = 1
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L37
            boolean r9 = r0.f25180x
            rf.c r7 = r0.f25179w
            rf.l r8 = r0.f25178v
            sf.h r1 = r0.f25177u
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L51
        L35:
            r7 = move-exception
            goto L8b
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L3e:
            boolean r9 = r0.f25180x
            rf.c r7 = r0.f25179w
            rf.l r8 = r0.f25178v
            sf.h r1 = r0.f25177u
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4a:
            pe.a.e(r10)
            rf.c r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L51:
            r0.f25177u = r7     // Catch: java.lang.Throwable -> L35
            r0.f25178v = r8     // Catch: java.lang.Throwable -> L35
            r0.f25179w = r10     // Catch: java.lang.Throwable -> L35
            r0.f25180x = r9     // Catch: java.lang.Throwable -> L35
            r0.f25182z = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L62
            goto L82
        L62:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f25177u = r1     // Catch: java.lang.Throwable -> L35
            r0.f25178v = r8     // Catch: java.lang.Throwable -> L35
            r0.f25179w = r7     // Catch: java.lang.Throwable -> L35
            r0.f25180x = r9     // Catch: java.lang.Throwable -> L35
            r0.f25182z = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.e(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L82:
            return r5
        L83:
            if (r9 == 0) goto L88
            r8.j(r2)
        L88:
            pe.z r7 = pe.z.f22715a
            return r7
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r10 = move-exception
            if (r9 == 0) goto La5
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L96
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L96:
            if (r2 != 0) goto La2
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La2:
            r8.j(r2)
        La5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.e0.h(sf.h, rf.l, boolean, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(sf.g r5, df.p r6, ve.c r7) {
        /*
            c4.s r0 = tf.c.f25716b
            boolean r1 = r7 instanceof sf.w
            if (r1 == 0) goto L15
            r1 = r7
            sf.w r1 = (sf.w) r1
            int r2 = r1.f25252y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f25252y = r2
            goto L1a
        L15:
            sf.w r1 = new sf.w
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f25251x
            int r2 = r1.f25252y
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            f6.i r5 = r1.f25250w
            kotlin.jvm.internal.y r6 = r1.f25249v
            ve.i r1 = r1.f25248u
            df.p r1 = (df.p) r1
            pe.a.e(r7)     // Catch: tf.a -> L2f
            goto L68
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L38:
            pe.a.e(r7)
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            r7.f19787u = r0
            f6.i r2 = new f6.i
            r4 = 6
            r2.<init>(r6, r4, r7)
            r4 = r6
            ve.i r4 = (ve.i) r4     // Catch: tf.a -> L5f
            r1.f25248u = r4     // Catch: tf.a -> L5f
            r1.f25249v = r7     // Catch: tf.a -> L5f
            r1.f25250w = r2     // Catch: tf.a -> L5f
            r1.f25252y = r3     // Catch: tf.a -> L5f
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: tf.a -> L5f
            ue.a r1 = ue.a.f27192u
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r1 = r6
            r6 = r7
            goto L68
        L5f:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L64:
            java.lang.Object r2 = r7.f25710u
            if (r2 != r5) goto L81
        L68:
            java.lang.Object r5 = r6.f19787u
            if (r5 == r0) goto L6d
            return r5
        L6d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.e0.i(sf.g, df.p, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(sf.g r5, ve.c r6) {
        /*
            c4.s r0 = tf.c.f25716b
            boolean r1 = r6 instanceof sf.v
            if (r1 == 0) goto L15
            r1 = r6
            sf.v r1 = (sf.v) r1
            int r2 = r1.f25247x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f25247x = r2
            goto L1a
        L15:
            sf.v r1 = new sf.v
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.f25246w
            int r2 = r1.f25247x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            sf.t r5 = r1.f25245v
            kotlin.jvm.internal.y r1 = r1.f25244u
            pe.a.e(r6)     // Catch: tf.a -> L2b
            goto L5d
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
        L32:
            r5 = 0
            return r5
        L34:
            pe.a.e(r6)
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            r6.f19787u = r0
            sf.t r2 = new sf.t
            r4 = 0
            r2.<init>(r6, r4)
            r1.f25244u = r6     // Catch: tf.a -> L55
            r1.f25245v = r2     // Catch: tf.a -> L55
            r1.f25247x = r3     // Catch: tf.a -> L55
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: tf.a -> L55
            ue.a r1 = ue.a.f27192u
            if (r5 != r1) goto L53
            return r1
        L53:
            r1 = r6
            goto L5d
        L55:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L59:
            java.lang.Object r2 = r6.f25710u
            if (r2 != r5) goto L68
        L5d:
            java.lang.Object r5 = r1.f19787u
            if (r5 == r0) goto L62
            return r5
        L62:
            java.lang.String r5 = "Expected at least one element"
            l4.a.h(r5)
            goto L32
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.e0.j(sf.g, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(sf.g r4, ve.c r5) {
        /*
            boolean r0 = r5 instanceof sf.x
            if (r0 == 0) goto L13
            r0 = r5
            sf.x r0 = (sf.x) r0
            int r1 = r0.f25256x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25256x = r1
            goto L18
        L13:
            sf.x r0 = new sf.x
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25255w
            int r1 = r0.f25256x
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            sf.t r4 = r0.f25254v
            kotlin.jvm.internal.y r0 = r0.f25253u
            pe.a.e(r5)     // Catch: tf.a -> L29
            goto L59
        L29:
            r5 = move-exception
            goto L55
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L32:
            pe.a.e(r5)
            kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
            r5.<init>()
            sf.t r1 = new sf.t
            r3 = 1
            r1.<init>(r5, r3)
            r0.f25253u = r5     // Catch: tf.a -> L51
            r0.f25254v = r1     // Catch: tf.a -> L51
            r0.f25256x = r2     // Catch: tf.a -> L51
            java.lang.Object r4 = r4.b(r1, r0)     // Catch: tf.a -> L51
            ue.a r0 = ue.a.f27192u
            if (r4 != r0) goto L4f
            return r0
        L4f:
            r0 = r5
            goto L59
        L51:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L55:
            java.lang.Object r1 = r5.f25710u
            if (r1 != r4) goto L5c
        L59:
            java.lang.Object r4 = r0.f19787u
            return r4
        L5c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.e0.k(sf.g, ve.c):java.lang.Object");
    }

    public static final a0 l(f6.h hVar, uf.c cVar, k0 k0Var, Float f10) {
        pf.a0 a0Var;
        rf.l.f24810t.getClass();
        rf.k kVar = rf.k.f24808a;
        iw iwVar = new iw(hVar, 19, te.h.f25707u);
        n0 b10 = b(f10);
        te.g gVar = (te.g) iwVar.f14490w;
        g gVar2 = (g) iwVar.f14489v;
        if (k0Var.equals(h0.f25175a)) {
            a0Var = pf.a0.f22717u;
        } else {
            a0Var = pf.a0.f22720x;
        }
        pf.w(cVar, gVar, a0Var, new l2(k0Var, gVar2, b10, f10, (te.c) null, 16));
        return new a0(b10);
    }
}
