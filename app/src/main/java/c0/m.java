package c0;
import t.d;

import wa.b9;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: b, reason: collision with root package name */
    public final d f3372b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3373c;

    public m(d dVar, d dVar2) {
        this.f3372b = dVar;
        this.f3373c = dVar2;
    }

    @Override // d
    public final float a(float f10, float f11, float f12) {
        float a10 = this.f3373c.a(f10, f11, f12);
        boolean z3 = false;
        if (f10 <= 0.0f ? f10 + f11 <= 0.0f : f10 + f11 > f12) {
            z3 = true;
        }
        float abs = Math.abs(a10);
        d dVar = this.f3372b;
        if (abs != 0.0f && z3) {
            float f13 = dVar.f3336f * (-1);
            while (a10 > 0.0f && f13 < a10) {
                f13 += dVar.o();
            }
            while (a10 < 0.0f && f13 > a10) {
                f13 -= dVar.o();
            }
            return f13;
        }
        if (Math.abs(dVar.f3336f) < 1.0E-6d) {
            return 0.0f;
        }
        float f14 = dVar.f3336f * (-1.0f);
        if (((Boolean) dVar.G.getValue()).booleanValue()) {
            f14 += dVar.o();
        }
        return b9.d(f14, -f12, f12);
    }
}
