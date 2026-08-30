package c3;

import q.a1;
import q.d0;
import q.e0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3742u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3743v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3744w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3745x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3746y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.f3742u = i;
        this.f3743v = obj;
        this.f3744w = obj2;
        this.f3745x = obj3;
        this.f3746y = obj4;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f3742u) {
            case 0:
                ((v) this.f3743v).h((df.a) this.f3744w, (u) this.f3745x, (y2.m) this.f3746y);
                return pe.z.f22715a;
            default:
                Number number = (Number) this.f3745x;
                Number number2 = (Number) this.f3743v;
                e0 e0Var = (e0) this.f3744w;
                if (!number2.equals(e0Var.f22881u) || !number.equals(e0Var.f22882v)) {
                    d0 d0Var = (d0) this.f3746y;
                    e0Var.f22881u = number2;
                    e0Var.f22882v = number;
                    e0Var.f22885y = new a1(d0Var, e0Var.f22883w, number2, number, null);
                    e0Var.C.f22891b.setValue(Boolean.TRUE);
                    e0Var.f22886z = false;
                    e0Var.A = true;
                }
                return pe.z.f22715a;
        }
    }
}
