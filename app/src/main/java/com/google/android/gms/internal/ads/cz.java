package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cz implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5226u = new ArrayList();

    public final boolean a(h00 h00Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5226u;
        int size = arrayList2.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            bz bzVar = (bz) obj;
            if (bzVar.f4908w == h00Var) {
                arrayList.add(bzVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((bz) obj2).f4909x.l();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5226u.iterator();
    }
}
