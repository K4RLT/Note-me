package p;
import q.z;
import t0.a;
import t0.b;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22275a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22276b;

    /* renamed from: c, reason: collision with root package name */
    public final z f22277c;

    public v0(float f10, long j10, z zVar) {
        this.f22275a = f10;
        this.f22276b = j10;
        this.f22277c = zVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (Float.compare(this.f22275a, v0Var.f22275a) != 0 || !k1.a(this.f22276b, v0Var.f22276b) || !this.f22277c.equals(v0Var.f22277c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f22275a) * 31;
        int i = k1.t0.f19530c;
        return this.f22277c.hashCode() + a.d(this.f22276b, hashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f22275a + ", transformOrigin=" + ((Object) k1.b(this.f22276b)) + ", animationSpec=" + this.f22277c + ')';
    }
}
