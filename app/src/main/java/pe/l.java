package pe;
import l.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Object f22696u;

    public /* synthetic */ l(Object obj) {
        this.f22696u = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).f22695u;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        return !(obj instanceof k);
    }

    public final /* synthetic */ Object c() {
        return this.f22696u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!kotlin.jvm.internal.a(this.f22696u, ((l) obj).f22696u)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f22696u;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f22696u;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
