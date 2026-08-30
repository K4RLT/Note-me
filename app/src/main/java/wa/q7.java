package wa;
import r.e;
import r.g;
import r.h;
import k1.r;
import x0.a;

/* loaded from: classes.dex */
public abstract class q7 {
    public static final String a(int i) {
        ya.a(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return mf.f.x(2, num);
    }

    public static final pe.o b(long j10) {
        float h3;
        float f10;
        float f11;
        float f12;
        float max = Math.max(r.h(j10), Math.max(r.g(j10), r.e(j10)));
        float min = max - Math.min(r.h(j10), Math.min(r.g(j10), r.e(j10)));
        float f13 = 0.0f;
        if (min == 0.0f) {
            f12 = 0.0f;
        } else {
            if (max == r.h(j10)) {
                f11 = (((r.g(j10) - r.e(j10)) / min) * 60) + 360.0f;
            } else {
                if (max == r.g(j10)) {
                    h3 = ((r.e(j10) - r.h(j10)) / min) * 60;
                    f10 = 120.0f;
                } else {
                    h3 = ((r.h(j10) - r.g(j10)) / min) * 60;
                    f10 = 240.0f;
                }
                f11 = h3 + f10;
            }
            f12 = f11 % 360.0f;
        }
        if (max != 0.0f) {
            f13 = min / max;
        }
        return new pe.o(Float.valueOf(f12), Float.valueOf(f13), Float.valueOf(max));
    }
}
