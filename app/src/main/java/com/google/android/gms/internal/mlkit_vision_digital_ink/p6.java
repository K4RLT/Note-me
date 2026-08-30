package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f14788c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f14789a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14790b = false;

    public p6(StringBuilder sb2) {
        this.f14789a = sb2;
    }

    public static int b(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt != '\"' && charAt != '\\') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final void a(Object obj, String str) {
        boolean z3 = this.f14790b;
        char c10 = ' ';
        StringBuilder sb2 = this.f14789a;
        if (z3) {
            sb2.append(' ');
        } else {
            if (sb2.length() > 0) {
                if (sb2.length() > 1000 || sb2.indexOf("\n") != -1) {
                    c10 = '\n';
                }
                sb2.append(c10);
            }
            sb2.append("[CONTEXT ");
            this.f14790b = true;
        }
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f14788c.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int b10 = b(i, obj2);
            if (b10 != -1) {
                sb2.append((CharSequence) obj2, i, b10);
                i = b10 + 1;
                char charAt = obj2.charAt(b10);
                if (charAt != '\t') {
                    if (charAt != '\n') {
                        if (charAt != '\r') {
                            if (charAt != '\"' && charAt != '\\') {
                                sb2.append((char) 65533);
                            }
                        } else {
                            charAt = 'r';
                        }
                    } else {
                        charAt = 'n';
                    }
                } else {
                    charAt = 't';
                }
                sb2.append("\\");
                sb2.append(charAt);
            } else {
                sb2.append((CharSequence) obj2, i, obj2.length());
                sb2.append('\"');
                return;
            }
        }
    }
}
