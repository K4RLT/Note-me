package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k81 extends e81 {
    public List J;

    public k81(d51 d51Var, boolean z3) {
        super(d51Var, z3, true);
        List arrayList;
        if (d51Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = d51Var.size();
            ed1.u(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < d51Var.size(); i++) {
            arrayList.add(null);
        }
        this.J = arrayList;
        x();
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final void t(int i) {
        this.F = null;
        this.J = null;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final void y(int i, Object obj) {
        List list = this.J;
        if (list != null) {
            list.set(i, new l81(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final void z() {
        Object obj;
        List<l81> list = this.J;
        if (list != null) {
            int size = list.size();
            ed1.u(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (l81 l81Var : list) {
                if (l81Var != null) {
                    obj = l81Var.f7974a;
                } else {
                    obj = null;
                }
                arrayList.add(obj);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
