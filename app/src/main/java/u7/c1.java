package u7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.daren.scraply.R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f25989a;

    static {
        w6 w6Var = w6.HEART;
        f25989a = qe.m.h(new a1("love_hearts", R.string.tpl_love_hearts, -598564, -2594692, -5031344, w6Var, 0.1f, 2.1f), new a1("love_kisses", R.string.tpl_love_kisses, -13953504, -1541490, -8708558, w6.KISS, 0.12f, 2.3f), new a1("love_letter", R.string.tpl_love_letter, -528925, -3567982, -5676182, w6Var, 0.06f, 3.4f));
    }

    public static Bitmap a(a1 a1Var, int i, int i10) {
        float f10;
        float f11;
        Bitmap createBitmap = Bitmap.createBitmap(i, i10, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(a1Var.f25890c);
        float f12 = i;
        float f13 = a1Var.f25893g * f12;
        float f14 = a1Var.f25894h * f13;
        float f15 = 2.0f;
        if (f14 < 2.0f) {
            return createBitmap;
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a1Var.f25891d);
        Path path = new Path();
        float f16 = (-f14) / 2.0f;
        float f17 = f16;
        int i11 = 0;
        while (f17 < i10 + f14) {
            if (i11 % 2 == 1) {
                f10 = f14 / f15;
            } else {
                f10 = 0.0f;
            }
            float f18 = f10 + f16;
            while (f18 < f12 + f14) {
                float f19 = f13 / f15;
                int i12 = b1.f25943a[a1Var.f25892f.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        float f20 = f19 * 1.15f;
                        float f21 = f19 * 0.65f;
                        float f22 = f18 - f20;
                        float f23 = f17 - (0.05f * f21);
                        path.moveTo(f22, f23);
                        float f24 = f20 * 0.72f;
                        float f25 = f17 - (1.05f * f21);
                        float f26 = 0.22f * f20;
                        float f27 = f17 - (0.95f * f21);
                        path.cubicTo(f18 - f24, f25, f18 - f26, f27, f18, f17 - (0.34f * f21));
                        float f28 = f18;
                        path.cubicTo(f18 + f26, f27, f18 + f24, f25, f28 + f20, f23);
                        float f29 = f20 * 0.66f;
                        float f30 = (f21 * 1.02f) + f17;
                        path.cubicTo(f28 + f29, f30, f28 - f29, f30, f22, f23);
                        path.close();
                        f11 = f28;
                    } else {
                        l4.a.o();
                        return null;
                    }
                } else {
                    float f31 = f18;
                    float f32 = (0.9f * f19) + f17;
                    path.moveTo(f31, f32);
                    float f33 = f19 * 1.1f;
                    float f34 = (0.15f * f19) + f17;
                    float f35 = f19 * 0.85f;
                    float f36 = f17 - (f19 * 0.95f);
                    f11 = f31;
                    path.cubicTo(f31 - f33, f34, f31 - f35, f36, f11, f17 - (f19 * 0.35f));
                    path.cubicTo(f11 + f35, f36, f11 + f33, f34, f11, f32);
                    path.close();
                }
                f18 = f11 + f14;
                f15 = 2.0f;
            }
            f17 += f14;
            i11++;
            f15 = 2.0f;
        }
        canvas.drawPath(path, paint);
        return createBitmap;
    }
}
