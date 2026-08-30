package b8;
import k1.f;
import l.a;

/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final f f1833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1834b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1835c;

    public a4(f fVar, int i, boolean z3) {
        this.f1833a = fVar;
        this.f1834b = i;
        this.f1835c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        if (kotlin.jvm.internal.a(this.f1833a, a4Var.f1833a) && this.f1834b == a4Var.f1834b && this.f1835c == a4Var.f1835c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        f fVar = this.f1833a;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        return Boolean.hashCode(this.f1835c) + a.b(this.f1834b, hashCode * 31, 31);
    }

    public final String toString() {
        return "NotebookCoverPreview(image=" + this.f1833a + ", spineArgb=" + this.f1834b + ", spineEnabled=" + this.f1835c + ")";
    }
}
