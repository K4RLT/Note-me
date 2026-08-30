package m2;
import l.a;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final y f20583a;

    /* renamed from: b, reason: collision with root package name */
    public final x f20584b;

    public z() {
        this(null, new x());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (kotlin.jvm.internal.a(this.f20584b, zVar.f20584b) && kotlin.jvm.internal.a(this.f20583a, zVar.f20583a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10 = 0;
        y yVar = this.f20583a;
        if (yVar != null) {
            i = yVar.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 31;
        x xVar = this.f20584b;
        if (xVar != null) {
            i10 = xVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f20583a + ", paragraphSyle=" + this.f20584b + ')';
    }

    public z(y yVar, x xVar) {
        this.f20583a = yVar;
        this.f20584b = xVar;
    }
}
