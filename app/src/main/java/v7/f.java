package v7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import u7.n2;
import w7.c5;
import w7.d5;
import wa.b9;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f27423a = new e(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static volatile n2 f27424b;

    public static final RectF a(float f10, float f11, int i, int i10, float f12, float f13, float f14) {
        float f15 = i;
        float f16 = i10;
        float d2 = b9.d(f12, 1.0f, 4.0f) * Math.max(f10 / f15, f11 / f16);
        float f17 = f15 * d2;
        float f18 = d2 * f16;
        pe.j b10 = b(f10 / f11, f15 / f16, f12);
        float floatValue = ((Number) b10.f22693u).floatValue();
        float floatValue2 = ((Number) b10.f22694v).floatValue();
        float d10 = (b9.d(f13, -floatValue, floatValue) * f10) + ((f10 - f17) / 2.0f);
        float d11 = (b9.d(f14, -floatValue2, floatValue2) * f11) + ((f11 - f18) / 2.0f);
        return new RectF(d10, d11, f17 + d10, f18 + d11);
    }

    public static final pe.j b(float f10, float f11, float f12) {
        float f13;
        float f14 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        if (f10 > 0.0f && f11 > 0.0f) {
            if (f12 < 1.0f) {
                f12 = 1.0f;
            }
            if (f11 >= f10) {
                float f15 = (f11 * f12) / f10;
                f13 = f12;
                f12 = f15;
            } else {
                f13 = (f10 * f12) / f11;
            }
            float f16 = (f12 - 1.0f) / 2.0f;
            if (f16 < 0.0f) {
                f16 = 0.0f;
            }
            Float valueOf2 = Float.valueOf(f16);
            float f17 = (f13 - 1.0f) / 2.0f;
            if (f17 >= 0.0f) {
                f14 = f17;
            }
            return new pe.j(valueOf2, Float.valueOf(f14));
        }
        return new pe.j(valueOf, valueOf);
    }

    public static final Rect c(int i, int i10, u7.b bVar) {
        bVar.getClass();
        e d2 = d(bVar);
        float f10 = i;
        int i11 = (int) (d2.f27419a * f10);
        int i12 = i - 1;
        if (i12 < 0) {
            i12 = 0;
        }
        int e = b9.e(i11, 0, i12);
        float f11 = i10;
        int i13 = (int) (d2.f27420b * f11);
        int i14 = i10 - 1;
        if (i14 < 0) {
            i14 = 0;
        }
        int e8 = b9.e(i13, 0, i14);
        return new Rect(e, e8, b9.e(Math.round(d2.f27421c * f10), e + 1, i), b9.e(Math.round(d2.f27422d * f11), e8 + 1, i10));
    }

    public static final e d(u7.b bVar) {
        bVar.getClass();
        float f10 = bVar.f25930p;
        float f11 = bVar.f25931q;
        float f12 = bVar.f25932r;
        float f13 = bVar.f25933s;
        float abs = Math.abs(f10);
        e eVar = f27423a;
        if (abs <= Float.MAX_VALUE && Math.abs(f11) <= Float.MAX_VALUE && Math.abs(f12) <= Float.MAX_VALUE && Math.abs(f13) <= Float.MAX_VALUE && f10 >= 0.0f && f11 >= 0.0f && f12 <= 1.0f && f13 <= 1.0f && f12 - f10 >= 0.05f && f13 - f11 >= 0.05f) {
            return new e(f10, f11, f12, f13);
        }
        return eVar;
    }

    public static final void e(Canvas canvas, Bitmap bitmap, u7.b bVar, Paint paint) {
        bVar.getClass();
        if (!g(bVar)) {
            canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
            return;
        }
        float width = r7.width() / 2.0f;
        float height = r7.height() / 2.0f;
        canvas.drawBitmap(bitmap, c(bitmap.getWidth(), bitmap.getHeight(), bVar), new RectF(-width, -height, width, height), paint);
    }

    public static final pe.j f(u7.b bVar, Integer num, Integer num2) {
        bVar.getClass();
        d5 b10 = bVar.b();
        if (b10 != null) {
            return c5.v(b10);
        }
        if (num != null && num2 != null && num.intValue() > 0 && num2.intValue() > 0) {
            if (!g(bVar)) {
                return new pe.j(Float.valueOf(num.intValue()), Float.valueOf(num2.intValue()));
            }
            Rect c10 = c(num.intValue(), num2.intValue(), bVar);
            return new pe.j(Float.valueOf(c10.width()), Float.valueOf(c10.height()));
        }
        e d2 = d(bVar);
        return new pe.j(Float.valueOf((d2.f27421c - d2.f27419a) * 300.0f), Float.valueOf((d2.f27422d - d2.f27420b) * 300.0f));
    }

    public static final boolean g(u7.b bVar) {
        bVar.getClass();
        if (bVar.f25930p <= 5.0E-4f && bVar.f25931q <= 5.0E-4f && bVar.f25932r >= 0.9995f && bVar.f25933s >= 0.9995f) {
            return false;
        }
        return true;
    }
}
