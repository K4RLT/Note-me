package c0;
import b0.l0;
import l.a;

import r0.e1;
import r0.i1;
import wa.b9;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3309u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0 f3310v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(i0 i0Var, int i) {
        super(1);
        this.f3309u = i;
        this.f3310v = i0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        df.l lVar;
        boolean z3;
        Number valueOf;
        x xVar;
        boolean z9;
        switch (this.f3309u) {
            case 0:
                l0 l0Var = (l0) obj;
                i0 i0Var = this.f3310v;
                b1.i d2 = b1.w.d();
                if (d2 != null) {
                    lVar = d2.e();
                } else {
                    lVar = null;
                }
                b1.i g8 = b1.w.g(d2);
                try {
                    l0Var.a(i0Var.e);
                    b1.w.j(d2, g8, lVar);
                    return pe.z.f22715a;
                } catch (Throwable th) {
                    b1.w.j(d2, g8, lVar);
                    throw th;
                }
            default:
                float floatValue = ((Number) obj).floatValue();
                i0 i0Var2 = this.f3310v;
                long a10 = wa.a(i0Var2);
                float f10 = i0Var2.i + floatValue;
                long c10 = ff.a.c(f10);
                i0Var2.i = f10 - ((float) c10);
                if (Math.abs(floatValue) >= 1.0E-4f) {
                    long j10 = a10 + c10;
                    long f11 = b9.f(j10, i0Var2.f3338h, i0Var2.f3337g);
                    boolean z10 = false;
                    if (j10 != f11) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long j11 = f11 - a10;
                    float f12 = (float) j11;
                    i0Var2.f3339j = f12;
                    float f13 = 0.0f;
                    if (Math.abs(j11) != 0) {
                        i1 i1Var = i0Var2.G;
                        if (f12 > 0.0f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i1Var.setValue(Boolean.valueOf(z9));
                        i1 i1Var2 = i0Var2.H;
                        if (f12 < 0.0f) {
                            z10 = true;
                        }
                        i1Var2.setValue(Boolean.valueOf(z10));
                    }
                    int i = (int) j11;
                    int i10 = -i;
                    x d10 = ((x) i0Var2.f3345p.getValue()).d(i10);
                    if (d10 != null && (xVar = i0Var2.f3333b) != null) {
                        x d11 = xVar.d(i10);
                        if (d11 != null) {
                            i0Var2.f3333b = d11;
                        } else {
                            d10 = null;
                        }
                    }
                    if (d10 != null) {
                        i0Var2.h(d10, i0Var2.f3332a, true);
                        i0Var2.C.setValue(pe.z.f22715a);
                    } else {
                        z zVar = i0Var2.f3335d;
                        i0 i0Var3 = (i0) zVar.f3437v;
                        e1 e1Var = (e1) zVar.f3439x;
                        if (i0Var3.o() != 0) {
                            f13 = i / i0Var3.o();
                        }
                        e1Var.i(e1Var.h() + f13);
                        b2.i0 i0Var4 = (b2.i0) i0Var2.f3354y.getValue();
                        if (i0Var4 != null) {
                            i0Var4.k();
                        }
                    }
                    if (z3) {
                        valueOf = Long.valueOf(j11);
                    } else {
                        valueOf = Float.valueOf(floatValue);
                    }
                    floatValue = valueOf.floatValue();
                }
                return Float.valueOf(floatValue);
        }
    }
}
