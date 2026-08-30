package r0;
import r0.q2;
import z0.g;

/* loaded from: classes.dex */
public final class k0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f24275a;

    public k0(i1 i1Var) {
        this.f24275a = i1Var;
    }

    @Override // q2
    public final Object a(g gVar) {
        return this.f24275a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof k0) || !this.f24275a.equals(((k0) obj).f24275a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f24275a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f24275a + ')';
    }
}
