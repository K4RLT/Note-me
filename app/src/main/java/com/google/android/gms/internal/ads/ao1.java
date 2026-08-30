package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ao1 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4566a;

    static {
        char[] cArr = new char[80];
        f4566a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i, String str, Object obj) {
        String str2;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i, sb2);
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
            String str3 = (String) obj;
            boolean z3 = false;
            boolean z9 = false;
            boolean z10 = false;
            for (int i11 = 0; i11 < str3.length(); i11++) {
                char charAt2 = str3.charAt(i11);
                if (charAt2 >= ' ' && charAt2 <= '~') {
                    if (charAt2 != '\"') {
                        if (charAt2 != '\'') {
                            if (charAt2 == '\\') {
                                z3 = true;
                            }
                        } else {
                            z9 = true;
                        }
                    } else {
                        z10 = true;
                    }
                } else {
                    str2 = so1.b(str3.getBytes(StandardCharsets.UTF_8));
                    break;
                }
            }
            if (z3) {
                str3 = str3.replace("\\", "\\\\");
            }
            if (z9) {
                str2 = str3.replace("'", "\\'");
            } else {
                str2 = str3;
            }
            if (z10) {
                str2 = str2.replace("\"", "\\\"");
            }
            sb2.append(str2);
            sb2.append('\"');
            return;
        }
        if (obj instanceof om1) {
            sb2.append(": \"");
            sb2.append(so1.b(((om1) obj).a()));
            sb2.append('\"');
            return;
        }
        if (obj instanceof dn1) {
            sb2.append(" {");
            b((dn1) obj, sb2, i + 2);
            sb2.append("\n");
            c(i, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i12 = i + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i12, "key", entry.getKey());
            a(sb2, i12, "value", entry.getValue());
            sb2.append("\n");
            c(i, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
    
        if (r13 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.google.android.gms.internal.ads.dn1 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ao1.b(com.google.android.gms.internal.ads.dn1, java.lang.StringBuilder, int):void");
    }

    public static void c(int i, StringBuilder sb2) {
        while (i > 0) {
            int i10 = 80;
            if (i <= 80) {
                i10 = i;
            }
            sb2.append(f4566a, 0, i10);
            i -= i10;
        }
    }
}
