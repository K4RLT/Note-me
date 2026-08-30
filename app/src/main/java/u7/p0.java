package u7;
import c2.n2;
import i1.i;
import q.d;
import r0.a1;
import r0.f1;
import t.k2;
import t.t1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b8.v8;

/* loaded from: classes.dex */
public final class p0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26696a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f26697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f26698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26699d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f26702h;
    public final /* synthetic */ a1 i;

    public p0(n2 n2Var, i iVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, a1 a1Var6) {
        this.f26699d = n2Var;
        this.e = iVar;
        this.f26697b = a1Var;
        this.f26698c = a1Var2;
        this.f26700f = a1Var3;
        this.f26701g = a1Var4;
        this.f26702h = a1Var5;
        this.i = a1Var6;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f26696a) {
            case 0:
                Object e = k2.e(wVar, null, null, null, new v8((n2) this.f26699d, (i) this.e, this.f26697b, this.f26698c, (a1) this.f26700f, (a1) this.f26701g, (a1) this.f26702h, this.i, 1), cVar, 7);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            default:
                if (!((Boolean) this.f26697b.getValue()).booleanValue()) {
                    Object e8 = t1.e(wVar, new w5((d) this.f26699d, (d) this.e, (d) this.f26700f, (pf.z) this.f26701g, this.f26698c, (l2) this.f26702h, (f1) this.i, null), cVar);
                    if (e8 == ue.a.f27192u) {
                        return e8;
                    }
                }
                return pe.z.f22715a;
        }
    }

    public p0(a1 a1Var, d dVar, d dVar2, d dVar3, pf.z zVar, a1 a1Var2, l2 l2Var, f1 f1Var) {
        this.f26697b = a1Var;
        this.f26699d = dVar;
        this.e = dVar2;
        this.f26700f = dVar3;
        this.f26701g = zVar;
        this.f26698c = a1Var2;
        this.f26702h = l2Var;
        this.i = f1Var;
    }
}
