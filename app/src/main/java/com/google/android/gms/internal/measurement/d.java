package com.google.android.gms.internal.measurement;
import g3.a;
import j6.n;
import q.x;
import x.l;
import x.o;
import y4.a;

import com.google.android.gms.internal.ads.qd1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class d implements i, n, Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final TreeMap f13681u;

    /* renamed from: v, reason: collision with root package name */
    public final TreeMap f13682v;

    public d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                u(i, (n) list.get(i));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final boolean C(String str) {
        if (!"length".equals(str) && !this.f13682v.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        TreeMap treeMap = this.f13681u;
        if (treeMap.size() == 1) {
            return p(0).a();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return s(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        d dVar = new d();
        for (Map.Entry entry : this.f13681u.entrySet()) {
            boolean z3 = entry.getValue() instanceof i;
            TreeMap treeMap = dVar.f13681u;
            if (z3) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).c());
            }
        }
        return dVar;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new qd1(this.f13681u.keySet().iterator(), this.f13682v.keySet().iterator(), 1);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (r() == dVar.r()) {
                    TreeMap treeMap = this.f13681u;
                    if (treeMap.isEmpty()) {
                        return dVar.f13681u.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!p(intValue).equals(dVar.p(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final void g(String str, n nVar) {
        TreeMap treeMap = this.f13682v;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    public final int hashCode() {
        return this.f13681u.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0399, code lost:
    
        if (com.google.android.gms.internal.measurement.y4.a(r26, r28, (com.google.android.gms.internal.measurement.o) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).r() != r()) goto L238;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x01e5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3 A[PHI: r24
      0x00e3: PHI (r24v7 char) = 
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v0 char)
      (r24v4 char)
      (r24v0 char)
     binds: [B:47:0x00e0, B:422:0x019c, B:419:0x0190, B:416:0x0184, B:413:0x017a, B:410:0x0170, B:407:0x0163, B:404:0x0159, B:401:0x014f, B:398:0x0145, B:395:0x013a, B:392:0x012f, B:389:0x0124, B:386:0x0119, B:383:0x010e, B:380:0x0103, B:377:0x00f8, B:375:0x01a1, B:373:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0287  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.n n(java.lang.String r27, j6.n r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.n(java.lang.String, j6.n, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final n o(String str) {
        n nVar;
        if ("length".equals(str)) {
            return new g(Double.valueOf(r()));
        }
        if (C(str) && (nVar = (n) this.f13682v.get(str)) != null) {
            return nVar;
        }
        return n.f13848h;
    }

    public final n p(int i) {
        n nVar;
        if (i < r()) {
            if (v(i) && (nVar = (n) this.f13681u.get(Integer.valueOf(i))) != null) {
                return nVar;
            }
            return n.f13848h;
        }
        q.x.l("Attempting to get element outside of current array");
        return null;
    }

    public final void q(n nVar) {
        u(r(), nVar);
    }

    public final int r() {
        TreeMap treeMap = this.f13681u;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String s(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f13681u.isEmpty()) {
            for (int i = 0; i < r(); i++) {
                n p10 = p(i);
                sb2.append(str);
                if (!(p10 instanceof t) && !(p10 instanceof l)) {
                    sb2.append(p10.b());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final void t(int i) {
        TreeMap treeMap = this.f13681u;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            treeMap.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i10 = i - 1;
                if (!treeMap.containsKey(Integer.valueOf(i10)) && i10 >= 0) {
                    treeMap.put(Integer.valueOf(i10), n.f13848h);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                    n nVar = (n) treeMap.get(Integer.valueOf(i));
                    if (nVar != null) {
                        treeMap.put(Integer.valueOf(i - 1), nVar);
                        treeMap.remove(Integer.valueOf(i));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return s(",");
    }

    public final void u(int i, n nVar) {
        if (i <= 32468) {
            if (i >= 0) {
                TreeMap treeMap = this.f13681u;
                if (nVar == null) {
                    treeMap.remove(Integer.valueOf(i));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i), nVar);
                    return;
                }
            }
            q.x.l(g3.a.g(i, "Out of bounds index: "));
            return;
        }
        q.x.o("Array too large");
    }

    public final boolean v(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f13681u;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        q.x.l(g3.a.g(i, "Out of bounds index: "));
        return false;
    }

    public final Iterator w() {
        return this.f13681u.keySet().iterator();
    }

    public final ArrayList x() {
        ArrayList arrayList = new ArrayList(r());
        for (int i = 0; i < r(); i++) {
            arrayList.add(p(i));
        }
        return arrayList;
    }

    public d() {
        this.f13681u = new TreeMap();
        this.f13682v = new TreeMap();
    }

    public d(n... nVarArr) {
        this(Arrays.asList(nVarArr));
    }
}
