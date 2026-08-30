package b8;
import l.a;

/* loaded from: classes.dex */
public final class i7 extends l7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2211a;

    public i7(String str) {
        str.getClass();
        this.f2211a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i7) && kotlin.jvm.internal.a(this.f2211a, ((i7) obj).f2211a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2211a.hashCode();
    }

    public final String toString() {
        return a.k("Granted(listingId=", this.f2211a, ")");
    }
}
