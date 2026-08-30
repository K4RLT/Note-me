package eg;

/* loaded from: classes.dex */
public final class j1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f16532c = new u0(k1.f16537a);

    @Override // eg.a
    public final int h(Object obj) {
        return ((pe.v) obj).f22711u.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        i1 i1Var = (i1) obj;
        i1Var.getClass();
        long n10 = aVar.o(this.f16587b, i).n();
        i1Var.b(i1Var.d() + 1);
        long[] jArr = i1Var.f16529a;
        int i10 = i1Var.f16530b;
        i1Var.f16530b = i10 + 1;
        jArr[i10] = n10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eg.i1] */
    @Override // eg.a
    public final Object k(Object obj) {
        long[] jArr = ((pe.v) obj).f22711u;
        Object obj2 = new Object();
        obj2.f16529a = jArr;
        obj2.f16530b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new pe.v(new long[0]);
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        long[] jArr = ((pe.v) obj).f22711u;
        tVar.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.k(this.f16587b, i10).n(jArr[i10]);
        }
    }
}