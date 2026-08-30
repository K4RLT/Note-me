package vd;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f27620a;

    public m(String str) {
        this.f27620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.a(this.f27620a, ((m) obj).f27620a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27620a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.n(new StringBuilder("FirebaseSessionsData(sessionId="), this.f27620a, ')');
    }
}
