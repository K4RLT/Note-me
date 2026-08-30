package b8;
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
public final class f3 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2065a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2066b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2067c;

    public f3() {
        float f10 = r4.e;
        float f11 = r4.f2639f;
        float f12 = r4.f2640g;
        this.f2065a = f10;
        this.f2066b = f11;
        this.f2067c = f12;
    }

    @Override // p0
    public final l0 a(long j10, m mVar, c cVar) {
        mVar.getClass();
        cVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float l0 = cVar.l0(this.f2065a / 2.0f);
        float f10 = intBitsToFloat / 2.0f;
        if (l0 > f10) {
            l0 = f10;
        }
        float l02 = cVar.l0(this.f2066b);
        float f11 = intBitsToFloat2 / 2.0f;
        if (l02 > f11) {
            l02 = f11;
        }
        float l03 = cVar.l0(this.f2067c);
        float f12 = intBitsToFloat / 4.0f;
        if (l03 > f12) {
            l03 = f12;
        }
        h a10 = k.a();
        Path path = a10.f19481a;
        a10.h(f10 - l0, 0.0f);
        a10.g(f10 + l0, 0.0f);
        a10.g(intBitsToFloat, l02);
        a10.g(intBitsToFloat, intBitsToFloat2 - l03);
        if (l03 > 0.0f) {
            float f13 = l03 * 2.0f;
            float f14 = intBitsToFloat - f13;
            float f15 = intBitsToFloat2 - f13;
            if (a10.f19482b == null) {
                a10.f19482b = new RectF();
            }
            RectF rectF = a10.f19482b;
            rectF.getClass();
            rectF.set(f14, f15, intBitsToFloat, intBitsToFloat2);
            RectF rectF2 = a10.f19482b;
            rectF2.getClass();
            path.arcTo(rectF2, 0.0f, 90.0f, false);
        }
        a10.g(l03, intBitsToFloat2);
        if (l03 > 0.0f) {
            float f16 = l03 * 2.0f;
            float f17 = intBitsToFloat2 - f16;
            if (a10.f19482b == null) {
                a10.f19482b = new RectF();
            }
            RectF rectF3 = a10.f19482b;
            rectF3.getClass();
            rectF3.set(0.0f, f17, f16, intBitsToFloat2);
            RectF rectF4 = a10.f19482b;
            rectF4.getClass();
            path.arcTo(rectF4, 90.0f, 90.0f, false);
        }
        a10.g(0.0f, l02);
        a10.d();
        return new e0(a10);
    }
}
