package u;
import l.a;
import l.c;

import java.util.concurrent.CancellationException;
import t.f1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25798a = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(t.f1 r9, float r10, q.l r11, q.u r12, df.l r13, ve.c r14) {
        /*
            boolean r0 = r14 instanceof u.i
            if (r0 == 0) goto L13
            r0 = r14
            u.i r0 = (u.i) r0
            int r1 = r0.f25786y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25786y = r1
            goto L18
        L13:
            u.i r0 = new u.i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25785x
            int r1 = r0.f25786y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.f25782u
            kotlin.jvm.internal.v r9 = r0.f25784w
            q.l r11 = r0.f25783v
            pe.a.e(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r9)
            r9 = 0
            return r9
        L32:
            pe.a.e(r14)
            kotlin.jvm.internal.v r5 = new kotlin.jvm.internal.v
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            u.j r3 = new u.j
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f25783v = r11
            r0.f25784w = r5
            r0.f25782u = r4
            r0.f25786y = r2
            java.lang.Object r9 = q.e.e(r11, r12, r14, r3, r0)
            ue.a r10 = ue.a.f27192u
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            u.a r12 = new u.a
            float r9 = r9.f19784u
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a(t.f1, float, q.l, q.u, df.l, ve.c):java.lang.Object");
    }

    public static final void b(q.j jVar, f1 f1Var, df.l lVar, float f10) {
        float f11;
        try {
            f11 = f1Var.a(f10);
        } catch (CancellationException unused) {
            jVar.a();
            f11 = 0.0f;
        }
        lVar.invoke(Float.valueOf(f11));
        if (Math.abs(f10 - f11) > 0.5f) {
            jVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(t.f1 r16, float r17, float r18, q.l r19, q.r0 r20, df.l r21, ve.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof u.k
            if (r2 == 0) goto L18
            r2 = r1
            u.k r2 = (u.k) r2
            int r3 = r2.f25797z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f25797z = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            u.k r2 = new u.k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f25796y
            int r2 = r8.f25797z
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.f25793v
            float r2 = r8.f25792u
            kotlin.jvm.internal.v r3 = r8.f25795x
            q.l r4 = r8.f25794w
            pe.a.e(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r0)
            r0 = 0
            return r0
        L3d:
            pe.a.e(r1)
            kotlin.jvm.internal.v r12 = new kotlin.jvm.internal.v
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            u.j r10 = new u.j
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.f25794w = r2
            r8.f25795x = r12
            r8.f25792u = r0
            r8.f25793v = r1
            r8.f25797z = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = q.e.g(r3, r4, r5, r6, r7, r8)
            ue.a r3 = ue.a.f27192u
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            u.a r2 = new u.a
            float r3 = r3.f19784u
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            q.l r0 = q.e.k(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c(t.f1, float, float, q.l, q.r0, df.l, ve.c):java.lang.Object");
    }

    public static final float d(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        if (f11 <= 0.0f ? f10 < f11 : f10 > f11) {
            return f11;
        }
        return f10;
    }
}
