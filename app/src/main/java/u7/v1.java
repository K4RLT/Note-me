package u7;
import g3.a;
import q.e;
import q.r0;

import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f26942a = {0.0152f, 0.0161f, 0.0231f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f26943b = {0.65f, 0.12f, 0.12f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f26944c = {0.05f, 0.05f, 0.055f};

    /* renamed from: d, reason: collision with root package name */
    public static final List f26945d = qe.m.h(new w1(-3392998, -744863), new w1(-3401106, -207410), new w1(-14795656, -1457046), new w1(-14717092, -5712454), new w1(-10802557, -3296037));

    public static final float[] a(float f10, float f11, float f12, float f13) {
        float f14 = (0.0722f * f12) + (0.7152f * f11) + (0.2126f * f10);
        return new float[]{b9.d(a.x(f10, f14, f13, f14), 0.0f, 1.0f), b9.d(a.x(f11, f14, f13, f14), 0.0f, 1.0f), b9.d(a.x(f12, f14, f13, f14), 0.0f, 1.0f)};
    }

    public static final float b(float f10, float f11) {
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        if (f10 < 1.0f) {
            return 0.75f / (f11 * f10);
        }
        return Math.max(1.0f / (f10 * f11), 0.75f / f11);
    }

    public static final float c(float f10) {
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        return Math.max(0.505f / (f10 * 0.41421357f), 2.0118446f);
    }

    public static final float d(float f10) {
        float f11;
        float f12 = 1.0f;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        if (f10 > 1.0f) {
            f11 = 0.48f;
        } else {
            f11 = 0.58f;
        }
        if (f10 > 0.0f) {
            f12 = f10;
        }
        return Math.max(0.505f / (0.19053824f * f12), 0.75f / (f11 * 0.41421357f));
    }

    public static final float e(float f10) {
        if (Math.abs(f10) < 1.0f) {
            return 0.0f;
        }
        return b9.d(f10 * 0.1f, -4.0f, 4.0f);
    }

    public static final r0 f(float f10) {
        if (f10 > 1.2f) {
            return e.r(0.92f, 200.0f, null, 4);
        }
        return e.r(0.85f, 1500.0f, null, 4);
    }

    public static final float g(float f10) {
        return b9.d(1.0f - (f10 / 0.35f), 0.0f, 1.0f);
    }

    public static final float h(float f10) {
        return b9.d((f10 - 0.65f) / 0.35f, 0.0f, 1.0f);
    }

    public static final float i(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final float j(float f10) {
        return k(f10) / 7.5f;
    }

    public static final float k(float f10) {
        float f11;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        if (f10 > 1.0f) {
            f11 = 0.52f;
        } else {
            f11 = 0.72f;
        }
        return Math.max(1.0f / (f10 * 0.68f), 0.75f / f11);
    }

    public static final float l(int i, boolean z3) {
        float f10 = (4 - i) / 4;
        if (z3) {
            return f10 * 15.4f;
        }
        return -(f10 * 15.4f);
    }

    public static final float m(float f10) {
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        return Math.max(1.0f / (f10 * 0.94f), 0.8823529f);
    }
}
