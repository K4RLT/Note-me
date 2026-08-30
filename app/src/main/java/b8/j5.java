package b8;
import r0.a1;
import r0.e1;
import t.t1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class j5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f2250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f2251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f2253d;
    public final /* synthetic */ boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.l f2254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f2255g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pf.z f2256h;

    public j5(df.l lVar, pf.z zVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, e1 e1Var, boolean z3) {
        this.f2250a = e1Var;
        this.f2251b = a1Var;
        this.f2252c = a1Var2;
        this.f2253d = a1Var3;
        this.e = z3;
        this.f2254f = lVar;
        this.f2255g = a1Var4;
        this.f2256h = zVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        Object e = t1.e(wVar, new i5(this.f2250a, this.f2251b, this.f2252c, this.f2253d, this.e, this.f2254f, this.f2255g, this.f2256h, null), cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
