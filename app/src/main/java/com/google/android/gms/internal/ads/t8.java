package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t8 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11266c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11267d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f11268a = new xk0();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f11269b = new StringBuilder();

    public static void a(xk0 xk0Var) {
        while (true) {
            for (boolean z3 = true; xk0Var.B() > 0 && z3; z3 = false) {
                int i = xk0Var.f12581b;
                byte[] bArr = xk0Var.f12580a;
                byte b10 = bArr[i];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i10 = xk0Var.f12582c;
                    if (i + 2 <= i10) {
                        int i11 = i + 1;
                        if (b10 == 47) {
                            int i12 = i + 2;
                            if (bArr[i11] == 42) {
                                while (true) {
                                    int i13 = i12 + 1;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    if (((char) bArr[i12]) == '*' && ((char) bArr[i13]) == '/') {
                                        i10 = i12 + 2;
                                        i12 = i10;
                                    } else {
                                        i12 = i13;
                                    }
                                }
                                xk0Var.G(i10 - xk0Var.f12581b);
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    xk0Var.G(1);
                }
            }
            return;
        }
    }

    public static String b(xk0 xk0Var, StringBuilder sb2) {
        a(xk0Var);
        if (xk0Var.B() == 0) {
            return null;
        }
        String c10 = c(xk0Var, sb2);
        if (!c10.isEmpty()) {
            return c10;
        }
        char K = (char) xk0Var.K();
        StringBuilder sb3 = new StringBuilder(String.valueOf(K).length());
        sb3.append(K);
        return sb3.toString();
    }

    public static String c(xk0 xk0Var, StringBuilder sb2) {
        sb2.setLength(0);
        int i = xk0Var.f12581b;
        int i10 = xk0Var.f12582c;
        loop0: while (true) {
            for (boolean z3 = false; i < i10 && !z3; z3 = true) {
                char c10 = (char) xk0Var.f12580a[i];
                if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                    sb2.append(c10);
                    i++;
                }
            }
        }
        xk0Var.G(i - xk0Var.f12581b);
        return sb2.toString();
    }
}
