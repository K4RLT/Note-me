package w7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f28436a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28437b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28438c;

    /* renamed from: d, reason: collision with root package name */
    public final e5 f28439d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28440f;

    /* renamed from: g, reason: collision with root package name */
    public final float f28441g;

    /* renamed from: h, reason: collision with root package name */
    public final float f28442h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28443j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f28444k;

    /* renamed from: l, reason: collision with root package name */
    public float f28445l;

    /* renamed from: m, reason: collision with root package name */
    public float f28446m;

    /* renamed from: n, reason: collision with root package name */
    public float f28447n;

    /* renamed from: o, reason: collision with root package name */
    public float f28448o;

    public i5(List list, float f10, float f11) {
        boolean z3;
        boolean z9;
        list.getClass();
        this.f28436a = f10;
        this.f28437b = f11;
        List<f5> list2 = list;
        ArrayList arrayList = new ArrayList(qe.m.d(list2, 10));
        for (f5 f5Var : list2) {
            arrayList.add(new h5(f5Var.f28218a, f5Var.f28219b, f5Var.f28224h, f5Var.i, f5Var.f28225j, f5Var.f28223g));
        }
        this.f28438c = arrayList;
        e5 l12 = n4.l1(list);
        this.f28439d = l12;
        this.e = l12.a() / this.f28436a;
        this.f28440f = ((l12.f28156b + l12.f28158d) / 2.0f) / this.f28437b;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float f12 = 12.0f / ((h5) it.next()).e;
            while (it.hasNext()) {
                f12 = Math.min(f12, 12.0f / ((h5) it.next()).e);
            }
            this.f28441g = f12 < 1.0f ? 1.0f : f12;
            Iterator it2 = this.f28438c.iterator();
            if (it2.hasNext()) {
                float f13 = 0.05f / ((h5) it2.next()).e;
                while (it2.hasNext()) {
                    f13 = Math.max(f13, 0.05f / ((h5) it2.next()).e);
                }
                this.f28442h = f13 > 1.0f ? 1.0f : f13;
                ArrayList arrayList2 = this.f28438c;
                boolean z10 = true;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        if (((h5) obj).f28355b == g5.IMAGE) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                this.i = z3;
                ArrayList arrayList3 = this.f28438c;
                if (arrayList3 == null || !arrayList3.isEmpty()) {
                    int size2 = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        if (((h5) obj2).f28355b == g5.TEXT) {
                            z9 = true;
                            break;
                        }
                    }
                }
                z9 = false;
                this.f28443j = z9;
                ArrayList arrayList4 = this.f28438c;
                if (arrayList4 == null || !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList4.get(i11);
                        i11++;
                        if (((h5) obj3).f28355b == g5.SHAPE) {
                            break;
                        }
                    }
                }
                z10 = false;
                this.f28444k = z10;
                this.f28447n = 1.0f;
                return;
            }
            l4.a.c();
            throw null;
        }
        l4.a.c();
        throw null;
    }
}
