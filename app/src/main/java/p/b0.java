package p;
import d1.e;
import l.a;
import q.z;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f22102a;

    /* renamed from: b, reason: collision with root package name */
    public final df.l f22103b;

    /* renamed from: c, reason: collision with root package name */
    public final z f22104c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22105d;

    public b0(e eVar, df.l lVar, z zVar, boolean z3) {
        this.f22102a = eVar;
        this.f22103b = lVar;
        this.f22104c = zVar;
        this.f22105d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!kotlin.jvm.internal.a(this.f22102a, b0Var.f22102a) || !kotlin.jvm.internal.a(this.f22103b, b0Var.f22103b) || !kotlin.jvm.internal.a(this.f22104c, b0Var.f22104c) || this.f22105d != b0Var.f22105d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22105d) + ((this.f22104c.hashCode() + ((this.f22103b.hashCode() + (this.f22102a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f22102a + ", size=" + this.f22103b + ", animationSpec=" + this.f22104c + ", clip=" + this.f22105d + ')';
    }
}
