package je;

import p.s0;
import p.t0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f19178a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19179b;

    public e(float f10, y2.c cVar) {
        this.f19178a = f10;
        float a10 = cVar.a();
        float f11 = t0.f22259a;
        this.f19179b = a10 * 386.0878f * 160.0f * 0.84f;
    }

    public s0 a(float f10) {
        double b10 = b(f10);
        double d2 = t0.f22259a;
        double d10 = d2 - 1.0d;
        return new s0(f10, (float) (Math.exp((d2 / d10) * b10) * this.f19178a * this.f19179b), (long) (Math.exp(b10 / d10) * 1000.0d));
    }

    public double b(float f10) {
        float[] fArr = p.c.f22112a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f19178a * this.f19179b));
    }

    public e(float f10, float f11) {
        this.f19178a = f10;
        this.f19179b = f11;
    }
}
