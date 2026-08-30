package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public abstract class bf {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4773a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f4774b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4775c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4776d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static void a() {
        synchronized (f4776d) {
            try {
                if (!f4773a) {
                    f4773a = true;
                    new Thread(new af(0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static te b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length > 0) {
            int i = length + 254;
            vector = new Vector();
            for (int i10 = 0; i10 < i / 255; i10++) {
                int i11 = i10 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i11 > 255) {
                        length2 = i11 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i11, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (vector != null || vector.isEmpty()) {
                return null;
            }
            te z3 = ue.z();
            int size = vector.size();
            for (int i12 = 0; i12 < size; i12++) {
                mm1 z9 = om1.z(d((byte[]) vector.get(i12), str, false), 0, 256);
                z3.b();
                ((ue) z3.f4845v).A(z9);
            }
            byte[] c10 = c(bArr);
            mm1 mm1Var = om1.f9167v;
            mm1 z10 = om1.z(c10, 0, c10.length);
            z3.b();
            ((ue) z3.f4845v).B(z10);
            return z3;
        }
        vector = null;
        if (vector != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.bf.f4774b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(byte[] r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.bf.f4775c
            monitor-enter(r0)
            a()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.bf.e     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L14
            goto L1d
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.bf.f4774b     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L19
            goto L1d
        L19:
            r1 = r2
            goto L1d
        L1b:
            r6 = move-exception
            goto L35
        L1d:
            if (r1 == 0) goto L2d
            r1.reset()     // Catch: java.lang.Throwable -> L1b
            r1.update(r6)     // Catch: java.lang.Throwable -> L1b
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.bf.f4774b     // Catch: java.lang.Throwable -> L1b
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r6
        L2d:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r6     // Catch: java.lang.Throwable -> L1b
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf.c(byte[]):byte[]");
    }

    public static byte[] d(byte[] bArr, String str, boolean z3) {
        int i;
        byte[] array;
        int length = bArr.length;
        if (true != z3) {
            i = 255;
        } else {
            i = 239;
        }
        if (length > i) {
            wd B0 = je.B0();
            B0.g(4096L);
            bArr = ((je) B0.c()).b();
        }
        int i10 = i + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i10).put(b10).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i10).put(b10).put(bArr).array();
        }
        if (z3) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        cf[] cfVarArr = (cf[]) new hf(0).K2;
        int length3 = cfVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            cfVarArr[i11].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            lx0 lx0Var = new lx0(str.getBytes("UTF-8"));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                byte[] bArr4 = (byte[]) lx0Var.f8177v;
                i12 = (i12 + 1) & 255;
                byte b11 = bArr4[i12];
                i13 = (i13 + b11) & 255;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b11;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b11) & 255] ^ bArr3[i14]);
            }
        }
        return bArr3;
    }
}
