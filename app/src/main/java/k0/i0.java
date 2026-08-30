package k0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import t.t1;

/* loaded from: classes.dex */
public final class i0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.l f19307b;

    public /* synthetic */ i0(int i, df.l lVar) {
        this.f19306a = i;
        this.f19307b = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v1.w wVar, te.c cVar) {
        switch (this.f19306a) {
            case 0:
                Object Y0 = ((v1.h0) wVar).Y0(new h0(this.f19307b, null, 0), cVar);
                if (Y0 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return Y0;
            default:
                Object e = t1.e(wVar, new h0(this.f19307b, null, 1), cVar);
                pe.z zVar = pe.z.f22715a;
                ue.a aVar = ue.a.f27192u;
                if (e != aVar) {
                    e = zVar;
                }
                if (e == aVar) {
                    return e;
                }
                return zVar;
        }
    }
}
