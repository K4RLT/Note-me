package s6;

import r.w0;
import r0.g0;
import r0.i1;
import r0.n2;
import r0.y;
import wa.b9;

/* loaded from: classes.dex */
public final class g implements n2 {
    public final i1 A;
    public final g0 B;
    public final i1 C;
    public final i1 D;
    public final i1 E;
    public final i1 F;
    public final g0 G;
    public final w0 H;

    /* renamed from: u, reason: collision with root package name */
    public final i1 f24948u;

    /* renamed from: v, reason: collision with root package name */
    public final i1 f24949v;

    /* renamed from: w, reason: collision with root package name */
    public final i1 f24950w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f24951x;

    /* renamed from: y, reason: collision with root package name */
    public final i1 f24952y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f24953z;

    public g() {
        Boolean bool = Boolean.FALSE;
        this.f24948u = y.B(bool);
        this.f24949v = y.B(1);
        this.f24950w = y.B(1);
        this.f24951x = y.B(bool);
        this.f24952y = y.B(null);
        this.f24953z = y.B(Float.valueOf(1.0f));
        this.A = y.B(bool);
        this.B = y.r(new e(this, 1));
        this.C = y.B(null);
        Float valueOf = Float.valueOf(0.0f);
        this.D = y.B(valueOf);
        this.E = y.B(valueOf);
        this.F = y.B(Long.MIN_VALUE);
        this.G = y.r(new e(this, 0));
        y.r(new e(this, 2));
        this.H = new w0();
    }

    public static final boolean a(g gVar, int i, long j10) {
        long longValue;
        float f10;
        float f11;
        float floatValue;
        float f12;
        i1 i1Var = gVar.C;
        i1 i1Var2 = gVar.D;
        i1 i1Var3 = gVar.f24952y;
        g0 g0Var = gVar.B;
        i1 i1Var4 = gVar.F;
        o6.a aVar = (o6.a) i1Var.getValue();
        if (aVar == null) {
            return true;
        }
        if (((Number) i1Var4.getValue()).longValue() == Long.MIN_VALUE) {
            longValue = 0;
        } else {
            longValue = j10 - ((Number) i1Var4.getValue()).longValue();
        }
        i1Var4.setValue(Long.valueOf(j10));
        l lVar = (l) i1Var3.getValue();
        if (lVar != null) {
            f10 = lVar.f24966a;
        } else {
            f10 = 0.0f;
        }
        l lVar2 = (l) i1Var3.getValue();
        if (lVar2 != null) {
            f11 = lVar2.f24967b;
        } else {
            f11 = 1.0f;
        }
        float floatValue2 = ((Number) g0Var.getValue()).floatValue() * (((float) (longValue / 1000000)) / aVar.b());
        if (((Number) g0Var.getValue()).floatValue() < 0.0f) {
            floatValue = f10 - (((Number) i1Var2.getValue()).floatValue() + floatValue2);
        } else {
            floatValue = (((Number) i1Var2.getValue()).floatValue() + floatValue2) - f11;
        }
        if (floatValue < 0.0f) {
            gVar.h(b9.d(((Number) i1Var2.getValue()).floatValue(), f10, f11) + floatValue2);
            return true;
        }
        float f13 = f11 - f10;
        int i10 = (int) (floatValue / f13);
        int i11 = i10 + 1;
        if (gVar.f() + i11 > i) {
            gVar.h(gVar.e());
            gVar.g(i);
            return false;
        }
        gVar.g(gVar.f() + i11);
        float f14 = floatValue - (i10 * f13);
        if (((Number) g0Var.getValue()).floatValue() < 0.0f) {
            f12 = f11 - f14;
        } else {
            f12 = f10 + f14;
        }
        gVar.h(f12);
        return true;
    }

    public static final void b(g gVar, boolean z3) {
        gVar.f24948u.setValue(Boolean.valueOf(z3));
    }

    public final float e() {
        return ((Number) this.G.getValue()).floatValue();
    }

    public final int f() {
        return ((Number) this.f24949v.getValue()).intValue();
    }

    public final void g(int i) {
        this.f24949v.setValue(Integer.valueOf(i));
    }

    @Override // r0.n2
    public final Object getValue() {
        return Float.valueOf(((Number) this.E.getValue()).floatValue());
    }

    public final void h(float f10) {
        o6.a aVar;
        this.D.setValue(Float.valueOf(f10));
        if (((Boolean) this.A.getValue()).booleanValue() && (aVar = (o6.a) this.C.getValue()) != null) {
            f10 -= f10 % (1 / aVar.f21795n);
        }
        this.E.setValue(Float.valueOf(f10));
    }
}
