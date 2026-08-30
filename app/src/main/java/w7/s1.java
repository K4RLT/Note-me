package w7;
import r0.a1;
import t1.e;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class s1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f29039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29040b;

    public s1(a1 a1Var, boolean z3) {
        this.f29039a = a1Var;
        this.f29040b = z3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        Object e = t.e(wVar, new r1(this.f29039a, this.f29040b, null), cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
