package m2;

import java.util.ArrayList;
import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final g f20483a = new g("");

    public static final List a(g gVar, int i, int i10, j7.p pVar) {
        List list;
        boolean z3;
        if (i == i10 || (list = gVar.f20476u) == null) {
            return null;
        }
        if (i == 0 && i10 >= gVar.f20477v.length()) {
            if (pVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                if (((Boolean) pVar.invoke(((e) obj).f20451a)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            e eVar = (e) list.get(i12);
            boolean z9 = true;
            if (pVar != null) {
                z3 = ((Boolean) pVar.invoke(eVar.f20451a)).booleanValue();
            } else {
                z3 = true;
            }
            if (!z3 || !b(i, i10, eVar.f20452b, eVar.f20453c)) {
                z9 = false;
            }
            if (z9) {
                arrayList2.add(new e((b) eVar.f20451a, b9.e(eVar.f20452b, i, i10) - i, b9.e(eVar.f20453c, i, i10) - i, eVar.f20454d));
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i10, int i11, int i12) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i == i10) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i11 == i12) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z13 = z3 | z9;
        if (i == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z14 = z13 & z10;
        if (i < i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 < i10) {
            z12 = true;
        }
        return (z11 & z12) | z14;
    }
}
