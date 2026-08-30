package u7;
import b2.f1;
import d.i;
import e7.r;
import o7.b;
import r0.a1;
import x7.g0;
import x7.j;
import y4.a;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements df.a {
    public final /* synthetic */ Context A;
    public final /* synthetic */ a1 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27057u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27058v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f27059w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f27060x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27061y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f27062z;

    public /* synthetic */ y3(Context context, String str, m3 m3Var, int i, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f27057u = 2;
        this.A = context;
        this.f27058v = str;
        this.f27061y = m3Var;
        this.f27060x = i;
        this.f27062z = a1Var;
        this.f27059w = a1Var2;
        this.B = a1Var3;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        int i = this.f27057u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f27059w;
        Object obj = this.f27062z;
        Object obj2 = this.f27061y;
        Object obj3 = this.f27058v;
        switch (i) {
            case 0:
                final b bVar = (b) obj2;
                final i iVar = (i) obj;
                a1Var.setValue(Boolean.FALSE);
                r rVar = r.f15993z;
                final int i10 = 0;
                final int i11 = this.f27060x;
                final Context context = this.A;
                final a1 a1Var2 = this.B;
                df.a aVar = new df.a() { // from class: u7.p3
                    @Override // df.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                Integer valueOf = Integer.valueOf(i11);
                                b bVar2 = bVar;
                                pe.j jVar = new pe.j(valueOf, bVar2);
                                a1 a1Var3 = a1Var2;
                                a1Var3.setValue(jVar);
                                if (!j.x(iVar, context, e.f0(bVar2.f21849b).concat(".pdf"))) {
                                    a1Var3.setValue(null);
                                }
                                return pe.z.f22715a;
                            default:
                                pe.j jVar2 = new pe.j(Integer.valueOf(i11), bVar);
                                a1 a1Var4 = a1Var2;
                                a1Var4.setValue(jVar2);
                                if (!j.x(iVar, context, null)) {
                                    a1Var4.setValue(null);
                                }
                                return pe.z.f22715a;
                        }
                    }
                };
                rVar.getClass();
                rVar.e((Activity) obj3, aVar);
                return zVar;
            case 1:
                final b bVar2 = (b) obj2;
                final i iVar2 = (i) obj;
                a1Var.setValue(Boolean.FALSE);
                r rVar2 = r.f15993z;
                final int i12 = 1;
                final int i13 = this.f27060x;
                final Context context2 = this.A;
                final a1 a1Var3 = this.B;
                df.a aVar2 = new df.a() { // from class: u7.p3
                    @Override // df.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                Integer valueOf = Integer.valueOf(i13);
                                b bVar22 = bVar2;
                                pe.j jVar = new pe.j(valueOf, bVar22);
                                a1 a1Var32 = a1Var3;
                                a1Var32.setValue(jVar);
                                if (!j.x(iVar2, context2, e.f0(bVar22.f21849b).concat(".pdf"))) {
                                    a1Var32.setValue(null);
                                }
                                return pe.z.f22715a;
                            default:
                                pe.j jVar2 = new pe.j(Integer.valueOf(i13), bVar2);
                                a1 a1Var4 = a1Var3;
                                a1Var4.setValue(jVar2);
                                if (!j.x(iVar2, context2, null)) {
                                    a1Var4.setValue(null);
                                }
                                return pe.z.f22715a;
                        }
                    }
                };
                rVar2.getClass();
                rVar2.e((Activity) obj3, aVar2);
                return zVar;
            default:
                m3 m3Var = (m3) obj2;
                a1 a1Var4 = (a1) obj;
                Context context3 = this.A;
                g0.c(context3, (String) obj3);
                String str2 = a1Var4.f25888a;
                int i14 = a1Var4.e;
                b bVar3 = (b) qe.l.y(this.f27060x, m3Var.f26547u);
                if (bVar3 != null && (str = bVar3.f21848a) != null) {
                    f1 f1Var = m3Var.f26541o;
                    f1Var.getClass();
                    a aVar3 = (a) f1Var.f1456v;
                    wf.e eVar = pf.l0.f22767a;
                    pf.b0.x(aVar3, wf.d.f29913w, new v7.b(str2, f1Var, context3, str, i14, (te.c) null), 2);
                }
                b(a1Var);
                u0.d(this.B);
                return zVar;
        }
    }

    public /* synthetic */ y3(Activity activity, a1 a1Var, int i, b bVar, i iVar, Context context, a1 a1Var2, int i10) {
        this.f27057u = i10;
        this.f27058v = activity;
        this.f27059w = a1Var;
        this.f27060x = i;
        this.f27061y = bVar;
        this.f27062z = iVar;
        this.A = context;
        this.B = a1Var2;
    }
}
