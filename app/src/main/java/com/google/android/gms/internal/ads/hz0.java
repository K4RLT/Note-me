package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hz0 {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f6936a;

    /* renamed from: b, reason: collision with root package name */
    public final h21 f6937b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6938c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f6939d = false;
    public SecureRandom e;

    public hz0(h21 h21Var) {
        this.f6937b = h21Var;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.g21) VIRTUAL call: com.google.android.gms.internal.ads.g21.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:27:0x0039 */
    public final void a() {
        boolean z3;
        g21 c10;
        synchronized (this) {
            z3 = this.f6939d;
        }
        if (!z3) {
            SecureRandom secureRandom = new SecureRandom();
            synchronized (this) {
                try {
                    g21 a10 = this.f6937b.a(202);
                    try {
                        a10.a();
                        this.e = secureRandom;
                        this.f6936a = MessageDigest.getInstance("MD5");
                        this.f6939d = true;
                    } catch (NoSuchAlgorithmException e) {
                        a10.b(e);
                    } catch (Throwable th) {
                        a10.b(th);
                        throw th;
                    }
                    a10.c();
                } catch (Throwable th2) {
                    c10.c();
                    throw th2;
                }
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z3) {
        int i;
        boolean z9;
        byte[] bytes;
        int length = bArr.length;
        if (true != z3) {
            i = 255;
        } else {
            i = 239;
        }
        if (length <= i) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.l(z9);
        ByteBuffer put = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i10 = i - length;
            byte[] bArr2 = new byte[i10];
            this.e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i10);
            System.arraycopy(bArr2, 0, bArr, length, i10);
        }
        byte[] array = put.put(bArr).array();
        if (z3) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        iz0[] iz0VarArr = (iz0[]) new hf(1).K2;
        int length2 = iz0VarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            iz0VarArr[i11].a(array, bArr3);
        }
        if (!xy.y(str)) {
            if (str.length() > 32) {
                bytes = str.substring(0, 32).getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = str.getBytes(StandardCharsets.UTF_8);
            }
            bl0 bl0Var = new bl0(bytes);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                byte[] bArr4 = (byte[]) bl0Var.f4819v;
                i12 = (i12 + 1) & 255;
                byte b10 = bArr4[i12];
                i13 = (i13 + b10) & 255;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b10;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b10) & 255] ^ bArr3[i14]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] digest;
        synchronized (this.f6938c) {
            this.f6936a.reset();
            this.f6936a.update(bArr);
            digest = this.f6936a.digest();
        }
        return digest;
    }

    public final te d(String str, byte[] bArr) {
        te z3 = ue.z();
        byte[] c10 = c(bArr);
        mm1 mm1Var = om1.f9167v;
        mm1 z9 = om1.z(c10, 0, c10.length);
        z3.b();
        ((ue) z3.f4845v).B(z9);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i10 = i * 255;
            int i11 = i10 + 255;
            if (length > i11) {
                length = i11;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i10, length));
            i++;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            mm1 z10 = om1.z(b((byte[]) obj, str, false), 0, 256);
            z3.b();
            ((ue) z3.f4845v).A(z10);
        }
        return z3;
    }
}
