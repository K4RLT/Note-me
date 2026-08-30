package u7;
import p.a;

/* loaded from: classes.dex */
public final class e7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26151b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26152c;

    public e7(int i, float f10, float f11) {
        this.f26150a = f10;
        this.f26151b = i;
        this.f26152c = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e7) {
                e7 e7Var = (e7) obj;
                if (Float.compare(this.f26150a, e7Var.f26150a) != 0 || this.f26151b != e7Var.f26151b || Float.compare(this.f26152c, e7Var.f26152c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26152c) + a.b(this.f26151b, Float.hashCode(this.f26150a) * 31, 31);
    }

    public final String toString() {
        return "Margin(offsetMm=" + this.f26150a + ", colorArgb=" + this.f26151b + ", widthMm=" + this.f26152c + ")";
    }

    public /* synthetic */ e7(float f10) {
        this(1723090234, f10, 0.22f);
    }
}
