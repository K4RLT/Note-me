package u7;
import b2.f1;
import d.a;
import o0.h;
import o7.b;
import p7.c;
import q.n;

import android.content.Context;
import b8.u9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26691u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26692v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26693w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26694x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26695y;

    public /* synthetic */ p(kotlin.jvm.internal.u uVar, m3 m3Var, int i, Context context) {
        this.f26691u = 4;
        this.f26695y = uVar;
        this.f26692v = m3Var;
        this.f26693w = i;
        this.f26694x = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // df.a
    public final Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.f26691u;
        String str6 = null;
        Context context = this.f26694x;
        pe.z zVar = pe.z.f22715a;
        int i10 = this.f26693w;
        m3 m3Var = this.f26692v;
        Object obj = this.f26695y;
        switch (i) {
            case 0:
                boolean z3 = !((v7.d) obj).f27407b;
                context.getClass();
                b bVar = (b) qe.l.y(i10, m3Var.f26547u);
                if (bVar != null && (str = bVar.f21848a) != null) {
                    f1 f1Var = m3Var.f26541o;
                    f1Var.getClass();
                    v7.d a10 = v7.a(f1Var.m(context, str), null, z3, 0, false, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, null, 32765);
                    ((ConcurrentHashMap) f1Var.f1458x).put(str, a10);
                    f1.o(str, context, a10);
                    f1Var.f(str);
                }
                return zVar;
            case 1:
                c cVar = (c) obj;
                if (cVar != null) {
                    str6 = cVar.f22431a;
                }
                String str7 = str6;
                context.getClass();
                b bVar2 = (b) qe.l.y(i10, m3Var.f26547u);
                if (bVar2 != null && (str2 = bVar2.f21848a) != null) {
                    f1 f1Var2 = m3Var.f26541o;
                    f1Var2.getClass();
                    v7.d a11 = v7.a(f1Var2.m(context, str2), null, false, 0, false, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, str7, 0, null, 30719);
                    ((ConcurrentHashMap) f1Var2.f1458x).put(str2, a11);
                    f1.o(str2, context, a11);
                    f1Var2.f(str2);
                }
                return zVar;
            case 2:
                String str8 = ((v0) obj).f26938a;
                context.getClass();
                b bVar3 = (b) qe.l.y(i10, m3Var.f26547u);
                if (bVar3 != null && (str3 = bVar3.f21848a) != null) {
                    f1 f1Var3 = m3Var.f26541o;
                    f1Var3.getClass();
                    v7.d a12 = v7.a(f1Var3.m(context, str3), null, false, 0, false, null, str8, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, null, 32735);
                    ((ConcurrentHashMap) f1Var3.f1458x).put(str3, a12);
                    f1.o(str3, context, a12);
                    f1Var3.f(str3);
                }
                return zVar;
            case 3:
                String str9 = ((s6) obj).f26860a;
                f1 f1Var4 = m3Var.f26541o;
                Context context2 = this.f26694x;
                context2.getClass();
                str9.getClass();
                b bVar4 = (b) qe.l.y(i10, m3Var.f26547u);
                if (bVar4 != null && (str4 = bVar4.f21848a) != null) {
                    List list = f1Var4.m(context2, str4).f27418o;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (kotlin.jvm.internal.a(((s6) next).f26860a, str9)) {
                                str6 = next;
                            }
                        }
                    }
                    s6 s6Var = (s6) str6;
                    if (s6Var != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!kotlin.jvm.internal.a(((s6) obj2).f26860a, str9)) {
                                arrayList.add(obj2);
                            }
                        }
                        v7.d a13 = v7.a(f1Var4.m(context2, str4), null, false, 0, false, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, arrayList, 16383);
                        ((ConcurrentHashMap) f1Var4.f1458x).put(str4, a13);
                        f1.o(str4, context2, a13);
                        f1Var4.f(str4);
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj3 = arrayList.get(i11);
                            i11++;
                            s6 s6Var2 = (s6) obj3;
                            qe.n(arrayList2, qe.k.l(new String[]{s6Var2.f26861b, s6Var2.f26862c, s6Var2.f26863d}));
                        }
                        Set U = qe.l.U(arrayList2);
                        a h3 = androidx.lifecycle.h(m3Var);
                        wf.e eVar = pf.l0.f22767a;
                        pf.b0.x(h3, wf.d.f29913w, new u9(s6Var, U, context2, str4, (te.c) null), 2);
                    }
                }
                return zVar;
            default:
                if (((kotlin.jvm.internal.u) obj).f19783u) {
                    context.getClass();
                    b bVar5 = (b) qe.l.y(i10, m3Var.f26547u);
                    if (bVar5 != null && (str5 = bVar5.f21848a) != null) {
                        f1 f1Var5 = m3Var.f26541o;
                        f1Var5.getClass();
                        f1.o(str5, context, f1Var5.m(context, str5));
                    }
                }
                return zVar;
        }
    }

    public /* synthetic */ p(m3 m3Var, int i, Context context, Object obj, int i10) {
        this.f26691u = i10;
        this.f26692v = m3Var;
        this.f26693w = i;
        this.f26694x = context;
        this.f26695y = obj;
    }
}
