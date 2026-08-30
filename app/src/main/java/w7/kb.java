package w7;
import r0.e1;
import t1.e;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class kb implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28587a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f28588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f28589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.a f28590d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28591f;

    public kb(df.l lVar, float f10, float f11, df.a aVar, e1 e1Var) {
        this.e = lVar;
        this.f28588b = f10;
        this.f28589c = f11;
        this.f28590d = aVar;
        this.f28591f = e1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f28587a) {
            case 0:
                Object e = t.e(wVar, new jb((u7.d) this.e, (df.p) this.f28591f, this.f28588b, this.f28589c, this.f28590d, null), cVar);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            default:
                Object e8 = t.e(wVar, new x7.e((df.l) this.e, this.f28588b, this.f28589c, this.f28590d, (e1) this.f28591f, null), cVar);
                if (e8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e8;
        }
    }

    public kb(u7.d dVar, df.p pVar, float f10, float f11, df.a aVar) {
        this.e = dVar;
        this.f28591f = pVar;
        this.f28588b = f10;
        this.f28589c = f11;
        this.f28590d = aVar;
    }
}
