package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class cp1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5140a = 0;

    static {
        int i = em1.f5727a;
    }

    public static boolean a(byte[] bArr, int i, int i10) {
        while (i < i10 && bArr[i] >= 0) {
            i++;
        }
        if (i < i10) {
            while (i < i10) {
                int i11 = i + 1;
                byte b10 = bArr[i];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i11 < i10 && b10 >= -62) {
                            i += 2;
                            if (bArr[i11] > -65) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (b10 < -16) {
                        if (i11 < i10 - 1) {
                            int i12 = i + 2;
                            byte b11 = bArr[i11];
                            if (b11 <= -65) {
                                if (b10 != -32 || b11 >= -96) {
                                    if (b10 != -19 || b11 < -96) {
                                        i += 3;
                                        if (bArr[i12] > -65) {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (i11 < i10 - 2) {
                        int i13 = i + 2;
                        byte b12 = bArr[i11];
                        if (b12 <= -65) {
                            if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                                int i14 = i + 3;
                                if (bArr[i13] <= -65) {
                                    i += 4;
                                    if (bArr[i14] > -65) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    i = i11;
                }
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cp1.b(java.lang.String, byte[], int, int):int");
    }

    public static String c(byte[] bArr, int i, int i10) {
        if (i10 != 0) {
            int length = bArr.length;
            if ((((length - i) - i10) | i | i10) >= 0) {
                int i11 = i + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i < i11) {
                    byte b10 = bArr[i];
                    if (b10 < 0) {
                        break;
                    }
                    i++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                while (i < i11) {
                    int i13 = i + 1;
                    byte b11 = bArr[i];
                    if (b11 >= 0) {
                        cArr[i12] = (char) b11;
                        i12++;
                        i = i13;
                        while (i < i11) {
                            byte b12 = bArr[i];
                            if (b12 >= 0) {
                                i++;
                                cArr[i12] = (char) b12;
                                i12++;
                            }
                        }
                    } else if (b11 < -32) {
                        if (i13 < i11) {
                            int i14 = i12 + 1;
                            i += 2;
                            byte b13 = bArr[i13];
                            if (b11 >= -62 && !ap1.b(b13)) {
                                cArr[i12] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                                i12 = i14;
                            } else {
                                androidx.datastore.preferences.protobuf.s1.t("Protocol message had invalid UTF-8.");
                                return null;
                            }
                        } else {
                            androidx.datastore.preferences.protobuf.s1.t("Protocol message had invalid UTF-8.");
                            return null;
                        }
                    } else {
                        if (b11 < -16) {
                            if (i13 < i11 - 1) {
                                int i15 = i12 + 1;
                                int i16 = i + 2;
                                byte b14 = bArr[i13];
                                i += 3;
                                byte b15 = bArr[i16];
                                if (!ap1.b(b14)) {
                                    if (b11 == -32) {
                                        if (b14 >= -96) {
                                            b11 = -32;
                                        }
                                    }
                                    if (b11 == -19) {
                                        if (b14 < -96) {
                                            b11 = -19;
                                        }
                                    }
                                    if (!ap1.b(b15)) {
                                        cArr[i12] = (char) (((b14 & 63) << 6) | ((b11 & 15) << 12) | (b15 & 63));
                                        i12 = i15;
                                    }
                                }
                                androidx.datastore.preferences.protobuf.s1.t("Protocol message had invalid UTF-8.");
                                return null;
                            }
                            androidx.datastore.preferences.protobuf.s1.t("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        if (i13 < i11 - 2) {
                            byte b16 = bArr[i13];
                            int i17 = i + 3;
                            byte b17 = bArr[i + 2];
                            i += 4;
                            byte b18 = bArr[i17];
                            if (!ap1.b(b16)) {
                                if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !ap1.b(b17) && !ap1.b(b18)) {
                                    int i18 = ((b16 & 63) << 12) | ((b11 & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                                    cArr[i12] = (char) ((i18 >>> 10) + 55232);
                                    cArr[i12 + 1] = (char) ((i18 & 1023) + 56320);
                                    i12 += 2;
                                }
                            }
                            androidx.datastore.preferences.protobuf.s1.t("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.t("Protocol message had invalid UTF-8.");
                        return null;
                    }
                }
                return new String(cArr, 0, i12);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)));
        }
        return "";
    }
}
