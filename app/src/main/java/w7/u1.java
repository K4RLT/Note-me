package w7;
import r0.a1;
import r0.e1;
import t1.e;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class u1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.l f29168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.l f29169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f29170c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f29171d;
    public final /* synthetic */ e3 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f29172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f29173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1 f29174h;
    public final /* synthetic */ e1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f29175j;

    public u1(df.l lVar, df.l lVar2, float f10, float f11, e3 e3Var, a1 a1Var, e1 e1Var, e1 e1Var2, e1 e1Var3, e1 e1Var4) {
        this.f29168a = lVar;
        this.f29169b = lVar2;
        this.f29170c = f10;
        this.f29171d = f11;
        this.e = e3Var;
        this.f29172f = a1Var;
        this.f29173g = e1Var;
        this.f29174h = e1Var2;
        this.i = e1Var3;
        this.f29175j = e1Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        Object e = t.e(wVar, new t1(this.f29168a, this.f29169b, this.f29170c, this.f29171d, this.e, this.f29172f, this.f29173g, this.f29174h, this.i, this.f29175j, null), cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
