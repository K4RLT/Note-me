package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class a7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25914a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25915b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25916c;

    public a7(int i, float f10, float f11) {
        this.f25914a = i;
        this.f25915b = f10;
        this.f25916c = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a7) {
                a7 a7Var = (a7) obj;
                if (this.f25914a != a7Var.f25914a || Float.compare(this.f25915b, a7Var.f25915b) != 0 || Float.compare(this.f25916c, a7Var.f25916c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25916c) + a.a(Integer.hashCode(this.f25914a) * 31, 31, this.f25915b);
    }

    public final String toString() {
        return "Border(colorArgb=" + this.f25914a + ", widthMm=" + this.f25915b + ", insetMm=" + this.f25916c + ")";
    }

    public /* synthetic */ a7(int i, float f10) {
        this(i, f10, 0.0f);
    }
}
