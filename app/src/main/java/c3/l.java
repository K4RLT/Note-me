package c3;
import a0.u;
import b.b;

import g0.a1;
import g0.j2;
import java.util.ArrayList;
import java.util.List;
import z1.o0;
import z1.p0;
import z1.q0;
import z1.r0;

/* loaded from: classes.dex */
public final class l implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3786a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3787b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3788c;

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.f3786a = i;
        this.f3787b = obj;
        this.f3788c = obj2;
    }

    @Override // z1.p0
    public final q0 g(r0 r0Var, List list, long j10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        pe.j jVar;
        switch (this.f3786a) {
            case 0:
                ((x) this.f3787b).setParentLayoutDirection((y2.m) this.f3788c);
                return r0Var.u0(0, 0, qe.t.f24024u, c.f3753x);
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                List list2 = list;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (!(((o0) obj).H() instanceof j2)) {
                        arrayList3.add(obj);
                    }
                }
                List list3 = (List) ((df.a) this.f3788c).invoke();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        j1.c cVar = (j1.c) list3.get(i10);
                        if (cVar != null) {
                            float f10 = cVar.f18764b;
                            float f11 = cVar.f18763a;
                            arrayList2 = arrayList4;
                            jVar = new pe.j(((o0) arrayList3.get(i10)).z(y2.b((int) Math.floor(cVar.f18765c - f11), (int) Math.floor(cVar.f18766d - f10), 5)), new y2.j((Math.round(f10) & 4294967295L) | (Math.round(f11) << 32)));
                        } else {
                            arrayList2 = arrayList4;
                            jVar = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (jVar != null) {
                            arrayList5.add(jVar);
                        }
                        i10++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size3 = list2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    Object obj2 = list.get(i11);
                    if (((o0) obj2).H() instanceof j2) {
                        arrayList6.add(obj2);
                    }
                }
                return r0Var.u0(y2.a.h(j10), y2.a.g(j10), qe.t.f24024u, new u(arrayList, 27, a1.o((df.a) this.f3787b, arrayList6)));
        }
    }
}
