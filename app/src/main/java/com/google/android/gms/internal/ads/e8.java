package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f5612a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5613b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5614c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5615d;

    static {
        String str = bq0.f4860a;
        Locale locale = Locale.US;
        f5613b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f5614c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f5615d = Pattern.compile("\\\\an(\\d+)");
    }
}
