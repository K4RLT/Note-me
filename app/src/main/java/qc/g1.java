package qc;

import java.util.List;

/* loaded from: classes.dex */
public final class g1 extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23778a;

    public g1(List list) {
        this.f23778a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            return this.f23778a.equals(((g1) ((h2) obj)).f23778a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23778a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f23778a + "}";
    }
}
