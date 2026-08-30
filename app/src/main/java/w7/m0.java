package w7;
import v7.k;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28665u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28666v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28667w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28668x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28669y;

    public /* synthetic */ m0(u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, int i11) {
        this.f28665u = i11;
        this.f28666v = m3Var;
        this.f28667w = i;
        this.f28668x = i10;
        this.f28669y = yVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.a
    public final Object invoke() {
        switch (this.f28665u) {
            case 0:
                u7.m3 m3Var = this.f28666v;
                int i = this.f28667w;
                int i10 = this.f28668x;
                Context context = (Context) this.f28669y.f19787u;
                context.getClass();
                k kVar = m3Var.f26542p;
                String y10 = m3Var.y(i);
                kVar.getClass();
                kVar.a(y10, i10, context, false);
                synchronized (f7.b.f16774a) {
                    f7.b.e++;
                }
                m3Var.f26546t = true;
                return pe.z.f22715a;
            case 1:
                u7.m3 m3Var2 = this.f28666v;
                int i11 = this.f28667w;
                int i12 = this.f28668x;
                Context context2 = (Context) this.f28669y.f19787u;
                context2.getClass();
                k kVar2 = m3Var2.f26542p;
                String y11 = m3Var2.y(i11);
                kVar2.getClass();
                kVar2.a(y11, i12, context2, true);
                m3Var2.f26546t = true;
                return pe.z.f22715a;
            case 2:
                u7.m3.t0(this.f28666v, this.f28667w, this.f28668x, (String) this.f28669y.f19787u, null, Boolean.FALSE, 8);
                return pe.z.f22715a;
            case 3:
                u7.m3 m3Var3 = this.f28666v;
                int i13 = this.f28667w;
                int i14 = this.f28668x;
                String str = (String) this.f28669y.f19787u;
                str.getClass();
                m3Var3.x0(i13, i14, str, new u7.y0(12));
                return pe.z.f22715a;
            default:
                u7.m3.t0(this.f28666v, this.f28667w, this.f28668x, (String) this.f28669y.f19787u, null, Boolean.TRUE, 8);
                return pe.z.f22715a;
        }
    }
}
