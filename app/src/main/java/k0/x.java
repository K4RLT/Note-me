package k0;
import g0.a1;
import g0.p1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class x implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f19450b;

    public /* synthetic */ x(p1 p1Var, int i) {
        this.f19449a = i;
        this.f19450b = p1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v1.w wVar, te.c cVar) {
        switch (this.f19449a) {
            case 0:
                Object r8 = a1.r(wVar, this.f19450b, cVar);
                if (r8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return r8;
            default:
                Object r10 = a1.r(wVar, this.f19450b, cVar);
                if (r10 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return r10;
        }
    }
}
