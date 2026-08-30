package eg;
import x.j;
import x.n;
import x.o;
import l.a;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements cg.d {

    /* renamed from: a, reason: collision with root package name */
    public final cg.d f16512a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.d f16513b;

    public f0(cg.d dVar, cg.d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        this.f16512a = dVar;
        this.f16513b = dVar2;
    }

    @Override // cg.d
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
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
        x.n(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // cg.d
    public final wa.z e() {
        return cg.i.f4136d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (!kotlin.jvm.internal.a(this.f16512a, f0Var.f16512a) || !kotlin.jvm.internal.a(this.f16513b, f0Var.f16513b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // cg.d
    public final int f() {
        return 2;
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
        x.j(g3.a.i("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.f16513b.hashCode() + ((this.f16512a.hashCode() + 710441009) * 31);
    }

    @Override // cg.d
    public final cg.d i(int i) {
        if (i >= 0) {
            int i10 = i % 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f16513b;
                }
                x.o("Unreached");
                return null;
            }
            return this.f16512a;
        }
        x.j(g3.a.i("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
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
        x.j(g3.a.i("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f16512a + ", " + this.f16513b + ')';
    }
}
