package eg;

/* loaded from: classes.dex */
public final class h extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f16521c = new u0(i.f16525a);

    @Override // eg.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        byte y10 = aVar.y(this.f16587b, i);
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.f16516a;
        int i10 = gVar.f16517b;
        gVar.f16517b = i10 + 1;
        bArr[i10] = y10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.g, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        Object obj2 = new Object();
        obj2.f16516a = bArr;
        obj2.f16517b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new byte[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        tVar.getClass();
        bArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            byte b10 = bArr[i10];
            t0 t0Var = this.f16587b;
            t0Var.getClass();
            tVar.g(t0Var, i10);
            tVar.d(b10);
        }
    }
}