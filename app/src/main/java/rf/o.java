package rf;
import l.a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f24812b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f24813a;

    public /* synthetic */ o(Object obj) {
        this.f24813a = obj;
    }

    public static final Object a(Object obj) {
        if (!(obj instanceof n)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (!kotlin.jvm.internal.a(this.f24813a, ((o) obj).f24813a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24813a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f24813a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
