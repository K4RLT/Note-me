package u7;
import u7.i7;
import u7.z6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f27107a = new ConcurrentHashMap();

    public static void a(Canvas canvas, float f10, float f11, float f12, i7 i7Var, boolean z3, boolean z9) {
        int i;
        canvas.getClass();
        i7Var.getClass();
        Integer num = i7Var.f26341c;
        if ((num != null || !i7Var.f26342d.isEmpty()) && f11 > 1.0f && f12 > 1.0f) {
            int save = canvas.save();
            try {
                canvas.clipRect(f10, 0.0f, f10 + f11, 0.0f + f12);
                canvas.translate(f10, 0.0f);
                if (num != null) {
                    int intValue = num.intValue();
                    if (z9) {
                        intValue = v6.i(intValue);
                    }
                    canvas.drawColor(intValue);
                }
                boolean z10 = false;
                if (!z3) {
                    canvas.translate(f11, 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                if (z3 || !z3) {
                    z10 = true;
                }
                List<x6> c10 = c(i7Var, f11, f12, z10);
                if (c10.isEmpty()) {
                    canvas.restoreToCount(save);
                    return;
                }
                Paint paint = new Paint(1);
                for (x6 x6Var : c10) {
                    if (z9) {
                        i = v6.i(x6Var.f27039b);
                    } else {
                        i = x6Var.f27039b;
                    }
                    paint.setColor(i);
                    float f13 = x6Var.f27040c;
                    float[] fArr = x6Var.f27038a;
                    Path path = x6Var.e;
                    paint.setStrokeWidth(f13);
                    if (path != null) {
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawPath(path, paint);
                    } else {
                        paint.setStyle(Paint.Style.STROKE);
                        if (x6Var.f27041d) {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                            canvas.drawPoints(fArr, paint);
                        } else {
                            paint.setStrokeCap(Paint.Cap.BUTT);
                            canvas.drawLines(fArr, paint);
                        }
                    }
                }
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    public static void b(Canvas canvas, float f10, float f11, i7 i7Var, i7 i7Var2, boolean z3) {
        canvas.getClass();
        i7Var.getClass();
        i7Var2.getClass();
        float f12 = f10 / 2.0f;
        a(canvas, 0.0f, f12, f11, i7Var, true, z3);
        a(canvas, f12, f12, f11, i7Var2, false, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0490 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List c(i7 r41, float r42, float r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.z6.c(i7, float, float, boolean):java.util.List");
    }
}
