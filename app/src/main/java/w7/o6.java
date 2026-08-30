package w7;
import r0.a1;
import r0.e1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class o6 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f28840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f28841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df.l f28842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.a f28843d;
    public final /* synthetic */ a1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1 f28844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u4 f28845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f28846h;

    public o6(a1 a1Var, float f10, df.l lVar, df.a aVar, a1 a1Var2, e1 e1Var, u4 u4Var, a1 a1Var3) {
        this.f28840a = a1Var;
        this.f28841b = f10;
        this.f28842c = lVar;
        this.f28843d = aVar;
        this.e = a1Var2;
        this.f28844f = e1Var;
        this.f28845g = u4Var;
        this.f28846h = a1Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final a1 a1Var = this.f28840a;
        b8.a0 a0Var = new b8.a0(a1Var, 21);
        final float f10 = this.f28841b;
        final df.l lVar = this.f28842c;
        final df.a aVar = this.f28843d;
        final a1 a1Var2 = this.e;
        final e1 e1Var = this.f28844f;
        Object h3 = t.f0.h(wVar, a0Var, new df.a() { // from class: w7.m6
            @Override // df.a
            public final Object invoke() {
                boolean z3;
                a1 a1Var3 = a1Var2;
                if (((Boolean) a1Var3.getValue()).booleanValue() && e1Var.h() < f10) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                lVar.invoke(null);
                Boolean bool = Boolean.FALSE;
                a1Var.setValue(bool);
                a1Var3.setValue(bool);
                if (z3) {
                    aVar.invoke();
                }
                return pe.z.f22715a;
            }
        }, new n6(lVar, a1Var, a1Var2, 0), new u7.m4(lVar, this.f28845g, a1Var2, this.f28846h, e1Var, 2), cVar);
        if (h3 == ue.a.f27192u) {
            return h3;
        }
        return pe.z.f22715a;
    }
}
