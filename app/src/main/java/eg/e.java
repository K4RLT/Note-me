package eg;

/* loaded from: classes.dex */
public final class e extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f16505c = new u0(f.f16510a);

    @Override // eg.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        boolean c10 = aVar.c(this.f16587b, i);
        dVar.b(dVar.d() + 1);
        boolean[] zArr = dVar.f16501a;
        int i10 = dVar.f16502b;
        dVar.f16502b = i10 + 1;
        zArr[i10] = c10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.d, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        Object obj2 = new Object();
        obj2.f16501a = zArr;
        obj2.f16502b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new boolean[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        tVar.getClass();
        zArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.c(this.f16587b, i10, zArr[i10]);
        }
    }
}