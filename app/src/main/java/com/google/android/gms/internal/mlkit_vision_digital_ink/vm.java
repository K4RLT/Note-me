package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import q.x;
import x.o;

import com.google.android.gms.internal.ads.rm1;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vm extends rm1 {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f15131d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public int f15132f;

    /* renamed from: g, reason: collision with root package name */
    public int f15133g;

    /* renamed from: h, reason: collision with root package name */
    public int f15134h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f15135j;

    /* renamed from: k, reason: collision with root package name */
    public int f15136k = Integer.MAX_VALUE;

    public /* synthetic */ vm(InputStream inputStream) {
        Charset charset = vn.f15137a;
        this.f15131d = inputStream;
        this.e = new byte[4096];
        this.f15132f = 0;
        this.f15134h = 0;
        this.f15135j = 0;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int A() {
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int C() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int E() {
        int i;
        int i10 = this.f15134h;
        int i11 = this.f15132f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f15134h = i12;
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
                this.f15134h = i13;
                return i;
            }
        }
        return (int) k0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int F() {
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int H() {
        return rm1.h(E());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int J() {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int E = E();
        this.i = E;
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
        return j0();
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
        int i = this.f15134h;
        int i10 = this.f15132f;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.e;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                this.f15134h = i11;
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
                this.f15134h = i12;
                return j10;
            }
        }
        return k0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final long U() {
        return j0();
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
        int i = this.f15132f;
        int i10 = this.f15134h;
        int i11 = i - i10;
        byte[] bArr = this.e;
        if (E <= i11 && E > 0) {
            sm k3 = tm.k(bArr, i10, E);
            this.f15134h += E;
            return k3;
        }
        if (E == 0) {
            return tm.f15012v;
        }
        if (E >= 0) {
            byte[] h02 = h0(E);
            if (h02 != null) {
                return tm.k(h02, 0, h02.length);
            }
            int i12 = this.f15134h;
            int i13 = this.f15132f;
            int i14 = i13 - i12;
            this.f15135j += i13;
            this.f15134h = 0;
            this.f15132f = 0;
            ArrayList c02 = c0(E - i14);
            byte[] bArr2 = new byte[E];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            int size = c02.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = c02.get(i15);
                i15++;
                byte[] bArr3 = (byte[]) obj;
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i14, length);
                i14 += length;
            }
            sm smVar = tm.f15012v;
            return new sm(bArr2);
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String Y() {
        int E = E();
        byte[] bArr = this.e;
        if (E > 0) {
            int i = this.f15132f;
            int i10 = this.f15134h;
            if (E <= i - i10) {
                String str = new String(bArr, i10, E, vn.f15137a);
                this.f15134h += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E >= 0) {
            if (E <= this.f15132f) {
                e0(E);
                String str2 = new String(bArr, this.f15134h, E, vn.f15137a);
                this.f15134h += E;
                return str2;
            }
            return new String(g0(E), vn.f15137a);
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final String Z() {
        int E = E();
        int i = this.f15134h;
        int i10 = this.f15132f;
        int i11 = i10 - i;
        byte[] bArr = this.e;
        if (E <= i11 && E > 0) {
            this.f15134h = i + E;
        } else {
            if (E == 0) {
                return "";
            }
            if (E >= 0) {
                i = 0;
                if (E <= i10) {
                    e0(E);
                    this.f15134h = E;
                } else {
                    bArr = g0(E);
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
        }
        return fp.d(bArr, i, E);
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void a(int i) {
        this.f15136k = i;
        d0();
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final void a0(int i) {
        if (this.i == i) {
            return;
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message end-group tag did not match expected tag.");
    }

    public final void b0(int i) {
        InputStream inputStream = this.f15131d;
        int i10 = this.f15132f;
        int i11 = this.f15134h;
        int i12 = i10 - i11;
        if (i <= i12 && i >= 0) {
            this.f15134h = i11 + i;
            return;
        }
        if (i >= 0) {
            int i13 = this.f15135j;
            int i14 = i13 + i11;
            int i15 = this.f15136k;
            if (i14 + i <= i15) {
                this.f15135j = i14;
                this.f15132f = 0;
                this.f15134h = 0;
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
                                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (xn e) {
                            e.f15243u = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.f15135j += i12;
                        d0();
                        throw th;
                    }
                }
                this.f15135j += i12;
                d0();
                if (i12 < i) {
                    int i16 = this.f15132f;
                    int i17 = i16 - this.f15134h;
                    this.f15134h = i16;
                    e0(1);
                    while (true) {
                        int i18 = i - i17;
                        int i19 = this.f15132f;
                        if (i18 > i19) {
                            i17 += i19;
                            this.f15134h = i19;
                            e0(1);
                        } else {
                            this.f15134h = i18;
                            return;
                        }
                    }
                }
            } else {
                b0((i15 - i13) - i11);
                androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final ArrayList c0(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f15131d.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.f15135j += read;
                    i10 += read;
                } else {
                    androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean d() {
        if (this.f15134h == this.f15132f && !f0(1)) {
            return true;
        }
        return false;
    }

    public final void d0() {
        int i = this.f15132f + this.f15133g;
        this.f15132f = i;
        int i10 = this.f15135j + i;
        int i11 = this.f15136k;
        if (i10 <= i11) {
            this.f15133g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f15133g = i12;
        this.f15132f = i - i12;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final boolean e() {
        if (S() != 0) {
            return true;
        }
        return false;
    }

    public final void e0(int i) {
        if (!f0(i)) {
            if (i > (Integer.MAX_VALUE - this.f15135j) - this.f15134h) {
                androidx.datastore.preferences.protobuf.s1.u("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            } else {
                androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
    }

    public final boolean f0(int i) {
        InputStream inputStream = this.f15131d;
        int i10 = this.f15134h;
        int i11 = i10 + i;
        int i12 = this.f15132f;
        if (i11 > i12) {
            int i13 = this.f15135j;
            if (i > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i > this.f15136k) {
                return false;
            }
            byte[] bArr = this.e;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                i13 = this.f15135j + i10;
                this.f15135j = i13;
                i12 = this.f15132f - i10;
                this.f15132f = i12;
                this.f15134h = 0;
            }
            try {
                int read = inputStream.read(bArr, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f15132f += read;
                    d0();
                    if (this.f15132f < i && !f0(i)) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (xn e) {
                e.f15243u = true;
                throw e;
            }
        }
        q.x.o(g3.a.i("refillBuffer() called when ", i, " bytes were already available in buffer"));
        return false;
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
        int i12 = this.f15132f - this.f15134h;
        byte[] bArr = this.e;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f15134h;
                this.f15134h = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i11 < 10) {
            if (this.f15134h == this.f15132f) {
                e0(1);
            }
            int i14 = this.f15134h;
            this.f15134h = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    public final byte[] g0(int i) {
        byte[] h02 = h0(i);
        if (h02 != null) {
            return h02;
        }
        int i10 = this.f15134h;
        int i11 = this.f15132f;
        int i12 = i11 - i10;
        this.f15135j += i11;
        this.f15134h = 0;
        this.f15132f = 0;
        ArrayList c02 = c0(i - i12);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i10, bArr, 0, i12);
        int size = c02.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = c02.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    public final byte[] h0(int i) {
        if (i == 0) {
            return vn.f15138b;
        }
        int i10 = this.f15135j;
        int i11 = this.f15134h;
        int i12 = i10 + i11 + i;
        if ((-2147483647) + i12 <= 0) {
            int i13 = this.f15136k;
            if (i12 <= i13) {
                int i14 = this.f15132f - i11;
                int i15 = i - i14;
                InputStream inputStream = this.f15131d;
                if (i15 >= 4096) {
                    try {
                        if (i15 > inputStream.available()) {
                            return null;
                        }
                    } catch (xn e) {
                        e.f15243u = true;
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.e, this.f15134h, bArr, 0, i14);
                this.f15135j += this.f15132f;
                this.f15134h = 0;
                this.f15132f = 0;
                while (i14 < i) {
                    try {
                        int read = inputStream.read(bArr, i14, i - i14);
                        if (read != -1) {
                            this.f15135j += read;
                            i14 += read;
                        } else {
                            androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            return null;
                        }
                    } catch (xn e8) {
                        e8.f15243u = true;
                        throw e8;
                    }
                }
                return bArr;
            }
            b0((i13 - i10) - i11);
            androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        return null;
    }

    public final int i0() {
        int i = this.f15134h;
        if (this.f15132f - i < 4) {
            e0(4);
            i = this.f15134h;
        }
        this.f15134h = i + 4;
        byte[] bArr = this.e;
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long j0() {
        int i = this.f15134h;
        if (this.f15132f - i < 8) {
            e0(8);
            i = this.f15134h;
        }
        this.f15134h = i + 8;
        byte[] bArr = this.e;
        long j10 = bArr[i];
        long j11 = bArr[i + 2];
        long j12 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j10 & 255) | ((bArr[i + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final long k0() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f15134h == this.f15132f) {
                e0(1);
            }
            int i10 = this.f15134h;
            this.f15134h = i10 + 1;
            j10 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.e[i10] & 128) == 0) {
                return j10;
            }
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final double q() {
        return Double.longBitsToDouble(j0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final float s() {
        return Float.intBitsToFloat(i0());
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int v() {
        return this.f15135j + this.f15134h;
    }

    @Override // com.google.android.gms.internal.ads.rm1
    public final int x(int i) {
        if (i >= 0) {
            int i10 = this.f15135j + this.f15134h + i;
            if (i10 >= 0) {
                int i11 = this.f15136k;
                if (i10 <= i11) {
                    this.f15136k = i10;
                    d0();
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
