package k0;
import l.a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f19399a;

    /* renamed from: b, reason: collision with root package name */
    public final q f19400b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19401c;

    public r(q qVar, q qVar2, boolean z3) {
        this.f19399a = qVar;
        this.f19400b = qVar2;
        this.f19401c = z3;
    }

    public static r a(r rVar, q qVar, q qVar2, boolean z3, int i) {
        if ((i & 1) != 0) {
            qVar = rVar.f19399a;
        }
        if ((i & 2) != 0) {
            qVar2 = rVar.f19400b;
        }
        if ((i & 4) != 0) {
            z3 = rVar.f19401c;
        }
        rVar.getClass();
        return new r(qVar, qVar2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (kotlin.jvm.internal.a(this.f19399a, rVar.f19399a) && kotlin.jvm.internal.a(this.f19400b, rVar.f19400b) && this.f19401c == rVar.f19401c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19401c) + ((this.f19400b.hashCode() + (this.f19399a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f19399a + ", end=" + this.f19400b + ", handlesCrossed=" + this.f19401c + ')';
    }
}
