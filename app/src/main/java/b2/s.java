package b2;
import r.e;
import a0.f0;
import b2.g1;
import b2.g2;
import b2.k1;
import b2.q;
import b2.r0;
import b2.r;
import b2.s0;
import b2.s;
import c2.x;
import k1.l0;
import k1.p;
import n1.b;
import z1.a1;
import z1.o0;
import z1.o;
import z1.p0;

import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public final class s extends k1 {
    public static final f0 m0;

    /* renamed from: k0, reason: collision with root package name */
    public final g2 f1589k0;
    public r l0;

    static {
        f0 i = l0.i();
        i.H(r.e);
        i.O(1.0f);
        i.P(1);
        m0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g2, q] */
    /* JADX WARN: Type inference failed for: r3v4, types: [s0] */
    public s(i0 i0Var) {
        super(i0Var);
        r rVar;
        q qVar = new q();
        qVar.f15691x = 0;
        this.f1589k0 = qVar;
        qVar.B = this;
        if (i0Var.B != null) {
            rVar = new s0(this);
        } else {
            rVar = null;
        }
        this.l0 = rVar;
    }

    @Override // r0
    public final int F0(o oVar) {
        r rVar = this.l0;
        if (rVar != null) {
            return rVar.F0(oVar);
        }
        a1 a1Var = this.I.f1478a0.f1558p;
        e0 e0Var = a1Var.f1420z.f1548d;
        j0 j0Var = a1Var.Q;
        if (e0Var == e0.f1443u) {
            j0Var.f1508d = true;
            if (j0Var.f1506b) {
                a1Var.O = true;
                a1Var.P = true;
            }
        } else {
            j0Var.e = true;
        }
        a1Var.g().E = true;
        a1Var.P();
        a1Var.g().E = false;
        Integer num = (Integer) j0Var.f1510g.get(oVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // o0
    public final int Z(int i) {
        e4 u9 = this.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.i((k1) i0Var.Z.f1459y, i0Var.m(), i);
    }

    @Override // o0
    public final int c(int i) {
        e4 u9 = this.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.f((k1) i0Var.Z.f1459y, i0Var.m(), i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [s0, r] */
    @Override // k1
    public final void c1() {
        if (this.l0 == null) {
            this.l0 = new s0(this);
        }
    }

    @Override // k1
    public final s0 f1() {
        return this.l0;
    }

    @Override // k1
    public final q h1() {
        return this.f1589k0;
    }

    @Override // o0
    public final int l(int i) {
        e4 u9 = this.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.a((k1) i0Var.Z.f1459y, i0Var.m(), i);
    }

    @Override // o0
    public final int n(int i) {
        e4 u9 = this.I.u();
        p0 b10 = u9.b();
        i0 i0Var = (i0) u9.f13728v;
        return b10.d((k1) i0Var.Z.f1459y, i0Var.m(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [e] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(g1 r19, long r20, q r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.s.n1(g1, long, q, int, boolean):void");
    }

    @Override // a1
    public final void r0(long j10, float f10, df.l lVar) {
        if (this.J) {
            s0 f12 = f1();
            f12.getClass();
            w1(f12.J, f10, lVar);
        } else {
            w1(j10, f10, lVar);
        }
        if (this.D) {
            return;
        }
        this.I.f1478a0.f1558p.L0();
    }

    @Override // k1
    public final void v1(p pVar, b bVar) {
        i0 i0Var = this.I;
        v1 a10 = m0.a(i0Var);
        e y10 = i0Var.y();
        Object[] objArr = y10.f25617u;
        int i = y10.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            if (i0Var2.J()) {
                i0Var2.i(pVar, bVar);
            }
        }
        if (((x) a10).getShowLayoutBounds()) {
            long j10 = this.f31771w;
            pVar.j(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f, m0);
        }
    }

    @Override // o0
    public final a1 z(long j10) {
        if (this.K) {
            r rVar = this.l0;
            rVar.getClass();
            j10 = rVar.f31772x;
        }
        A0(j10);
        i0 i0Var = this.I;
        e z3 = i0Var.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            ((i0) objArr[i10]).f1478a0.f1558p.F = g0.f1468w;
        }
        z1(i0Var.Q.g(this, i0Var.m(), j10));
        s1();
        return this;
    }
}