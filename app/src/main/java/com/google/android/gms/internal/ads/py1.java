package com.google.android.gms.internal.ads;
import p.a;

import android.content.Context;
import android.media.MediaCodec;
import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class py1 implements com.google.android.gms.internal.mlkit_vision_digital_ink.da {

    /* renamed from: u, reason: collision with root package name */
    public long f9667u;

    /* renamed from: v, reason: collision with root package name */
    public Object f9668v;

    /* renamed from: w, reason: collision with root package name */
    public Object f9669w;

    /* renamed from: x, reason: collision with root package name */
    public Object f9670x;

    /* renamed from: y, reason: collision with root package name */
    public Object f9671y;

    /* renamed from: z, reason: collision with root package name */
    public Object f9672z;

    public static d6 c(d6 d6Var, es1 es1Var, r7 r7Var, xk0 xk0Var) {
        boolean z3;
        if (es1Var.c(1073741824)) {
            long j10 = r7Var.f10136w;
            int i = 1;
            xk0Var.y(1);
            d6 e = e(d6Var, j10, xk0Var.f12580a, 1);
            long j11 = j10 + 1;
            byte b10 = xk0Var.f12580a[0];
            int i10 = b10 & 128;
            int i11 = b10 & Byte.MAX_VALUE;
            cs1 cs1Var = es1Var.f5766c;
            byte[] bArr = cs1Var.f5145a;
            if (bArr == null) {
                cs1Var.f5145a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i10 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            d6Var = e(e, j11, cs1Var.f5145a, i11);
            long j12 = j11 + i11;
            if (z3) {
                xk0Var.y(2);
                d6Var = e(d6Var, j12, xk0Var.f12580a, 2);
                j12 += 2;
                i = xk0Var.L();
            }
            int[] iArr = cs1Var.f5148d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = cs1Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z3) {
                int i12 = i * 6;
                xk0Var.y(i12);
                d6Var = e(d6Var, j12, xk0Var.f12580a, i12);
                j12 += i12;
                xk0Var.E(0);
                for (int i13 = 0; i13 < i; i13++) {
                    iArr[i13] = xk0Var.L();
                    iArr2[i13] = xk0Var.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = r7Var.f10135v - ((int) (j12 - r7Var.f10136w));
            }
            h3 h3Var = (h3) r7Var.f10137x;
            String str = bq0.f4860a;
            byte[] bArr2 = h3Var.f6572b;
            byte[] bArr3 = cs1Var.f5145a;
            int i14 = h3Var.f6571a;
            int i15 = h3Var.f6573c;
            int i16 = h3Var.f6574d;
            cs1Var.f5149f = i;
            cs1Var.f5148d = iArr;
            cs1Var.e = iArr2;
            cs1Var.f5146b = bArr2;
            cs1Var.f5145a = bArr3;
            cs1Var.f5147c = i14;
            cs1Var.f5150g = i15;
            cs1Var.f5151h = i16;
            MediaCodec.CryptoInfo cryptoInfo = cs1Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar = cs1Var.f5152j;
            iwVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) iwVar.f14490w;
            pattern.set(i15, i16);
            ((MediaCodec.CryptoInfo) iwVar.f14489v).setPattern(pattern);
            long j13 = r7Var.f10136w;
            int i17 = (int) (j12 - j13);
            r7Var.f10136w = j13 + i17;
            r7Var.f10135v -= i17;
        }
        if (es1Var.c(268435456)) {
            xk0Var.y(4);
            d6 e8 = e(d6Var, r7Var.f10136w, xk0Var.f12580a, 4);
            int h3 = xk0Var.h();
            r7Var.f10136w += 4;
            r7Var.f10135v -= 4;
            es1Var.d(h3);
            d6 d2 = d(e8, r7Var.f10136w, es1Var.f5767d, h3);
            r7Var.f10136w += h3;
            int i18 = r7Var.f10135v - h3;
            r7Var.f10135v = i18;
            ByteBuffer byteBuffer = es1Var.f5768f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                es1Var.f5768f.clear();
            } else {
                es1Var.f5768f = ByteBuffer.allocate(i18);
            }
            return d(d2, r7Var.f10136w, es1Var.f5768f, r7Var.f10135v);
        }
        es1Var.d(r7Var.f10135v);
        return d(d6Var, r7Var.f10136w, es1Var.f5767d, r7Var.f10135v);
    }

    public static d6 d(d6 d6Var, long j10, ByteBuffer byteBuffer, int i) {
        while (j10 >= d6Var.f5316v) {
            d6Var = (d6) d6Var.f5318x;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (d6Var.f5316v - j10));
            v vVar = (v) d6Var.f5317w;
            byte[] bArr = vVar.f11763a;
            long j11 = j10 - d6Var.f5315u;
            vVar.getClass();
            byteBuffer.put(bArr, (int) j11, min);
            i -= min;
            j10 += min;
            if (j10 == d6Var.f5316v) {
                d6Var = (d6) d6Var.f5318x;
            }
        }
        return d6Var;
    }

    public static d6 e(d6 d6Var, long j10, byte[] bArr, int i) {
        while (j10 >= d6Var.f5316v) {
            d6Var = (d6) d6Var.f5318x;
        }
        int i10 = i;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d6Var.f5316v - j10));
            v vVar = (v) d6Var.f5317w;
            byte[] bArr2 = vVar.f11763a;
            long j11 = j10 - d6Var.f5315u;
            vVar.getClass();
            System.arraycopy(bArr2, (int) j11, bArr, i - i10, min);
            i10 -= min;
            j10 += min;
            if (j10 == d6Var.f5316v) {
                d6Var = (d6) d6Var.f5318x;
            }
        }
        return d6Var;
    }

    public void a(long j10) {
        d6 d6Var;
        if (j10 != -1) {
            while (true) {
                d6Var = (d6) this.f9670x;
                if (j10 < d6Var.f5316v) {
                    break;
                }
                ((w) this.f9668v).m((v) d6Var.f5317w);
                d6 d6Var2 = (d6) this.f9670x;
                d6Var2.f5317w = null;
                d6 d6Var3 = (d6) d6Var2.f5318x;
                d6Var2.f5318x = null;
                this.f9670x = d6Var3;
            }
            if (((d6) this.f9671y).f5315u < d6Var.f5315u) {
                this.f9671y = d6Var;
            }
        }
    }

    public int b(int i) {
        d6 d6Var = (d6) this.f9672z;
        if (((v) d6Var.f5317w) == null) {
            v mo206zza = ((w) this.f9668v).mo206zza();
            d6 d6Var2 = new d6(((d6) this.f9672z).f5316v);
            d6Var.f5317w = mo206zza;
            d6Var.f5318x = d6Var2;
        }
        return Math.min(i, (int) (((d6) this.f9672z).f5316v - this.f9667u));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya zza() {
        int i;
        String str = "";
        String str2 = (String) this.f9669w;
        Context context = (Context) this.f9668v;
        long j10 = this.f9667u;
        com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f9670x;
        com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.or) this.f9671y;
        com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.tr) this.f9672z;
        try {
            com.google.android.gms.internal.mlkit_vision_digital_ink.r a10 = com.google.android.gms.internal.mlkit_vision_digital_ink.s.a(context);
            a10.d(j10, str2);
            OutputStream outputStream = (OutputStream) iVar.c(a10.c(), new com.google.android.gms.internal.mlkit_vision_digital_ink.s5(2));
            i = 0;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.w unused) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.cx.g("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", orVar.D(), trVar.P());
            str = p.a.l("System limit exceeded for file ", orVar.D(), ", group ", trVar.P());
            i = 25;
        } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.x unused2) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.cx.g("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", orVar.D(), trVar.P());
            str = p.a.l("Malformed lease Uri for file ", orVar.D(), ", group ", trVar.P());
            i = 18;
        } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.y e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str = e.getMessage();
            }
            com.google.android.gms.internal.mlkit_vision_digital_ink.cx.k("%s: Failed to share file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", orVar.D(), trVar.P(), str);
            str = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str));
            i = 24;
        } catch (IOException unused3) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.cx.g("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", orVar.D(), trVar.P());
            str = p.a.l("Error while acquiring lease for file ", orVar.D(), ", group ", trVar.P());
            i = 20;
        }
        if (i == 0) {
            return com.google.android.gms.internal.mlkit_vision_digital_ink.va.f15125v;
        }
        throw new com.google.android.gms.internal.mlkit_vision_digital_ink.fx(i, str);
    }
}
