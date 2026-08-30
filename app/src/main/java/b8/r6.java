package b8;
import f.b;
import f0.e;
import b0.b;
import b0.x;
import l.a;
import q7.f;
import r0.a1;
import r0.f1;
import u7.g2;
import u7.h2;
import u7.m3;
import u7.y0;
import x7.f0;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.daren.scraply.R;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements df.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2665u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2666v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2667w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2668x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2669y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2670z;

    public /* synthetic */ r6(pf.z zVar, Context context, ca caVar, a1 a1Var, u6 u6Var, a1 a1Var2, a1 a1Var3) {
        this.f2665u = 1;
        this.f2666v = zVar;
        this.f2670z = context;
        this.A = caVar;
        this.f2667w = a1Var;
        this.B = u6Var;
        this.f2668x = a1Var2;
        this.f2669y = a1Var3;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        int i = this.f2665u;
        pe.z zVar = pe.z.f22715a;
        Object obj = this.B;
        Object obj2 = this.A;
        Object obj3 = this.f2670z;
        Object obj4 = this.f2669y;
        Object obj5 = this.f2668x;
        Object obj6 = this.f2667w;
        Object obj7 = this.f2666v;
        te.c cVar = null;
        switch (i) {
            case 0:
                a1 a1Var = (a1) obj6;
                a1 a1Var2 = (a1) obj5;
                a1Var.setValue(Boolean.TRUE);
                a1Var2.setValue(null);
                pf.x((pf.z) obj7, null, new l3((a1) obj4, (a1) obj3, (a1) obj2, a1Var, (df.a) obj, a1Var2, null), 3);
                return zVar;
            case 1:
                pf.z zVar2 = (pf.z) obj7;
                Context context = (Context) obj3;
                ca caVar = (ca) obj2;
                a1 a1Var3 = (a1) obj6;
                u6 u6Var = (u6) obj;
                a1 a1Var4 = (a1) obj5;
                a1 a1Var5 = (a1) obj4;
                if (kotlin.jvm.internal.a(caVar.d(), "ad") && !((Boolean) b.f24612b.f25140u.getValue()).booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a0 a0Var = new a0(a1Var3, 9);
                p9 p9Var = new p9(context, zVar2, a1Var3, u6Var, caVar, a1Var4, a1Var5, 0);
                Activity b10 = f.b(context);
                if (z3 && b10 != null) {
                    pf.x(zVar2, null, new d5(a0Var, context, "universe", null, p9Var, b10, null), 3);
                } else {
                    p9Var.invoke();
                }
                return zVar;
            case 2:
                Context context2 = (Context) obj7;
                Uri uri = (Uri) obj5;
                df.p pVar = (df.p) obj4;
                sf.n0 n0Var = f0.f30184a;
                String string = context2.getString(R.string.loading_importing);
                string.getClass();
                f0.e(string);
                int h3 = ((f1) obj3).h();
                int h10 = ((f1) obj2).h();
                int h11 = ((f1) obj).h();
                y0 y0Var = new y0(21);
                uri.getClass();
                pVar.getClass();
                wf.e eVar = pf.l0.f22767a;
                pf.x(pf.b(wf.d.f29913w), null, new h2(context2, pVar, y0Var, (m3) obj6, h3, h10, h11, uri, null), 3);
                return zVar;
            default:
                Context context3 = (Context) obj7;
                m3 m3Var = (m3) obj6;
                List list = (List) obj5;
                df.p pVar2 = (df.p) obj4;
                sf.n0 n0Var2 = f0.f30184a;
                String string2 = context3.getString(R.string.loading_importing);
                string2.getClass();
                f0.e(string2);
                int h12 = ((f1) obj3).h();
                int h13 = ((f1) obj2).h();
                int h14 = ((f1) obj).h();
                y0 y0Var2 = new y0(20);
                list.getClass();
                pVar2.getClass();
                if (list.isEmpty()) {
                    wf.e eVar2 = pf.l0.f22767a;
                    pf.x(pf.b(uf.n.f27235a), null, new o3(pVar2, cVar, 4), 3);
                } else {
                    wf.e eVar3 = pf.l0.f22767a;
                    pf.x(pf.b(wf.d.f29913w), null, new g2(context3, list, y0Var2, m3Var, h12, h13, h14, pVar2, null), 3);
                }
                return zVar;
        }
    }

    public /* synthetic */ r6(Object obj, Object obj2, Object obj3, Object obj4, a1 a1Var, a1 a1Var2, Object obj5, int i) {
        this.f2665u = i;
        this.f2666v = obj;
        this.f2667w = obj2;
        this.f2668x = obj3;
        this.f2669y = obj4;
        this.f2670z = a1Var;
        this.A = a1Var2;
        this.B = obj5;
    }
}
