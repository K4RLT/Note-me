package eg;

/* loaded from: classes.dex */
public final class m1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f16547c = new u0(n1.f16551a);

    @Override // eg.a
    public final int h(Object obj) {
        return ((pe.y) obj).f22714u.length;
    }

    @Override // eg.n, eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        l1 l1Var = (l1) obj;
        l1Var.getClass();
        short z3 = aVar.o(this.f16587b, i).z();
        l1Var.b(l1Var.d() + 1);
        short[] sArr = l1Var.f16541a;
        int i10 = l1Var.f16542b;
        l1Var.f16542b = i10 + 1;
        sArr[i10] = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eg.l1] */
    @Override // eg.a
    public final Object k(Object obj) {
        short[] sArr = ((pe.y) obj).f22714u;
        Object obj2 = new Object();
        obj2.f16541a = sArr;
        obj2.f16542b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // eg.u0
    public final Object n() {
        return new pe.y(new short[0]);
    }

    @Override // eg.u0
    public final void o(gg.t tVar, Object obj, int i) {
        short[] sArr = ((pe.y) obj).f22714u;
        tVar.getClass();
        for (int i10 = 0; i10 < i; i10++) {
            tVar.k(this.f16587b, i10).t(sArr[i10]);
        }
    }
}