package c0;
import a0.u;
import b0.n;
import b0.x;
import d0.b;
import p.a;
import q.d;
import q.l;
import r.l0;
import r.m0;
import r.o0;
import r.q0;
import s.f;
import t.o;
import v.i;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.ads.n00;
import g0.y1;
import k0.p0;
import q.g1;
import r0.a1;
import r0.n2;
import r0.v0;
import t.r1;
import t.z0;
import ya.ed;
import ya.jb;
import ya.nc;
import z1.r0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3377u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3378v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3379w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(d0 d0Var, df.a aVar) {
        super(3);
        this.f3377u = 6;
        this.f3378v = d0Var;
        this.f3379w = (kotlin.jvm.internal.m) aVar;
    }

    /* JADX WARN: Type inference failed for: r13v25, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r13v56, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r1v34, types: [kotlin.jvm.internal.m, df.a] */
    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        float a10;
        long j10;
        i iVar;
        boolean z3;
        int i;
        boolean z9;
        switch (this.f3377u) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                float floatValue3 = ((Number) obj3).floatValue();
                d dVar = (d) this.f3378v;
                y2.m mVar = (y2.m) this.f3379w;
                boolean b10 = nc.b(dVar, floatValue);
                char c10 = 0;
                if (dVar.l().e != z0.f25597u && mVar != y2.m.f30814u) {
                    b10 = !b10;
                }
                int i10 = dVar.l().f3420b;
                if (i10 == 0) {
                    a10 = 0.0f;
                } else {
                    a10 = nc.a(dVar) / i10;
                }
                float f10 = a10 - ((int) a10);
                if (Math.abs(floatValue) >= dVar.f3346q.l0(l.f25798a)) {
                    if (floatValue > 0.0f) {
                        c10 = 1;
                    } else {
                        c10 = 2;
                    }
                }
                if (c10 == 0) {
                    if (Math.abs(f10) > 0.5f) {
                        floatValue2 = floatValue3;
                    } else {
                        floatValue2 = floatValue3;
                        break;
                    }
                } else {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                }
                return Float.valueOf(floatValue2);
            case 1:
                ((Number) obj3).intValue();
                i iVar2 = (i) this.f3379w;
                r0.r rVar = (r0.r) ((r0.m) obj2);
                rVar.a0(-102778667);
                Object O = rVar.O();
                v0 v0Var = r0.l.f24285a;
                if (O == v0Var) {
                    O = r0.y.p(rVar);
                    rVar.k0(O);
                }
                pf.z zVar = (pf.z) O;
                Object O2 = rVar.O();
                if (O2 == v0Var) {
                    O2 = r0.y.B(null);
                    rVar.k0(O2);
                }
                a1 a1Var = (a1) O2;
                a1 G = r0.y.G((df.l) this.f3378v, rVar);
                boolean f11 = rVar.f(iVar2);
                Object O3 = rVar.O();
                if (f11 || O3 == v0Var) {
                    O3 = new u(a1Var, 24, iVar2);
                    rVar.k0(O3);
                }
                r0.y.c(iVar2, (df.l) O3, rVar);
                boolean h3 = rVar.h(zVar) | rVar.f(iVar2) | rVar.f(G);
                Object O4 = rVar.O();
                if (h3 || O4 == v0Var) {
                    O4 = new y1(zVar, a1Var, iVar2, G);
                    rVar.k0(O4);
                }
                d1.r b11 = v1.b(d1.o.f15687a, iVar2, (PointerInputEventHandler) O4);
                rVar.p(false);
                return b11;
            case 2:
                ((Number) obj3).intValue();
                r0.r rVar2 = (r0.r) ((r0.m) obj2);
                rVar2.a0(759876635);
                df.a aVar = (df.a) this.f3378v;
                Object O5 = rVar2.O();
                v0 v0Var2 = r0.l.f24285a;
                if (O5 == v0Var2) {
                    O5 = r0.y.r(aVar);
                    rVar2.k0(O5);
                }
                n2 n2Var = (n2) O5;
                Object O6 = rVar2.O();
                if (O6 == v0Var2) {
                    O6 = new d(new j1.b(((j1.b) n2Var.getValue()).f18762a), q0.f19396b, new j1.b(q0.f19397c), 8);
                    rVar2.k0(O6);
                }
                d dVar2 = (d) O6;
                boolean h10 = rVar2.h(dVar2);
                Object O7 = rVar2.O();
                if (h10 || O7 == v0Var2) {
                    O7 = new a6.f(n2Var, dVar2, null, 18);
                    rVar2.k0(O7);
                }
                r0.y.f((df.p) O7, pe.z.f22715a, rVar2);
                l lVar = dVar2.f22865c;
                df.l lVar2 = (df.l) this.f3379w;
                boolean f12 = rVar2.f(lVar);
                Object O8 = rVar2.O();
                if (f12 || O8 == v0Var2) {
                    O8 = new p0(lVar, 0);
                    rVar2.k0(O8);
                }
                d1.r rVar3 = (d1.r) lVar2.invoke((df.a) O8);
                rVar2.p(false);
                return rVar3;
            case 3:
                r0 r0Var = (r0) obj;
                z1.a1 z10 = ((z1.o0) obj2).z(((y2.a) obj3).f30799a);
                if (r0Var.j0() && !((Boolean) ((kotlin.jvm.internal.m) this.f3378v).invoke(((g1) this.f3379w).f22905d.getValue())).booleanValue()) {
                    j10 = 0;
                } else {
                    j10 = (z10.f31769u << 32) | (z10.f31770v & 4294967295L);
                }
                return r0Var.u0((int) (j10 >> 32), (int) (4294967295L & j10), qe.t.f24024u, new b0.n(z10, 6));
            case 4:
                ((Number) obj3).intValue();
                r0.r rVar4 = (r0.r) ((r0.m) obj2);
                rVar4.a0(-1534186401);
                l0 l0Var = (l0) rVar4.j(androidx.compose.foundation.d.f469a);
                if (l0Var instanceof q0) {
                    rVar4.a0(-1726068379);
                    rVar4.p(false);
                    iVar = null;
                } else {
                    rVar4.a0(-1725935761);
                    Object O9 = rVar4.O();
                    if (O9 == r0.l.f24285a) {
                        O9 = a.r(rVar4);
                    }
                    iVar = (i) O9;
                    rVar4.p(false);
                }
                d1.r g8 = androidx.compose.foundation.a.g(d1.o.f15687a, iVar, l0Var, (df.a) this.f3378v, (df.a) this.f3379w);
                rVar4.p(false);
                return g8;
            case 5:
                ((Number) obj3).intValue();
                r0.r rVar5 = (r0.r) ((r0.m) obj2);
                rVar5.a0(-353972293);
                m0 b12 = ((l0) this.f3378v).b((i) this.f3379w, rVar5);
                boolean f13 = rVar5.f(b12);
                Object O10 = rVar5.O();
                if (f13 || O10 == r0.l.f24285a) {
                    O10 = new o0(b12);
                    rVar5.k0(O10);
                }
                o0 o0Var = (o0) O10;
                rVar5.p(false);
                return o0Var;
            case 6:
                b bVar = (b) obj;
                r0.m mVar2 = (r0.m) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((r0.r) mVar2).f(bVar)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar6 = (r0.r) mVar2;
                if (rVar6.R(intValue & 1, z3)) {
                    String str = (String) ((d0) this.f3378v).invoke(rVar6, 0);
                    if (mf.f.u(str)) {
                        a.c("Label must not be blank");
                    }
                    l.b(str, bVar, (kotlin.jvm.internal.m) this.f3379w, rVar6, (intValue << 6) & 896);
                } else {
                    rVar6.U();
                }
                return pe.z.f22715a;
            case 7:
                r0.m mVar3 = (r0.m) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r0.r rVar7 = (r0.r) mVar3;
                if (rVar7.R(intValue2 & 1, z9)) {
                    Object O11 = rVar7.O();
                    if (O11 == r0.l.f24285a) {
                        O11 = new f();
                        rVar7.k0(O11);
                    }
                    f fVar = (f) O11;
                    Object r13 = (kotlin.jvm.internal.m) this.f3378v;
                    b bVar2 = (b) this.f3379w;
                    fVar.f24835a.clear();
                    r13.invoke(fVar);
                    fVar.a(bVar2, rVar7, 0);
                } else {
                    rVar7.U();
                }
                return pe.z.f22715a;
            default:
                v1.t tVar = (v1.t) obj;
                v1.t tVar2 = (v1.t) obj2;
                long j11 = ((j1.b) obj3).f18762a;
                r1 r1Var = (r1) this.f3378v;
                if (((Boolean) r1Var.L.invoke(tVar)).booleanValue()) {
                    if (!r1Var.Q) {
                        if (r1Var.O == null) {
                            r1Var.O = jb.a(Integer.MAX_VALUE, 6, null);
                        }
                        r1Var.Q = true;
                        pf.x(r1Var.M0(), null, new l0(r1Var, null), 3);
                    }
                    ed.a((n00) this.f3379w, tVar);
                    long g10 = j1.b.g(tVar2.f27343c, j11);
                    rf.h hVar = r1Var.O;
                    if (hVar != null) {
                        hVar.e(new o(g10));
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(df.l lVar, g1 g1Var) {
        super(3);
        this.f3377u = 3;
        this.f3378v = (kotlin.jvm.internal.m) lVar;
        this.f3379w = g1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(df.l lVar, b bVar) {
        super(3);
        this.f3377u = 7;
        this.f3378v = (kotlin.jvm.internal.m) lVar;
        this.f3379w = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i, Object obj2) {
        super(3);
        this.f3377u = i;
        this.f3378v = obj;
        this.f3379w = obj2;
    }
}