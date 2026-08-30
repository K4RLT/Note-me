package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class oz0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f9287a = StandardCharsets.UTF_8;

    /* renamed from: b, reason: collision with root package name */
    public static Cipher f9288b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9289c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f9290d = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] t3 = ay0.t(str, false);
            int length2 = t3.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(t3);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f9289c) {
                    b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = b().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new Exception();
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f9290d) {
            try {
                if (f9288b == null) {
                    f9288b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f9288b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
