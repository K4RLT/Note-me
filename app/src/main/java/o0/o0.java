package o0;
import d1.d;
import d1.i;
import d1.r;
import g0.c1;
import g0.d1;
import k1.p0;
import r.f;
import r0.a;
import r0.m;
import r0.y;
import t.n0;
import x.j0;

import ya.xe;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21606u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f21607v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f21608w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f21609x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f21610y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f21611z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r rVar, m mVar, j0 j0Var, boolean z3, n0 n0Var, boolean z9, f fVar, d dVar, f fVar2, i iVar, d dVar2, df.l lVar, int i, int i10, int i11) {
        super(2);
        this.f21607v = rVar;
        this.C = mVar;
        this.D = j0Var;
        this.f21608w = z3;
        this.E = n0Var;
        this.f21609x = z9;
        this.F = fVar;
        this.G = dVar;
        this.H = fVar2;
        this.I = iVar;
        this.J = dVar2;
        this.f21610y = lVar;
        this.f21611z = i;
        this.A = i10;
        this.B = i11;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21606u) {
            case 0:
                ((Number) obj2).intValue();
                String str = (String) this.C;
                m2.q0 q0Var = (m2.q0) this.D;
                df.p pVar = (df.p) this.E;
                r2.e0 e0Var = (r2.e0) this.F;
                d1 d1Var = (d1) this.G;
                c1 c1Var = (c1) this.H;
                p0 p0Var = (p0) this.I;
                s1 s1Var = (s1) this.J;
                int L = y.L(1573297);
                int i = this.B;
                a(str, this.f21610y, this.f21607v, this.f21608w, q0Var, pVar, e0Var, d1Var, c1Var, this.f21609x, this.f21611z, this.A, p0Var, s1Var, (m) obj, L, i);
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                m mVar = (m) this.C;
                j0 j0Var = (j0) this.D;
                n0 n0Var = (n0) this.E;
                f fVar = (f) this.F;
                d dVar = (d) this.G;
                f fVar2 = (f) this.H;
                i iVar = (i) this.I;
                d dVar2 = (d) this.J;
                int L2 = y.L(this.f21611z | 1);
                int L3 = y.L(this.A);
                int i10 = this.B;
                xe.a(this.f21607v, mVar, j0Var, this.f21608w, n0Var, this.f21609x, fVar, dVar, fVar2, iVar, dVar2, this.f21610y, (m) obj, L2, L3, i10);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str, df.l lVar, r rVar, boolean z3, m2.q0 q0Var, df.p pVar, r2.e0 e0Var, d1 d1Var, c1 c1Var, boolean z9, int i, int i10, p0 p0Var, s1 s1Var, int i11, int i12) {
        super(2);
        this.C = str;
        this.f21610y = lVar;
        this.f21607v = rVar;
        this.f21608w = z3;
        this.D = q0Var;
        this.E = pVar;
        this.F = e0Var;
        this.G = d1Var;
        this.H = c1Var;
        this.f21609x = z9;
        this.f21611z = i;
        this.A = i10;
        this.I = p0Var;
        this.J = s1Var;
        this.B = i12;
    }
}
