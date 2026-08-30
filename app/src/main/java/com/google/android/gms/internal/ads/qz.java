package com.google.android.gms.internal.ads;
import k9.a0;
import l9.i;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qz extends qb1 implements iq1 {
    public static final Pattern N = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference O = new AtomicReference();
    public final int A;
    public final String B;
    public final z11 C;
    public HttpURLConnection D;
    public InputStream E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public final HashSet M;

    /* renamed from: y, reason: collision with root package name */
    public final pz f10040y;

    /* renamed from: z, reason: collision with root package name */
    public final int f10041z;

    public qz(String str, wz wzVar, int i, int i10, int i11) {
        super(true);
        this.f10040y = new pz(this);
        this.M = new HashSet();
        b80.l(true ^ TextUtils.isEmpty(str));
        this.B = str;
        this.C = new z11(9);
        this.f10041z = i;
        this.A = i10;
        this.L = i11;
        if (wzVar != null) {
            b(wzVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x028f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0261 A[Catch: IOException -> 0x003d, TryCatch #3 {IOException -> 0x003d, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0026, B:8:0x0034, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0088, B:21:0x00ab, B:22:0x00d1, B:23:0x00d6, B:37:0x010c, B:93:0x0254, B:95:0x0261, B:97:0x0272, B:103:0x027b, B:104:0x0288, B:107:0x028f, B:108:0x0296, B:113:0x0297, B:114:0x02b4), top: B:2:0x000c }] */
    @Override // com.google.android.gms.internal.ads.pf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.dj1 r25) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qz.a(com.google.android.gms.internal.ads.dj1):long");
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.D;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        try {
            if (this.J != this.H) {
                AtomicReference atomicReference = O;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.J;
                    long j11 = this.H;
                    if (j10 != j11) {
                        int read = this.E.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.J += read;
                                i(read);
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        atomicReference.set(bArr2);
                        break;
                    }
                }
            }
            if (i10 == 0) {
                return 0;
            }
            long j12 = this.I;
            if (j12 != -1) {
                long j13 = j12 - this.K;
                if (j13 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j13);
            }
            int read2 = this.E.read(bArr, i, i10);
            if (read2 == -1) {
                if (this.I != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.K += read2;
            i(read2);
            return read2;
        } catch (IOException e) {
            throw new co1(e, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Map f() {
        HttpURLConnection httpURLConnection = this.D;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void k() {
        HashSet hashSet = this.M;
        try {
            InputStream inputStream = this.E;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new co1(e, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.E = null;
            l();
            if (this.F) {
                this.F = false;
                j();
            }
            hashSet.clear();
        }
    }

    public final void l() {
        HttpURLConnection httpURLConnection = this.D;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = k9.a0.f19634b;
                l9.i.d("Unexpected error while disconnecting", e);
            }
            this.D = null;
        }
    }
}
