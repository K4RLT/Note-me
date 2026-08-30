package q2;
import l.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23340a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!kotlin.jvm.internal.a(this.f23340a, ((d) obj).f23340a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f23340a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f23340a + ')';
    }
}
