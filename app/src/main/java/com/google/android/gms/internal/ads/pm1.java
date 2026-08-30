package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pm1 extends rm1 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9554d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f9555f;

    /* renamed from: g, reason: collision with root package name */
    public int f9556g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9557h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f9558j = Integer.MAX_VALUE;

    public /* synthetic */ pm1(byte[] bArr, int i, int i10) {
        this.f9554d = bArr;
        int i11 = i10 + i;
        this.e = i11;
        this.f9555f = i11;
        this.f9556g = i;
        this.f9557h = i;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long B() {
        return e0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int C() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long D() {
        return b0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int E() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean G() {
        if (e0() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String I() {
        int d02 = d0();
        if (d02 > 0) {
            int i = this.f9555f;
            int i10 = this.f9556g;
            if (d02 <= i - i10) {
                String str = new String(this.f9554d, i10, d02, StandardCharsets.UTF_8);
                this.f9556g += d02;
                return str;
            }
        }
        if (d02 == 0) {
            return "";
        }
        if (d02 < 0) {
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String K() {
        int d02 = d0();
        if (d02 > 0) {
            int i = this.f9555f;
            int i10 = this.f9556g;
            if (d02 <= i - i10) {
                String c10 = cp1.c(this.f9554d, i10, d02);
                this.f9556g += d02;
                return c10;
            }
        }
        if (d02 == 0) {
            return "";
        }
        if (d02 <= 0) {
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final mm1 M() {
        int d02 = d0();
        byte[] bArr = this.f9554d;
        if (d02 > 0) {
            int i = this.f9555f;
            int i10 = this.f9556g;
            if (d02 <= i - i10) {
                mm1 A = om1.A(bArr, i10, d02);
                this.f9556g += d02;
                return A;
            }
        }
        if (d02 == 0) {
            return om1.f9167v;
        }
        if (d02 > 0) {
            int i11 = this.f9555f;
            int i12 = this.f9556g;
            if (d02 <= i11 - i12) {
                int i13 = d02 + i12;
                this.f9556g = i13;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i12, i13);
                mm1 mm1Var = om1.f9167v;
                if (copyOfRange.length == 0) {
                    return om1.f9167v;
                }
                return new mm1(copyOfRange);
            }
        }
        if (d02 <= 0) {
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int N() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int P() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int R() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long S() {
        return b0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int T() {
        return rm1.n(d0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long U() {
        return rm1.o(e0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int b(int i) {
        if (i >= 0) {
            int i10 = this.f9556g;
            int i11 = this.f9557h;
            int i12 = (i10 - i11) + i;
            if (i12 >= 0) {
                int i13 = this.f9558j;
                if (i12 <= i13) {
                    this.f9558j = i12;
                    int i14 = this.e;
                    if (i12 <= i14 - i11) {
                        this.f9555f = i12 + i11;
                        return i13;
                    }
                    this.f9555f = i14;
                    return i13;
                }
                androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            androidx.datastore.preferences.protobuf.s1.t("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public final long b0() {
        int i = this.f9556g;
        if (this.f9555f - i >= 8) {
            this.f9556g = i + 8;
            byte[] bArr = this.f9554d;
            long j10 = bArr[i];
            long j11 = bArr[i + 2];
            long j12 = bArr[i + 3];
            return ((bArr[i + 6] & 255) << 48) | (j10 & 255) | ((bArr[i + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
        }
        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void c(int i) {
        this.f9558j = i;
        int i10 = this.e;
        int i11 = this.f9557h;
        if (i <= i10 - i11) {
            this.f9555f = i + i11;
        } else {
            this.f9555f = i10;
        }
    }

    public final void c0(int i) {
        if (i >= 0) {
            int i10 = this.f9555f;
            int i11 = this.f9556g;
            if (i <= i10 - i11) {
                this.f9556g = i11 + i;
                return;
            }
        }
        if (i < 0) {
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final int d0() {
        int i;
        int i10 = this.f9556g;
        int i11 = this.f9555f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f9554d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f9556g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i19;
                            }
                            i = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f9556g = i13;
                return i;
            }
        }
        return (int) f0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean e() {
        if (this.f9556g == this.f9555f) {
            return true;
        }
        return false;
    }

    public final long e0() {
        long j10;
        long j11;
        long j12;
        int i = this.f9556g;
        int i10 = this.f9555f;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f9554d;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                this.f9556g = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j10 = i13 ^ (-128);
                } else {
                    int i14 = i + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j10 = i15 ^ 16256;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j13 = (-2080896) ^ i17;
                            i12 = i16;
                            j10 = j13;
                        } else {
                            i14 = i + 5;
                            long j14 = i17 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i18 = i + 6;
                                long j15 = j14 ^ (bArr[i14] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i14 = i + 7;
                                    j14 = j15 ^ (bArr[i18] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i18 = i + 8;
                                        j15 = j14 ^ (bArr[i14] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i14 = i + 9;
                                            j14 = j15 ^ (bArr[i18] << 56);
                                            if (j14 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                int i19 = i + 10;
                                                long j16 = j14 ^ (bArr[i14] << 63);
                                                if (j16 >= 0) {
                                                    j10 = j16 ^ (-9151873028817141888L);
                                                    i12 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j15 ^ j12;
                                i12 = i18;
                            }
                            j10 = j14 ^ j11;
                        }
                    }
                    i12 = i14;
                }
                this.f9556g = i12;
                return j10;
            }
        }
        return f0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int f() {
        return this.f9556g - this.f9557h;
    }

    public final long f0() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i10 = this.f9556g;
            if (i10 != this.f9555f) {
                this.f9556g = i10 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.f9554d[i10] & 128) == 0) {
                    return j10;
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int g0() {
        int i = this.f9556g;
        if (this.f9555f - i >= 4) {
            this.f9556g = i + 4;
            byte[] bArr = this.f9554d;
            int i10 = bArr[i] & 255;
            int i11 = bArr[i + 1] & 255;
            int i12 = bArr[i + 2] & 255;
            return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
        }
        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int p() {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int d02 = d0();
        this.i = d02;
        if ((d02 >>> 3) != 0) {
            return d02;
        }
        androidx.datastore.preferences.protobuf.s1.t("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void r(int i) {
        if (this.i == i) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.t("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean t(int i) {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                c0(4);
                                return true;
                            }
                            androidx.datastore.preferences.protobuf.s1.o();
                            return false;
                        }
                        if (this.f10246b == 0) {
                            r(0);
                        }
                        return false;
                    }
                    m();
                    r(((i >>> 3) << 3) | 4);
                    return true;
                }
                c0(d0());
                return true;
            }
            c0(8);
            return true;
        }
        int i12 = this.f9555f - this.f9556g;
        byte[] bArr = this.f9554d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f9556g;
                this.f9556g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i11 < 10) {
            int i14 = this.f9556g;
            if (i14 != this.f9555f) {
                this.f9556g = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final double u() {
        return Double.longBitsToDouble(b0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final float w() {
        return Float.intBitsToFloat(g0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long z() {
        return e0();
    }
}
