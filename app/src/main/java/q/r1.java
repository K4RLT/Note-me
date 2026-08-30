package q;
import l.a;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final q f22977a;

    /* renamed from: b, reason: collision with root package name */
    public final w f22978b;

    public r1(q qVar, w wVar) {
        this.f22977a = qVar;
        this.f22978b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (kotlin.jvm.internal.a(this.f22977a, r1Var.f22977a) && kotlin.jvm.internal.a(this.f22978b, r1Var.f22978b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f22978b.hashCode() + (this.f22977a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f22977a + ", easing=" + this.f22978b + ", arcMode=ArcMode(value=0))";
    }
}
