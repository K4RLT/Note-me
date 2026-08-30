package q1;
import p.a;

import b2.l0;
import j.i0;
import r0.f1;
import r0.i1;

/* loaded from: classes.dex */
public final class c0 extends p1.b {
    public final i1 e = r0.y.B(new j1.e(0));

    /* renamed from: f, reason: collision with root package name */
    public final i1 f23230f = r0.y.B(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    public final x f23231g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f23232h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public k1.s f23233j;

    /* renamed from: k, reason: collision with root package name */
    public int f23234k;

    public c0(b bVar) {
        x xVar = new x(bVar);
        xVar.f23312f = new a2.c(26, this);
        this.f23231g = xVar;
        this.f23232h = new f1(0);
        this.i = 1.0f;
        this.f23234k = -1;
    }

    @Override // p1.b
    public final void a(float f10) {
        this.i = f10;
    }

    @Override // p1.b
    public final void b(k1.s sVar) {
        this.f23233j = sVar;
    }

    @Override // p1.b
    public final long d() {
        return ((j1.e) this.e.getValue()).f18774a;
    }

    @Override // p1.b
    public final void e(l0 l0Var) {
        m1.b bVar = l0Var.f1533u;
        k1.s sVar = this.f23233j;
        x xVar = this.f23231g;
        if (sVar == null) {
            sVar = (k1.s) xVar.f23313g.getValue();
        }
        if (((Boolean) this.f23230f.getValue()).booleanValue() && l0Var.getLayoutDirection() == y2.m.f30815v) {
            long w02 = bVar.w0();
            i0 i0Var = bVar.f20424v;
            long r8 = i0Var.r();
            i0Var.j().l();
            try {
                ((ic.c) i0Var.f18636v).A(-1.0f, 1.0f, w02);
                xVar.e(l0Var, this.i, sVar);
            } finally {
                a.v(i0Var, r8);
            }
        } else {
            xVar.e(l0Var, this.i, sVar);
        }
        this.f23234k = this.f23232h.h();
    }
}
