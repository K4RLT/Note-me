package j0;
import l.a;

import java.util.List;
import k1.u;
import m2.l0;
import m2.m0;
import m2.q0;
import qe.s;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18750u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f18751v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(1);
        this.f18750u = i;
        this.f18751v = oVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        m0 m0Var;
        boolean z3;
        long j10;
        switch (this.f18750u) {
            case 0:
                List list = (List) obj;
                o oVar = this.f18751v;
                m0 m0Var2 = oVar.Z0().f18710o;
                if (m0Var2 != null) {
                    l0 l0Var = m0Var2.f20524a;
                    m2.g gVar = l0Var.f20514a;
                    q0 q0Var = oVar.J;
                    u uVar = oVar.T;
                    if (uVar != null) {
                        j10 = uVar.a();
                    } else {
                        j10 = k1.r.f19521l;
                    }
                    m0Var = new m0(new l0(gVar, q0.e(q0Var, j10, 0L, null, null, null, 0L, 0, 0L, 16777214), l0Var.f20516c, l0Var.f20517d, l0Var.e, l0Var.f20518f, l0Var.f20519g, l0Var.f20520h, l0Var.i, l0Var.f20521j), m0Var2.f20525b, m0Var2.f20526c);
                    list.add(m0Var);
                } else {
                    m0Var = null;
                }
                if (m0Var != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                m2.g gVar2 = (m2.g) obj;
                o oVar2 = this.f18751v;
                m mVar = oVar2.Z;
                s sVar = s.f24023u;
                if (mVar != null) {
                    if (!kotlin.jvm.internal.a(gVar2, mVar.f18747b)) {
                        mVar.f18747b = gVar2;
                        e eVar = mVar.f18749d;
                        if (eVar != null) {
                            q0 q0Var2 = oVar2.J;
                            q2.h hVar = oVar2.K;
                            int i = oVar2.M;
                            boolean z9 = oVar2.N;
                            int i10 = oVar2.O;
                            int i11 = oVar2.P;
                            g0.i iVar = oVar2.U;
                            eVar.f18698a = gVar2;
                            eVar.e(q0Var2);
                            eVar.f18699b = hVar;
                            eVar.f18700c = i;
                            eVar.f18701d = z9;
                            eVar.e = i10;
                            eVar.f18702f = i11;
                            eVar.f18703g = sVar;
                            eVar.f18704h = iVar;
                            eVar.f18708m = null;
                            eVar.f18710o = null;
                            eVar.f18712q = -1;
                            eVar.f18711p = -1;
                            eVar.f18713r = null;
                        }
                    }
                } else {
                    m mVar2 = new m(oVar2.I, gVar2);
                    e eVar2 = new e(gVar2, oVar2.J, oVar2.K, oVar2.M, oVar2.N, oVar2.O, oVar2.P, sVar, oVar2.U);
                    eVar2.c(oVar2.Z0().f18706k);
                    mVar2.f18749d = eVar2;
                    oVar2.Z = mVar2;
                }
                b2.l.m(oVar2);
                b2.l.l(oVar2);
                b2.l.k(oVar2);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                o oVar3 = this.f18751v;
                m mVar3 = oVar3.Z;
                if (mVar3 == null) {
                    return Boolean.FALSE;
                }
                df.l lVar = oVar3.V;
                if (lVar != null) {
                    lVar.invoke(mVar3);
                }
                m mVar4 = oVar3.Z;
                if (mVar4 != null) {
                    mVar4.f18748c = booleanValue;
                }
                b2.l.m(oVar3);
                b2.l.l(oVar3);
                b2.l.k(oVar3);
                return Boolean.TRUE;
        }
    }
}
