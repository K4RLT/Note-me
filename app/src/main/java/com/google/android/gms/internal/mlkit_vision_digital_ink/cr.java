package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import ig.k;
import ig.p;
import ig.q;
import pg.h;
import q.h;
import q.x;
import x.n;
import x.o;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class cr extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final br f14165a;

    /* renamed from: b, reason: collision with root package name */
    public final br f14166b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cr(java.net.URL r2, ig.q r3) {
        /*
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_digital_ink.br r0 = new com.google.android.gms.internal.mlkit_vision_digital_ink.br
            r0.<init>(r2, r3)
            java.net.URL r2 = r0.getURL()
            r1.<init>(r2)
            r1.f14165a = r0
            r1.f14166b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.cr.<init>(java.net.URL, ig.q):void");
    }

    public final ig.k a() {
        br brVar = this.f14166b;
        if (brVar.f14106f != null) {
            return brVar.f14113n;
        }
        q.x.o("Connection has not yet been established");
        return null;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f14165a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        ((HttpsURLConnection) this).connected = true;
        this.f14165a.connect();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.f14165a.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f14165a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        ig.k a10 = a();
        if (a10 != null) {
            return a10.f18524b.f18496a;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f14165a.f14102a.P;
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f14165a.getContent();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.f14165a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.f14165a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        return this.f14165a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.f14165a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.f14165a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f14165a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f14165a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f14165a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f14165a.getErrorStream();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.f14165a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.f14165a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j10) {
        return this.f14165a.getHeaderFieldDate(str, j10);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        return this.f14165a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        return this.f14165a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j10) {
        return this.f14165a.getHeaderFieldLong(str, j10);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        return this.f14165a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f14166b.f14102a.G;
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f14165a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f14165a.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f14165a.f14102a.N;
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.f14165a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        ig.k a10 = a();
        if (a10 != null) {
            List list = a10.f18526d;
            if (!list.isEmpty()) {
                return (Certificate[]) list.toArray(new Certificate[list.size()]);
            }
            return null;
        }
        return null;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        ig.k a10 = a();
        if (a10 != null) {
            List list = a10.f18526d;
            if (!list.isEmpty()) {
                return ((X509Certificate) list.get(0)).getSubjectX500Principal();
            }
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f14165a.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        ig.k a10 = a();
        if (a10 != null) {
            List list = a10.f18525c;
            if (!list.isEmpty()) {
                return ((X509Certificate) list.get(0)).getSubjectX500Principal();
            }
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f14165a.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f14165a.f14102a.Q;
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f14165a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f14165a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f14165a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f14165a.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f14165a.getResponseMessage();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f14166b.f14102a.E;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        ig.k a10 = a();
        if (a10 != null) {
            List list = a10.f18525c;
            if (!list.isEmpty()) {
                return (Certificate[]) list.toArray(new Certificate[list.size()]);
            }
            return null;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f14165a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f14165a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z3) {
        this.f14165a.setAllowUserInteraction(z3);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f14165a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f14165a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z3) {
        this.f14165a.setDefaultUseCaches(z3);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z3) {
        this.f14165a.setDoInput(z3);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z3) {
        this.f14165a.setDoOutput(z3);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f14165a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        br brVar = this.f14166b;
        ig.q qVar = brVar.f14102a;
        qVar.getClass();
        ig.p pVar = new ig.p(qVar);
        if (hostnameVerifier != null) {
            pVar.f18552m = hostnameVerifier;
            brVar.f14102a = new ig.q(pVar);
        } else {
            g5.q.h("hostnameVerifier == null");
        }
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j10) {
        this.f14165a.setIfModifiedSince(j10);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z3) {
        this.f14165a.setInstanceFollowRedirects(z3);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f14165a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f14165a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.f14165a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory != null) {
            br brVar = this.f14166b;
            ig.q qVar = brVar.f14102a;
            qVar.getClass();
            ig.p pVar = new ig.p(qVar);
            pVar.f18550k = sSLSocketFactory;
            pg.h hVar = pg.h.f22833a;
            X509TrustManager o10 = hVar.o(sSLSocketFactory);
            if (o10 != null) {
                pVar.f18551l = hVar.c(o10);
                brVar.f14102a = new ig.q(pVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder("Unable to extract the trust manager on ");
            sb2.append(hVar);
            Class<?> cls = sSLSocketFactory.getClass();
            sb2.append(", sslSocketFactory is ");
            sb2.append(cls);
            throw new IllegalStateException(sb2.toString());
        }
        q.x.n("sslSocketFactory == null");
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z3) {
        this.f14165a.setUseCaches(z3);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f14165a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f14165a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f14165a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.f14165a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j10) {
        this.f14165a.setFixedLengthStreamingMode(j10);
    }
}
