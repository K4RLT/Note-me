package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ab.b;

/* loaded from: classes.dex */
public abstract class a8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14016a;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        /*
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> Le
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r1 = r0.matches(r1)     // Catch: java.lang.SecurityException -> Le
            if (r1 != 0) goto L10
        Le:
            java.lang.String r0 = "\n"
        L10:
            com.google.android.gms.internal.mlkit_vision_digital_ink.a8.f14016a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.a8.<clinit>():void");
    }

    public static void a(StringBuilder sb2, String str, int i, int i10) {
        int i11 = i;
        while (i < i10) {
            int i12 = i + 1;
            if (str.charAt(i) == '%') {
                if (i12 == i10) {
                    break;
                }
                char charAt = str.charAt(i12);
                if (charAt == '%') {
                    sb2.append((CharSequence) str, i11, i12);
                } else if (charAt == 'n') {
                    sb2.append((CharSequence) str, i11, i);
                    sb2.append(f14016a);
                }
                i11 = i + 2;
                i = i11;
            }
            i = i12;
        }
        if (i11 < i10) {
            sb2.append((CharSequence) str, i11, i10);
        }
    }

    public static int b(int i, String str) {
        while (i < str.length()) {
            int i10 = i + 1;
            if (str.charAt(i) != '%') {
                i = i10;
            } else if (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            } else {
                throw new b(b.c("trailing unquoted '%' character", i, -1, str), 10);
            }
        }
        return -1;
    }
}
