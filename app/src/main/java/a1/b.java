package a1;
import l.a;

import android.content.Context;
import b1.y;
import b8.p6;
import b8.t9;
import b8.u6;
import b8.z3;
import b8.z5;
import java.util.List;
import pe.z;
import pf.b0;
import r0.a1;
import t.g0;
import u7.m3;
import u7.o1;
import u7.u0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements df.a {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f179u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f180v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f181w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f182x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f183y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f184z;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f179u = i;
        this.f180v = obj;
        this.f181w = obj2;
        this.f182x = obj3;
        this.f183y = obj4;
        this.f184z = obj5;
        this.A = obj6;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        int i = this.f179u;
        boolean z3 = true;
        boolean z9 = false;
        z zVar = z.f22715a;
        Object obj = this.A;
        Object obj2 = this.f184z;
        Object obj3 = this.f183y;
        Object obj4 = this.f182x;
        Object obj5 = this.f181w;
        Object obj6 = this.f180v;
        switch (i) {
            case 0:
                d dVar = (d) obj6;
                s sVar = (s) obj5;
                o oVar = (o) obj4;
                String str2 = (String) obj3;
                Object[] objArr = (Object[]) obj;
                if (dVar.f188v != oVar) {
                    dVar.f188v = oVar;
                    z9 = true;
                }
                if (!kotlin.jvm.internal.a(dVar.f189w, str2)) {
                    dVar.f189w = str2;
                } else {
                    z3 = z9;
                }
                dVar.f187u = sVar;
                dVar.f190x = obj2;
                dVar.f191y = objArr;
                n nVar = dVar.f192z;
                if (nVar != null && z3) {
                    ((ra.e) nVar).A();
                    dVar.f192z = null;
                    dVar.c();
                }
                return zVar;
            case 1:
                pf.z zVar2 = (pf.z) obj6;
                a1 a1Var = (a1) obj4;
                Context context = (Context) obj3;
                a1 a1Var2 = (a1) obj2;
                a1 a1Var3 = (a1) obj;
                ((a1) obj5).setValue(Boolean.FALSE);
                z5 z5Var = z5.f3075a;
                z5.d();
                df.a aVar = (df.a) a1Var.getValue();
                te.c cVar = null;
                if (aVar != null) {
                    a1Var.setValue(null);
                    aVar.invoke();
                } else {
                    b0.x(zVar2, null, new t9(context, a1Var2, a1Var3, cVar, 1), 3);
                }
                return zVar;
            case 2:
                pf.z zVar3 = (pf.z) obj5;
                a1 a1Var4 = (a1) obj4;
                Context context2 = (Context) obj3;
                a1 a1Var5 = (a1) obj2;
                a1 a1Var6 = (a1) obj;
                if ((((u6) obj6) instanceof z3) && !((Boolean) p6.e.f25140u.getValue()).booleanValue()) {
                    a1Var4.setValue(Boolean.TRUE);
                } else {
                    b0.x(zVar3, null, new t9(context2, a1Var5, a1Var6, null, 0), 3);
                }
                return zVar;
            case 3:
                a1 a1Var7 = (a1) obj6;
                a1 a1Var8 = (a1) obj5;
                a1 a1Var9 = (a1) obj4;
                a1 a1Var10 = (a1) obj3;
                a1 a1Var11 = (a1) obj2;
                a1 a1Var12 = (a1) obj;
                a1Var7.setValue(Boolean.valueOf(!u0.c(a1Var7)));
                if (((Boolean) a1Var7.getValue()).booleanValue()) {
                    u0.h(a1Var8);
                    u0.f(a1Var9, false);
                    u0.j(a1Var10);
                    u0.b(a1Var11);
                    u0.i(a1Var12);
                }
                return zVar;
            default:
                o1 o1Var = (o1) obj6;
                pf.z zVar4 = (pf.z) obj5;
                m3 m3Var = (m3) obj4;
                Context context3 = (Context) obj3;
                List list = (List) obj2;
                y yVar = (y) obj;
                String a10 = o1Var.i().a(o1Var.e());
                if (a10 != null && a10.length() > 0) {
                    str = a10;
                } else {
                    str = null;
                }
                if (str != null) {
                    b0.x(zVar4, null, new g0(o1Var, m3Var, context3, str, list, yVar, null), 3);
                }
                return zVar;
        }
    }
}
