package w7;
import r0.a1;
import r0.q;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* loaded from: classes.dex */
public final class ga implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f28315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f28316d;
    public final /* synthetic */ a1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f28317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pf.z f28318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f28319h;
    public final /* synthetic */ df.p i;

    public ga(boolean z3, int i, a1 a1Var, a1 a1Var2, a1 a1Var3, float f10, pf.z zVar, List list, df.p pVar) {
        this.f28313a = z3;
        this.f28314b = i;
        this.f28315c = a1Var;
        this.f28316d = a1Var2;
        this.e = a1Var3;
        this.f28317f = f10;
        this.f28318g = zVar;
        this.f28319h = list;
        this.i = pVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        if (this.f28313a) {
            int i = this.f28314b;
            a1 a1Var = this.f28315c;
            a1 a1Var2 = this.f28316d;
            a1 a1Var3 = this.e;
            Object h3 = t.f0.h(wVar, new ca(i, a1Var, a1Var2, a1Var3), new fa(this.f28317f, this.f28318g, a1Var3, a1Var, a1Var2, this.f28319h, this.i), new ha(2, a1Var3, a1Var, a1Var2), new q(1, a1Var2), cVar);
            if (h3 == ue.a.f27192u) {
                return h3;
            }
        }
        return pe.z.f22715a;
    }
}
