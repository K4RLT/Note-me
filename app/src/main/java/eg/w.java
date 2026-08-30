package eg;

/* loaded from: classes.dex */
public final class w extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w f16592c = new u0(x.f16594a);

    @Override // eg.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        v vVar = (v) obj;
        vVar.getClass();
        float d2 = aVar.d(this.f16587b, i);
        vVar.b(vVar.d() + 1);
        float[] fArr = vVar.f16588a;
        int i10 = vVar.f16589b;
        vVar.f16589b = i10 + 1;
        fArr[i10] = d2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.v, java.lang.Object] */
    @Override // eg.a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        Object obj2 = new Object();
        obj2.f16588a = fArr;
        obj2.f16589b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new float[0];
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        tVar.getClass();
        fArr.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.i(this.f16587b, i10, fArr[i10]);
        }
    }
}