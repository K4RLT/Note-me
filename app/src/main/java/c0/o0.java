package c0;
import o0.a;
import x.o;
import a0.k0;
import b0.x;
import c0.d;
import c0.n0;
import c0.o0;
import c0.s;
import t.l;
import t.v1;
import u.h;

/* loaded from: classes.dex */
public final class o0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f3386a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3387b;

    public o0(h hVar, d dVar) {
        this.f3386a = hVar;
        this.f3387b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(v1 r6, float r7, te.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof n0
            if (r0 == 0) goto L13
            r0 = r8
            n0 r0 = (n0) r0
            int r1 = r0.f3383x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3383x = r1
            goto L1a
        L13:
            n0 r0 = new n0
            ve.c r8 = (ve.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.f3381v
            int r1 = r0.f3383x
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            c0.o0 r6 = r0.f3380u
            pe.a.e(r8)
            goto L48
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L30:
            pe.a.e(r8)
            k0 r8 = new k0
            r8.<init>(r5, r6)
            r0.f3380u = r5
            r0.f3383x = r2
            h r1 = r5.f3386a
            java.lang.Object r8 = r1.d(r6, r7, r8, r0)
            ue.a r6 = ue.a.f27192u
            if (r8 != r6) goto L47
            return r6
        L47:
            r6 = r5
        L48:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            d r6 = r6.f3387b
            float r8 = r6.k()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L5a
            goto L92
        L5a:
            float r8 = r6.k()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L92
            int r8 = r6.j()
            l r1 = r6.f3340k
            boolean r1 = r1.a()
            if (r1 == 0) goto L8d
            r0.i1 r1 = r6.f3345p
            java.lang.Object r1 = r1.getValue()
            x r1 = (x) r1
            pf.z r1 = r1.f3434r
            s r2 = new s
            r3 = 2
            r4 = 0
            r2.<init>(r6, r4, r3)
            r3 = 3
            pf.x(r1, r4, r2, r3)
        L8d:
            r1 = 0
            r6.t(r8, r0, r1)
            goto L95
        L92:
            r6.k()
        L95:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.o0.a(v1, float, te.c):java.lang.Object");
    }
}
