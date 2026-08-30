package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class q6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale f14844a = Locale.ROOT;

    public static String a(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String obj2 = obj.toString();
                if (obj2 != null) {
                    return obj2;
                }
                return b(obj, "toString() returned null");
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e8) {
                simpleName = e8.getClass().getSimpleName();
            }
            return b(obj, simpleName);
        }
    }

    public static String b(Object obj, String str) {
        return a.k(a.m("{", obj.getClass().getName(), "@", System.identityHashCode(obj), ": "), str, "}");
    }

    public static void c(StringBuilder sb2, long j10, boolean z3) {
        String str;
        if (j10 == 0) {
            sb2.append("0");
            return;
        }
        if (true != z3) {
            str = "0123456789abcdef";
        } else {
            str = "0123456789ABCDEF";
        }
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j10)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb2.append(str.charAt((int) ((j10 >>> numberOfLeadingZeros) & 15)));
        }
    }
}
