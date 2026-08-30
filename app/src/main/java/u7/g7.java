package u7;
import p.a;

/* loaded from: classes.dex */
public final class g7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26246a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26247b;

    public g7(int i, float f10) {
        boolean z3;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f26246a = f10;
        this.f26247b = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g7) {
                g7 g7Var = (g7) obj;
                if (Float.compare(this.f26246a, g7Var.f26246a) != 0 || Float.compare(0.22f, 0.22f) != 0 || this.f26247b != g7Var.f26247b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26247b) + a.a(a.b(1073741824, Float.hashCode(this.f26246a) * 31, 31), 31, 0.22f);
    }

    public final String toString() {
        return "Rule(offsetMm=" + this.f26246a + ", colorArgb=1073741824, widthMm=0.22, fromBottom=" + this.f26247b + ")";
    }
}
