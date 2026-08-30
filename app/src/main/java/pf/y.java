package pf;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class y extends te.a {

    /* renamed from: w, reason: collision with root package name */
    public static final w f22809w = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final String f22810v;

    public y() {
        super(f22809w);
        this.f22810v = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && kotlin.jvm.internal.a(this.f22810v, ((y) obj).f22810v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22810v.hashCode();
    }

    public final String toString() {
        return a.n(new StringBuilder("CoroutineName("), this.f22810v, ')');
    }
}
