package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13911a;

    static {
        char[] cArr = new char[80];
        f13911a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb2) {
        while (i > 0) {
            int i10 = 80;
            if (i <= 80) {
                i10 = i;
            }
            sb2.append(f13911a, 0, i10);
            i -= i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0191, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.google.android.gms.internal.measurement.b5 r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s5.b(com.google.android.gms.internal.measurement.b5, java.lang.StringBuilder, int):void");
    }

    public static void c(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            s4 s4Var = s4.f13907w;
            sb2.append(w3.b(new s4(((String) obj).getBytes(d5.f13686a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof s4) {
            sb2.append(": \"");
            sb2.append(w3.b((s4) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof b5) {
            sb2.append(" {");
            b((b5) obj, sb2, i + 2);
            sb2.append("\n");
            a(i, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i11 = i + 2;
            c(sb2, i11, "key", entry.getKey());
            c(sb2, i11, "value", entry.getValue());
            sb2.append("\n");
            a(i, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }
}
