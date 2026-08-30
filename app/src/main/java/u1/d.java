package u1;
import d.a;
import d.b;

import kotlin.jvm.internal.m;
import pf.z;
import q.x;
import r.m1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public g f25809a;

    /* renamed from: b, reason: collision with root package name */
    public g f25810b;

    /* renamed from: c, reason: collision with root package name */
    public m f25811c = new m1(5, this);

    /* renamed from: d, reason: collision with root package name */
    public z f25812d;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, long r13, ve.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof u1.b
            if (r0 == 0) goto L14
            r0 = r15
            u1.b r0 = (u1.b) r0
            int r1 = r0.f25805w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f25805w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            u1.b r0 = new u1.b
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f25803u
            int r0 = r6.f25805w
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2a
            pe.a.e(r15)
            goto L82
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r11)
            r11 = 0
            return r11
        L31:
            pe.a.e(r15)
            goto L5e
        L35:
            pe.a.e(r15)
            u1.g r15 = r10.f25809a
            r0 = 0
            if (r15 == 0) goto L48
            boolean r3 = r15.H
            if (r3 == 0) goto L48
            b2.j2 r15 = b2.l.i(r15)
            u1.g r15 = (u1.g) r15
            goto L49
        L48:
            r15 = r0
        L49:
            r3 = 0
            ue.a r7 = ue.a.f27192u
            if (r15 != 0) goto L63
            u1.g r1 = r10.f25810b
            if (r1 == 0) goto L88
            r6.f25805w = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.G0(r2, r4, r6)
            if (r15 != r7) goto L5e
            goto L81
        L5e:
            y2.q r15 = (y2.q) r15
            long r3 = r15.f30822a
            goto L88
        L63:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            u1.g r13 = r10.f25809a
            if (r13 == 0) goto L76
            boolean r14 = r13.H
            if (r14 == 0) goto L76
            b2.j2 r13 = b2.l.i(r13)
            r0 = r13
            u1.g r0 = (u1.g) r0
        L76:
            if (r0 == 0) goto L87
            r6.f25805w = r1
            r1 = r0
            java.lang.Object r15 = r1.G0(r2, r4, r6)
            if (r15 != r7) goto L82
        L81:
            return r7
        L82:
            y2.q r15 = (y2.q) r15
            long r3 = r15.f30822a
            goto L88
        L87:
            r3 = r11
        L88:
            y2.q r11 = new y2.q
            r11.<init>(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a(long, long, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, ve.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof u1.c
            if (r0 == 0) goto L13
            r0 = r7
            u1.c r0 = (u1.c) r0
            int r1 = r0.f25808w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25808w = r1
            goto L18
        L13:
            u1.c r0 = new u1.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f25806u
            int r1 = r0.f25808w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r7)
            goto L4c
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L2c:
            pe.a.e(r7)
            u1.g r7 = r4.f25809a
            r1 = 0
            if (r7 == 0) goto L3f
            boolean r3 = r7.H
            if (r3 == 0) goto L3f
            b2.j2 r7 = b2.l.i(r7)
            r1 = r7
            u1.g r1 = (u1.g) r1
        L3f:
            if (r1 == 0) goto L51
            r0.f25808w = r2
            java.lang.Object r7 = r1.i(r5, r0)
            ue.a r5 = ue.a.f27192u
            if (r7 != r5) goto L4c
            return r5
        L4c:
            y2.q r7 = (y2.q) r7
            long r5 = r7.f30822a
            goto L53
        L51:
            r5 = 0
        L53:
            y2.q r7 = new y2.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b(long, ve.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.a] */
    public final z c() {
        z zVar = (z) this.f25811c.invoke();
        if (zVar != null) {
            return zVar;
        }
        x.o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
