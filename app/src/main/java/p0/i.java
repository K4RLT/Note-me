package p0;

import pe.z;
import q.g1;
import r0.a1;
import wa.u8;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22326u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f22327v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f22328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f10, a1 a1Var) {
        super(1);
        this.f22327v = f10;
        this.f22328w = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f22326u) {
            case 0:
                long j10 = ((j1.e) obj).f18774a;
                float d2 = j1.e.d(j10);
                float f10 = this.f22327v;
                float f11 = d2 * f10;
                float b10 = j1.e.b(j10) * f10;
                a1 a1Var = (a1) this.f22328w;
                if (j1.e.d(((j1.e) a1Var.getValue()).f18774a) != f11 || j1.e.b(((j1.e) a1Var.getValue()).f18774a) != b10) {
                    a1Var.setValue(new j1.e(u8.a(f11, b10)));
                }
                return z.f22715a;
            default:
                long longValue = ((Number) obj).longValue();
                g1 g1Var = (g1) this.f22328w;
                boolean g8 = g1Var.g();
                r0.g1 g1Var2 = g1Var.f22907g;
                if (!g8) {
                    if (g1Var2.h() == Long.MIN_VALUE) {
                        g1Var2.i(longValue);
                        g1Var.f22902a.f22918a.setValue(Boolean.TRUE);
                    }
                    long h3 = longValue - g1Var2.h();
                    float f12 = this.f22327v;
                    if (f12 != 0.0f) {
                        h3 = ff.a.c(h3 / f12);
                    }
                    if (g1Var.f22903b == null) {
                        g1Var.f22906f.i(h3);
                    }
                    if (f12 == 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    g1Var.h(h3, z3);
                }
                return z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g1 g1Var, float f10) {
        super(1);
        this.f22328w = g1Var;
        this.f22327v = f10;
    }
}
