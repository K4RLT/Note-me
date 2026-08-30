package wa;
import z.a;

/* loaded from: classes.dex */
public abstract class d6 implements dg.b, dg.a {
    @Override // dg.b
    public float A() {
        D();
        throw null;
    }

    @Override // dg.a
    public String B(cg.d dVar, int i) {
        dVar.getClass();
        return j();
    }

    @Override // dg.b
    public double C() {
        D();
        throw null;
    }

    public void D() {
        throw new IllegalArgumentException(kotlin.jvm.internal.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // dg.b
    public boolean a() {
        D();
        throw null;
    }

    @Override // dg.b
    public char b() {
        D();
        throw null;
    }

    @Override // dg.a
    public boolean c(cg.d dVar, int i) {
        dVar.getClass();
        return a();
    }

    @Override // dg.a
    public float d(cg.d dVar, int i) {
        dVar.getClass();
        return A();
    }

    @Override // dg.a
    public long e(cg.d dVar, int i) {
        dVar.getClass();
        return n();
    }

    public void f(cg.d dVar) {
        dVar.getClass();
    }

    @Override // dg.b
    public abstract int h();

    @Override // dg.b
    public dg.b i(cg.d dVar) {
        dVar.getClass();
        return this;
    }

    @Override // dg.b
    public String j() {
        D();
        throw null;
    }

    @Override // dg.b
    public dg.a k(cg.d dVar) {
        dVar.getClass();
        return this;
    }

    @Override // dg.b
    public int l(cg.d dVar) {
        dVar.getClass();
        D();
        throw null;
    }

    @Override // dg.a
    public int m(cg.d dVar, int i) {
        dVar.getClass();
        return h();
    }

    @Override // dg.b
    public abstract long n();

    @Override // dg.a
    public dg.b o(eg.t0 t0Var, int i) {
        t0Var.getClass();
        return i(t0Var.i(i));
    }

    @Override // dg.b
    public boolean p() {
        return true;
    }

    @Override // dg.b
    public Object q(ag.a aVar) {
        aVar.getClass();
        return aVar.b(this);
    }

    @Override // dg.a
    public short r(eg.t0 t0Var, int i) {
        t0Var.getClass();
        return z();
    }

    public Object s(cg.d dVar, int i, ag.a aVar, Object obj) {
        dVar.getClass();
        aVar.getClass();
        return q(aVar);
    }

    @Override // dg.a
    public char u(eg.t0 t0Var, int i) {
        t0Var.getClass();
        return b();
    }

    @Override // dg.a
    public double v(eg.t0 t0Var, int i) {
        t0Var.getClass();
        return C();
    }

    @Override // dg.a
    public Object w(cg.d dVar, int i, ag.a aVar, Object obj) {
        dVar.getClass();
        aVar.getClass();
        if (!aVar.d().c() && !p()) {
            return null;
        }
        return q(aVar);
    }

    @Override // dg.b
    public abstract byte x();

    @Override // dg.a
    public byte y(eg.t0 t0Var, int i) {
        t0Var.getClass();
        return x();
    }

    @Override // dg.b
    public abstract short z();
}
