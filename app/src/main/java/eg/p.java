package eg;

/* loaded from: classes.dex */
public final class p extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p f16558c = new u0(q.f16563a);

    @Override // eg.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        o oVar = (o) obj;
        oVar.getClass();
        double v2 = aVar.v(this.f16587b, i);
        oVar.b(oVar.d() + 1);
        double[] dArr = oVar.f16553a;
        int i10 = oVar.f16554b;
        oVar.f16554b = i10 + 1;
        dArr[i10] = v2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eg.o] */
    @Override // eg.a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        Object obj2 = new Object();
        obj2.f16553a = dArr;
        obj2.f16554b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new double[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        tVar.getClass();
        dArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            double d2 = dArr[i10];
            t0 t0Var = this.f16587b;
            t0Var.getClass();
            tVar.g(t0Var, i10);
            tVar.f(d2);
        }
    }
}