package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class va extends IOException {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f11864u;

    /* renamed from: v, reason: collision with root package name */
    public final int f11865v;

    public va(String str, Throwable th, boolean z3, int i) {
        super(str, th);
        this.f11864u = z3;
        this.f11865v = i;
    }

    public static va a(RuntimeException runtimeException, String str) {
        return new va(str, runtimeException, true, 1);
    }

    public static va b(String str) {
        return new va(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = "";
        }
        int length = str.length();
        boolean z3 = this.f11864u;
        int length2 = String.valueOf(z3).length() + length + 20;
        int i = this.f11865v;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(z3);
        sb2.append(", dataType=");
        return p.a.j(i, "}", sb2);
    }
}
