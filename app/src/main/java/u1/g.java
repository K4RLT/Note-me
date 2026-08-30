package u1;

import b0.h1;
import b2.j2;
import b2.l;
import d1.q;
import pf.b0;
import pf.z;
import q.x;
import r.m1;

/* loaded from: classes.dex */
public final class g extends q implements j2, a {
    public a I;
    public d J;
    public g K;
    public final String L;

    public g(a aVar, d dVar) {
        this.I = aVar;
        this.J = dVar == null ? new d() : dVar;
        this.L = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // u1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(long r13, long r15, te.c r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof u1.e
            if (r1 == 0) goto L16
            r1 = r0
            u1.e r1 = (u1.e) r1
            int r2 = r1.f25817y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f25817y = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            u1.e r1 = new u1.e
            ve.c r0 = (ve.c) r0
            r1.<init>(r12, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.f25815w
            int r1 = r7.f25817y
            r8 = 2
            r2 = 1
            ue.a r9 = ue.a.f27192u
            if (r1 == 0) goto L41
            if (r1 == r2) goto L39
            if (r1 != r8) goto L32
            long r1 = r7.f25813u
            pe.a.e(r0)
            goto L87
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r0)
            r0 = 0
            return r0
        L39:
            long r1 = r7.f25814v
            long r3 = r7.f25813u
            pe.a.e(r0)
            goto L58
        L41:
            pe.a.e(r0)
            u1.a r0 = r12.I
            r7.f25813u = r13
            r5 = r15
            r7.f25814v = r5
            r7.f25817y = r2
            r3 = r13
            r2 = r0
            java.lang.Object r0 = r2.G0(r3, r5, r7)
            if (r0 != r9) goto L56
            goto L85
        L56:
            r3 = r13
            r1 = r15
        L58:
            y2.q r0 = (y2.q) r0
            long r10 = r0.f30822a
            boolean r0 = r12.H
            if (r0 == 0) goto L6d
            r5 = 0
            if (r0 == 0) goto L6f
            if (r0 == 0) goto L6f
            b2.j2 r0 = b2.l.i(r12)
            r5 = r0
            u1.g r5 = (u1.g) r5
            goto L6f
        L6d:
            u1.g r5 = r12.K
        L6f:
            if (r5 == 0) goto L8d
            long r3 = y2.q.e(r3, r10)
            long r0 = y2.q.d(r1, r10)
            r7.f25813u = r10
            r7.f25817y = r8
            r2 = r5
            r5 = r0
            java.lang.Object r0 = r2.G0(r3, r5, r7)
            if (r0 != r9) goto L86
        L85:
            return r9
        L86:
            r1 = r10
        L87:
            y2.q r0 = (y2.q) r0
            long r3 = r0.f30822a
            r10 = r1
            goto L8f
        L8d:
            r3 = 0
        L8f:
            long r0 = y2.q.e(r10, r3)
            y2.q r2 = new y2.q
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g.G0(long, long, te.c):java.lang.Object");
    }

    @Override // d1.q
    public final void Q0() {
        d dVar = this.J;
        dVar.f25809a = this;
        dVar.f25810b = null;
        this.K = null;
        dVar.f25811c = new m1(6, this);
        dVar.f25812d = M0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // d1.q
    public final void R0() {
        Object obj = new Object();
        l.x(this, new h1(obj, 2));
        g gVar = (g) ((j2) obj.f19787u);
        this.K = gVar;
        d dVar = this.J;
        dVar.f25810b = gVar;
        if (dVar.f25809a == this) {
            dVar.f25809a = null;
        }
    }

    @Override // u1.a
    public final long U(int i, long j10) {
        long j11;
        boolean z3 = this.H;
        g gVar = null;
        if (z3 && z3) {
            gVar = (g) l.i(this);
        }
        if (gVar != null) {
            j11 = gVar.U(i, j10);
        } else {
            j11 = 0;
        }
        return j1.b.h(j11, this.I.U(i, j1.b.g(j10, j11)));
    }

    public final z Y0() {
        g gVar;
        z zVar = null;
        if (this.H) {
            gVar = (g) l.i(this);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            zVar = gVar.Y0();
        }
        if (zVar != null && b0.t(zVar)) {
            return zVar;
        }
        z zVar2 = this.J.f25812d;
        if (zVar2 != null) {
            return zVar2;
        }
        x.o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // u1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r10, te.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof u1.f
            if (r0 == 0) goto L13
            r0 = r12
            u1.f r0 = (u1.f) r0
            int r1 = r0.f25821x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25821x = r1
            goto L1a
        L13:
            u1.f r0 = new u1.f
            ve.c r12 = (ve.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f25819v
            int r1 = r0.f25821x
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            long r10 = r0.f25818u
            pe.a.e(r12)
            goto L75
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L35:
            long r10 = r0.f25818u
            pe.a.e(r12)
            goto L59
        L3b:
            pe.a.e(r12)
            boolean r12 = r9.H
            r1 = 0
            if (r12 == 0) goto L4c
            if (r12 == 0) goto L4c
            b2.j2 r12 = b2.l.i(r9)
            r1 = r12
            u1.g r1 = (u1.g) r1
        L4c:
            if (r1 == 0) goto L61
            r0.f25818u = r10
            r0.f25821x = r3
            java.lang.Object r12 = r1.i(r10, r0)
            if (r12 != r4) goto L59
            goto L74
        L59:
            y2.q r12 = (y2.q) r12
            long r5 = r12.f30822a
        L5d:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L64
        L61:
            r5 = 0
            goto L5d
        L64:
            u1.a r12 = r9.I
            long r5 = y2.q.d(r5, r10)
            r0.f25818u = r10
            r0.f25821x = r2
            java.lang.Object r12 = r12.i(r5, r0)
            if (r12 != r4) goto L75
        L74:
            return r4
        L75:
            y2.q r12 = (y2.q) r12
            long r0 = r12.f30822a
            long r10 = y2.q.e(r10, r0)
            y2.q r12 = new y2.q
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g.i(long, te.c):java.lang.Object");
    }

    @Override // b2.j2
    public final Object j() {
        return this.L;
    }

    @Override // u1.a
    public final long z(long j10, int i, long j11) {
        long j12;
        long z3 = this.I.z(j10, i, j11);
        boolean z9 = this.H;
        g gVar = null;
        if (z9 && z9) {
            gVar = (g) l.i(this);
        }
        g gVar2 = gVar;
        if (gVar2 != null) {
            j12 = gVar2.z(j1.b.h(j10, z3), i, j1.b.g(j11, z3));
        } else {
            j12 = 0;
        }
        return j1.b.h(z3, j12);
    }
}