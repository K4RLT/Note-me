package t;
import t.d;

/* loaded from: classes.dex */
public final class f implements d {
    @Override // d
    public final float a(float f10, float f11, float f12) {
        boolean z3;
        float abs = Math.abs((f11 + f10) - f10);
        if (abs <= f12) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f13 = (0.3f * f12) - (0.0f * abs);
        float f14 = f12 - f13;
        if (z3 && f14 < abs) {
            f13 = f12 - abs;
        }
        return f10 - f13;
    }
}
