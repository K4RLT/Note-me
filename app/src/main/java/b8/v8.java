package b8;
import a0.u;
import a1.i;
import c2.n2;
import c2.r1;
import f.c;
import i1.i;
import j6.e;
import r0.a1;
import r0.j0;
import r0.n2;
import u7.d6;
import u7.e6;
import u7.l2;
import u7.m3;
import u7.q7;
import u7.u0;
import y8.c;
import z.e;
import z0.c;

import android.content.Context;
import android.view.Choreographer;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class v8 implements df.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2893u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2894v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2895w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2896x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2897y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2898z;

    public /* synthetic */ v8(List list, df.l lVar, df.l lVar2, String str, df.l lVar3, e eVar, Set set, n2 n2Var) {
        this.f2893u = 0;
        this.f2894v = list;
        this.f2895w = lVar;
        this.f2896x = lVar2;
        this.f2898z = str;
        this.f2897y = lVar3;
        this.A = eVar;
        this.B = set;
        this.C = n2Var;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f2893u) {
            case 0:
                List list = (List) this.f2894v;
                df.l lVar = (df.l) this.f2895w;
                df.l lVar2 = (df.l) this.f2896x;
                String str = (String) this.f2898z;
                df.l lVar3 = (df.l) this.f2897y;
                e eVar = (e) this.A;
                Set set = (Set) this.B;
                n2 n2Var = (n2) this.C;
                e eVar2 = (e) obj;
                eVar2.getClass();
                eVar2.o(list.size(), new u(new i(14), 6, list), new d9(0, list), new c(-1091073711, new e9(list, lVar, lVar2, str, lVar3, eVar, set, n2Var), true));
                break;
            case 1:
                n2 n2Var2 = (n2) this.f2894v;
                i iVar = (i) this.f2895w;
                a1 a1Var = (a1) this.f2896x;
                a1 a1Var2 = (a1) this.f2897y;
                a1 a1Var3 = (a1) this.f2898z;
                a1 a1Var4 = (a1) this.A;
                a1 a1Var5 = (a1) this.B;
                a1 a1Var6 = (a1) this.C;
                u0.f(a1Var, false);
                u0.h(a1Var2);
                u0.i(a1Var3);
                u0.j(a1Var4);
                u0.b(a1Var5);
                u0.d(a1Var6);
                if (n2Var2 != null) {
                    ((r1) n2Var2).a();
                }
                i.a(iVar);
                break;
            default:
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) this.f2894v;
                d6 d6Var = (d6) this.f2895w;
                Choreographer choreographer = (Choreographer) this.f2896x;
                m3 m3Var = (m3) this.f2897y;
                Context context = (Context) this.f2898z;
                q7 q7Var = (q7) this.A;
                c cVar = (c) this.B;
                l2 l2Var = (l2) this.C;
                ((j0) obj).getClass();
                c cVar2 = new c(d6Var, choreographer, m3Var, context, 1);
                wVar.g().a(cVar2);
                return new e6(new Object(), wVar, cVar2, d6Var, choreographer, q7Var, cVar, l2Var);
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ v8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.f2893u = i;
        this.f2894v = obj;
        this.f2895w = obj2;
        this.f2896x = obj3;
        this.f2897y = obj4;
        this.f2898z = obj5;
        this.A = obj6;
        this.B = obj7;
        this.C = obj8;
    }
}
