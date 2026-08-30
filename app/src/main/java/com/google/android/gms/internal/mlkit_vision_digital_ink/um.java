package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.rm1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class um extends rm1 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15061d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f15062f;

    /* renamed from: h, reason: collision with root package name */
    public int f15064h;
    public int i = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f15063g = 0;

    public /* synthetic */ um(byte[] bArr, int i) {
        this.f15061d = bArr;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int A() {
        return c0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int C() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int E() {
        int i;
        int i10 = this.f15063g;
        int i11 = this.e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f15061d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f15063g = i12;
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
                this.f15063g = i13;
                return i;
            }
        }
        return (int) e0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int F() {
        return c0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int H() {
        return rm1.h(E());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int J() {
        if (d()) {
            this.f15064h = 0;
            return 0;
        }
        int E = E();
        this.f15064h = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int L() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long O() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long Q() {
        return S();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long S() {
        long j10;
        long j11;
        long j12;
        int i = this.f15063g;
        int i10 = this.e;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f15061d;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                this.f15063g = i11;
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
                                j12 = 266354560;
                            } else {
                                int i18 = i + 6;
                                long j15 = j14 ^ (bArr[i14] << 35);
                                if (j15 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i + 7;
                                    j14 = j15 ^ (bArr[i18] << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i18 = i + 8;
                                        j15 = j14 ^ (bArr[i14] << 49);
                                        if (j15 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i + 9;
                                            long j16 = (j15 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i + 10;
                                                if (bArr[i14] >= 0) {
                                                    j10 = j16;
                                                    i12 = i19;
                                                }
                                            } else {
                                                j10 = j16;
                                            }
                                        }
                                    }
                                }
                                j10 = j15 ^ j11;
                                i12 = i18;
                            }
                            j10 = j14 ^ j12;
                        }
                    }
                    i12 = i14;
                }
                this.f15063g = i12;
                return j10;
            }
        }
        return e0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long U() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long V() {
        return rm1.i(S());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long W() {
        return S();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final sm X() {
        int E = E();
        byte[] bArr = this.f15061d;
        if (E > 0) {
            int i = this.e;
            int i10 = this.f15063g;
            if (E <= i - i10) {
                sm k3 = tm.k(bArr, i10, E);
                this.f15063g += E;
                return k3;
            }
        }
        if (E != 0) {
            if (E > 0) {
                int i11 = this.e;
                int i12 = this.f15063g;
                if (E <= i11 - i12) {
                    int i13 = E + i12;
                    this.f15063g = i13;
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i12, i13);
                    sm smVar = tm.f15012v;
                    return new sm(copyOfRange);
                }
            }
            if (E <= 0) {
                androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        return tm.f15012v;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String Y() {
        int E = E();
        if (E > 0) {
            int i = this.e;
            int i10 = this.f15063g;
            if (E <= i - i10) {
                String str = new String(this.f15061d, i10, E, vn.f15137a);
                this.f15063g += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String Z() {
        int E = E();
        if (E > 0) {
            int i = this.e;
            int i10 = this.f15063g;
            if (E <= i - i10) {
                String d2 = fp.d(this.f15061d, i10, E);
                this.f15063g += E;
                return d2;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E <= 0) {
            androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void a(int i) {
        this.i = i;
        int i10 = this.e + this.f15062f;
        this.e = i10;
        if (i10 > i) {
            int i11 = i10 - i;
            this.f15062f = i11;
            this.e = i10 - i11;
            return;
        }
        this.f15062f = 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void a0(int i) {
        if (this.f15064h == i) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message end-group tag did not match expected tag.");
    }

    public final void b0(int i) {
        if (i >= 0) {
            int i10 = this.e;
            int i11 = this.f15063g;
            if (i <= i10 - i11) {
                this.f15063g = i11 + i;
                return;
            }
        }
        if (i < 0) {
            androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final int c0() {
        int i = this.f15063g;
        if (this.e - i >= 4) {
            this.f15063g = i + 4;
            byte[] bArr = this.f15061d;
            int i10 = bArr[i] & 255;
            int i11 = bArr[i + 1] & 255;
            int i12 = bArr[i + 2] & 255;
            return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
        }
        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean d() {
        return this.f15063g == this.e;
    }

    public final long d0() {
        int i = this.f15063g;
        if (this.e - i >= 8) {
            this.f15063g = i + 8;
            byte[] bArr = this.f15061d;
            long j10 = bArr[i];
            long j11 = bArr[i + 2];
            long j12 = bArr[i + 3];
            return ((bArr[i + 6] & 255) << 48) | (j10 & 255) | ((bArr[i + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
        }
        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean e() {
        if (S() != 0) {
            return true;
        }
        return false;
    }

    public final long e0() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i10 = this.f15063g;
            if (i10 != this.e) {
                this.f15063g = i10 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.f15061d[i10] & 128) == 0) {
                    return j10;
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean g(int i) {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                b0(4);
                                return true;
                            }
                            androidx.datastore.preferences.protobuf.s1.s();
                            return false;
                        }
                        if (this.f10246b == 0) {
                            a0(0);
                        }
                        return false;
                    }
                    l();
                    a0(((i >>> 3) << 3) | 4);
                    return true;
                }
                b0(E());
                return true;
            }
            b0(8);
            return true;
        }
        int i12 = this.e - this.f15063g;
        byte[] bArr = this.f15061d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f15063g;
                this.f15063g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i11 < 10) {
            int i14 = this.f15063g;
            if (i14 != this.e) {
                this.f15063g = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final double q() {
        return Double.longBitsToDouble(d0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final float s() {
        return Float.intBitsToFloat(c0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int v() {
        return this.f15063g;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int x(int i) {
        if (i >= 0) {
            int i10 = i + this.f15063g;
            if (i10 >= 0) {
                int i11 = this.i;
                if (i10 <= i11) {
                    this.i = i10;
                    int i12 = this.e + this.f15062f;
                    this.e = i12;
                    if (i12 > i10) {
                        int i13 = i12 - i10;
                        this.f15062f = i13;
                        this.e = i12 - i13;
                        return i11;
                    }
                    this.f15062f = 0;
                    return i11;
                }
                androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            androidx.datastore.preferences.protobuf.s1.u("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int y() {
        return E();
    }
}
