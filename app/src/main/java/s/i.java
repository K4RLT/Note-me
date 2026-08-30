package s;
import b.c;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f24848a;

    public i(long j10) {
        this.f24848a = j10;
        if ((j10 & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        w.a.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return j1.c(this.f24848a, ((i) obj).f24848a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f24848a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) j1.b.j(this.f24848a)) + ')';
    }
}
