package r0;
import l.a;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f24359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24360b;

    public r0(Integer num, Object obj) {
        this.f24359a = num;
        this.f24360b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (!this.f24359a.equals(r0Var.f24359a) || !kotlin.jvm.internal.a(this.f24360b, r0Var.f24360b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f24359a.hashCode() * 31;
        Object obj = this.f24360b;
        if (obj instanceof Enum) {
            i = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return i + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f24359a + ", right=" + this.f24360b + ')';
    }
}
