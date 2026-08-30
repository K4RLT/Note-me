package w7;
import r0.a1;
import t1.e;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class ib implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f28468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f28469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df.p f28470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f28471d;
    public final /* synthetic */ float e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.a f28472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df.l f28473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f28474h;

    public ib(double d2, float f10, df.p pVar, float f11, float f12, df.a aVar, df.l lVar, a1 a1Var) {
        this.f28468a = d2;
        this.f28469b = f10;
        this.f28470c = pVar;
        this.f28471d = f11;
        this.e = f12;
        this.f28472f = aVar;
        this.f28473g = lVar;
        this.f28474h = a1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        Object e = t.e(wVar, new hb(this.f28468a, this.f28469b, this.f28470c, this.f28471d, this.e, this.f28472f, this.f28473g, this.f28474h, null), cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
