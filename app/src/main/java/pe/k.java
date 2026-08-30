package pe;
import l.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Throwable f22695u;

    public k(Throwable th) {
        th.getClass();
        this.f22695u = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (kotlin.jvm.internal.a(this.f22695u, ((k) obj).f22695u)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22695u.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f22695u + ')';
    }
}
