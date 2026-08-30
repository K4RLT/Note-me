package eg;

/* loaded from: classes.dex */
public final class j0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f16531c = new u0(k0.f16535a);

    @Override // eg.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        i0 i0Var = (i0) obj;
        i0Var.getClass();
        long e = aVar.e(this.f16587b, i);
        i0Var.b(i0Var.d() + 1);
        long[] jArr = i0Var.f16527a;
        int i10 = i0Var.f16528b;
        i0Var.f16528b = i10 + 1;
        jArr[i10] = e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eg.i0] */
    @Override // eg.a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        Object obj2 = new Object();
        obj2.f16527a = jArr;
        obj2.f16528b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new long[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        tVar.getClass();
        jArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.o(this.f16587b, i10, jArr[i10]);
        }
    }
}