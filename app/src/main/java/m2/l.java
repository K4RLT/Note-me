package m2;
import l.a;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f20512a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f20513b;

    public l(String str, n0 n0Var) {
        this.f20512a = str;
        this.f20513b = n0Var;
    }

    @Override // m2.n
    public final n0 a() {
        return this.f20513b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!this.f20512a.equals(lVar.f20512a) || !kotlin.jvm.internal.a(this.f20513b, lVar.f20513b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f20512a.hashCode() * 31;
        n0 n0Var = this.f20513b;
        if (n0Var != null) {
            i = n0Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return p.a.n(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f20512a, ')');
    }
}
