package eg;

/* loaded from: classes.dex */
public final class d1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d1 f16504c = new u0(e1.f16508a);

    @Override // eg.a
    public final int h(Object obj) {
        return ((pe.r) obj).f22707u.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        c1 c1Var = (c1) obj;
        c1Var.getClass();
        byte x9 = aVar.o(this.f16587b, i).x();
        c1Var.b(c1Var.d() + 1);
        byte[] bArr = c1Var.f16499a;
        int i10 = c1Var.f16500b;
        c1Var.f16500b = i10 + 1;
        bArr[i10] = x9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.c1, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        byte[] bArr = ((pe.r) obj).f22707u;
        Object obj2 = new Object();
        obj2.f16499a = bArr;
        obj2.f16500b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new pe.r(new byte[0]);
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        byte[] bArr = ((pe.r) obj).f22707u;
        tVar.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.k(this.f16587b, i10).d(bArr[i10]);
        }
    }
}