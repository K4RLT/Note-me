package w7;
import k.a;
import k1.e0;
import k1.h;
import k1.k;
import k1.l0;
import k1.p0;
import y2.c;
import y2.m;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class z6 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f29542a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29543b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29544c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29545d;

    public z6(float f10, float f11, float f12, float f13) {
        this.f29542a = f10;
        this.f29543b = f11;
        this.f29544c = f12;
        this.f29545d = f13;
    }

    @Override // p0
    public final l0 a(long j10, m mVar, c cVar) {
        float f10;
        mVar.getClass();
        cVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float l0 = cVar.l0(this.f29542a);
        float l02 = cVar.l0(this.f29543b);
        float l03 = cVar.l0(this.f29544c);
        float l04 = cVar.l0(this.f29545d);
        float f11 = 2;
        float f12 = f11 * l03;
        float f13 = f11 * l04;
        if (intBitsToFloat2 < l02 + f12 + f13) {
            f10 = Math.max(0.0f, (intBitsToFloat2 - l02) / (f12 + f13));
        } else {
            f10 = 1.0f;
        }
        float f14 = l03 * f10;
        float f15 = l04 * f10;
        float f16 = f14 + f15;
        if (f16 > l0) {
            float f17 = l0 / f16;
            f14 *= f17;
            f15 *= f17;
        }
        h a10 = k.a();
        float f18 = (intBitsToFloat2 - l02) / 2.0f;
        float f19 = l02 + f18;
        float f20 = l0 + f14;
        Path path = a10.f19481a;
        a10.h(f20, 0.0f);
        a10.g(intBitsToFloat, 0.0f);
        a10.g(intBitsToFloat, intBitsToFloat2);
        a10.g(f20, intBitsToFloat2);
        float f21 = f11 * f14;
        float f22 = intBitsToFloat2 - f21;
        float f23 = l0 + f21;
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF = a10.f19482b;
        rectF.getClass();
        rectF.set(l0, f22, f23, intBitsToFloat2);
        RectF rectF2 = a10.f19482b;
        rectF2.getClass();
        path.arcTo(rectF2, 90.0f, 90.0f, false);
        a10.g(l0, f19 + f15);
        float f24 = f11 * f15;
        float f25 = l0 - f24;
        float f26 = f19 + f24;
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF3 = a10.f19482b;
        rectF3.getClass();
        rectF3.set(f25, f19, l0, f26);
        RectF rectF4 = a10.f19482b;
        rectF4.getClass();
        path.arcTo(rectF4, 0.0f, -90.0f, false);
        a10.g(f14, f19);
        float f27 = f19 - f21;
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF5 = a10.f19482b;
        rectF5.getClass();
        rectF5.set(0.0f, f27, f21, f19);
        RectF rectF6 = a10.f19482b;
        rectF6.getClass();
        path.arcTo(rectF6, 90.0f, 90.0f, false);
        a10.g(0.0f, f18 + f14);
        float f28 = f18 + f21;
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF7 = a10.f19482b;
        rectF7.getClass();
        rectF7.set(0.0f, f18, f21, f28);
        RectF rectF8 = a10.f19482b;
        rectF8.getClass();
        path.arcTo(rectF8, 180.0f, 90.0f, false);
        a10.g(l0 - f15, f18);
        float f29 = f18 - f24;
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF9 = a10.f19482b;
        rectF9.getClass();
        rectF9.set(f25, f29, l0, f18);
        RectF rectF10 = a10.f19482b;
        rectF10.getClass();
        path.arcTo(rectF10, 90.0f, -90.0f, false);
        a10.g(l0, f14);
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF11 = a10.f19482b;
        rectF11.getClass();
        rectF11.set(l0, 0.0f, f23, f21);
        RectF rectF12 = a10.f19482b;
        rectF12.getClass();
        path.arcTo(rectF12, 180.0f, 90.0f, false);
        a10.d();
        return new e0(a10);
    }
}
