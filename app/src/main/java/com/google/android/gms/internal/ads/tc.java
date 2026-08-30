package com.google.android.gms.internal.ads;
import a5.a;
import i0.m;

import android.os.HandlerThread;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class tc implements af1, zb0 {

    /* renamed from: u, reason: collision with root package name */
    public int f11314u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11315v;

    /* renamed from: w, reason: collision with root package name */
    public Object f11316w;

    /* renamed from: x, reason: collision with root package name */
    public Object f11317x;

    public tc(String str, SecretKeySpec secretKeySpec) {
        int i;
        al1 al1Var = new al1(this);
        this.f11315v = al1Var;
        if (ct.i(2)) {
            this.f11316w = str;
            this.f11317x = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i = 20;
                            this.f11314u = i;
                            al1Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i = 28;
                            this.f11314u = i;
                            al1Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i = 32;
                            this.f11314u = i;
                            al1Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i = 48;
                            this.f11314u = i;
                            al1Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i = 64;
                            this.f11314u = i;
                            al1Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    public static final void i(long j10) {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + jArr[6]) ^ (jArr[7] % 477127367)) == 0) {
        } else {
            throw new Exception();
        }
    }

    public void a(long j10) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        i(j10);
        long j19 = j10 / (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17) ^ (j18 % 899334107));
        if (j19 >= 0 && j19 <= ((oc) this.f11315v).f9089a.length) {
            this.f11314u = (int) j19;
            return;
        }
        throw new Exception();
    }

    public long b() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        return this.f11314u * (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public void c() {
        boolean z3;
        HandlerThread handlerThread;
        synchronized (this.f11315v) {
            try {
                if (this.f11314u > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.K(z3);
                int i = this.f11314u - 1;
                this.f11314u = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f11317x) != null) {
                    handlerThread.quit();
                    this.f11317x = null;
                    this.f11316w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long d() {
        try {
            hc hcVar = (hc) this.f11316w;
            oc ocVar = (oc) this.f11315v;
            this.f11314u = this.f11314u + 1;
            return hcVar.h(ocVar, r2);
        } catch (IndexOutOfBoundsException e) {
            throw new Exception(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.af1
    public byte[] e(byte[] bArr, int i) {
        if (i <= this.f11314u) {
            al1 al1Var = (al1) this.f11315v;
            ((Mac) al1Var.get()).update(bArr);
            return Arrays.copyOf(((Mac) al1Var.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    public int f() {
        try {
            hc hcVar = (hc) this.f11316w;
            oc ocVar = (oc) this.f11315v;
            int i = this.f11314u;
            this.f11314u = i + 1;
            int h3 = hcVar.h(ocVar, i) & 255;
            hc hcVar2 = (hc) this.f11316w;
            oc ocVar2 = (oc) this.f11315v;
            int i10 = this.f11314u;
            this.f11314u = i10 + 1;
            int h10 = h3 | ((hcVar2.h(ocVar2, i10) & 255) << 8);
            hc hcVar3 = (hc) this.f11316w;
            oc ocVar3 = (oc) this.f11315v;
            int i11 = this.f11314u;
            this.f11314u = i11 + 1;
            int h11 = h10 | ((hcVar3.h(ocVar3, i11) & 255) << 16);
            hc hcVar4 = (hc) this.f11316w;
            oc ocVar4 = (oc) this.f11315v;
            int i12 = this.f11314u;
            this.f11314u = i12 + 1;
            return h11 | (hcVar4.h(ocVar4, i12) << 24);
        } catch (IndexOutOfBoundsException e) {
            throw new Exception(e);
        }
    }

    public long g() {
        int i = 0;
        long j10 = 0;
        while (i < 64) {
            try {
                hc hcVar = (hc) this.f11316w;
                oc ocVar = (oc) this.f11315v;
                int i10 = this.f11314u;
                this.f11314u = i10 + 1;
                byte h3 = hcVar.h(ocVar, i10);
                j10 |= (h3 & Byte.MAX_VALUE) << i;
                if (i == 63) {
                    if (h3 <= 1) {
                        i = 63;
                    } else {
                        throw new Exception();
                    }
                }
                if ((h3 & 128) == 0) {
                    return (-(j10 & 1)) ^ (j10 >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new Exception(e);
            }
        }
        throw new Exception();
    }

    public oc h(long j10) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        i(b() + j10);
        int i17 = this.f11314u;
        long j11 = i17;
        oc ocVar = (oc) this.f11315v;
        long j12 = (j10 >> ((i16 % 774318984) ^ w10)) + j11;
        if (j12 <= ocVar.f9089a.length && j12 >= j11) {
            try {
                int i18 = (int) j12;
                oc k3 = ((hc) this.f11316w).k(ocVar, i17, i18);
                this.f11314u = i18;
                return k3;
            } catch (IndexOutOfBoundsException e) {
                throw new AssertionError(nc.a("CEiv6BFfPnitUE+D"), e);
            }
        }
        throw new Exception();
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* renamed from: l */
    public /* synthetic */ void mo213l(Object obj) {
        ((by1) obj).l(0, (yx1) ((i0.m) this.f11315v).f18055w, (qx1) this.f11316w, (vx1) this.f11317x, this.f11314u);
    }

    public /* synthetic */ tc(i0.m mVar, qx1 qx1Var, vx1 vx1Var, int i) {
        this.f11315v = mVar;
        this.f11316w = qx1Var;
        this.f11317x = vx1Var;
        this.f11314u = i;
    }

    public tc(oc ocVar, int i, hc hcVar) {
        this.f11315v = ocVar;
        this.f11314u = i;
        this.f11316w = hcVar;
    }
}
