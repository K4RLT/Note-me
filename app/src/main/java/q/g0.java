package q;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Float f22900a;

    /* renamed from: b, reason: collision with root package name */
    public w f22901b;

    public g0(Float f10, w wVar) {
        this.f22900a = f10;
        this.f22901b = wVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (g0Var.f22900a.equals(this.f22900a) && kotlin.jvm.internal.a(g0Var.f22901b, this.f22901b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22901b.hashCode() + a.b(0, this.f22900a.hashCode() * 31, 31);
    }
}
