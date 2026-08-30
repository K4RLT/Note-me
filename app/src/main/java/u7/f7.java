package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class f7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26192a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26193b;

    /* renamed from: c, reason: collision with root package name */
    public final w6 f26194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26195d;
    public final boolean e;

    public f7(float f10, float f11, w6 w6Var, int i) {
        int i10;
        w6Var = (i & 4) != 0 ? w6.HEART : w6Var;
        if ((i & 8) != 0) {
            i10 = 1438934654;
        } else {
            i10 = 868509310;
        }
        w6Var.getClass();
        this.f26192a = f10;
        this.f26193b = f11;
        this.f26194c = w6Var;
        this.f26195d = i10;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f7) {
                f7 f7Var = (f7) obj;
                if (Float.compare(this.f26192a, f7Var.f26192a) != 0 || Float.compare(this.f26193b, f7Var.f26193b) != 0 || this.f26194c != f7Var.f26194c || this.f26195d != f7Var.f26195d || this.e != f7Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a.b(this.f26195d, (this.f26194c.hashCode() + a.a(Float.hashCode(this.f26192a) * 31, 31, this.f26193b)) * 31, 31);
    }

    public final String toString() {
        return "Motif(spacingMm=" + this.f26192a + ", sizeMm=" + this.f26193b + ", kind=" + this.f26194c + ", colorArgb=" + this.f26195d + ", staggered=" + this.e + ")";
    }
}
