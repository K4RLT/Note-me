package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;

/* loaded from: classes.dex */
public final class k2 extends n5 {

    /* renamed from: d, reason: collision with root package name */
    public final char f14541d;

    public k2(char c10) {
        this.f14541d = c10;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f14541d;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return a.k("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
