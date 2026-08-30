package pe;
import l.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Object f22693u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f22694v;

    public j(Object obj, Object obj2) {
        this.f22693u = obj;
        this.f22694v = obj2;
    }

    public final Object a() {
        return this.f22693u;
    }

    public final Object b() {
        return this.f22694v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.a(this.f22693u, jVar.f22693u) && kotlin.jvm.internal.a(this.f22694v, jVar.f22694v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.f22693u;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f22694v;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        return "(" + this.f22693u + ", " + this.f22694v + ')';
    }
}
