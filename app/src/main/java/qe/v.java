package qe;
import l.a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f24026a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24027b;

    public v(int i, Object obj) {
        this.f24026a = i;
        this.f24027b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f24026a == vVar.f24026a && kotlin.jvm.internal.a(this.f24027b, vVar.f24027b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f24026a) * 31;
        Object obj = this.f24027b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f24026a + ", value=" + this.f24027b + ')';
    }
}
