package x7;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b8.eb;
import r0.a1;
import t.k2;
import w7.h9;
import w7.z8;

/* loaded from: classes.dex */
public final class u0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30303a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.l f30304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30306d;
    public final /* synthetic */ a1 e;

    public u0(df.l lVar, float f10, float f11, a1 a1Var) {
        this.f30304b = lVar;
        this.f30305c = f10;
        this.f30306d = f11;
        this.e = a1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v1.w wVar, te.c cVar) {
        switch (this.f30303a) {
            case 0:
                a1 a1Var = this.e;
                Object f10 = t.f0.f(wVar, new z8(a1Var, 6), new h9(a1Var, 10), new h9(a1Var, 11), new eb(wVar, this.f30304b, this.f30305c, this.f30306d), cVar);
                if (f10 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return f10;
            default:
                Object e = k2.e(wVar, null, null, new v0(wVar, this.f30304b, this.f30305c, this.f30306d, this.e, null), null, cVar, 11);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
        }
    }

    public u0(a1 a1Var, df.l lVar, float f10, float f11) {
        this.e = a1Var;
        this.f30304b = lVar;
        this.f30305c = f10;
        this.f30306d = f11;
    }
}
