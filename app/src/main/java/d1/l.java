package d1;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class l implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f15683a;

    /* renamed from: b, reason: collision with root package name */
    public final r f15684b;

    public l(r rVar, r rVar2) {
        this.f15683a = rVar;
        this.f15684b = rVar2;
    }

    @Override // d1.r
    public final boolean a(df.l lVar) {
        if (this.f15683a.a(lVar) && this.f15684b.a(lVar)) {
            return true;
        }
        return false;
    }

    @Override // d1.r
    public final Object b(df.p pVar, Object obj) {
        return this.f15684b.b(pVar, this.f15683a.b(pVar, obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f15683a.equals(lVar.f15683a) && kotlin.jvm.internal.a(this.f15684b, lVar.f15684b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15684b.hashCode() * 31) + this.f15683a.hashCode();
    }

    public final String toString() {
        return a.n(new StringBuilder("["), (String) b(k.f15682u, ""), ']');
    }
}
