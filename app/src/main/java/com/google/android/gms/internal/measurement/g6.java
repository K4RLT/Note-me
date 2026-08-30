package com.google.android.gms.internal.measurement;
import e6.e;
import g3.a;
import g6.b;
import q.x;
import x.n;

/* loaded from: classes.dex */
public abstract class g6 {

    /* renamed from: a, reason: collision with root package name */
    public static final c5 f13760a;

    static {
        if (e6.e) {
            boolean z3 = e6.f13736d;
        }
        f13760a = new c5(9);
    }

    public static int a(String str) {
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
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new h6(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        q.x.n(g3.a.h(i11 + 4294967296L, "UTF-8 length does not fit in int: "));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g6.b(java.lang.String, byte[], int, int):int");
    }

    public static /* synthetic */ int c(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    byte b11 = bArr[i];
                    byte b12 = bArr[i + 1];
                    if (b10 > -12 || b11 > -65 || b12 > -65) {
                        return -1;
                    }
                    return (b12 << 16) ^ ((b11 << 8) ^ b10);
                }
                throw new AssertionError();
            }
            byte b13 = bArr[i];
            if (b10 > -12 || b13 > -65) {
                return -1;
            }
            return (b13 << 8) ^ b10;
        }
        if (b10 > -12) {
            return -1;
        }
        return b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(byte[] bArr, int i, int i10) {
        int i11;
        f13760a.getClass();
        while (i < i10 && bArr[i] >= 0) {
            i++;
        }
        if (i < i10) {
            while (i < i10) {
                int i12 = i + 1;
                i11 = bArr[i];
                if (i11 < 0) {
                    if (i11 < -32) {
                        if (i12 >= i10) {
                            break;
                        }
                        if (i11 >= -62) {
                            i += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        i11 = -1;
                        break;
                    }
                    if (i11 < -16) {
                        if (i12 >= i10 - 1) {
                            i11 = c(bArr, i12, i10);
                            break;
                        }
                        int i13 = i + 2;
                        char c10 = bArr[i12];
                        if (c10 <= -65 && ((i11 != -32 || c10 >= -96) && (i11 != -19 || c10 < -96))) {
                            i += 3;
                            if (bArr[i13] > -65) {
                            }
                        }
                        i11 = -1;
                        break;
                    }
                    if (i12 >= i10 - 2) {
                        i11 = c(bArr, i12, i10);
                        break;
                    }
                    int i14 = i + 2;
                    int i15 = bArr[i12];
                    if (i15 <= -65) {
                        if ((((i15 + 112) + (i11 << 28)) >> 30) == 0) {
                            int i16 = i + 3;
                            if (bArr[i14] <= -65) {
                                i += 4;
                                if (bArr[i16] > -65) {
                                }
                            }
                        }
                    }
                    i11 = -1;
                    break;
                }
                i = i12;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            return false;
        }
        return true;
    }
}
