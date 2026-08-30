package eg;

/* loaded from: classes.dex */
public final class l extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f16539c = new u0(m.f16543a);

    @Override // eg.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        char u9 = aVar.u(this.f16587b, i);
        kVar.b(kVar.d() + 1);
        char[] cArr = kVar.f16533a;
        int i10 = kVar.f16534b;
        kVar.f16534b = i10 + 1;
        cArr[i10] = u9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.k, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        Object obj2 = new Object();
        obj2.f16533a = cArr;
        obj2.f16534b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new char[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        tVar.getClass();
        cArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            char c10 = cArr[i10];
            t0 t0Var = this.f16587b;
            t0Var.getClass();
            tVar.g(t0Var, i10);
            tVar.e(c10);
        }
    }
}