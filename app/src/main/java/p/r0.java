package p;
import l.a;
import q.z;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f22246a;

    public r0(z zVar) {
        this.f22246a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || !kotlin.jvm.internal.a(this.f22246a, r0Var.f22246a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22246a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f22246a + ')';
    }
}
