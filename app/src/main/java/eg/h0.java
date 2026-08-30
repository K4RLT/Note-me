package eg;
import l.a;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h0 implements cg.d {

    /* renamed from: a, reason: collision with root package name */
    public final cg.d f16522a;

    public h0(cg.d dVar) {
        this.f16522a = dVar;
    }

    @Override // cg.d
    public final boolean c() {
        return false;
    }

    @Override // cg.d
    public final int d(String str) {
        str.getClass();
        Integer k3 = mf.m.k(10, str);
        if (k3 != null) {
            return k3.intValue();
        }
        x.n(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // cg.d
    public final wa.z e() {
        return cg.i.f4135c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (kotlin.jvm.internal.a(this.f16522a, h0Var.f16522a) && kotlin.jvm.internal.a(a(), h0Var.a())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // cg.d
    public final int f() {
        return 1;
    }

    @Override // cg.d
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // cg.d
    public final List getAnnotations() {
        return qe.s.f24023u;
    }

    @Override // cg.d
    public final List h(int i) {
        if (i >= 0) {
            return qe.s.f24023u;
        }
        l4.a.l(g3.a.m("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f16522a.hashCode() * 31);
    }

    @Override // cg.d
    public final cg.d i(int i) {
        if (i >= 0) {
            return this.f16522a;
        }
        l4.a.l(g3.a.m("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // cg.d
    public final boolean isInline() {
        return false;
    }

    @Override // cg.d
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        l4.a.l(g3.a.m("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f16522a + ')';
    }
}
