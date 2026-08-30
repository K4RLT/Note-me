package a7;

import android.graphics.PointF;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f315a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f10, float f11) {
        boolean z3;
        int i = (int) f10;
        int i10 = (int) f11;
        int i11 = i / i10;
        if ((i ^ i10) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i12 = i % i10;
        if (!z3 && i12 != 0) {
            i11--;
        }
        return i - (i10 * i11);
    }

    public static float e(float f10, float f11, float f12) {
        return g3.a.x(f11, f10, f12, f10);
    }
}
