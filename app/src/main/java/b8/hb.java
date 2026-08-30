package b8;
import r0.a1;
import v.d;
import v.e;
import v.h;
import v.j;
import v.k;
import v.l;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hb implements sf.h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2174u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2175v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f2176w;

    public /* synthetic */ hb(ArrayList arrayList, a1 a1Var, int i) {
        this.f2174u = i;
        this.f2175v = arrayList;
        this.f2176w = a1Var;
    }

    @Override // sf.h
    public final Object e(Object obj, te.c cVar) {
        switch (this.f2174u) {
            case 0:
                h hVar = (h) obj;
                boolean z3 = hVar instanceof k;
                ArrayList arrayList = this.f2175v;
                if (z3) {
                    arrayList.add(hVar);
                } else if (hVar instanceof l) {
                    arrayList.remove(((l) hVar).f27260a);
                } else if (hVar instanceof j) {
                    arrayList.remove(((j) hVar).f27258a);
                }
                this.f2176w.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return pe.z.f22715a;
            default:
                h hVar2 = (h) obj;
                boolean z9 = hVar2 instanceof d;
                ArrayList arrayList2 = this.f2175v;
                if (z9) {
                    arrayList2.add(hVar2);
                } else if (hVar2 instanceof e) {
                    arrayList2.remove(((e) hVar2).f27255a);
                }
                this.f2176w.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                return pe.z.f22715a;
        }
    }
}
