package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11782c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f11783a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f11784b = -1;

    public final void a(m8 m8Var) {
        y51 a10 = m8Var.a(v4.class, u2.f11517w);
        int i = a10.f12783x;
        int i10 = 0;
        int i11 = 0;
        while (i11 < i) {
            boolean b10 = b(((v4) a10.get(i11)).f11796d);
            i11++;
            if (b10) {
                return;
            }
        }
        y51 a11 = m8Var.a(a5.class, u2.f11516v);
        int i12 = a11.f12783x;
        while (i10 < i12) {
            boolean b11 = b(((a5) a11.get(i10)).f4362d);
            i10++;
            if (b11) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f11782c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = bq0.f4860a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f11783a = parseInt;
                    this.f11784b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
