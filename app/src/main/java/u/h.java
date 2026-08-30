package u;
import l.a;

import q.r0;
import q.u;
import t.h1;
import t.n0;
import t.v1;

/* loaded from: classes.dex */
public final class h implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.m f25778a;

    /* renamed from: b, reason: collision with root package name */
    public final u f25779b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f25780c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f25781d = androidx.compose.foundation.gestures.a.f475b;

    public h(i0.m mVar, u uVar, r0 r0Var) {
        this.f25778a = mVar;
        this.f25779b = uVar;
        this.f25780c = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(u.h r5, t.f1 r6, float r7, float r8, u.e r9, ve.c r10) {
        /*
            boolean r0 = r10 instanceof u.g
            if (r0 == 0) goto L14
            r0 = r10
            u.g r0 = (u.g) r0
            int r1 = r0.f25777w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f25777w = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            u.g r0 = new u.g
            r0.<init>(r5, r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.f25775u
            int r1 = r10.f25777w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            pe.a.e(r0)
            goto L9b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L2f:
            pe.a.e(r0)
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            goto L44
        L3c:
            float r0 = java.lang.Math.abs(r8)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4b
        L44:
            r5 = 28
            q.l r5 = q.e.b(r5, r7, r8)
            return r5
        L4b:
            r10.f25777w = r2
            q.u r0 = r5.f25779b
            q.l1 r3 = q.m1.f22948a
            j6.n r3 = new j6.n
            k6.i r4 = r0.f23013a
            r3.<init>(r4)
            q.m r4 = new q.m
            r4.<init>(r1)
            q.m r1 = new q.m
            r1.<init>(r8)
            q.q r1 = r3.h(r4, r1)
            q.m r1 = (q.m) r1
            float r1 = r1.f22945a
            float r1 = java.lang.Math.abs(r1)
            float r3 = java.lang.Math.abs(r7)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L7e
            u.c r5 = new u.c
            r1 = 0
            r5.<init>(r1, r0)
        L7c:
            r0 = r7
            goto L87
        L7e:
            t.a r0 = new t.a
            q.r0 r5 = r5.f25780c
            r0.<init>(r2, r5)
            r5 = r0
            goto L7c
        L87:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            r0 = r8
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r0)
            java.lang.Object r0 = r5.a(r6, r7, r8, r9, r10)
            ue.a r5 = ue.a.f27192u
            if (r0 != r5) goto L9b
            return r5
        L9b:
            u.a r0 = (u.a) r0
            q.l r5 = r0.f25762b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.b(u.h, t.f1, float, float, u.e, ve.c):java.lang.Object");
    }

    @Override // t.n0
    public Object a(v1 v1Var, float f10, te.c cVar) {
        return d(v1Var, f10, t.e.B, (ve.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(t.f1 r10, float r11, df.l r12, ve.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof u.d
            if (r0 == 0) goto L13
            r0 = r13
            u.d r0 = (u.d) r0
            int r1 = r0.f25768x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25768x = r1
            goto L18
        L13:
            u.d r0 = new u.d
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f25766v
            int r1 = r0.f25768x
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            df.l r12 = r0.f25765u
            pe.a.e(r13)
            r4 = r9
            goto L4c
        L28:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L2f:
            pe.a.e(r13)
            s6.a r3 = new s6.a
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f25765u = r6
            r0.f25768x = r2
            t.h1 r10 = r4.f25781d
            java.lang.Object r13 = pf.b0.J(r10, r3, r0)
            ue.a r10 = ue.a.f27192u
            if (r13 != r10) goto L4b
            return r10
        L4b:
            r12 = r6
        L4c:
            u.a r13 = (u.a) r13
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r12.invoke(r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.c(t.f1, float, df.l, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(t.f1 r5, float r6, df.l r7, ve.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof u.f
            if (r0 == 0) goto L13
            r0 = r8
            u.f r0 = (u.f) r0
            int r1 = r0.f25774w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25774w = r1
            goto L18
        L13:
            u.f r0 = new u.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f25772u
            int r1 = r0.f25774w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r8)
            goto L3a
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L2c:
            pe.a.e(r8)
            r0.f25774w = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            ue.a r5 = ue.a.f27192u
            if (r8 != r5) goto L3a
            return r5
        L3a:
            u.a r8 = (u.a) r8
            java.lang.Float r5 = r8.f25761a
            float r5 = r5.floatValue()
            q.l r6 = r8.f25762b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r5 = r6.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L54:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.d(t.f1, float, df.l, ve.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f25780c.equals(this.f25780c) && kotlin.jvm.internal.a(hVar.f25779b, this.f25779b) && hVar.f25778a.equals(this.f25778a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25778a.hashCode() + ((this.f25779b.hashCode() + (this.f25780c.hashCode() * 31)) * 31);
    }
}
