package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public abstract class fp {
    static {
        if (dp.e && dp.f14200d) {
            int i = nm.f14715a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i, int i10) {
        int i11 = i10 - i;
        byte b10 = bArr[i - 1];
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    byte b11 = bArr[i];
                    byte b12 = bArr[i + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return (b12 << 16) ^ ((b11 << 8) ^ b10);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b13 = bArr[i];
            if (b10 <= -12 && b13 <= -65) {
                return (b13 << 8) ^ b10;
            }
            return -1;
        }
        if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.fp.b(java.lang.String, byte[], int, int):int");
    }

    public static int c(String str) {
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
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new ep(i10, length2);
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
        androidx.datastore.preferences.protobuf.s1.h(i11 + 4294967296L);
        return 0;
    }

    public static String d(byte[] bArr, int i, int i10) {
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
                        if (b11 >= -62 && !f7.o(b13)) {
                            cArr[i12] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                            i12 = i14;
                        } else {
                            androidx.datastore.preferences.protobuf.s1.u("Protocol message had invalid UTF-8.");
                            return null;
                        }
                    } else {
                        androidx.datastore.preferences.protobuf.s1.u("Protocol message had invalid UTF-8.");
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
                            if (!f7.o(b14)) {
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
                                if (!f7.o(b15)) {
                                    cArr[i12] = (char) (((b14 & 63) << 6) | ((b11 & 15) << 12) | (b15 & 63));
                                    i12 = i15;
                                }
                            }
                            androidx.datastore.preferences.protobuf.s1.u("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.u("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    if (i13 < i11 - 2) {
                        byte b16 = bArr[i13];
                        int i17 = i + 3;
                        byte b17 = bArr[i + 2];
                        i += 4;
                        byte b18 = bArr[i17];
                        if (!f7.o(b16)) {
                            if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !f7.o(b17) && !f7.o(b18)) {
                                int i18 = ((b16 & 63) << 12) | ((b11 & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i12] = (char) ((i18 >>> 10) + 55232);
                                cArr[i12 + 1] = (char) ((i18 & 1023) + 56320);
                                i12 += 2;
                            }
                        }
                        androidx.datastore.preferences.protobuf.s1.u("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.u("Protocol message had invalid UTF-8.");
                    return null;
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = a(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = a(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.fp.e(byte[], int, int):boolean");
    }
}
