package ya;
import d0.a;
import pe.j;
import qe.s;
import ya.d0;
import z5.h;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class d0 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090 A[EDGE_INSN: B:48:0x0090->B:32:0x0090 BREAK  A[LOOP:0: B:10:0x0014->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(h r9, int r10, int r11) {
        /*
            r9.getClass()
            if (r10 != r11) goto L8
            s r9 = s.f24023u
            return r9
        L8:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r0
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L14:
            if (r2 == 0) goto L19
            if (r10 >= r11) goto L91
            goto L1b
        L19:
            if (r10 <= r11) goto L91
        L1b:
            java.lang.Object r4 = r9.f31922v
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            r5 = 0
            if (r2 == 0) goto L3a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L30
        L2e:
            r7 = r5
            goto L50
        L30:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            j r7 = new j
            r7.<init>(r4, r6)
            goto L50
        L3a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L47
            goto L2e
        L47:
            java.util.Set r6 = r4.keySet()
            j r7 = new j
            r7.<init>(r4, r6)
        L50:
            if (r7 != 0) goto L53
            goto L90
        L53:
            java.lang.Object r4 = r7.f22693u
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.f22694v
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L78
            int r8 = r10 + 1
            if (r8 > r7) goto L5f
            if (r7 > r11) goto L5f
            goto L7c
        L78:
            if (r11 > r7) goto L5f
            if (r7 >= r10) goto L5f
        L7c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r10.getClass()
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L8e
        L8d:
            r4 = r0
        L8e:
            if (r4 != 0) goto L14
        L90:
            return r5
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d0.a(h, int, int):java.util.List");
    }

    public static final boolean b(a aVar, int i, int i10) {
        aVar.getClass();
        if (i > i10 && aVar.f17407l) {
            return false;
        }
        Set set = aVar.f17408m;
        if (!aVar.f17406k || (set != null && set.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }
}
