package w7;
import r0.i0;

import android.content.Context;

/* loaded from: classes.dex */
public final class a3 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1.v f27856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f27857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27859d;
    public final /* synthetic */ e3 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f27860f;

    public a3(b1.v vVar, u7.m3 m3Var, int i, int i10, e3 e3Var, kotlin.jvm.internal.y yVar) {
        this.f27856a = vVar;
        this.f27857b = m3Var;
        this.f27858c = i;
        this.f27859d = i10;
        this.e = e3Var;
        this.f27860f = yVar;
    }

    @Override // i0
    public final void a() {
        b1.v vVar = this.f27856a;
        if (!vVar.isEmpty()) {
            v0.b bVar = b1.w.e(vVar).f1328c;
            float h3 = this.e.f28145w.h();
            Context context = (Context) this.f27860f.f19787u;
            u7.m3 m3Var = this.f27857b;
            m3Var.V(this.f27858c, this.f27859d, bVar, h3, context);
            vVar.clear();
            m3Var.U();
        }
    }
}
