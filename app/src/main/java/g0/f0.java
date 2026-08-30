package g0;
import a.a;
import a2.c;
import d.g;
import d0.b;
import d1.a;
import d1.o;
import d1.r;
import k0.j1;
import k0.v0;
import l2.a;
import m2.p0;
import m2.q0;
import r0.l;
import r0.m;
import r0.r;
import t.z0;
import z0.h;

import wa.j7;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ r2.e0 A;
    public final /* synthetic */ r B;
    public final /* synthetic */ r C;
    public final /* synthetic */ r D;
    public final /* synthetic */ r E;
    public final /* synthetic */ b F;
    public final /* synthetic */ j1 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ df.l I;
    public final /* synthetic */ r2.q J;
    public final /* synthetic */ y2.c K;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e1 f17093u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q0 f17094v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f17095w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f17096x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d2 f17097y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r2.x f17098z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e1 e1Var, q0 q0Var, int i, int i10, d2 d2Var, r2.x xVar, r2.e0 e0Var, r rVar, r rVar2, r rVar3, r rVar4, b bVar, j1 j1Var, boolean z3, df.l lVar, r2.q qVar, y2.c cVar) {
        super(2);
        this.f17093u = e1Var;
        this.f17094v = q0Var;
        this.f17095w = i;
        this.f17096x = i10;
        this.f17097y = d2Var;
        this.f17098z = xVar;
        this.A = e0Var;
        this.B = rVar;
        this.C = rVar2;
        this.D = rVar3;
        this.E = rVar4;
        this.F = bVar;
        this.G = j1Var;
        this.H = z3;
        this.I = lVar;
        this.J = qVar;
        this.K = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        r m2Var;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            e1 e1Var = this.f17093u;
            r g8 = androidx.compose.foundation.layout.g(o.f15687a, ((y2.f) e1Var.f17067g.getValue()).f30805u, Float.NaN);
            int i = this.f17095w;
            int i10 = this.f17096x;
            q0 q0Var = this.f17094v;
            r a10 = a(g8, new t0(i, i10, q0Var));
            boolean h3 = rVar.h(e1Var);
            Object O = rVar.O();
            if (h3 || O == l.f24285a) {
                O = new c(12, e1Var);
                rVar.k0(O);
            }
            df.a aVar = (df.a) O;
            d2 d2Var = this.f17097y;
            z0 z0Var = (z0) d2Var.f17051f.getValue();
            r2.x xVar = this.f17098z;
            long j10 = xVar.f24516b;
            int i11 = p0.f20545c;
            int i12 = (int) (j10 >> 32);
            long j11 = d2Var.e;
            if (i12 == ((int) (j11 >> 32)) && (i12 = (int) (j10 & 4294967295L)) == ((int) (4294967295L & j11))) {
                i12 = p0.e(j10);
            }
            d2Var.e = xVar.f24516b;
            r2.c0 a11 = a(this.A, xVar.f24515a);
            int ordinal = z0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    m2Var = new v0(d2Var, i12, a11, aVar);
                } else {
                    l4.a.o();
                    return null;
                }
            } else {
                m2Var = new m2(d2Var, i12, a11, aVar);
            }
            v0.f(androidx.compose.foundation.relocation.a(a(j7.b(a10).d(m2Var).d(this.B).d(this.C), new f2(1, q0Var)).d(this.D).d(this.E), this.F), h.d(-1172467467, new e0(this.G, e1Var, this.H, this.I, this.f17098z, this.J, this.K, this.f17096x), rVar), rVar, 48);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
