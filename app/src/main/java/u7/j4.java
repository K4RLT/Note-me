package u7;
import a1.a;
import g0.b1;
import i1.i;
import i1.r;
import k0.w;
import o7.b;
import q.d;
import r0.a1;
import r0.e1;
import r0.f1;
import r2.x;
import w7.h6;
import z.e;
import z0.c;

import android.content.Context;
import b8.k9;
import b8.v9;
import java.util.ArrayList;
import w7.t9;
import wa.b9;

/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26367u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f26368v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f26369w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26370x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26371y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26372z;

    public /* synthetic */ j4(pf.z zVar, m3 m3Var, Context context, d dVar, f1 f1Var) {
        this.f26367u = 1;
        this.f26368v = zVar;
        this.f26371y = m3Var;
        this.f26372z = context;
        this.f26369w = dVar;
        this.f26370x = f1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f26367u) {
            case 0:
                b bVar = (b) this.f26371y;
                pf.z zVar = (pf.z) this.f26368v;
                f1 f1Var = (f1) this.f26370x;
                f1 f1Var2 = (f1) this.f26372z;
                d dVar = (d) this.f26369w;
                int intValue = ((Integer) obj).intValue();
                boolean z3 = true;
                int i = bVar.f21850c - 1;
                if (i < 0) {
                    i = 0;
                }
                int e = b9.e(f1Var.h() + intValue, 0, i);
                if (e == f1Var.h()) {
                    z3 = false;
                } else {
                    f1Var.i(e);
                    f1Var2.i(e);
                    pf.b0.x(zVar, null, new y5(e, dVar, null), 3);
                }
                return Boolean.valueOf(z3);
            case 1:
                pf.b0.x((pf.z) this.f26368v, null, new v9(((Boolean) obj).booleanValue(), (m3) this.f26371y, (Context) this.f26372z, (d) this.f26369w, (f1) this.f26370x, (te.c) null), 3);
                break;
            case 2:
                t9 t9Var = (t9) this.f26371y;
                df.l lVar = (df.l) this.f26368v;
                df.q qVar = (df.q) this.f26370x;
                df.l lVar2 = (df.l) this.f26372z;
                e1 e1Var = (e1) this.f26369w;
                e eVar = (e) obj;
                eVar.getClass();
                ArrayList h3 = t9Var.h();
                eVar.o(h3.size(), new w(new a(16, t9Var), 25, h3), new k9(8, h3), new c(-1091073711, new h6(h3, t9Var, lVar, qVar, lVar2, e1Var), true));
                break;
            case 3:
                i iVar = (i) this.f26371y;
                df.l lVar3 = (df.l) this.f26368v;
                String str = (String) this.f26370x;
                a1 a1Var = (a1) this.f26372z;
                a1 a1Var2 = (a1) this.f26369w;
                ((b1) obj).getClass();
                a1Var.setValue(Boolean.TRUE);
                i.a(iVar);
                String obj2 = mf.f.I(((x) a1Var2.getValue()).f24515a.f20477v).toString();
                if (obj2.length() != 0) {
                    str = obj2;
                }
                lVar3.invoke(str);
                break;
            default:
                df.l lVar4 = (df.l) this.f26371y;
                String str2 = (String) this.f26368v;
                a1 a1Var3 = (a1) this.f26370x;
                a1 a1Var4 = (a1) this.f26372z;
                a1 a1Var5 = (a1) this.f26369w;
                r rVar = (r) obj;
                rVar.getClass();
                if (rVar.b()) {
                    a1Var3.setValue(Boolean.TRUE);
                } else if (((Boolean) a1Var3.getValue()).booleanValue() && !((Boolean) a1Var4.getValue()).booleanValue()) {
                    a1Var4.setValue(Boolean.TRUE);
                    String obj3 = mf.f.I(((x) a1Var5.getValue()).f24515a.f20477v).toString();
                    if (obj3.length() != 0) {
                        str2 = obj3;
                    }
                    lVar4.invoke(str2);
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ j4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f26367u = i;
        this.f26371y = obj;
        this.f26368v = obj2;
        this.f26370x = obj3;
        this.f26372z = obj4;
        this.f26369w = obj5;
    }
}
