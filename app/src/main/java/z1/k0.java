package z1;

import b2.d2;

/* loaded from: classes.dex */
public final class k0 extends z0 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f31837v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f31838w;

    public /* synthetic */ k0(int i, Object obj) {
        this.f31837v = i;
        this.f31838w = obj;
    }

    @Override // y2.c
    public final float a() {
        switch (this.f31837v) {
            case 0:
                return ((b2.r0) this.f31838w).a();
            default:
                return ((c2.x) this.f31838w).getDensity().a();
        }
    }

    @Override // z1.z0
    public float c(q qVar) {
        float f10;
        float intBitsToFloat;
        int p10;
        switch (this.f31837v) {
            case 0:
                df.p pVar = qVar.f31864a;
                if (pVar != null) {
                    return ((Number) pVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                b2.r0 r0Var = (b2.r0) this.f31838w;
                if (r0Var.E) {
                    return Float.NaN;
                }
                b2.r0 r0Var2 = r0Var;
                while (true) {
                    d2 d2Var = r0Var2.G;
                    if (d2Var != null && (p10 = qe.k.p(qVar, (q[]) d2Var.f1437b)) >= 0) {
                        f10 = ((float[]) d2Var.f1438c)[p10];
                    } else {
                        f10 = Float.NaN;
                    }
                    if (!Float.isNaN(f10)) {
                        r0Var2.C0(r0Var.O0(), qVar);
                        x M0 = r0Var2.M0();
                        x M02 = r0Var.M0();
                        switch (qVar.f31865b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (M02.d(M0, (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(((int) (M0.k() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (M02.d(M0, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(((int) (M0.k() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    b2.r0 Q0 = r0Var2.Q0();
                    if (Q0 == null) {
                        r0Var2.C0(r0Var.O0(), qVar);
                        return Float.NaN;
                    }
                    r0Var2 = Q0;
                }
                break;
            default:
                return super.c(qVar);
        }
    }

    @Override // z1.z0
    public final x d() {
        x M0;
        switch (this.f31837v) {
            case 0:
                b2.r0 r0Var = (b2.r0) this.f31838w;
                if (r0Var.E) {
                    M0 = null;
                } else {
                    M0 = r0Var.M0();
                }
                if (M0 == null) {
                    r0Var.O0().f1478a0.b();
                }
                return M0;
            default:
                return (b2.k1) ((c2.x) this.f31838w).getRoot().Z.f1459y;
        }
    }

    @Override // z1.z0
    public final y2.m f() {
        switch (this.f31837v) {
            case 0:
                return ((b2.r0) this.f31838w).getLayoutDirection();
            default:
                return ((c2.x) this.f31838w).getLayoutDirection();
        }
    }

    @Override // z1.z0
    public final int g() {
        switch (this.f31837v) {
            case 0:
                return ((b2.r0) this.f31838w).f0();
            default:
                return ((c2.x) this.f31838w).getRoot().f1478a0.f1558p.f31769u;
        }
    }

    @Override // y2.c
    public final float i0() {
        switch (this.f31837v) {
            case 0:
                return ((b2.r0) this.f31838w).i0();
            default:
                return ((c2.x) this.f31838w).getDensity().i0();
        }
    }
}
