package wa;
import x.n;
import b0.a;
import b8.l2;
import f6.h;
import g5.f;
import g5.o0;
import g5.v;
import i5.k;
import q.x;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d8 {
    public static final k a(v vVar, String[] strArr, df.l lVar) {
        pe.j jVar;
        f j10 = vVar.j();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        o0 o0Var = j10.f17438b;
        o0Var.getClass();
        re.h hVar = new re.h();
        int i = 0;
        for (String str : strArr2) {
            HashMap hashMap = o0Var.f17499c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) hashMap.get(lowerCase);
            if (set != null) {
                hVar.addAll(set);
            } else {
                hVar.add(str);
            }
        }
        String[] strArr3 = (String[]) qe.a(hVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i < length) {
                String str2 = strArr3[i];
                LinkedHashMap linkedHashMap = o0Var.f17501f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap.get(lowerCase2);
                if (num != null) {
                    iArr[i] = num.intValue();
                    i++;
                } else {
                    x.n("There is no table with name ".concat(str2));
                    jVar = null;
                    break;
                }
            } else {
                jVar = new pe.j(strArr3, iArr);
                break;
            }
        }
        String[] strArr4 = (String[]) jVar.f22693u;
        int[] iArr2 = (int[]) jVar.f22694v;
        strArr4.getClass();
        iArr2.getClass();
        return new k(sf.e0.d(new h(new l2(o0Var, iArr2, strArr4, (te.c) null, 9)), -1), vVar, lVar);
    }
}
