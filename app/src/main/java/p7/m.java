package p7;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import r0.a1;
import t.k2;
import t.t1;

/* loaded from: classes.dex */
public final class m implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22531a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f22532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22534d;

    public m(b1.v vVar, b1.v vVar2, a1 a1Var) {
        this.f22533c = vVar;
        this.f22534d = vVar2;
        this.f22532b = a1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v1.w wVar, te.c cVar) {
        switch (this.f22531a) {
            case 0:
                Object e = t1.e(wVar, new l((b1.v) this.f22533c, (b1.v) this.f22534d, this.f22532b, null), cVar);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            default:
                Object e8 = k2.e(wVar, null, null, null, new h8.l(1, this.f22532b, (a1) this.f22533c, (a1) this.f22534d), cVar, 7);
                if (e8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e8;
        }
    }

    public m(a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f22532b = a1Var;
        this.f22533c = a1Var2;
        this.f22534d = a1Var3;
    }
}
