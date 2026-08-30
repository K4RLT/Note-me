package m2;
import l.a;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f20522a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f20523b;

    public m(String str, n0 n0Var) {
        this.f20522a = str;
        this.f20523b = n0Var;
    }

    @Override // m2.n
    public final n0 a() {
        return this.f20523b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (!this.f20522a.equals(mVar.f20522a) || !kotlin.jvm.internal.a(this.f20523b, mVar.f20523b)) {
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
        int hashCode = this.f20522a.hashCode() * 31;
        n0 n0Var = this.f20523b;
        if (n0Var != null) {
            i = n0Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return p.a.n(new StringBuilder("LinkAnnotation.Url(url="), this.f20522a, ')');
    }
}
