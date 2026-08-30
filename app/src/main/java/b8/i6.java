package b8;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class i6 {
    public static final h6 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f2210a;

    public /* synthetic */ i6(int i, String str) {
        if ((i & 1) == 0) {
            this.f2210a = "";
        } else {
            this.f2210a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i6) && kotlin.jvm.internal.a(this.f2210a, ((i6) obj).f2210a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2210a.hashCode();
    }

    public final String toString() {
        return a.k("UserBit(id=", this.f2210a, ")");
    }
}
