package w7;
import lb.g;
import r0.a1;

import java.util.List;

/* loaded from: classes.dex */
public final class fa implements df.a {
    public final /* synthetic */ df.p A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28250u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pf.z f28251v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28252w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28253x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f28254y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List f28255z;

    public fa(float f10, pf.z zVar, a1 a1Var, a1 a1Var2, a1 a1Var3, List list, df.p pVar) {
        this.f28250u = f10;
        this.f28251v = zVar;
        this.f28252w = a1Var;
        this.f28253x = a1Var2;
        this.f28254y = a1Var3;
        this.f28255z = list;
        this.A = pVar;
    }

    @Override // df.a
    public final Object invoke() {
        this.f28252w.setValue(Long.valueOf(System.currentTimeMillis()));
        a1 a1Var = this.f28253x;
        Integer num = (Integer) a1Var.getValue();
        a1 a1Var2 = this.f28254y;
        if (num == null) {
            g(0.0f, a1Var2);
        } else {
            int intValue = num.intValue();
            float floatValue = ((Number) a1Var2.getValue()).floatValue();
            float f10 = this.f28250u;
            int b10 = ff.a.b(floatValue / f10) + intValue;
            int size = this.f28255z.size() - 1;
            if (size < 0) {
                size = 0;
            }
            pf.b0.x(this.f28251v, null, new ea(wa.b9.e(b10, 0, size), num, this.A, ((Number) a1Var2.getValue()).floatValue(), (r1 - num.intValue()) * f10, this.f28254y, a1Var, null), 3);
        }
        return pe.z.f22715a;
    }
}
