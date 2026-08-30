package x;
import l.a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final d1.d f30002a;

    public t(d1.h hVar) {
        this.f30002a = hVar;
    }

    public final int a(int i, y2.m mVar) {
        return this.f30002a.a(0, i, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && kotlin.jvm.internal.a(this.f30002a, ((t) obj).f30002a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30002a.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f30002a + ')';
    }
}
