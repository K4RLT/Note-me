package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14230a = Pattern.compile("(\\w+).*");

    public static String a(z4 z4Var) {
        if (z4Var.isEmpty()) {
            return null;
        }
        e4 listIterator = z4Var.listIterator(0);
        StringBuilder sb2 = new StringBuilder();
        f7.i(sb2, listIterator, "+");
        return "transform=".concat(sb2.toString());
    }
}
