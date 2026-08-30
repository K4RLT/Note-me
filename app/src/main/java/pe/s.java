package pe;
import l.b;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final int f22708u;

    public /* synthetic */ s(int i) {
        this.f22708u = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.b(this.f22708u ^ Integer.MIN_VALUE, ((s) obj).f22708u ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (this.f22708u != ((s) obj).f22708u) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22708u);
    }

    public final String toString() {
        return String.valueOf(this.f22708u & 4294967295L);
    }
}
