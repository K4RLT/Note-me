package pe;
import l.b;

/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final short f22713u;

    public /* synthetic */ x(short s10) {
        this.f22713u = s10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.b(this.f22713u & 65535, ((x) obj).f22713u & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            if (this.f22713u != ((x) obj).f22713u) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f22713u);
    }

    public final String toString() {
        return String.valueOf(this.f22713u & 65535);
    }
}
