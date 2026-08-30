package u7;
import b8.c0;
import j1.b;
import k6.r;
import q.d;
import r0.a1;
import r0.f1;
import z1.x;

import android.view.View;
import com.google.android.gms.internal.ads.n00;
import wa.b9;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements df.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ a1 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26250u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f26251v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f26252w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26253x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26254y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26255z;

    public /* synthetic */ h(View view, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, a1 a1Var6) {
        this.f26252w = view;
        this.f26251v = a1Var;
        this.f26253x = a1Var2;
        this.f26254y = a1Var3;
        this.f26255z = a1Var4;
        this.A = a1Var5;
        this.B = a1Var6;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f26250u) {
            case 0:
                View view = (View) this.f26252w;
                a1 a1Var = this.f26251v;
                a1 a1Var2 = (a1) this.f26253x;
                a1 a1Var3 = (a1) this.f26254y;
                a1 a1Var4 = (a1) this.f26255z;
                a1 a1Var5 = (a1) this.A;
                a1 a1Var6 = this.B;
                x xVar = (x) obj;
                xVar.getClass();
                long k3 = xVar.k();
                if (!((Boolean) a1Var.getValue()).booleanValue() && !u0.e(a1Var2) && !u0.g(a1Var3) && !((Boolean) a1Var4.getValue()).booleanValue() && !u0.c(a1Var5) && !((Boolean) a1Var6.getValue()).booleanValue()) {
                    int i = (int) (4294967295L & k3);
                    int height = view.getHeight();
                    float f10 = 0.0f;
                    if (height > 0) {
                        f10 = b9.d(i / height, 0.0f, 0.85f);
                    }
                    e.f26111b = f10;
                }
                return pe.z.f22715a;
            default:
                pf.z zVar = (pf.z) this.f26252w;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f26253x;
                d dVar = (d) this.f26254y;
                b bVar = (b) this.f26255z;
                n00 n00Var = (n00) this.A;
                a1 a1Var7 = this.f26251v;
                f1 f1Var = (f1) this.B;
                pf.b0.x(zVar, null, new c0(16, dVar, null), 3);
                r(a1Var7, true);
                vVar.f19784u = ((Number) dVar.e()).floatValue();
                f1Var.i(b9.e(ff.a.b(((Number) dVar.e()).floatValue()), 0, bVar.f21850c - 1));
                n00Var.c();
                n00Var.a(0L, ((b) obj).f18762a);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ h(pf.z zVar, kotlin.jvm.internal.v vVar, d dVar, b bVar, n00 n00Var, a1 a1Var, f1 f1Var) {
        this.f26252w = zVar;
        this.f26253x = vVar;
        this.f26254y = dVar;
        this.f26255z = bVar;
        this.A = n00Var;
        this.f26251v = a1Var;
        this.B = f1Var;
    }
}
