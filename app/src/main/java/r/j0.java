package r;
import b0.x;
import d1.q;
import r.g0;
import r.h0;
import r.j0;
import v.f;
import v.g;
import v.h;
import v.i;

import b2.a2;

/* loaded from: classes.dex */
public final class j0 extends q implements a2 {
    public i I;
    public f J;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [h, java.lang.Object, f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y0(r.j0 r4, ve.c r5) {
        /*
            boolean r0 = r5 instanceof g0
            if (r0 == 0) goto L13
            r0 = r5
            g0 r0 = (g0) r0
            int r1 = r0.f24082y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24082y = r1
            goto L18
        L13:
            g0 r0 = new g0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f24080w
            int r1 = r0.f24082y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            f r4 = r0.f24079v
            r.j0 r0 = r0.f24078u
            pe.a.e(r5)
            r5 = r4
            r4 = r0
            goto L4f
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L32:
            pe.a.e(r5)
            f r5 = r4.J
            if (r5 != 0) goto L51
            f r5 = new f
            r5.<init>()
            i r1 = r4.I
            r0.f24078u = r4
            r0.f24079v = r5
            r0.f24082y = r2
            java.lang.Object r0 = r1.a(r5, r0)
            ue.a r1 = ue.a.f27192u
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4.J = r5
        L51:
            pe.z r4 = pe.z.f22715a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.j0.Y0(r.j0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z0(r.j0 r4, ve.c r5) {
        /*
            boolean r0 = r5 instanceof h0
            if (r0 == 0) goto L13
            r0 = r5
            h0 r0 = (h0) r0
            int r1 = r0.f24089x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24089x = r1
            goto L18
        L13:
            h0 r0 = new h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f24087v
            int r1 = r0.f24089x
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            r.j0 r4 = r0.f24086u
            pe.a.e(r5)
            goto L49
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L2e:
            pe.a.e(r5)
            f r5 = r4.J
            if (r5 == 0) goto L4c
            g r1 = new g
            r1.<init>(r5)
            i r5 = r4.I
            r0.f24086u = r4
            r0.f24089x = r2
            java.lang.Object r5 = r5.a(r1, r0)
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L49
            return r0
        L49:
            r5 = 0
            r4.J = r5
        L4c:
            pe.z r4 = pe.z.f22715a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.j0.Z0(r.j0, ve.c):java.lang.Object");
    }

    @Override // b2.a2
    public final void H(v1.k kVar, v1.l lVar, long j10) {
        if (lVar == v1.l.f27332v) {
            int i = kVar.e;
            te.c cVar = null;
            if (i == 4) {
                pf.x(M0(), null, new i0(this, cVar, 0), 3);
            } else if (i == 5) {
                pf.x(M0(), null, new i0(this, cVar, 1), 3);
            }
        }
    }

    @Override // b2.a2
    public final void O() {
        a1();
    }

    @Override // q
    public final void R0() {
        a1();
    }

    public final void a1() {
        f fVar = this.J;
        if (fVar != null) {
            this.I.b(new g(fVar));
            this.J = null;
        }
    }
}
