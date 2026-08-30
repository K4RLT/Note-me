package m2;
import a.a;
import l.a;
import n.j;
import n.v;

import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements CharSequence {

    /* renamed from: u, reason: collision with root package name */
    public final List f20476u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20477v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f20478w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f20479x;

    static {
        x90 x90Var = e0.f20455a;
    }

    public g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        this.f20476u = list;
        this.f20477v = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) list.get(i10);
                Object obj = eVar.f20451a;
                if (obj instanceof h0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(eVar);
                } else if (obj instanceof v) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f20478w = arrayList;
        this.f20479x = arrayList2;
        if (arrayList2 != null) {
            list2 = qe.l.K(arrayList2, new f(i));
        } else {
            list2 = null;
        }
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            int i11 = ((e) qe.l.w(list2)).f20453c;
            v vVar = j.f20897a;
            v vVar2 = new v(1);
            vVar2.a(i11);
            int size2 = list2.size();
            for (int i12 = 1; i12 < size2; i12++) {
                e eVar2 = (e) list2.get(i12);
                while (true) {
                    int i13 = vVar2.f20953b;
                    if (i13 == 0) {
                        break;
                    }
                    if (i13 != 0) {
                        int i14 = vVar2.f20952a[i13 - 1];
                        int i15 = eVar2.f20452b;
                        int i16 = eVar2.f20453c;
                        if (i15 >= i14) {
                            vVar2.d(i13 - 1);
                        } else if (i16 > i14) {
                            s2.a("Paragraph overlap not allowed, end " + i16 + " should be less than or equal to " + i14);
                        }
                    } else {
                        l4.a.h("IntList is empty.");
                        throw null;
                    }
                }
                vVar2.a(eVar2.f20453c);
            }
        }
    }

    public final List a(int i) {
        List list = this.f20476u;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                e eVar = (e) obj;
                if ((eVar.f20451a instanceof n) && h.b(0, i, eVar.f20452b, eVar.f20453c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return qe.s.f24023u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m2.g subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            s2.a(r1)
        L26:
            java.lang.String r1 = r10.f20477v
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            m2.g r4 = m2.h.f20483a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            s2.a(r2)
        L54:
            java.util.List r2 = r10.f20476u
            if (r2 != 0) goto L59
            goto L9c
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
        L69:
            if (r0 >= r4) goto L96
            java.lang.Object r5 = r2.get(r0)
            m2.e r5 = (m2.e) r5
            int r6 = r5.f20452b
            int r7 = r5.f20453c
            boolean r6 = m2.h.b(r11, r12, r6, r7)
            if (r6 == 0) goto L93
            m2.e r6 = new m2.e
            java.lang.Object r8 = r5.f20451a
            int r9 = r5.f20452b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f20454d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L93:
            int r0 = r0 + 1
            goto L69
        L96:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9d
        L9c:
            r3 = 0
        L9d:
            m2.g r11 = new m2.g
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g.subSequence(int, int):m2.g");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f20477v.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (kotlin.jvm.internal.a(this.f20477v, gVar.f20477v) && kotlin.jvm.internal.a(this.f20476u, gVar.f20476u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f20477v.hashCode() * 31;
        List list = this.f20476u;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20477v.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20477v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r1, java.lang.String r2, java.util.ArrayList r3) {
        /*
            r0 = this;
            r1 = r1 & 2
            if (r1 == 0) goto L6
            qe.s r3 = qe.s.f24023u
        L6:
            m2.g r1 = m2.h.f20483a
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            r3 = 0
        Lf:
            r0.<init>(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g.<init>(int, java.lang.String, java.util.ArrayList):void");
    }

    public /* synthetic */ g(String str) {
        this(str, qe.s.f24023u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.String r2, java.util.List r3) {
        /*
            r1 = this;
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            r3 = 0
        L9:
            java.util.List r3 = (java.util.List) r3
            r1.<init>(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g.<init>(java.lang.String, java.util.List):void");
    }
}
