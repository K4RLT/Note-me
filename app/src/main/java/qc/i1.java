package qc;

/* loaded from: classes.dex */
public final class i1 extends k2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23805a;

    public i1(String str) {
        this.f23805a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            return this.f23805a.equals(((i1) ((k2) obj)).f23805a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23805a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a5.a.k(new StringBuilder("User{identifier="), this.f23805a, "}");
    }
}
