package r0;
import l.a;
import r0.q2;
import z0.g;

/* loaded from: classes.dex */
public final class p2 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24321a;

    public p2(Object obj) {
        this.f24321a = obj;
    }

    @Override // q2
    public final Object a(g gVar) {
        return this.f24321a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p2) && kotlin.jvm.internal.a(this.f24321a, ((p2) obj).f24321a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24321a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f24321a + ')';
    }
}
