package com.google.android.gms.internal.ads;
import p.a;

/* loaded from: classes.dex */
public final class a31 extends z21 {

    /* renamed from: u, reason: collision with root package name */
    public final char f4332u;

    public a31(char c10) {
        this.f4332u = c10;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final boolean a(char c10) {
        return c10 == this.f4332u;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f4332u;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return p.a.o(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
