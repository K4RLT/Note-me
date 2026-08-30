package wa;

import com.google.android.gms.internal.ads.fm1;

/* loaded from: classes.dex */
public abstract class h0 {
    public static int a(byte[] bArr, int i, fm1 fm1Var) {
        int f10 = f(bArr, i, fm1Var);
        int i10 = fm1Var.f6123a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - f10) {
                if (i10 == 0) {
                    fm1Var.f6125c = com.google.android.gms.internal.play_billing.g1.f15429v;
                    return f10;
                }
                fm1Var.f6125c = com.google.android.gms.internal.play_billing.g1.q(bArr, f10, i10);
                return f10 + i10;
            }
            androidx.datastore.preferences.protobuf.s1.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int b(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int c(com.google.android.gms.internal.play_billing.p2 p2Var, int i, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.v1 v1Var, fm1 fm1Var) {
        com.google.android.gms.internal.play_billing.r1 a10 = p2Var.a();
        com.google.android.gms.internal.play_billing.p2 p2Var2 = p2Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        fm1 fm1Var2 = fm1Var;
        int k3 = k(a10, p2Var2, bArr2, i10, i12, fm1Var2);
        p2Var2.b(a10);
        fm1Var2.f6125c = a10;
        v1Var.add(a10);
        while (k3 < i12) {
            fm1 fm1Var3 = fm1Var2;
            int i13 = i12;
            int f10 = f(bArr2, k3, fm1Var3);
            if (i != fm1Var3.f6123a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.p2 p2Var3 = p2Var2;
            com.google.android.gms.internal.play_billing.r1 a11 = p2Var3.a();
            k3 = k(a11, p2Var3, bArr3, f10, i13, fm1Var3);
            p2Var2 = p2Var3;
            bArr2 = bArr3;
            i12 = i13;
            fm1Var2 = fm1Var3;
            p2Var2.b(a11);
            fm1Var2.f6125c = a11;
            v1Var.add(a11);
        }
        return k3;
    }

    public static int d(byte[] bArr, int i, com.google.android.gms.internal.play_billing.v1 v1Var, fm1 fm1Var) {
        com.google.android.gms.internal.play_billing.s1 s1Var = (com.google.android.gms.internal.play_billing.s1) v1Var;
        int f10 = f(bArr, i, fm1Var);
        int i10 = fm1Var.f6123a + f10;
        while (f10 < i10) {
            f10 = f(bArr, f10, fm1Var);
            s1Var.b(fm1Var.f6123a);
        }
        if (f10 == i10) {
            return f10;
        }
        androidx.datastore.preferences.protobuf.s1.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int e(int i, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.s2 s2Var, fm1 fm1Var) {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                s2Var.c(i, Integer.valueOf(b(bArr, i10)));
                                return i10 + 4;
                            }
                            androidx.datastore.preferences.protobuf.s1.v("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i13 = (i & (-8)) | 4;
                        com.google.android.gms.internal.play_billing.s2 b10 = com.google.android.gms.internal.play_billing.s2.b();
                        int i14 = fm1Var.f6126d + 1;
                        fm1Var.f6126d = i14;
                        if (i14 < 100) {
                            int i15 = 0;
                            while (true) {
                                if (i10 >= i11) {
                                    break;
                                }
                                int f10 = f(bArr, i10, fm1Var);
                                int i16 = fm1Var.f6123a;
                                if (i16 == i13) {
                                    i15 = i16;
                                    i10 = f10;
                                    break;
                                }
                                i10 = e(i16, bArr, f10, i11, b10, fm1Var);
                                i15 = i16;
                            }
                            fm1Var.f6126d--;
                            if (i10 <= i11 && i15 == i13) {
                                s2Var.c(i, b10);
                                return i10;
                            }
                            androidx.datastore.preferences.protobuf.s1.v("Failed to parse the message.");
                            return 0;
                        }
                        androidx.datastore.preferences.protobuf.s1.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int f11 = f(bArr, i10, fm1Var);
                    int i17 = fm1Var.f6123a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - f11) {
                            if (i17 == 0) {
                                s2Var.c(i, com.google.android.gms.internal.play_billing.g1.f15429v);
                            } else {
                                s2Var.c(i, com.google.android.gms.internal.play_billing.g1.q(bArr, f11, i17));
                            }
                            return f11 + i17;
                        }
                        androidx.datastore.preferences.protobuf.s1.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    androidx.datastore.preferences.protobuf.s1.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                s2Var.c(i, Long.valueOf(l(bArr, i10)));
                return i10 + 8;
            }
            int i18 = i(bArr, i10, fm1Var);
            s2Var.c(i, Long.valueOf(fm1Var.f6124b));
            return i18;
        }
        androidx.datastore.preferences.protobuf.s1.v("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int f(byte[] bArr, int i, fm1 fm1Var) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 >= 0) {
            fm1Var.f6123a = b10;
            return i10;
        }
        return g(b10, bArr, i10, fm1Var);
    }

    public static int g(int i, byte[] bArr, int i10, fm1 fm1Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            fm1Var.f6123a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            fm1Var.f6123a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            fm1Var.f6123a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            fm1Var.f6123a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                fm1Var.f6123a = i19;
                return i20;
            }
        }
    }

    public static int h(int i, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.v1 v1Var, fm1 fm1Var) {
        com.google.android.gms.internal.play_billing.s1 s1Var = (com.google.android.gms.internal.play_billing.s1) v1Var;
        int f10 = f(bArr, i10, fm1Var);
        s1Var.b(fm1Var.f6123a);
        while (f10 < i11) {
            int f11 = f(bArr, f10, fm1Var);
            if (i != fm1Var.f6123a) {
                break;
            }
            f10 = f(bArr, f11, fm1Var);
            s1Var.b(fm1Var.f6123a);
        }
        return f10;
    }

    public static int i(byte[] bArr, int i, fm1 fm1Var) {
        long j10 = bArr[i];
        int i10 = i + 1;
        if (j10 >= 0) {
            fm1Var.f6124b = j10;
            return i10;
        }
        int i11 = i + 2;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        fm1Var.f6124b = j11;
        return i11;
    }

    public static int j(Object obj, com.google.android.gms.internal.play_billing.p2 p2Var, byte[] bArr, int i, int i10, int i11, fm1 fm1Var) {
        com.google.android.gms.internal.play_billing.j2 j2Var = (com.google.android.gms.internal.play_billing.j2) p2Var;
        int i12 = fm1Var.f6126d + 1;
        fm1Var.f6126d = i12;
        if (i12 < 100) {
            int t3 = j2Var.t(obj, bArr, i, i10, i11, fm1Var);
            fm1Var.f6126d--;
            fm1Var.f6125c = obj;
            return t3;
        }
        androidx.datastore.preferences.protobuf.s1.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int k(Object obj, com.google.android.gms.internal.play_billing.p2 p2Var, byte[] bArr, int i, int i10, fm1 fm1Var) {
        int i11 = i + 1;
        int i12 = bArr[i];
        if (i12 < 0) {
            i11 = g(i12, bArr, i11, fm1Var);
            i12 = fm1Var.f6123a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = fm1Var.f6126d + 1;
            fm1Var.f6126d = i14;
            if (i14 < 100) {
                int i15 = i13 + i12;
                p2Var.c(obj, bArr, i13, i15, fm1Var);
                fm1Var.f6126d--;
                fm1Var.f6125c = obj;
                return i15;
            }
            androidx.datastore.preferences.protobuf.s1.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static long l(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
