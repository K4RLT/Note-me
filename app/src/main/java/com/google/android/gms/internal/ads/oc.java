package com.google.android.gms.internal.ads;
import a5.a;
import g3.a;
import nc.a;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oc {

    /* renamed from: b, reason: collision with root package name */
    public static final oc f9088b = new oc(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9089a;

    public oc(byte[] bArr) {
        this.f9089a = bArr;
    }

    public static oc e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new oc(bArr2);
    }

    public static int f(byte b10) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        return b10 & ((iArr[7] % 837626799) ^ a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
    }

    public final byte[] a() {
        byte[] bArr = this.f9089a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final byte b(int i) {
        byte[] bArr = this.f9089a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb2 = new StringBuilder(a.d(i, 11));
                sb2.append(a("Akelqh1fajntGgo="));
                sb2.append(i);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(a.d(length, a.d(i, 18)));
            String a10 = a("Akelqh1faDmxRUSK1T9GeQ==");
            String a11 = a("Zwk=");
            sb3.append(a10);
            sb3.append(i);
            sb3.append(a11);
            sb3.append(length);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return bArr[i];
    }

    public final String c() {
        Charset forName = Charset.forName(a("Hn2H4l0="));
        byte[] bArr = this.f9089a;
        return new String(bArr, 0, bArr.length, forName);
    }

    public final oc d(oc ocVar) {
        byte[] bArr = ocVar.f9089a;
        int length = bArr.length;
        byte[] bArr2 = this.f9089a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oc) {
            return Arrays.equals(this.f9089a, ((oc) obj).f9089a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f9089a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        String arrays = Arrays.toString(this.f9089a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + ((i16 % 981766422) ^ w10));
        sb2.append(a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(arrays);
        sb2.append(a("Ng=="));
        return sb2.toString();
    }
}
