package com.google.android.gms.internal.ads;
import g3.a;

import android.net.TrafficStats;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class tl1 extends qb1 implements iq1 {
    public final int A;
    public final String B;
    public final z11 C;
    public final z11 D;
    public dj1 E;
    public HttpURLConnection F;
    public InputStream G;
    public boolean H;
    public int I;
    public long J;
    public long K;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11384y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11385z;

    public /* synthetic */ tl1(String str, int i, int i10, boolean z3, z11 z11Var) {
        super(true);
        this.B = str;
        this.f11385z = i;
        this.A = i10;
        this.f11384y = z3;
        this.C = z11Var;
        this.D = new z11(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d3 A[Catch: IOException -> 0x01df, TRY_LEAVE, TryCatch #5 {IOException -> 0x01df, blocks: (B:27:0x01cb, B:29:0x01d3), top: B:26:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.regex.Matcher] */
    @Override // com.google.android.gms.internal.ads.pf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.dj1 r30) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tl1.a(com.google.android.gms.internal.ads.dj1):long");
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        dj1 dj1Var = this.E;
        if (dj1Var != null) {
            return dj1Var.f5444a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.J;
            if (j10 != -1) {
                long j11 = j10 - this.K;
                if (j11 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j11);
            }
            InputStream inputStream = this.G;
            String str = bq0.f4860a;
            int read = inputStream.read(bArr, i, i10);
            if (read != -1) {
                this.K += read;
                i(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = bq0.f4860a;
            throw co1.a(e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Map f() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection == null) {
            return d61.A;
        }
        return new dl1(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.pf1
    public final void k() {
        try {
            InputStream inputStream = this.G;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = bq0.f4860a;
                    throw new co1(e, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.G = null;
            q();
            if (this.H) {
                this.H = false;
                j();
            }
            this.F = null;
            this.E = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection l(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f11385z
            r5.setConnectTimeout(r0)
            int r0 = r4.A
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.z11 r1 = r4.C
            java.util.Map r1 = r1.i()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.z11 r1 = r4.D
            java.util.Map r1 = r1.i()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L32
        L4e:
            r0 = 0
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            r6 = 0
            goto L79
        L5c:
            r6 = r0
        L5d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r12.<init>(r0)
            r12.append(r6)
            java.lang.String r0 = "-"
            r12.append(r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L75:
            java.lang.String r6 = r12.toString()
        L79:
            if (r6 == 0) goto L80
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L80:
            java.lang.String r6 = r4.B
            if (r6 == 0) goto L89
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L89:
            r6 = 1
            if (r6 == r10) goto L8f
            java.lang.String r6 = "identity"
            goto L91
        L8f:
            java.lang.String r6 = "gzip"
        L91:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.dj1.f5443f
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tl1.l(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final URL o(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new co1("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), AdError.INTERNAL_ERROR_CODE, 1);
                }
                if (!this.f11384y && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb2 = new StringBuilder(g3.a.v(protocol, String.valueOf(protocol2).length() + 40, 1));
                    sb2.append("Disallowed cross-protocol redirect (");
                    sb2.append(protocol2);
                    sb2.append(" to ");
                    sb2.append(protocol);
                    sb2.append(")");
                    throw new co1(sb2.toString(), AdError.INTERNAL_ERROR_CODE, 1);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new co1(e, AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        throw new co1("Null location redirect", AdError.INTERNAL_ERROR_CODE, 1);
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                x21.P("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }
}
