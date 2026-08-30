package eg;

/* loaded from: classes.dex */
public final class z0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f16602c = new u0(a1.f16490a);

    @Override // eg.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        y0 y0Var = (y0) obj;
        y0Var.getClass();
        short r8 = aVar.r(this.f16587b, i);
        y0Var.b(y0Var.d() + 1);
        short[] sArr = y0Var.f16599a;
        int i10 = y0Var.f16600b;
        y0Var.f16600b = i10 + 1;
        sArr[i10] = r8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eg.y0] */
    @Override // eg.a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        Object obj2 = new Object();
        obj2.f16599a = sArr;
        obj2.f16600b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new short[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        tVar.getClass();
        sArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            short s10 = sArr[i10];
            t0 t0Var = this.f16587b;
            t0Var.getClass();
            tVar.g(t0Var, i10);
            tVar.t(s10);
        }
    }
}