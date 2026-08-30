package w7;
import o8.c;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class d6 implements df.a {
    public final /* synthetic */ k0 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f28084u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u4 f28085v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pf.z f28086w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28087x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28088y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f28089z;

    public d6(Context context, u4 u4Var, pf.z zVar, u7.m3 m3Var, int i, int i10, k0 k0Var) {
        this.f28084u = context;
        this.f28085v = u4Var;
        this.f28086w = zVar;
        this.f28087x = m3Var;
        this.f28088y = i;
        this.f28089z = i10;
        this.A = k0Var;
    }

    @Override // df.a
    public final Object invoke() {
        Set set = x7.g0.f30195a;
        u4 u4Var = this.f28085v;
        String str = "fill:" + u4Var.f29209a;
        Context context = this.f28084u;
        x7.g0.c(context, str);
        sf.n0 n0Var = o8.f28851a;
        c(context, q8.FILL, u4Var.f29209a);
        wf.e eVar = pf.l0.f22767a;
        pf.b0.x(this.f28086w, wf.d.f29913w, new b8.v4(u4Var, context, this.f28087x, this.f28088y, this.f28089z, this.A, null), 2);
        return pe.z.f22715a;
    }
}
