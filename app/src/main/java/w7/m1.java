package w7;
import r0.a1;
import r0.e1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class m1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f28671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f28672c;

    public /* synthetic */ m1(a1 a1Var, e1 e1Var, int i) {
        this.f28670a = i;
        this.f28671b = a1Var;
        this.f28672c = e1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f28670a) {
            case 0:
                a1 a1Var = this.f28671b;
                Object f10 = t.f0.f(wVar, new b8.a0(a1Var, 16), new u7.k4(a1Var, 7), new u7.k4(a1Var, 8), new b8.l(wVar, 7, this.f28672c), cVar);
                if (f10 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return f10;
            default:
                Object e = t.k2.e(wVar, null, null, new g0.x1(wVar, this.f28671b, this.f28672c, null, 1), null, cVar, 11);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
        }
    }
}
