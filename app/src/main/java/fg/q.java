package fg;

import java.util.List;

/* loaded from: classes.dex */
public final class q implements cg.d {

    /* renamed from: a, reason: collision with root package name */
    public final pe.n f16994a;

    public q(df.a aVar) {
        this.f16994a = new pe.n(aVar);
    }

    @Override // cg.d
    public final String a() {
        return b().a();
    }

    public final cg.d b() {
        return (cg.d) this.f16994a.getValue();
    }

    @Override // cg.d
    public final boolean c() {
        return false;
    }

    @Override // cg.d
    public final int d(String str) {
        str.getClass();
        return b().d(str);
    }

    @Override // cg.d
    public final wa.z e() {
        return b().e();
    }

    @Override // cg.d
    public final int f() {
        return b().f();
    }

    @Override // cg.d
    public final String g(int i) {
        return b().g(i);
    }

    @Override // cg.d
    public final List getAnnotations() {
        return qe.s.f24023u;
    }

    @Override // cg.d
    public final List h(int i) {
        return b().h(i);
    }

    @Override // cg.d
    public final cg.d i(int i) {
        return b().i(i);
    }

    @Override // cg.d
    public final boolean isInline() {
        return false;
    }

    @Override // cg.d
    public final boolean j(int i) {
        return b().j(i);
    }
}
