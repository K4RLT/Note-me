package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15565a = 0;

    static {
        try {
            if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                return;
            }
        } catch (SecurityException unused) {
        }
        if (x2.e && x2.f15548d) {
            int i = d1.f15402a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.z2.a(java.lang.String, byte[], int, int):int");
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) >= 65536) {
                                    i10++;
                                } else {
                                    throw new Exception("Unpaired surrogate at index " + i10 + " of " + length2);
                                }
                            }
                        }
                        i10++;
                    }
                    i11 += i;
                } catch (y2 unused) {
                    return str.getBytes(w1.f15539a).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        androidx.datastore.preferences.protobuf.s1.h(i11 + 4294967296L);
        return 0;
    }

    public static boolean c(byte[] bArr, int i, int i10) {
        while (i < i10 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i10) {
            return true;
        }
        while (i < i10) {
            int i11 = i + 1;
            byte b10 = bArr[i];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i11 < i10 && b10 >= -62) {
                        i += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 < -16) {
                    if (i11 >= i10 - 1) {
                        return false;
                    }
                    int i12 = i + 2;
                    byte b11 = bArr[i11];
                    if (b11 > -65 || (b10 == -32 && b11 < -96)) {
                        return false;
                    }
                    if (b10 == -19 && b11 >= -96) {
                        return false;
                    }
                    i += 3;
                    if (bArr[i12] > -65) {
                        return false;
                    }
                } else {
                    if (i11 >= i10 - 2) {
                        return false;
                    }
                    int i13 = i + 2;
                    byte b12 = bArr[i11];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i14 = i + 3;
                            if (bArr[i13] <= -65) {
                                i += 4;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
            } else {
                i = i11;
            }
        }
        return true;
    }
}
