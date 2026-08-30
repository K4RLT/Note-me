package b8;
import g0.b;
import b1.g0;
import e7.u;
import g7.h;
import r0.l;
import r0.m;
import r0.n2;
import r0.r;

import java.util.Map;

/* loaded from: classes.dex */
public final class i9 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w7.s9 f2215u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Map f2216v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f2217w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f2218x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n2 f2219y;

    public i9(w7.s9 s9Var, Map map, df.l lVar, float f10, n2 n2Var) {
        this.f2215u = s9Var;
        this.f2216v = map;
        this.f2217w = lVar;
        this.f2218x = f10;
        this.f2219y = n2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean f10;
        Object O;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        w7.s9 s9Var = this.f2215u;
        String str = s9Var.f29080a;
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            boolean z11 = s9Var.f29083d;
            boolean z12 = s9Var.f29082c;
            w7.l9 l9Var = null;
            if (z11) {
                w7.p9 p9Var = w7.p9.f28915a;
                w7.pa paVar = (w7.pa) qe.l.x(s9Var.f29088k);
                if (paVar != null) {
                    w7.p9 p9Var2 = w7.p9.f28915a;
                    l9Var = w7.p9.r(paVar);
                }
            }
            w7.l9 l9Var2 = l9Var;
            Object obj3 = l.f24285a;
            Map map = this.f2216v;
            df.l lVar = this.f2217w;
            if (l9Var2 != null) {
                rVar.a0(865132183);
                String str2 = s9Var.f29081b;
                if (mf.f.u(str2)) {
                    str2 = str;
                }
                h hVar = (h) map.get(str);
                u.f15996z.getClass();
                if (g0.b() && !z12) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean b10 = g0.b();
                n2 n2Var = this.f2219y;
                if (b10 && !z12) {
                    q.t tVar = z9.f3099a;
                    if (((Number) n2Var.getValue()).intValue() <= 0) {
                        z10 = true;
                        q.t tVar2 = z9.f3099a;
                        int intValue2 = ((Number) n2Var.getValue()).intValue();
                        f10 = rVar.f(lVar) | rVar.h(s9Var);
                        O = rVar.O();
                        if (!f10 || O == obj3) {
                            O = new h9(lVar, s9Var, 0);
                            rVar.k0(O);
                        }
                        v5.b(str2, l9Var2, hVar, z9, z10, intValue2, (df.a) O, this.f2218x, rVar, 0);
                        rVar.p(false);
                    }
                }
                z10 = false;
                q.t tVar22 = z9.f3099a;
                int intValue22 = ((Number) n2Var.getValue()).intValue();
                f10 = rVar.f(lVar) | rVar.h(s9Var);
                O = rVar.O();
                if (!f10) {
                }
                O = new h9(lVar, s9Var, 0);
                rVar.k0(O);
                v5.b(str2, l9Var2, hVar, z9, z10, intValue22, (df.a) O, this.f2218x, rVar, 0);
                rVar.p(false);
            } else if (!s9Var.f29087j.isEmpty()) {
                rVar.a0(865876276);
                h hVar2 = (h) map.get(str);
                boolean f11 = rVar.f(lVar) | rVar.h(s9Var);
                Object O2 = rVar.O();
                if (f11 || O2 == obj3) {
                    O2 = new h9(lVar, s9Var, 1);
                    rVar.k0(O2);
                }
                w7.r9 r9Var = w7.s9.Companion;
                a3.b(s9Var, hVar2, (df.a) O2, this.f2218x, rVar, 8);
                rVar.p(false);
            } else {
                rVar.a0(866193685);
                h hVar3 = (h) map.get(str);
                boolean f12 = rVar.f(lVar) | rVar.h(s9Var);
                Object O3 = rVar.O();
                if (f12 || O3 == obj3) {
                    O3 = new h9(lVar, s9Var, 2);
                    rVar.k0(O3);
                }
                w7.r9 r9Var2 = w7.s9.Companion;
                z9.h(s9Var, hVar3, (df.a) O3, this.f2218x, rVar, 8);
                rVar.p(false);
            }
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
