package eg;

/* loaded from: classes.dex */
public final class d0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f16503c = new u0(e0.f16506a);

    @Override // eg.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        c0 c0Var = (c0) obj;
        c0Var.getClass();
        int m4 = aVar.m(this.f16587b, i);
        c0Var.b(c0Var.d() + 1);
        int[] iArr = c0Var.f16497a;
        int i10 = c0Var.f16498b;
        c0Var.f16498b = i10 + 1;
        iArr[i10] = m4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.c0, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        Object obj2 = new Object();
        obj2.f16497a = iArr;
        obj2.f16498b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new int[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        tVar.getClass();
        iArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.m(i10, iArr[i10], this.f16587b);
        }
    }
}