package q2;
import l.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z f23342a;

    public e(z zVar) {
        this.f23342a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e) || !kotlin.jvm.internal.a(this.f23342a, ((e) obj).f23342a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f23342a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f23342a + ", loaderKey=null)";
    }
}
