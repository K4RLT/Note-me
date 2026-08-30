package b8;
import a5.a;
import ca.a;
import l.a;
import l.c;
import m.d;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t3 extends ve.i implements df.p {
    public final /* synthetic */ String A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2756u;

    /* renamed from: v, reason: collision with root package name */
    public yf.c f2757v;

    /* renamed from: w, reason: collision with root package name */
    public u3 f2758w;

    /* renamed from: x, reason: collision with root package name */
    public String f2759x;

    /* renamed from: y, reason: collision with root package name */
    public int f2760y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ u3 f2761z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(u3 u3Var, String str, te.c cVar, int i) {
        super(2, cVar);
        this.f2756u = i;
        this.f2761z = u3Var;
        this.A = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2756u) {
            case 0:
                return new t3(this.f2761z, this.A, cVar, 0);
            default:
                return new t3(this.f2761z, this.A, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2756u) {
            case 0:
                return ((t3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((t3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        u3 u3Var;
        yf.c cVar;
        String str;
        int i;
        yf.c cVar2;
        String str2;
        u3 u3Var2;
        switch (this.f2756u) {
            case 0:
                int i10 = this.f2760y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        str = this.f2759x;
                        u3Var = this.f2758w;
                        cVar = this.f2757v;
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    u3Var = this.f2761z;
                    cVar = u3Var.f2823c;
                    this.f2757v = cVar;
                    this.f2758w = u3Var;
                    str = this.A;
                    this.f2759x = str;
                    this.f2760y = 1;
                    Object f10 = cVar.f(this);
                    ue.a aVar = ue.a.f27192u;
                    if (f10 == aVar) {
                        return aVar;
                    }
                }
                try {
                    List<ca> list = u3.l(u3Var).f2246a;
                    ArrayList arrayList = new ArrayList(qe.d(list, 10));
                    ca caVar = null;
                    for (ca caVar2 : list) {
                        if (kotlin.jvm.internal.a(caVar2.f1935a, str)) {
                            boolean z3 = caVar2.f1947o;
                            boolean z9 = !z3;
                            int i11 = caVar2.f1939f;
                            if (z3) {
                                i = -1;
                            } else {
                                i = 1;
                            }
                            int i12 = i11 + i;
                            if (i12 < 0) {
                                i12 = 0;
                            }
                            caVar = a(caVar2, i12, 0, 0, 0L, z9, 245727);
                            caVar2 = caVar;
                        }
                        arrayList.add(caVar2);
                    }
                    if (caVar != null) {
                        u3.n(u3Var, new j3(arrayList));
                    }
                    cVar.j(null);
                    return caVar;
                } catch (Throwable th) {
                    cVar.j(null);
                    throw th;
                }
            default:
                int i13 = this.f2760y;
                String str3 = this.A;
                u3 u3Var3 = this.f2761z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        str2 = this.f2759x;
                        u3Var2 = this.f2758w;
                        cVar2 = this.f2757v;
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    cVar2 = u3Var3.f2823c;
                    this.f2757v = cVar2;
                    this.f2758w = u3Var3;
                    this.f2759x = str3;
                    this.f2760y = 1;
                    Object f11 = cVar2.f(this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (f11 == aVar2) {
                        return aVar2;
                    }
                    str2 = str3;
                    u3Var2 = u3Var3;
                }
                try {
                    List list2 = u3.l(u3Var2).f2246a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!kotlin.jvm.internal.a(((ca) obj2).f1935a, str2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    u3.n(u3Var2, new j3(arrayList2));
                    cVar2.j(null);
                    u3.m(u3Var3, str3).delete();
                    new File(u3Var3.v(), a.g(str3, ".jpg")).delete();
                    af.c(u3.k(u3Var3, str3));
                    return pe.z.f22715a;
                } finally {
                    cVar2.j(null);
                }
        }
    }
}
