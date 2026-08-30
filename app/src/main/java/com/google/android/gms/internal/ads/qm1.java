package com.google.android.gms.internal.ads;
import a5.a;
import q.x;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qm1 extends rm1 {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f9904d;

    /* renamed from: g, reason: collision with root package name */
    public int f9906g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public int f9909k = Integer.MAX_VALUE;
    public final byte[] e = new byte[4096];

    /* renamed from: f, reason: collision with root package name */
    public int f9905f = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f9907h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f9908j = 0;

    public /* synthetic */ qm1(InputStream inputStream) {
        this.f9904d = inputStream;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long B() {
        return W();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int C() {
        return h0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long D() {
        return k0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int E() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean G() {
        if (W() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String I() {
        int h02 = h0();
        byte[] bArr = this.e;
        if (h02 > 0) {
            int i = this.f9905f;
            int i10 = this.f9907h;
            if (h02 <= i - i10) {
                String str = new String(bArr, i10, h02, StandardCharsets.UTF_8);
                this.f9907h += h02;
                return str;
            }
        }
        if (h02 == 0) {
            return "";
        }
        if (h02 >= 0) {
            if (h02 <= this.f9905f) {
                c0(h02);
                String str2 = new String(bArr, this.f9907h, h02, StandardCharsets.UTF_8);
                this.f9907h += h02;
                return str2;
            }
            return new String(e0(h02), StandardCharsets.UTF_8);
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String K() {
        int h02 = h0();
        int i = this.f9907h;
        int i10 = this.f9905f;
        int i11 = i10 - i;
        byte[] bArr = this.e;
        if (h02 <= i11 && h02 > 0) {
            this.f9907h = i + h02;
        } else {
            if (h02 == 0) {
                return "";
            }
            if (h02 >= 0) {
                i = 0;
                if (h02 <= i10) {
                    c0(h02);
                    this.f9907h = h02;
                } else {
                    bArr = e0(h02);
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
        }
        return cp1.c(bArr, i, h02);
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final mm1 M() {
        int h02 = h0();
        int i = this.f9905f;
        int i10 = this.f9907h;
        int i11 = i - i10;
        byte[] bArr = this.e;
        if (h02 <= i11 && h02 > 0) {
            mm1 A = om1.A(bArr, i10, h02);
            this.f9907h += h02;
            return A;
        }
        if (h02 == 0) {
            return om1.f9167v;
        }
        if (h02 >= 0) {
            byte[] f02 = f0(h02);
            if (f02 != null) {
                return om1.A(f02, 0, f02.length);
            }
            int i12 = this.f9907h;
            int i13 = this.f9905f;
            int i14 = i13 - i12;
            this.f9908j += i13;
            this.f9907h = 0;
            this.f9905f = 0;
            ArrayList g02 = g0(h02 - i14);
            byte[] bArr2 = new byte[h02];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            int size = g02.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = g02.get(i15);
                i15++;
                byte[] bArr3 = (byte[]) obj;
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i14, length);
                i14 += length;
            }
            mm1 mm1Var = om1.f9167v;
            try {
                if (h02 == 0) {
                    return om1.f9167v;
                }
                return new mm1(bArr2);
            } catch (pn1 e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int N() {
        return h0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int P() {
        return h0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int R() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long S() {
        return k0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int T() {
        return rm1.n(h0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long U() {
        return rm1.o(W());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long W() {
        long j10;
        long j11;
        long j12;
        int i = this.f9907h;
        int i10 = this.f9905f;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.e;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                this.f9907h = i11;
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
                this.f9907h = i12;
                return j10;
            }
        }
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void a(int i) {
        InputStream inputStream = this.f9904d;
        int i10 = this.f9905f;
        int i11 = this.f9907h;
        int i12 = i10 - i11;
        if (i <= i12 && i >= 0) {
            this.f9907h = i11 + i;
            return;
        }
        if (i >= 0) {
            int i13 = this.f9908j;
            int i14 = i13 + i11;
            int i15 = this.f9909k;
            if (i14 + i <= i15) {
                this.f9908j = i14;
                this.f9905f = 0;
                this.f9907h = 0;
                while (i12 < i) {
                    long j10 = i - i12;
                    try {
                        try {
                            long skip = inputStream.skip(j10);
                            if (skip >= 0 && skip <= j10) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i12 += (int) skip;
                                }
                            } else {
                                String valueOf = String.valueOf(inputStream.getClass());
                                StringBuilder sb2 = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                                sb2.append(valueOf);
                                sb2.append("#skip returned invalid result: ");
                                sb2.append(skip);
                                sb2.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb2.toString());
                            }
                        } catch (pn1 e) {
                            e.f9565u = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.f9908j += i12;
                        b0();
                        throw th;
                    }
                }
                this.f9908j += i12;
                b0();
                if (i12 < i) {
                    int i16 = this.f9905f;
                    int i17 = i16 - this.f9907h;
                    this.f9907h = i16;
                    c0(1);
                    while (true) {
                        int i18 = i - i17;
                        int i19 = this.f9905f;
                        if (i18 > i19) {
                            i17 += i19;
                            this.f9907h = i19;
                            c0(1);
                        } else {
                            this.f9907h = i18;
                            return;
                        }
                    }
                }
            } else {
                a((i15 - i13) - i11);
                androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int b(int i) {
        if (i >= 0) {
            int i10 = this.f9908j + this.f9907h + i;
            if (i10 >= 0) {
                int i11 = this.f9909k;
                if (i10 <= i11) {
                    this.f9909k = i10;
                    b0();
                    return i11;
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

    public final void b0() {
        int i = this.f9905f + this.f9906g;
        this.f9905f = i;
        int i10 = this.f9908j + i;
        int i11 = this.f9909k;
        if (i10 <= i11) {
            this.f9906g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f9906g = i12;
        this.f9905f = i - i12;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void c(int i) {
        this.f9909k = i;
        b0();
    }

    public final void c0(int i) {
        if (!d0(i)) {
            if (i > (Integer.MAX_VALUE - this.f9908j) - this.f9907h) {
                androidx.datastore.preferences.protobuf.s1.t("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            } else {
                androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
    }

    public final boolean d0(int i) {
        InputStream inputStream = this.f9904d;
        int i10 = this.f9907h;
        int i11 = i10 + i;
        int i12 = this.f9905f;
        if (i11 > i12) {
            int i13 = this.f9908j;
            if (i <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i <= this.f9909k) {
                byte[] bArr = this.e;
                if (i10 > 0) {
                    if (i12 > i10) {
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    i13 = this.f9908j + i10;
                    this.f9908j = i13;
                    i12 = this.f9905f - i10;
                    this.f9905f = i12;
                    this.f9907h = 0;
                }
                try {
                    int read = inputStream.read(bArr, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
                    if (read != 0 && read >= -1 && read <= 4096) {
                        if (read > 0) {
                            this.f9905f += read;
                            b0();
                            if (this.f9905f >= i || d0(i)) {
                                return true;
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                        sb2.append(valueOf);
                        sb2.append("#read(byte[]) returned invalid result: ");
                        sb2.append(read);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                } catch (pn1 e) {
                    e.f9565u = true;
                    throw e;
                }
            }
            return false;
        }
        q.x.o(a5.a.j(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean e() {
        if (this.f9907h == this.f9905f && !d0(1)) {
            return true;
        }
        return false;
    }

    public final byte[] e0(int i) {
        byte[] f02 = f0(i);
        if (f02 != null) {
            return f02;
        }
        int i10 = this.f9907h;
        int i11 = this.f9905f;
        int i12 = i11 - i10;
        this.f9908j += i11;
        this.f9907h = 0;
        this.f9905f = 0;
        ArrayList g02 = g0(i - i12);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i10, bArr, 0, i12);
        int size = g02.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = g02.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int f() {
        return this.f9908j + this.f9907h;
    }

    public final byte[] f0(int i) {
        if (i == 0) {
            return ln1.f8074a;
        }
        int i10 = this.f9908j;
        int i11 = this.f9907h;
        int i12 = i10 + i11 + i;
        if ((-2147483647) + i12 <= 0) {
            int i13 = this.f9909k;
            if (i12 <= i13) {
                int i14 = this.f9905f - i11;
                int i15 = i - i14;
                InputStream inputStream = this.f9904d;
                if (i15 >= 4096) {
                    try {
                        if (i15 > inputStream.available()) {
                            return null;
                        }
                    } catch (pn1 e) {
                        e.f9565u = true;
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.e, this.f9907h, bArr, 0, i14);
                this.f9908j += this.f9905f;
                this.f9907h = 0;
                this.f9905f = 0;
                while (i14 < i) {
                    try {
                        int read = inputStream.read(bArr, i14, i - i14);
                        if (read != -1) {
                            this.f9908j += read;
                            i14 += read;
                        } else {
                            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            return null;
                        }
                    } catch (pn1 e8) {
                        e8.f9565u = true;
                        throw e8;
                    }
                }
                return bArr;
            }
            a((i13 - i10) - i11);
            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.t("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        return null;
    }

    public final ArrayList g0(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                try {
                    int read = this.f9904d.read(bArr, i10, min - i10);
                    if (read != -1) {
                        this.f9908j += read;
                        i10 += read;
                    } else {
                        androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                } catch (pn1 e) {
                    e.f9565u = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int h0() {
        int i;
        int i10 = this.f9907h;
        int i11 = this.f9905f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f9907h = i12;
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
                this.f9907h = i13;
                return i;
            }
        }
        return (int) i0();
    }

    public final long i0() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f9907h == this.f9905f) {
                c0(1);
            }
            int i10 = this.f9907h;
            this.f9907h = i10 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.e[i10] & 128) == 0) {
                return j10;
            }
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int j0() {
        int i = this.f9907h;
        if (this.f9905f - i < 4) {
            c0(4);
            i = this.f9907h;
        }
        this.f9907h = i + 4;
        byte[] bArr = this.e;
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long k0() {
        int i = this.f9907h;
        if (this.f9905f - i < 8) {
            c0(8);
            i = this.f9907h;
        }
        this.f9907h = i + 8;
        byte[] bArr = this.e;
        long j10 = bArr[i];
        long j11 = bArr[i + 2];
        long j12 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j10 & 255) | ((bArr[i + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int p() {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int h02 = h0();
        this.i = h02;
        if ((h02 >>> 3) != 0) {
            return h02;
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
                                a(4);
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
                a(h0());
                return true;
            }
            a(8);
            return true;
        }
        int i12 = this.f9905f - this.f9907h;
        byte[] bArr = this.e;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f9907h;
                this.f9907h = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i11 < 10) {
            if (this.f9907h == this.f9905f) {
                c0(1);
            }
            int i14 = this.f9907h;
            this.f9907h = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        androidx.datastore.preferences.protobuf.s1.t("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final double u() {
        return Double.longBitsToDouble(k0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final float w() {
        return Float.intBitsToFloat(j0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long z() {
        return W();
    }
}
