package com.google.android.gms.internal.consent_sdk;
import g3.a;
import g5.q;
import q.x;
import z.c;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f13403a;

    public static m a(Context context, String str) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("/", -1);
            int length = split.length;
            if (length == 1) {
                String valueOf = String.valueOf(context.getPackageName());
                str3 = split[0];
                str2 = valueOf.concat("_preferences");
            } else if (length == 2) {
                str2 = split[0];
                str3 = split[1];
            } else {
                return null;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return new m(str2, str3);
            }
            return null;
        }
        return null;
    }

    public static void b(int i, int i10) {
        String c10;
        if (i >= 0 && i < i10) {
            return;
        }
        if (i >= 0) {
            if (i10 < 0) {
                x.n(a.g(i10, "negative size: "));
                return;
            }
            c10 = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            c10 = c("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(c10);
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        q.h("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void d(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        x.l(f("index", i, i10));
    }

    public static void e(int i, int i10, int i11) {
        String f10;
        if (i >= 0 && i10 >= i && i10 <= i11) {
            return;
        }
        if (i >= 0 && i <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                f10 = c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                f10 = f("end index", i10, i11);
            }
        } else {
            f10 = f("start index", i, i11);
        }
        throw new IndexOutOfBoundsException(f10);
    }

    public static String f(String str, int i, int i10) {
        if (i < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        x.n(a.g(i10, "negative size: "));
        return null;
    }
}
