package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class b7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f25964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25965b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25966c;

    public b7(int i, float f10, float f11, int i10) {
        f11 = (i10 & 4) != 0 ? 0.16f : f11;
        this.f25964a = f10;
        this.f25965b = i;
        this.f25966c = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b7) {
                b7 b7Var = (b7) obj;
                if (Float.compare(this.f25964a, b7Var.f25964a) != 0 || this.f25965b != b7Var.f25965b || Float.compare(this.f25966c, b7Var.f25966c) != 0 || Float.compare(0.0f, 0.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + a.a(a.b(this.f25965b, Float.hashCode(this.f25964a) * 31, 31), 31, this.f25966c);
    }

    public final String toString() {
        return "Columns(spacingMm=" + this.f25964a + ", colorArgb=" + this.f25965b + ", widthMm=" + this.f25966c + ", startMm=0.0)";
    }
}
