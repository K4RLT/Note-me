package r0;
import r0.a1;
import r0.n2;

/* loaded from: classes.dex */
public final class o1 implements a1, pf.z {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a1 f24309u;

    /* renamed from: v, reason: collision with root package name */
    public final te.g f24310v;

    public o1(a1 a1Var, te.g gVar) {
        this.f24309u = a1Var;
        this.f24310v = gVar;
    }

    @Override // pf.z
    public final te.g A() {
        return this.f24310v;
    }

    @Override // n2
    public final Object getValue() {
        return this.f24309u.getValue();
    }

    @Override // a1
    public final void setValue(Object obj) {
        this.f24309u.setValue(obj);
    }
}
