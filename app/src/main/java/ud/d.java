package ud;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f27190a;

    public d(HashSet hashSet) {
        this.f27190a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f27190a.equals(((d) obj).f27190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27190a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f27190a + "}";
    }
}
