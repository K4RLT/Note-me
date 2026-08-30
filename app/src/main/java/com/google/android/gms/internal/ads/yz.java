package com.google.android.gms.internal.ads;
import a5.a;
import k9.a0;
import l9.i;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class yz extends qb1 implements iq1 {
    public static final Pattern P = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final String A;
    public final z11 B;
    public dj1 C;
    public HttpURLConnection D;
    public final ArrayDeque E;
    public InputStream F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public final long N;
    public final long O;

    /* renamed from: y, reason: collision with root package name */
    public final int f13014y;

    /* renamed from: z, reason: collision with root package name */
    public final int f13015z;

    public yz(String str, wz wzVar, int i, int i10, long j10, long j11) {
        super(true);
        b80.l(true ^ TextUtils.isEmpty(str));
        this.A = str;
        this.B = new z11(9);
        this.f13014y = i;
        this.f13015z = i10;
        this.E = new ArrayDeque();
        this.N = j10;
        this.O = j11;
        if (wzVar != null) {
            b(wzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final long a(dj1 dj1Var) {
        this.C = dj1Var;
        this.J = 0L;
        long j10 = dj1Var.f5446c;
        long j11 = dj1Var.f5447d;
        long j12 = this.N;
        if (j11 != -1) {
            j12 = Math.min(j12, j11);
        }
        this.K = j10;
        HttpURLConnection l10 = l(j10, 1, (j12 + j10) - 1);
        this.D = l10;
        String headerField = l10.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = P.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j11 != -1) {
                        this.I = j11;
                        this.L = Math.max(parseLong, (this.K + j11) - 1);
                    } else {
                        this.I = parseLong2 - this.K;
                        this.L = parseLong2 - 1;
                    }
                    this.M = parseLong;
                    this.G = true;
                    g(dj1Var);
                    return this.I;
                } catch (NumberFormatException unused) {
                    String o10 = p.a.o(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i = k9.a0.f19634b;
                    l9.i.c(o10);
                }
            }
        }
        throw new co1("Invalid content range: ".concat(String.valueOf(headerField)), AdError.SERVER_ERROR_CODE, 1);
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
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.I;
            long j11 = this.J;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.K + j11;
            long j13 = i10;
            long j14 = j12 + j13 + this.O;
            long j15 = this.M;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.L;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.N + j16) - r4) - 1, (j16 + j13) - 1));
                    l(j16, 2, min);
                    this.M = min;
                    j15 = min;
                }
            }
            int read = this.F.read(bArr, i, (int) Math.min(j13, ((j15 + 1) - this.K) - this.J));
            if (read != -1) {
                this.J += read;
                i(read);
                return read;
            }
            throw new EOFException();
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
        try {
            InputStream inputStream = this.F;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new co1(e, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.F = null;
            o();
            if (this.G) {
                this.G = false;
                j();
            }
        }
    }

    public final HttpURLConnection l(long j10, int i, long j11) {
        String uri = this.C.f5444a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f13014y);
            httpURLConnection.setReadTimeout(this.f13015z);
            for (Map.Entry entry : this.B.i().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            sb2.append(j11);
            httpURLConnection.setRequestProperty("Range", sb2.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.A);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.E.add(httpURLConnection);
            String uri2 = this.C.f5444a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.H = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.F != null) {
                            inputStream = new SequenceInputStream(this.F, inputStream);
                        }
                        this.F = inputStream;
                        return httpURLConnection;
                    } catch (IOException e) {
                        o();
                        throw new co1(e, AdError.SERVER_ERROR_CODE, i);
                    }
                }
                httpURLConnection.getHeaderFields();
                o();
                int i10 = this.H;
                throw new co1(a5.a.f(i10, "Response code: ", new StringBuilder(String.valueOf(i10).length() + 15)), AdError.SERVER_ERROR_CODE, i);
            } catch (IOException e8) {
                o();
                throw new co1("Unable to connect to ".concat(String.valueOf(uri2)), e8, AdError.SERVER_ERROR_CODE, i);
            }
        } catch (IOException e10) {
            throw new co1("Unable to connect to ".concat(String.valueOf(uri)), e10, AdError.SERVER_ERROR_CODE, i);
        }
    }

    public final void o() {
        while (true) {
            ArrayDeque arrayDeque = this.E;
            if (!arrayDeque.isEmpty()) {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e) {
                    int i = k9.a0.f19634b;
                    l9.i.d("Unexpected error while disconnecting", e);
                }
            } else {
                this.D = null;
                return;
            }
        }
    }
}
