package wa;

/* loaded from: classes.dex */
public abstract class q8 {
    public static final String a(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            if (f10 < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f11 = f10 * pow;
        int i = (int) f11;
        if (f11 - i >= 0.5f) {
            i++;
        }
        float f12 = i / pow;
        if (max > 0) {
            return String.valueOf(f12);
        }
        return String.valueOf((int) f12);
    }
}
