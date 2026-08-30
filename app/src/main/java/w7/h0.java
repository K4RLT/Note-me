package w7;
import r0.a1;

import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements df.q {
    public final /* synthetic */ e3 A;
    public final /* synthetic */ e3 B;
    public final /* synthetic */ e3 C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pf.z f28327u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28328v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28329w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28330x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28331y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f28332z;

    public /* synthetic */ h0(pf.z zVar, kotlin.jvm.internal.y yVar, u7.m3 m3Var, int i, int i10, a1 a1Var, e3 e3Var, e3 e3Var2, e3 e3Var3) {
        this.f28327u = zVar;
        this.f28328v = yVar;
        this.f28329w = m3Var;
        this.f28330x = i;
        this.f28331y = i10;
        this.f28332z = a1Var;
        this.A = e3Var;
        this.B = e3Var2;
        this.C = e3Var3;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        Uri uri = (Uri) obj;
        uri.getClass();
        wf.e eVar = pf.l0.f22767a;
        pf.b0.x(this.f28327u, wf.d.f29913w, new u7.z4(this.f28328v, uri, (Float) obj2, (Float) obj3, this.f28329w, this.f28330x, this.f28331y, this.f28332z, this.A, this.B, this.C, null), 2);
        return pe.z.f22715a;
    }
}
