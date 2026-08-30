package a1;
import q.j;
import t.a;

import r0.v0;
import r0.v1;

/* loaded from: classes.dex */
public final class d implements v1 {
    public final c A = new c(0, this);

    /* renamed from: u, reason: collision with root package name */
    public s f187u;

    /* renamed from: v, reason: collision with root package name */
    public o f188v;

    /* renamed from: w, reason: collision with root package name */
    public String f189w;

    /* renamed from: x, reason: collision with root package name */
    public Object f190x;

    /* renamed from: y, reason: collision with root package name */
    public Object[] f191y;

    /* renamed from: z, reason: collision with root package name */
    public n f192z;

    public d(s sVar, o oVar, String str, Object obj, Object[] objArr) {
        this.f187u = sVar;
        this.f188v = oVar;
        this.f189w = str;
        this.f190x = obj;
        this.f191y = objArr;
    }

    @Override // r0.v1
    public final void a() {
        n nVar = this.f192z;
        if (nVar != null) {
            ((ra.e) nVar).A();
        }
    }

    @Override // r0.v1
    public final void b() {
        n nVar = this.f192z;
        if (nVar != null) {
            ((ra.e) nVar).A();
        }
    }

    public final void c() {
        String a10;
        o oVar = this.f188v;
        if (this.f192z == null) {
            if (oVar != null) {
                c cVar = this.A;
                Object invoke = cVar.invoke();
                if (invoke != null && !oVar.b(invoke)) {
                    if (invoke instanceof b1.r) {
                        b1.r rVar = (b1.r) invoke;
                        if (rVar.d() != v0.f24418w && rVar.d() != v0.f24421z && rVar.d() != v0.f24419x) {
                            a10 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            a10 = "MutableState containing " + rVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        a10 = a(invoke);
                    }
                    throw new IllegalArgumentException(a10);
                }
                this.f192z = oVar.d(this.f189w, cVar);
                return;
            }
            return;
        }
        g5.j("entry(", this.f192z, ") is not null");
    }

    @Override // r0.v1
    public final void d() {
        c();
    }
}
