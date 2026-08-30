package com.google.android.gms.internal.measurement;
import j6.e;
import j6.n;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f13866w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f13867x;

    /* renamed from: y, reason: collision with root package name */
    public final j6.n f13868y;

    public o(String str, ArrayList arrayList, List list, j6.n nVar) {
        super(str);
        this.f13866w = new ArrayList();
        this.f13868y = nVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.f13866w.add(((n) obj).b());
            }
        }
        this.f13867x = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.n
    public final n c() {
        return new o(this);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(j6.n nVar, List list) {
        t tVar;
        j6.n u9 = this.f13868y.u();
        j6.e eVar = (j6.e) u9.f18939w;
        int i = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13866w;
            int size = arrayList.size();
            tVar = n.f13848h;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                u9.w((String) arrayList.get(i10), ((j6.e) nVar.f18939w).k(nVar, (n) list.get(i10)));
            } else {
                u9.w((String) arrayList.get(i10), tVar);
            }
            i10++;
        }
        ArrayList arrayList2 = this.f13867x;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            n nVar2 = (n) obj;
            n k3 = eVar.k(u9, nVar2);
            if (k3 instanceof q) {
                k3 = eVar.k(u9, nVar2);
            }
            if (k3 instanceof h) {
                return ((h) k3).f13764u;
            }
        }
        return tVar;
    }

    public o(o oVar) {
        super(oVar.f13784u);
        ArrayList arrayList = new ArrayList(oVar.f13866w.size());
        this.f13866w = arrayList;
        arrayList.addAll(oVar.f13866w);
        ArrayList arrayList2 = new ArrayList(oVar.f13867x.size());
        this.f13867x = arrayList2;
        arrayList2.addAll(oVar.f13867x);
        this.f13868y = oVar.f13868y;
    }
}
