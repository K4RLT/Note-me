package w7;
import k1.l0;
import p.a;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements df.s {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28481u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28482v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28483w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28484x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f28485y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f28486z;

    public /* synthetic */ j0(u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, e3 e3Var, e3 e3Var2) {
        this.f28481u = m3Var;
        this.f28482v = i;
        this.f28483w = i10;
        this.f28484x = yVar;
        this.f28485y = e3Var;
        this.f28486z = e3Var2;
    }

    @Override // df.s
    public final Object c(Object obj, Number number, Number number2, Object obj2, Number number3) {
        float floatValue = ((Float) number).floatValue();
        float floatValue2 = ((Float) number2).floatValue();
        float floatValue3 = ((Float) obj2).floatValue();
        float floatValue4 = ((Float) number3).floatValue();
        Context context = (Context) this.f28484x.f19787u;
        u7.m3 m3Var = this.f28481u;
        int i = this.f28482v;
        int i10 = this.f28483w;
        m3Var.R0(i, i10, context);
        m3Var.p(i, i10, new u7.d(a.i(), (String) obj, (String) this.f28485y.f28134l.getValue(), l0.F(this.f28486z.l()), floatValue3, floatValue, floatValue2, floatValue4, false, null, false, false, null, 523776));
        return pe.z.f22715a;
    }
}
