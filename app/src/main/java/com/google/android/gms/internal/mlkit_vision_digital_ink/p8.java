package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.s61;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class p8 {
    static {
        new s61(1);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }
}
