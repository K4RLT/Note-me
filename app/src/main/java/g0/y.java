package g0;
import a1.e;
import d1.o;
import k0.d0;
import k0.n;
import k0.q;
import k0.r;
import k0.s0;
import k0.t0;
import k0.v0;
import k0.x;
import k0.y;
import l.a;
import m.h;
import m2.m0;
import r0.l;
import r0.m;
import z0.c;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17358u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f17359v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f17360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t0 t0Var, c cVar, int i) {
        super(2);
        this.f17360w = t0Var;
        this.f17359v = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        k0.y yVar;
        x2.j jVar;
        q qVar;
        n c10;
        q qVar2;
        n c11;
        switch (this.f17358u) {
            case 0:
                ((Number) obj2).intValue();
                e(this.f17360w, this.f17359v, (m) obj, r0.y.L(49));
                return pe.z.f22715a;
            default:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                boolean z10 = true;
                boolean z11 = false;
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    this.f17359v.invoke(rVar, 0);
                    t0 t0Var = this.f17360w;
                    if (t0Var.g() && ((Boolean) t0Var.i.getValue()).booleanValue()) {
                        r e = t0Var.e();
                        if (e != null) {
                            z10 = kotlin.jvm.internal.a(e.f19399a, e.f19400b);
                        }
                        if (!z10) {
                            rVar.a0(-881553831);
                            r e8 = t0Var.e();
                            if (e8 == null) {
                                rVar.a0(-881514989);
                                rVar.p(false);
                                z9 = false;
                            } else {
                                rVar.a0(-881514988);
                                rVar.a0(1495586214);
                                List h3 = qe.h(Boolean.TRUE, Boolean.FALSE);
                                int size = h3.size();
                                int i = 0;
                                while (i < size) {
                                    boolean booleanValue = ((Boolean) h3.get(i)).booleanValue();
                                    boolean g8 = rVar.g(booleanValue);
                                    Object O = rVar.O();
                                    v0 v0Var = l.f24285a;
                                    if (g8 || O == v0Var) {
                                        O = new s0(booleanValue, t0Var);
                                        rVar.k0(O);
                                    }
                                    p1 p1Var = (p1) O;
                                    boolean g10 = rVar.g(booleanValue);
                                    Object O2 = rVar.O();
                                    if (g10 || O2 == v0Var) {
                                        if (booleanValue) {
                                            yVar = new k0.y(t0Var, 0);
                                        } else {
                                            yVar = new k0.y(t0Var, 1);
                                        }
                                        O2 = yVar;
                                        rVar.k0(O2);
                                    }
                                    df.a aVar = (df.a) O2;
                                    if (booleanValue) {
                                        jVar = e8.f19399a.f19392a;
                                    } else {
                                        jVar = e8.f19400b.f19392a;
                                    }
                                    float f10 = 0.0f;
                                    if (booleanValue) {
                                        r e10 = t0Var.e();
                                        if (e10 != null && (c11 = t0Var.c((qVar2 = e10.f19399a))) != null) {
                                            int i10 = qVar2.f19393b;
                                            m0 m0Var = (m0) c11.f19363c.invoke();
                                            if (m0Var != null) {
                                                f10 = a1.x(m0Var, i10);
                                            }
                                        }
                                    } else {
                                        r e11 = t0Var.e();
                                        if (e11 != null && (c10 = t0Var.c((qVar = e11.f19400b))) != null) {
                                            int i11 = qVar.f19393b;
                                            m0 m0Var2 = (m0) c10.f19363c.invoke();
                                            if (m0Var2 != null) {
                                                f10 = a1.x(m0Var2, i11);
                                            }
                                        }
                                    }
                                    float f11 = f10;
                                    x2.j jVar2 = jVar;
                                    d0 d0Var = new d0(aVar);
                                    boolean z12 = e8.f19401c;
                                    boolean h10 = rVar.h(p1Var);
                                    Object O3 = rVar.O();
                                    if (h10 || O3 == v0Var) {
                                        O3 = new x(p1Var, 0);
                                        rVar.k0(O3);
                                    }
                                    v0.d(d0Var, booleanValue, jVar2, z12, 0L, f11, d0.b(o.f15687a, p1Var, (PointerInputEventHandler) O3), rVar, 0);
                                    i++;
                                    z11 = false;
                                }
                                z9 = z11;
                                rVar.p(z9);
                                rVar.p(z9);
                            }
                            rVar.p(z9);
                        }
                    }
                    rVar.a0(-879541497);
                    rVar.p(false);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c cVar, t0 t0Var) {
        super(2);
        this.f17359v = cVar;
        this.f17360w = t0Var;
    }
}
