package i2;
import f.a;
import f.b;

import o0.y1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f18161a;

    /* renamed from: b, reason: collision with root package name */
    public float f18162b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18163c;

    public f(n2.h hVar) {
        this.f18163c = hVar;
        this.f18161a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f18163c
            n2.h r0 = (n2.h) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f21131f
            int r3 = ya.c1.a(r3, r6, r7)
            android.text.Layout r4 = r0.f21131f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f18161a
            if (r1 != r4) goto L35
            float r6 = r5.f18162b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f18161a = r4
            r5.f18162b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, ve.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i2.e
            if (r0 == 0) goto L13
            r0 = r6
            i2.e r0 = (i2.e) r0
            int r1 = r0.f18160w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18160w = r1
            goto L18
        L13:
            i2.e r0 = new i2.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18158u
            int r1 = r0.f18160w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r6)
            goto L43
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L2c:
            pe.a.e(r6)
            java.lang.Object r6 = r4.f18163c
            o0.y1 r6 = (o0.y1) r6
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.f18160w = r2
            java.lang.Object r6 = r6.invoke(r1, r0)
            ue.a r5 = ue.a.f27192u
            if (r6 != r5) goto L43
            return r5
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f18162b
            float r6 = r6 + r5
            r4.f18162b = r6
            pe.z r5 = pe.z.f22715a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.b(float, ve.c):java.lang.Object");
    }

    public f(int i, y1 y1Var) {
        this.f18161a = i;
        this.f18163c = y1Var;
    }
}
