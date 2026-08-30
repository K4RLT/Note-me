package u7;
import b1.f0;
import b1.g0;
import b1.q;
import b1.y;
import b8.b7;
import d8.a;
import j6.n;
import j7.l;
import j7.p;
import m7.j;
import o7.b;
import q.x;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26746u;

    /* renamed from: v, reason: collision with root package name */
    public int f26747v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(m3 m3Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26746u = i;
        this.f26748w = m3Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26746u) {
            case 0:
                return new q2(this.f26748w, cVar, 0);
            case 1:
                return new q2(this.f26748w, cVar, 1);
            case 2:
                return new q2(this.f26748w, cVar, 2);
            default:
                return new q2(this.f26748w, cVar, 3);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26746u) {
            case 0:
                return ((q2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((q2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((q2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((q2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i;
        switch (this.f26746u) {
            case 0:
                n nVar = this.f26748w.f26530b;
                int i10 = this.f26747v;
                ue.a aVar = ue.a.f27192u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            pe.a.e(obj);
                            return pe.z.f22715a;
                        }
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pe.a.e(obj);
                } else {
                    pe.a.e(obj);
                    List h3 = qe.m.h(new b(a.i(), "Libreta 1", 10, 0.65f, 0.12f, 0.12f, null), new b(a.i(), "Libreta 2", 12, 0.1f, 0.3f, 0.65f, null), new b(a.i(), "Libreta 3", 8, 0.15f, 0.5f, 0.2f, null));
                    this.f26747v = 1;
                    if (nVar.n(h3, this) == aVar) {
                        return aVar;
                    }
                }
                this.f26747v = 2;
                if (nVar.g(this) == aVar) {
                    return aVar;
                }
                return pe.z.f22715a;
            case 1:
                int i11 = this.f26747v;
                pe.z zVar = pe.z.f22715a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                m3 m3Var = this.f26748w;
                l lVar = (l) m3Var.f26530b.f18939w;
                lVar.getClass();
                sf.m mVar = new sf.m(wa.a(lVar.f19018a, new String[]{"notebooks"}, new b7(26)), new ve.i(4, null), 1);
                t2 t2Var = new t2(m3Var, 0);
                this.f26747v = 1;
                Object b10 = mVar.b(new j(t2Var, 0), this);
                ue.a aVar2 = ue.a.f27192u;
                if (b10 != aVar2) {
                    b10 = zVar;
                }
                if (b10 == aVar2) {
                    return aVar2;
                }
                return zVar;
            case 2:
                int i12 = this.f26747v;
                pe.z zVar2 = pe.z.f22715a;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return zVar2;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                m3 m3Var2 = this.f26748w;
                q qVar = (q) m3Var2.f26530b.f18941y;
                qVar.getClass();
                sf.m mVar2 = new sf.m(wa.a(qVar.f19034a, new String[]{"stacks"}, new p(2)), new ve.i(4, null), 1);
                t2 t2Var2 = new t2(m3Var2, 1);
                this.f26747v = 1;
                Object b11 = mVar2.b(new j(t2Var2, 1), this);
                ue.a aVar3 = ue.a.f27192u;
                if (b11 != aVar3) {
                    b11 = zVar2;
                }
                if (b11 == aVar3) {
                    return aVar3;
                }
                return zVar2;
            default:
                int i13 = this.f26747v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f26747v = 1;
                    Object j10 = pf.b0.j(400L, this);
                    ue.a aVar4 = ue.a.f27192u;
                    if (j10 == aVar4) {
                        return aVar4;
                    }
                }
                m3 m3Var3 = this.f26748w;
                m3Var3.A = false;
                q qVar2 = m3Var3.f26534g.f1408v;
                ArrayList arrayList = new ArrayList();
                Object it = qVar2.iterator();
                while (((g0) it).hasNext()) {
                    Object next = ((f0) it).next();
                    if (!((Collection) ((Map.Entry) next).getValue()).isEmpty()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(qe.m.d(arrayList, 10));
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    arrayList2.add((pe.j) ((Map.Entry) obj2).getKey());
                }
                for (pe.j jVar : qe.l.P(arrayList2)) {
                    y yVar = m3Var3.f26538l;
                    Integer num = (Integer) yVar.get(jVar);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    yVar.put(jVar, new Integer(i + 1));
                }
                m3Var3.f26544r = SystemClock.uptimeMillis();
                a.x(m3Var3.f26543q, 1, m3Var3);
                return pe.z.f22715a;
        }
    }
}
