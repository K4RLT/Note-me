package ub;

import android.app.PendingIntent;
import g5.q;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: u, reason: collision with root package name */
    public final PendingIntent f27146u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f27147v;

    public b(PendingIntent pendingIntent, boolean z3) {
        if (pendingIntent != null) {
            this.f27146u = pendingIntent;
            this.f27147v = z3;
        } else {
            q.h("Null pendingIntent");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            b bVar = (b) ((a) obj);
            if (this.f27146u.equals(bVar.f27146u) && this.f27147v == bVar.f27147v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f27146u.hashCode() ^ 1000003;
        if (true != this.f27147v) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f27146u.toString() + ", isNoOp=" + this.f27147v + "}";
    }
}
