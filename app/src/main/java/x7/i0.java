package x7;
import k.a;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class i0 implements k1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f30207a;

    public i0(float f10) {
        this.f30207a = f10;
    }

    @Override // k1.p0
    public final k1.l0 a(long j10, y2.m mVar, y2.c cVar) {
        mVar.getClass();
        cVar.getClass();
        float l0 = cVar.l0(this.f30207a);
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        float min = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i10)) / 2.0f;
        if (l0 > min) {
            l0 = min;
        }
        if (l0 < 0.0f) {
            l0 = 0.0f;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        float intBitsToFloat2 = Float.intBitsToFloat(i10);
        k1.h a10 = k1.a();
        Path path = a10.f19481a;
        a10.h(0.0f, 0.0f);
        a10.g(intBitsToFloat, 0.0f);
        a10.g(intBitsToFloat, intBitsToFloat2);
        a10.g(0.0f, intBitsToFloat2);
        float f10 = -l0;
        float f11 = 2.0f * l0;
        float f12 = intBitsToFloat2 - f11;
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF = a10.f19482b;
        rectF.getClass();
        rectF.set(f10, f12, l0, intBitsToFloat2);
        RectF rectF2 = a10.f19482b;
        rectF2.getClass();
        path.arcTo(rectF2, 90.0f, -90.0f, false);
        a10.g(l0, l0);
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF3 = a10.f19482b;
        rectF3.getClass();
        rectF3.set(f10, 0.0f, l0, f11);
        RectF rectF4 = a10.f19482b;
        rectF4.getClass();
        path.arcTo(rectF4, 0.0f, -90.0f, false);
        a10.d();
        return new k1.e0(a10);
    }
}
