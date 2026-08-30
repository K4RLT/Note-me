package j0;
import l.a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final m2.g f18746a;

    /* renamed from: b, reason: collision with root package name */
    public m2.g f18747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18748c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f18749d = null;

    public m(m2.g gVar, m2.g gVar2) {
        this.f18746a = gVar;
        this.f18747b = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (kotlin.jvm.internal.a(this.f18746a, mVar.f18746a) && kotlin.jvm.internal.a(this.f18747b, mVar.f18747b) && this.f18748c == mVar.f18748c && kotlin.jvm.internal.a(this.f18749d, mVar.f18749d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c((this.f18747b.hashCode() + (this.f18746a.hashCode() * 31)) * 31, 31, this.f18748c);
        e eVar = this.f18749d;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return c10 + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f18746a) + ", substitution=" + ((Object) this.f18747b) + ", isShowingSubstitution=" + this.f18748c + ", layoutCache=" + this.f18749d + ')';
    }
}
