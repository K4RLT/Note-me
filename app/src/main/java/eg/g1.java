package eg;

/* loaded from: classes.dex */
public final class g1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g1 f16520c = new u0(h1.f16523a);

    @Override // eg.a
    public final int h(Object obj) {
        return ((pe.t) obj).f22709u.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        f1 f1Var = (f1) obj;
        f1Var.getClass();
        int h3 = aVar.o(this.f16587b, i).h();
        f1Var.b(f1Var.d() + 1);
        int[] iArr = f1Var.f16514a;
        int i10 = f1Var.f16515b;
        f1Var.f16515b = i10 + 1;
        iArr[i10] = h3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.f1, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        int[] iArr = ((pe.t) obj).f22709u;
        Object obj2 = new Object();
        obj2.f16514a = iArr;
        obj2.f16515b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new pe.t(new int[0]);
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        int[] iArr = ((pe.t) obj).f22709u;
        tVar.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.k(this.f16587b, i10).l(iArr[i10]);
        }
    }
}