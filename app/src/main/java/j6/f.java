package j6;

/* loaded from: classes.dex */
public abstract class f {
    public static float a(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f10) {
        if (f10 <= 0.0031308f) {
            return f10 * 12.92f;
        }
        return (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(int i, int i10, float f10) {
        if (i == i10 || f10 <= 0.0f) {
            return i;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float f11 = ((i >> 24) & 255) / 255.0f;
        float f12 = ((i10 >> 24) & 255) / 255.0f;
        float a10 = a(((i >> 16) & 255) / 255.0f);
        float a11 = a(((i >> 8) & 255) / 255.0f);
        float a12 = a((i & 255) / 255.0f);
        float a13 = a(((i10 >> 16) & 255) / 255.0f);
        float a14 = a(((i10 >> 8) & 255) / 255.0f);
        float a15 = a((i10 & 255) / 255.0f);
        float x9 = g3.a.x(f12, f11, f10, f11);
        float x10 = g3.a.x(a13, a10, f10, a10);
        float x11 = g3.a.x(a14, a11, f10, a11);
        float x12 = g3.a.x(a15, a12, f10, a12);
        float b10 = b(x10) * 255.0f;
        float b11 = b(x11) * 255.0f;
        return Math.round(b(x12) * 255.0f) | (Math.round(b10) << 16) | (Math.round(x9 * 255.0f) << 24) | (Math.round(b11) << 8);
    }
}
