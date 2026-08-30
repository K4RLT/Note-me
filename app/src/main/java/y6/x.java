package y6;
import x.n;
import g.a;
import n.c;
import q.x;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: u, reason: collision with root package name */
    public static final x f30967u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final j6.e f30968v = j6.e.j("c", "v", "i", "o");

    @Override // y6.d0
    public final Object d(z6.a aVar, float f10) {
        if (aVar.H() == 1) {
            aVar.f();
        }
        aVar.j();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z3 = false;
        while (aVar.p()) {
            int L = aVar.L(f30968v);
            if (L != 0) {
                if (L != 1) {
                    if (L != 2) {
                        if (L != 3) {
                            aVar.M();
                            aVar.N();
                        } else {
                            arrayList3 = c(aVar, f10);
                        }
                    } else {
                        arrayList2 = c(aVar, f10);
                    }
                } else {
                    arrayList = c(aVar, f10);
                }
            } else {
                z3 = aVar.r();
            }
        }
        aVar.m();
        if (aVar.H() == 2) {
            aVar.k();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new w6.k(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i10 = i - 1;
                arrayList4.add(new u6.a(a7.a((PointF) arrayList.get(i10), (PointF) arrayList3.get(i10)), a7.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
            }
            if (z3) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i11 = size - 1;
                arrayList4.add(new u6.a(a7.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), a7.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new w6.k(pointF, z3, arrayList4);
        }
        q.x.n("Shape data was missing information.");
        return null;
    }
}
