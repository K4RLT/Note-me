package w7;
import c.h;
import r0.i0;
import r0.i1;

import android.content.Context;

/* loaded from: classes.dex */
public final class z2 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f29530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f29531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f29533d;
    public final /* synthetic */ e3 e;

    public z2(androidx.lifecycle.w wVar, h hVar, u7.m3 m3Var, kotlin.jvm.internal.y yVar, e3 e3Var) {
        this.f29530a = wVar;
        this.f29531b = hVar;
        this.f29532c = m3Var;
        this.f29533d = yVar;
        this.e = e3Var;
    }

    @Override // i0
    public final void a() {
        this.f29530a.g().f(this.f29531b);
        u7.m3 m3Var = this.f29532c;
        kotlin.jvm.internal.y yVar = this.f29533d;
        m3Var.a0((Context) yVar.f19787u);
        e3 e3Var = this.e;
        e3Var.B(false);
        i1 i1Var = e3Var.G;
        Boolean bool = Boolean.FALSE;
        i1Var.setValue(bool);
        e3Var.K.setValue(bool);
        e3Var.L.setValue(null);
        Context context = (Context) yVar.f19787u;
        context.getClass();
        e3 e3Var2 = n4.E;
        if (e3Var2 == null) {
            return;
        }
        try {
            n4.p1(context, e3Var2);
        } catch (Throwable unused) {
        }
    }
}
