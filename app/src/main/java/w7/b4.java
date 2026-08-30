package w7;
import r0.a1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class b4 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f27980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f27981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f27982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f27983d;
    public final /* synthetic */ a1 e;

    public b4(a1 a1Var, e3 e3Var, a1 a1Var2, a1 a1Var3, a1 a1Var4) {
        this.f27980a = a1Var;
        this.f27981b = e3Var;
        this.f27982c = a1Var2;
        this.f27983d = a1Var3;
        this.e = a1Var4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        Object obj = new Object();
        Object g8 = t.f0.g(wVar, new z3(obj, 0), null, new a4((kotlin.jvm.internal.v) obj, this.f27980a, this.f27981b, this.f27982c, this.f27983d, this.e), cVar, 6);
        if (g8 == ue.a.f27192u) {
            return g8;
        }
        return pe.z.f22715a;
    }
}