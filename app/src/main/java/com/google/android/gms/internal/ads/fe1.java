package com.google.android.gms.internal.ads;
import ab.b;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class fe1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6052a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final gl1 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(charAt);
                throw new b(sb2.toString(), 6);
            }
        }
        return gl1.a(bArr);
    }

    public static final gl1 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(charAt);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return gl1.a(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
