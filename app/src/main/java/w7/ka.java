package w7;
import p.a;

/* loaded from: classes.dex */
public final class ka extends ma {

    /* renamed from: a, reason: collision with root package name */
    public final String f28586a;

    public ka(String str) {
        str.getClass();
        this.f28586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ka) && kotlin.jvm.internal.l.a(this.f28586a, ((ka) obj).f28586a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28586a.hashCode();
    }

    public final String toString() {
        return a.k("Asset(path=", this.f28586a, ")");
    }
}
