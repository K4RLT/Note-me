package pe;
import l.b;

/* loaded from: classes.dex */
public final class q implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final byte f22706u;

    public /* synthetic */ q(byte b10) {
        this.f22706u = b10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.b(this.f22706u & 255, ((q) obj).f22706u & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (this.f22706u != ((q) obj).f22706u) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f22706u);
    }

    public final String toString() {
        return String.valueOf(this.f22706u & 255);
    }
}
