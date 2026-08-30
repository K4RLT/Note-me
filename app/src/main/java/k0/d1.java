package k0;
import k0.m0;
import n.a0;
import n.o;
import r.a;

/* loaded from: classes.dex */
public final class d1 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19255b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19256c;

    /* renamed from: d, reason: collision with root package name */
    public final r f19257d;
    public final p e;

    public d1(boolean z3, int i, int i10, r rVar, p pVar) {
        this.f19254a = z3;
        this.f19255b = i;
        this.f19256c = i10;
        this.f19257d = rVar;
        this.e = pVar;
    }

    @Override // m0
    public final boolean a() {
        return this.f19254a;
    }

    @Override // m0
    public final p b() {
        return this.e;
    }

    @Override // m0
    public final r c() {
        return this.f19257d;
    }

    @Override // m0
    public final p d() {
        return this.e;
    }

    @Override // m0
    public final a0 e(r rVar) {
        boolean z3 = rVar.f19401c;
        q qVar = rVar.f19400b;
        q qVar2 = rVar.f19399a;
        if ((!z3 && qVar2.f19393b > qVar.f19393b) || (z3 && qVar2.f19393b <= qVar.f19393b)) {
            rVar = a(rVar, null, null, !z3, 3);
        }
        long j10 = this.e.f19383a;
        a0 a0Var = o.f20920a;
        a0 a0Var2 = new a0();
        a0Var2.h(j10, rVar);
        return a0Var2;
    }

    @Override // m0
    public final boolean f(m0 m0Var) {
        if (this.f19257d != null && m0Var != null && (m0Var instanceof d1) && this.f19255b == m0Var.l() && this.f19256c == m0Var.g() && this.f19254a == m0Var.a()) {
            p pVar = ((d1) m0Var).e;
            p pVar2 = this.e;
            if (pVar2.f19383a == pVar.f19383a && pVar2.f19385c == pVar.f19385c && pVar2.f19386d == pVar.f19386d) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // m0
    public final int g() {
        return this.f19256c;
    }

    @Override // m0
    public final p h() {
        return this.e;
    }

    @Override // m0
    public final i i() {
        int i = this.f19255b;
        int i10 = this.f19256c;
        if (i < i10) {
            return i.f19303v;
        }
        if (i > i10) {
            return i.f19302u;
        }
        return this.e.b();
    }

    @Override // m0
    public final p j() {
        return this.e;
    }

    @Override // m0
    public final int l() {
        return this.f19255b;
    }

    @Override // m0
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f19254a + ", crossed=" + i() + ", info=\n\t" + this.e + ')';
    }

    @Override // m0
    public final void k(df.l lVar) {
    }
}
