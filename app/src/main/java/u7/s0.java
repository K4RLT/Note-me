package u7;
import b1.h;
import b8.b7;
import b8.y6;
import d8.f;
import g7.e;
import g7.i;
import l.a;
import p0.b;
import q.x;
import r0.a1;

import android.content.Context;
import b8.n9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import w7.p9;
import w7.t9;

/* loaded from: classes.dex */
public final class s0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26804u;

    /* renamed from: v, reason: collision with root package name */
    public int f26805v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f26806w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f26807x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Context context, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26804u = i;
        this.f26806w = context;
        this.f26807x = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26804u) {
            case 0:
                return new s0(this.f26806w, this.f26807x, cVar, 0);
            default:
                return new s0(this.f26806w, this.f26807x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26804u) {
            case 0:
                return ((s0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((s0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        lb.r1 r1Var;
        boolean z3;
        te.c cVar = null;
        switch (this.f26804u) {
            case 0:
                ue.a aVar = ue.a.f27192u;
                int i = this.f26805v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    wf.e eVar = pf.l0.f22767a;
                    wf.d dVar = wf.d.f29913w;
                    y6 y6Var = new y6(3, this.f26806w, null);
                    this.f26805v = 1;
                    obj = pf.b0.J(dVar, y6Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                a1 a1Var = this.f26807x;
                float f10 = u0.f26903a;
                a1Var.setValue((List) obj);
                return pe.z.f22715a;
            default:
                Object obj2 = ue.a.f27192u;
                int i10 = this.f26805v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    sf.n0 n0Var = i.f17566a;
                    Context context = this.f26806w;
                    context.getClass();
                    int i11 = 0;
                    if (i.e == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (lb.a.class) {
                            r1Var = (lb.r1) ((mb.e) lb.b(applicationContext).f18914v).b();
                        }
                        r1Var.getClass();
                        i.e = r1Var;
                        Object obj3 = new Object();
                        synchronized (r1Var) {
                            lb.s sVar = r1Var.f20251b;
                            synchronized (sVar) {
                                if (sVar.e != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            synchronized (sVar) {
                                sVar.f20258a.e("registerListener", new Object[0]);
                                sVar.f20261d.add(obj3);
                                sVar.a();
                            }
                            if (!z3) {
                                ((Executor) r1Var.f20257j.b()).execute(new lb.e1(r1Var, 0));
                            }
                        }
                    }
                    p9 p9Var = p9.f28915a;
                    Context context2 = this.f26806w;
                    context2.getClass();
                    List p10 = p9Var.p(context2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : p10) {
                        if (kotlin.jvm.internal.a(((t9) obj4).f29155a.e, "ondemand")) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(qe.m.d(arrayList, 10));
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj5 = arrayList.get(i12);
                        i12++;
                        arrayList2.add(((t9) obj5).f29155a.f29080a);
                    }
                    lb.r1 r1Var2 = i.e;
                    if (r1Var2 != null && !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj6 = arrayList2.get(i11);
                            i11++;
                            String str = (String) obj6;
                            str.getClass();
                            lb.r1 r1Var3 = i.e;
                            if (r1Var3 != null) {
                                lb.y c10 = r1Var3.c(str);
                                sf.n0 n0Var2 = i.f17566a;
                                do {
                                    value = n0Var2.getValue();
                                    Map map = (Map) value;
                                    map.getClass();
                                    linkedHashMap = new LinkedHashMap(map);
                                    if (c10 != null) {
                                        linkedHashMap.put(str, e.f17563a);
                                    } else if (!map.containsKey(str)) {
                                        linkedHashMap.put(str, f.f17564a);
                                    }
                                } while (!n0Var2.i(value, linkedHashMap));
                            }
                        }
                        try {
                            ib.o c11 = ((lb.t1) r1Var2.i.b()).c(arrayList2, new ic.c(11, r1Var2), r1Var2.f20250a.p());
                            sf.n0 n0Var3 = i.f17566a;
                            h hVar = new h(8, new b7(21));
                            c11.getClass();
                            eb.z1 z1Var = ib.i.f18364a;
                            c11.f(z1Var, hVar);
                            c11.e(z1Var, new g5.q(1));
                        } catch (Throwable unused) {
                        }
                    }
                    fg.s sVar2 = f.f15790a;
                    Context context3 = this.f26806w;
                    this.f26805v = 1;
                    wf.e eVar2 = pf.l0.f22767a;
                    Object J = pf.b0.J(wf.d.f29913w, new n9(4, context3, cVar), this);
                    if (J != ue.a.f27192u) {
                        J = pe.z.f22715a;
                    }
                    if (J == obj2) {
                        return obj2;
                    }
                }
                this.f26807x.setValue(p9.f28915a.p(this.f26806w));
                return pe.z.f22715a;
        }
    }
}
