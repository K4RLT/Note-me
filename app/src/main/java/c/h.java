package c;

import android.content.Context;
import u7.m3;
import w7.e3;
import w7.n4;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.u {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3238u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3239v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3240w;

    public /* synthetic */ h(Object obj, int i, Object obj2) {
        this.f3238u = i;
        this.f3239v = obj;
        this.f3240w = obj2;
    }

    @Override // androidx.lifecycle.u
    public final void k(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        switch (this.f3238u) {
            case 0:
                g0 g0Var = (g0) this.f3239v;
                o oVar2 = (o) this.f3240w;
                if (oVar == androidx.lifecycle.o.ON_CREATE) {
                    g0Var.e = i.a(oVar2);
                    g0Var.d(g0Var.f3237g);
                    return;
                }
                return;
            default:
                m3 m3Var = (m3) this.f3239v;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f3240w;
                if (oVar == androidx.lifecycle.o.ON_PAUSE) {
                    m3Var.a0((Context) yVar.f19787u);
                    Context context = (Context) yVar.f19787u;
                    context.getClass();
                    e3 e3Var = n4.E;
                    if (e3Var != null) {
                        try {
                            n4.p1(context, e3Var);
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
