package v1;
import b0.x;
import g0.f;
import g0.j;

import c2.r2;
import ya.rc;

/* loaded from: classes.dex */
public final class g0 implements b, y2.c, te.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h0 f27308u;

    /* renamed from: v, reason: collision with root package name */
    public final pf.l f27309v;

    /* renamed from: w, reason: collision with root package name */
    public pf.l f27310w;

    /* renamed from: x, reason: collision with root package name */
    public l f27311x = l.f27332v;

    /* renamed from: y, reason: collision with root package name */
    public final te.h f27312y = te.h.f25707u;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h0 f27313z;

    public g0(h0 h0Var, pf.l lVar) {
        this.f27313z = h0Var;
        this.f27308u = h0Var;
        this.f27309v = lVar;
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f27308u.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f27308u.D0(j10);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f27308u.R(f10);
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f27308u.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f27308u.a();
    }

    @Override // y2.c
    public final float a0(float f10) {
        return f10 / this.f27308u.a();
    }

    public final Object b(l lVar, te.c cVar) {
        pf.l lVar2 = new pf.l(1, rc.b(cVar));
        lVar2.s();
        this.f27311x = lVar;
        this.f27310w = lVar2;
        return lVar2.r();
    }

    public final long c() {
        h0 h0Var = this.f27313z;
        long B0 = h0Var.B0(b2.l.u(h0Var).U.d());
        long j10 = h0Var.S;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (B0 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (B0 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final r2 d() {
        return b2.l.u(this.f27313z).U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [pf.d1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [pf.d1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [df.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r6, df.p r8, ve.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof v1.e0
            if (r0 == 0) goto L13
            r0 = r9
            v1.e0 r0 = (v1.e0) r0
            int r1 = r0.f27304x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27304x = r1
            goto L18
        L13:
            v1.e0 r0 = new v1.e0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f27302v
            int r1 = r0.f27304x
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            pf.r1 r6 = r0.f27301u
            pe.a.e(r9)     // Catch: java.lang.Throwable -> L27
            goto L68
        L27:
            r7 = move-exception
            goto L6e
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L30:
            pe.a.e(r9)
            r3 = 0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L4a
            pf.l r9 = r5.f27310w
            if (r9 == 0) goto L4a
            v1.m r1 = new v1.m
            r1.<init>(r6)
            pe.k r3 = new pe.k
            r3.<init>(r1)
            r9.resumeWith(r3)
        L4a:
            v1.h0 r9 = r5.f27313z
            pf.z r9 = r9.M0()
            b3.h r1 = new b3.h
            r3 = 0
            r1.<init>(r6, r5, r3)
            r6 = 3
            pf.r1 r6 = pf.x(r9, r3, r1, r6)
            r0.f27301u = r6     // Catch: java.lang.Throwable -> L27
            r0.f27304x = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L27
            ue.a r7 = ue.a.f27192u
            if (r9 != r7) goto L68
            return r7
        L68:
            v1.c r7 = v1.c.f27288v
            r6.j(r7)
            return r9
        L6e:
            v1.c r8 = v1.c.f27288v
            r6.j(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.f(long, df.p, ve.c):java.lang.Object");
    }

    @Override // te.c
    public final te.g getContext() {
        return this.f27312y;
    }

    @Override // y2.c
    public final float i0() {
        return this.f27308u.i0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r5, df.p r7, ve.a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof v1.f0
            if (r0 == 0) goto L13
            r0 = r8
            v1.f0 r0 = (v1.f0) r0
            int r1 = r0.f27307w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27307w = r1
            goto L18
        L13:
            v1.f0 r0 = new v1.f0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f27305u
            int r1 = r0.f27307w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r8)     // Catch: v1.m -> L3b
            return r8
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L2c:
            pe.a.e(r8)
            r0.f27307w = r2     // Catch: v1.m -> L3b
            java.lang.Object r5 = r4.f(r5, r7, r0)     // Catch: v1.m -> L3b
            ue.a r6 = ue.a.f27192u
            if (r5 != r6) goto L3a
            return r6
        L3a:
            return r5
        L3b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.j(long, df.p, ve.a):java.lang.Object");
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f27308u.a() * f10;
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f27308u.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f27308u.p(j10);
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        h0 h0Var = this.f27313z;
        synchronized (h0Var.P) {
            h0Var.O.m(this);
        }
        this.f27309v.resumeWith(obj);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f27308u.t0(f10);
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f27308u.x(j10);
    }
}
