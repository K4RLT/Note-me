package qc;

/* loaded from: classes.dex */
public final class c1 extends e2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23729a;

    public c1(String str) {
        this.f23729a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            return this.f23729a.equals(((c1) ((e2) obj)).f23729a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23729a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a5.a.k(new StringBuilder("Log{content="), this.f23729a, "}");
    }
}
