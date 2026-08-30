package g0;
import t1.e;
import b0.e1;
import b0.i;
import b2.l;
import c0.g;
import k0.j1;
import k0.t0;
import k0.y;
import r0.a1;
import t.k2;
import t.t1;
import v1.h0;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b8.u9;

/* loaded from: classes.dex */
public final class p0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17249c;

    public p0(l lVar, p1 p1Var) {
        this.f17247a = 1;
        this.f17249c = lVar;
        this.f17248b = p1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f17247a) {
            case 0:
                Object i = pf.i(new u9(wVar, (p1) this.f17248b, (j1) this.f17249c, (te.c) null, 1), cVar);
                if (i != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return i;
            case 1:
                h0 h0Var = (h0) wVar;
                h0Var.getClass();
                Object e = t1.e(wVar, new g((l) this.f17249c, new e1(l.u(h0Var).U), (p1) this.f17248b, null), cVar);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            case 2:
                Object e8 = t1.e(wVar, new j1((t0) this.f17248b, (y) this.f17249c, null, 1), cVar);
                if (e8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e8;
            default:
                Object e10 = k2.e(wVar, null, null, new f6.g((a1) this.f17248b, null), new u7.x1(3, (df.a) this.f17249c), cVar, 3);
                if (e10 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e10;
        }
    }

    public /* synthetic */ p0(Object obj, int i, Object obj2) {
        this.f17247a = i;
        this.f17248b = obj;
        this.f17249c = obj2;
    }
}
