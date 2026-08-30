package j2;
import x.n;
import q.x;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f18783c = new f(0.0f, new jf.a(0.0f, 0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final float f18784a;

    /* renamed from: b, reason: collision with root package name */
    public final jf.a f18785b;

    public f(float f10, jf.a aVar) {
        this.f18784a = f10;
        this.f18785b = aVar;
        if (!Float.isNaN(f10)) {
            return;
        }
        x.n("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f18784a == fVar.f18784a && this.f18785b.equals(fVar.f18785b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18785b.hashCode() + (Float.hashCode(this.f18784a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f18784a + ", range=" + this.f18785b + ", steps=0)";
    }
}
