package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class gm1 {
    public static int a(byte[] bArr, int i, fm1 fm1Var) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 >= 0) {
            fm1Var.f6123a = b10;
            return i10;
        }
        return b(b10, bArr, i10, fm1Var);
    }

    public static int b(int i, byte[] bArr, int i10, fm1 fm1Var) {
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

    public static int c(byte[] bArr, int i, fm1 fm1Var) {
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

    public static LinkedHashMap d(int i) {
        int i10;
        if (i < 3) {
            i10 = i + 1;
        } else if (i < 1073741824) {
            i10 = (int) ((i / 0.75f) + 1.0f);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i10);
    }

    public static int e(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long f(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int g(byte[] bArr, int i, fm1 fm1Var) {
        int a10 = a(bArr, i, fm1Var);
        int i10 = fm1Var.f6123a;
        if (i10 >= 0) {
            if (i10 == 0) {
                fm1Var.f6125c = "";
                return a10;
            }
            fm1Var.f6125c = cp1.c(bArr, a10, i10);
            return a10 + i10;
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int h(byte[] bArr, int i, fm1 fm1Var) {
        int a10 = a(bArr, i, fm1Var);
        int i10 = fm1Var.f6123a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - a10) {
                if (i10 == 0) {
                    fm1Var.f6125c = om1.f9167v;
                    return a10;
                }
                fm1Var.f6125c = om1.z(bArr, a10, i10);
                return a10 + i10;
            }
            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int i(Object obj, oo1 oo1Var, byte[] bArr, int i, int i10, fm1 fm1Var) {
        int i11 = i + 1;
        int i12 = bArr[i];
        if (i12 < 0) {
            i11 = b(i12, bArr, i11, fm1Var);
            i12 = fm1Var.f6123a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = fm1Var.f6126d + 1;
            fm1Var.f6126d = i14;
            p(i14);
            int i15 = i13 + i12;
            oo1Var.h(obj, bArr, i13, i15, fm1Var);
            fm1Var.f6126d--;
            fm1Var.f6125c = obj;
            return i15;
        }
        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int j(Object obj, oo1 oo1Var, byte[] bArr, int i, int i10, int i11, fm1 fm1Var) {
        int i12 = fm1Var.f6126d + 1;
        fm1Var.f6126d = i12;
        p(i12);
        int x9 = ((bo1) oo1Var).x(obj, bArr, i, i10, i11, fm1Var);
        fm1Var.f6126d--;
        fm1Var.f6125c = obj;
        return x9;
    }

    public static int k(int i, byte[] bArr, int i10, int i11, kn1 kn1Var, fm1 fm1Var) {
        en1 en1Var = (en1) kn1Var;
        int a10 = a(bArr, i10, fm1Var);
        en1Var.g(fm1Var.f6123a);
        while (a10 < i11) {
            int a11 = a(bArr, a10, fm1Var);
            if (i != fm1Var.f6123a) {
                break;
            }
            a10 = a(bArr, a11, fm1Var);
            en1Var.g(fm1Var.f6123a);
        }
        return a10;
    }

    public static int l(byte[] bArr, int i, kn1 kn1Var, fm1 fm1Var) {
        en1 en1Var = (en1) kn1Var;
        int a10 = a(bArr, i, fm1Var);
        int i10 = fm1Var.f6123a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - a10) {
                int i11 = i10 + a10;
                while (a10 < i11) {
                    a10 = a(bArr, a10, fm1Var);
                    en1Var.g(fm1Var.f6123a);
                }
                if (a10 == i11) {
                    return a10;
                }
                androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int m(oo1 oo1Var, int i, byte[] bArr, int i10, int i11, kn1 kn1Var, fm1 fm1Var) {
        dn1 zza = oo1Var.zza();
        oo1 oo1Var2 = oo1Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        fm1 fm1Var2 = fm1Var;
        int i13 = i(zza, oo1Var2, bArr2, i10, i12, fm1Var2);
        oo1Var2.d(zza);
        fm1Var2.f6125c = zza;
        kn1Var.add(zza);
        while (i13 < i12) {
            fm1 fm1Var3 = fm1Var2;
            int i14 = i12;
            int a10 = a(bArr2, i13, fm1Var3);
            if (i != fm1Var3.f6123a) {
                break;
            }
            byte[] bArr3 = bArr2;
            oo1 oo1Var3 = oo1Var2;
            dn1 zza2 = oo1Var3.zza();
            i13 = i(zza2, oo1Var3, bArr3, a10, i14, fm1Var3);
            oo1Var2 = oo1Var3;
            bArr2 = bArr3;
            i12 = i14;
            fm1Var2 = fm1Var3;
            oo1Var2.d(zza2);
            fm1Var2.f6125c = zza2;
            kn1Var.add(zza2);
        }
        return i13;
    }

    public static int n(int i, byte[] bArr, int i10, int i11, vo1 vo1Var, fm1 fm1Var) {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                vo1Var.d(i, Integer.valueOf(e(bArr, i10)));
                                return i10 + 4;
                            }
                            androidx.datastore.preferences.protobuf.s1.t("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i13 = (i & (-8)) | 4;
                        vo1 a10 = vo1.a();
                        int i14 = fm1Var.f6126d + 1;
                        fm1Var.f6126d = i14;
                        p(i14);
                        int i15 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int a11 = a(bArr, i10, fm1Var);
                            int i16 = fm1Var.f6123a;
                            if (i16 == i13) {
                                i15 = i16;
                                i10 = a11;
                                break;
                            }
                            i10 = n(i16, bArr, a11, i11, a10, fm1Var);
                            i15 = i16;
                        }
                        fm1Var.f6126d--;
                        if (i10 <= i11 && i15 == i13) {
                            vo1Var.d(i, a10);
                            return i10;
                        }
                        androidx.datastore.preferences.protobuf.s1.t("Failed to parse the message.");
                        return 0;
                    }
                    int a12 = a(bArr, i10, fm1Var);
                    int i17 = fm1Var.f6123a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - a12) {
                            if (i17 == 0) {
                                vo1Var.d(i, om1.f9167v);
                            } else {
                                vo1Var.d(i, om1.z(bArr, a12, i17));
                            }
                            return a12 + i17;
                        }
                        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                vo1Var.d(i, Long.valueOf(f(bArr, i10)));
                return i10 + 8;
            }
            int c10 = c(bArr, i10, fm1Var);
            vo1Var.d(i, Long.valueOf(fm1Var.f6124b));
            return c10;
        }
        androidx.datastore.preferences.protobuf.s1.t("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int o(int i, byte[] bArr, int i10, int i11, fm1 fm1Var) {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                return i10 + 4;
                            }
                            androidx.datastore.preferences.protobuf.s1.t("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i13 = (i & (-8)) | 4;
                        int i14 = fm1Var.f6126d + 1;
                        fm1Var.f6126d = i14;
                        p(i14);
                        int i15 = 0;
                        while (i10 < i11) {
                            i10 = a(bArr, i10, fm1Var);
                            i15 = fm1Var.f6123a;
                            if (i15 == i13) {
                                break;
                            }
                            i10 = o(i15, bArr, i10, i11, fm1Var);
                        }
                        fm1Var.f6126d--;
                        if (i10 <= i11 && i15 == i13) {
                            return i10;
                        }
                        androidx.datastore.preferences.protobuf.s1.t("Failed to parse the message.");
                        return 0;
                    }
                    return a(bArr, i10, fm1Var) + fm1Var.f6123a;
                }
                return i10 + 8;
            }
            return c(bArr, i10, fm1Var);
        }
        androidx.datastore.preferences.protobuf.s1.t("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static void p(int i) {
        if (i < 100) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.t("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
