package r;
import f.a;
import f.b;
import k1.r0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f24132a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f24133b;

    public o(float f10, r0 r0Var) {
        this.f24132a = f10;
        this.f24133b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!y2.a(this.f24132a, oVar.f24132a) || !this.f24133b.equals(oVar.f24133b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f24133b.hashCode() + (Float.hashCode(this.f24132a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) y2.b(this.f24132a)) + ", brush=" + this.f24133b + ')';
    }
}
