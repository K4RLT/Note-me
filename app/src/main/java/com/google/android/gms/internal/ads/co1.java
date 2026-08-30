package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class co1 extends pg1 {

    /* renamed from: v, reason: collision with root package name */
    public final int f5137v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co1(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto Lb
            r3 = 1
            if (r4 == r3) goto L9
            r3 = r0
            goto Lb
        L9:
            r3 = 2001(0x7d1, float:2.804E-42)
        Lb:
            r1.<init>(r3, r2)
            r1.f5137v = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co1.<init>(java.io.IOException, int, int):void");
    }

    public static co1 a(IOException iOException, int i) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else if (message != null && ed1.h(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new co1("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1);
        }
        return new co1(iOException, i10, i);
    }

    public co1() {
        this.f5137v = 1;
    }

    public co1(String str, int i, int i10) {
        super(str, i == 2000 ? i10 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f5137v = i10;
    }

    public co1(String str, IOException iOException, int i, int i10) {
        super(str, iOException, i == 2000 ? i10 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f5137v = i10;
    }
}
