package g0;
import p0.b;
import a0.k0;
import c2.d2;
import j1.c;
import k0.j1;
import k0.v0;
import l.a;
import m2.m0;
import m2.p0;
import r0.i1;
import z1.x;

import c2.u2;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e1 f17153u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17154v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u2 f17155w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j1 f17156x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r2.x f17157y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r2.q f17158z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e1 e1Var, boolean z3, u2 u2Var, j1 j1Var, r2.x xVar, r2.q qVar) {
        super(1);
        this.f17153u = e1Var;
        this.f17154v = z3;
        this.f17155w = u2Var;
        this.f17156x = j1Var;
        this.f17157y = xVar;
        this.f17158z = qVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        r2.b0 b0Var;
        x xVar;
        x xVar2;
        x xVar3 = (x) obj;
        e1 e1Var = this.f17153u;
        i1 i1Var = e1Var.f17074o;
        e1Var.f17068h = xVar3;
        g2 d2 = e1Var.d();
        if (d2 != null) {
            d2.f17114b = xVar3;
        }
        if (this.f17154v) {
            s0 a10 = e1Var.a();
            s0 s0Var = s0.f17276v;
            r2.x xVar4 = this.f17157y;
            j1 j1Var = this.f17156x;
            if (a10 == s0Var) {
                if (((Boolean) e1Var.f17071l.getValue()).booleanValue() && ((Boolean) ((d2) this.f17155w).f3506a.getValue()).booleanValue()) {
                    j1Var.p();
                } else {
                    j1Var.l();
                }
                e1Var.f17072m.setValue(Boolean.valueOf(v0.w(j1Var, true)));
                e1Var.f17073n.setValue(Boolean.valueOf(v0.w(j1Var, false)));
                i1Var.setValue(Boolean.valueOf(p0.b(xVar4.f24516b)));
            } else if (e1Var.a() == s0.f17277w) {
                i1Var.setValue(Boolean.valueOf(v0.w(j1Var, true)));
            }
            a1.y(e1Var, xVar4, this.f17158z);
            g2 d10 = e1Var.d();
            if (d10 != null && (b0Var = e1Var.e) != null && e1Var.b() && (xVar = d10.f17114b) != null && xVar.i() && (xVar2 = d10.f17115c) != null) {
                m0 m0Var = d10.f17113a;
                a0.k0 k0Var = new a0.k0(16, xVar);
                c y10 = v0.y(xVar);
                c u9 = xVar.u(xVar2, false);
                if (kotlin.jvm.internal.a((r2.b0) b0Var.f24465a.f24519b.get(), b0Var)) {
                    b0Var.f24466b.e(this.f17157y, this.f17158z, m0Var, k0Var, y10, u9);
                }
            }
        }
        return pe.z.f22715a;
    }
}
