package m8;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20734a;

    public m(ArrayList arrayList) {
        this.f20734a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f20734a.equals(((m) ((w) obj)).f20734a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20734a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20734a + "}";
    }
}
