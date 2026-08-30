package ya;
import l.b;
import f3.l;
import ff.a;
import r.y;
import y2.c;

import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public abstract class va {
    public static float a(EdgeEffect edgeEffect, float f10, float f11, c cVar) {
        float f12;
        float f13 = y.f24161a;
        double a10 = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double d2 = y.f24161a * a10;
        float exp = (float) (Math.exp((y.f24162b / y.f24163c) * Math.log((Math.abs(f10) * 0.35f) / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f12 = l.b(edgeEffect);
        } else {
            f12 = 0.0f;
        }
        if (exp > f12 * f11) {
            return 0.0f;
        }
        int b10 = a.b(f10);
        if (i >= 31) {
            edgeEffect.onAbsorb(b10);
            return f10;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(b10);
        }
        return f10;
    }
}
