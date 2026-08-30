package i5;
import a.a;
import q.c;
import q.e;
import q.x;

import g5.e0;
import g5.f0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class q implements f0, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.j f18278a;

    /* renamed from: b, reason: collision with root package name */
    public final p5.a f18279b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f18280c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f18281d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(df.p pVar, p5.a aVar) {
        aVar.getClass();
        this.f18278a = (kotlin.jvm.internal.j) pVar;
        this.f18279b = aVar;
        this.f18280c = new AtomicInteger(0);
    }

    @Override // g5.f0
    public final Boolean a(te.c cVar) {
        boolean z3;
        if (this.f18281d == null && !this.f18279b.J()) {
            z3 = false;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // i5.d0
    public final p5.a b() {
        return this.f18279b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (r8 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [df.p, kotlin.jvm.internal.j] */
    @Override // g5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, df.l r7, ve.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof i5.n
            if (r0 == 0) goto L13
            r0 = r8
            i5.n r0 = (i5.n) r0
            int r1 = r0.f18270y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18270y = r1
            goto L18
        L13:
            i5.n r0 = new i5.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f18268w
            int r1 = r0.f18270y
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            pe.a.e(r8)
            return r8
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L31:
            df.l r7 = r0.f18267v
            java.lang.String r6 = r0.f18266u
            pe.a.e(r8)
            goto L49
        L39:
            pe.a.e(r8)
            r0.f18266u = r6
            r0.f18267v = r7
            r0.f18270y = r3
            java.lang.Boolean r8 = r5.a(r0)
            if (r8 != r4) goto L49
            goto L65
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L67
            i5.o r8 = new i5.o
            r8.<init>(r5, r6, r7, r1)
            r0.f18266u = r1
            r0.f18267v = r1
            r0.f18270y = r2
            kotlin.jvm.internal.j r6 = r5.f18278a
            java.lang.Object r6 = r6.invoke(r8, r0)
            if (r6 != r4) goto L66
        L65:
            return r4
        L66:
            return r6
        L67:
            p5.a r8 = r5.f18279b
            p5.c r6 = r8.T(r6)
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L75
            ug.a.b(r6, r1)
            return r7
        L75:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            ug.a.b(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.c(java.lang.String, df.l, ve.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [df.p, kotlin.jvm.internal.j] */
    @Override // g5.f0
    public final Object d(e0 e0Var, df.p pVar, ve.i iVar) {
        return this.f18278a.invoke(new p(this, e0Var, pVar, null), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(g5.e0 r8, df.p r9, ve.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof i5.m
            if (r0 == 0) goto L13
            r0 = r10
            i5.m r0 = (i5.m) r0
            int r1 = r0.f18265x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18265x = r1
            goto L18
        L13:
            i5.m r0 = new i5.m
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f18263v
            int r1 = r0.f18265x
            java.lang.String r2 = "ROLLBACK TRANSACTION"
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.f18280c
            r5 = 1
            p5.a r6 = r7.f18279b
            if (r1 == 0) goto L37
            if (r1 != r5) goto L30
            int r5 = r0.f18262u
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L2e
            goto L75
        L2e:
            r8 = move-exception
            goto L89
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
        L35:
            r8 = 0
            return r8
        L37:
            pe.a.e(r10)
            int r10 = r8.ordinal()
            if (r10 == 0) goto L55
            if (r10 == r5) goto L4f
            r1 = 2
            if (r10 != r1) goto L4b
            java.lang.String r10 = "BEGIN EXCLUSIVE TRANSACTION"
            ya.n9.a(r6, r10)
            goto L5a
        L4b:
            l4.a.o()
            goto L35
        L4f:
            java.lang.String r10 = "BEGIN IMMEDIATE TRANSACTION"
            ya.n9.a(r6, r10)
            goto L5a
        L55:
            java.lang.String r10 = "BEGIN DEFERRED TRANSACTION"
            ya.n9.a(r6, r10)
        L5a:
            int r10 = r4.incrementAndGet()
            if (r10 <= 0) goto L62
            r7.f18281d = r8
        L62:
            i5.l r8 = new i5.l     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> L2e
            r0.f18262u = r5     // Catch: java.lang.Throwable -> L2e
            r0.f18265x = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r9.invoke(r8, r0)     // Catch: java.lang.Throwable -> L2e
            ue.a r8 = ue.a.f27192u
            if (r10 != r8) goto L75
            return r8
        L75:
            int r8 = r4.decrementAndGet()
            if (r8 != 0) goto L7d
            r7.f18281d = r3
        L7d:
            if (r5 == 0) goto L85
            java.lang.String r8 = "END TRANSACTION"
            ya.n9.a(r6, r8)
            return r10
        L85:
            ya.n9.a(r6, r2)
            return r10
        L89:
            throw r8     // Catch: java.lang.Throwable -> L8a
        L8a:
            r9 = move-exception
            int r10 = r4.decrementAndGet()     // Catch: android.database.SQLException -> L94
            if (r10 != 0) goto L96
            r7.f18281d = r3     // Catch: android.database.SQLException -> L94
            goto L96
        L94:
            r10 = move-exception
            goto L9a
        L96:
            ya.n9.a(r6, r2)     // Catch: android.database.SQLException -> L94
            goto L9d
        L9a:
            pe.a(r8, r10)
        L9d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e(g5.e0, df.p, ve.c):java.lang.Object");
    }
}
