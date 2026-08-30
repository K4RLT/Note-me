package g0;
import c2.r1;
import i1.o;
import j1.b;
import k0.j1;
import k1.m0;
import k1.t0;
import m2.g0;
import q.f1;
import q.i0;
import r0.a1;
import r0.i1;
import r0.n2;
import x.a;

import com.google.android.gms.internal.ads.mu;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17192u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17193v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17194w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17195x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17196y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17197z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e1 e1Var, o oVar, boolean z3, j1 j1Var, r2.q qVar) {
        super(1);
        this.f17194w = e1Var;
        this.f17195x = oVar;
        this.f17193v = z3;
        this.f17196y = j1Var;
        this.f17197z = qVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        switch (this.f17192u) {
            case 0:
                long j10 = ((b) obj).f18762a;
                e1 e1Var = (e1) this.f17194w;
                o oVar = (o) this.f17195x;
                if (!e1Var.b()) {
                    o.b(oVar);
                } else {
                    n2 n2Var = e1Var.f17064c;
                    if (n2Var != null) {
                        ((r1) n2Var).b();
                    }
                }
                if (e1Var.b() && this.f17193v) {
                    if (e1Var.a() != s0.f17276v) {
                        g2 d2 = e1Var.d();
                        if (d2 != null) {
                            r2.q qVar = (r2.q) this.f17197z;
                            mu muVar = e1Var.f17065d;
                            i0 i0Var = e1Var.f17081v;
                            int c10 = qVar.c(d2.b(j10, true));
                            i0Var.invoke(r2.a((r2.x) muVar.f8422v, null, g0.b(c10, c10), 5));
                            if (e1Var.f17062a.f17232a.f20477v.length() > 0) {
                                e1Var.f17070k.setValue(s0.f17277w);
                            }
                        }
                    } else {
                        ((j1) this.f17196y).e(new b(j10));
                    }
                }
                return pe.z.f22715a;
            default:
                m0 m0Var = (m0) obj;
                n2 n2Var2 = (n2) this.f17196y;
                i1 i1Var = ((i0) this.f17194w).f22920c;
                float f11 = 0.8f;
                float f12 = 1.0f;
                boolean z3 = this.f17193v;
                if (!z3) {
                    f10 = ((Number) n2Var2.getValue()).floatValue();
                } else if (((Boolean) i1Var.getValue()).booleanValue()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                m0Var.h(f10);
                if (!z3) {
                    f11 = ((Number) n2Var2.getValue()).floatValue();
                } else if (((Boolean) i1Var.getValue()).booleanValue()) {
                    f11 = 1.0f;
                }
                m0Var.i(f11);
                if (!z3) {
                    f12 = ((Number) ((n2) this.f17197z).getValue()).floatValue();
                } else if (!((Boolean) i1Var.getValue()).booleanValue()) {
                    f12 = 0.0f;
                }
                m0Var.b(f12);
                m0Var.m(((t0) ((a1) this.f17195x).getValue()).f19531a);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z3, i0 i0Var, a1 a1Var, f1 f1Var, f1 f1Var2) {
        super(1);
        this.f17193v = z3;
        this.f17194w = i0Var;
        this.f17195x = a1Var;
        this.f17196y = f1Var;
        this.f17197z = f1Var2;
    }
}
