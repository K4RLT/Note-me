package com.google.android.gms.internal.mlkit_vision_digital_ink;
import f4.h;
import g3.a;
import g5.q;
import ig.k;
import ig.l;
import ig.n;
import ig.p;
import ig.q;
import ig.t;
import ig.u;
import ig.w;
import jg.b;
import nd.o;
import p.a;
import pg.h;
import q.x;
import sg.f;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class br extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public q f14102a;

    /* renamed from: b, reason: collision with root package name */
    public final ar f14103b;

    /* renamed from: c, reason: collision with root package name */
    public final h f14104c;

    /* renamed from: d, reason: collision with root package name */
    public l f14105d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public u f14106f;

    /* renamed from: g, reason: collision with root package name */
    public long f14107g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f14108h;
    public w i;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f14109j;

    /* renamed from: k, reason: collision with root package name */
    public w f14110k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14111l;

    /* renamed from: m, reason: collision with root package name */
    public Proxy f14112m;

    /* renamed from: n, reason: collision with root package name */
    public k f14113n;

    public br(URL url, q qVar) {
        super(url);
        this.f14103b = new ar(this);
        this.f14104c = new h(1);
        this.f14107g = -1L;
        this.f14108h = new Object();
        this.f14111l = true;
        this.f14102a = qVar;
    }

    public final void a(IOException iOException) {
        Object obj = this.f14108h;
        synchronized (obj) {
            try {
                boolean z3 = iOException instanceof hr;
                Throwable th = iOException;
                if (z3) {
                    th = iOException.getCause();
                }
                this.f14109j = th;
                obj.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (!((HttpURLConnection) this).connected) {
            if (str != null) {
                if (str2 == null) {
                    return;
                }
                h hVar = this.f14104c;
                hVar.getClass();
                l.a(str);
                l.b(str2, str);
                hVar.a(str, str2);
                return;
            }
            q.h("field == null");
            return;
        }
        x.o("Cannot add request property after connection is made");
    }

    public final void b(w wVar) {
        Object obj = this.f14108h;
        synchronized (obj) {
            try {
                this.i = wVar;
                this.f14113n = wVar.f18600y;
                n nVar = (n) wVar.f18596u.f240c;
                nVar.getClass();
                try {
                    ((HttpURLConnection) this).url = new URL(nVar.f18541h);
                    obj.notifyAll();
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        if (this.e) {
            return;
        }
        u e = e();
        this.e = true;
        synchronized (e) {
            if (!e.f18585z) {
                e.f18585z = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e.f18581v.f20828c = h.f22833a.j();
        e.f18583x.getClass();
        o oVar = e.f18580u.f18564u;
        t tVar = new t(e, this);
        synchronized (oVar) {
            ((ArrayDeque) oVar.f21274x).add(tVar);
        }
        oVar.n();
        Object obj = this.f14108h;
        synchronized (obj) {
            while (this.f14111l && this.i == null && this.f14109j == null) {
                try {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Throwable th2 = this.f14109j;
            if (th2 != null) {
                ir.a(th2);
                throw null;
            }
        }
    }

    public final l d() {
        String g8;
        if (this.f14105d == null) {
            w f10 = f(true);
            int i = f10.f18598w;
            h e = f10.f18601z.e();
            String str = f10.f18597v.f18575u;
            l.a("ObsoleteUrlFactory-Selected-Protocol");
            l.b(str, "ObsoleteUrlFactory-Selected-Protocol");
            e.a("ObsoleteUrlFactory-Selected-Protocol", str);
            LinkedHashSet linkedHashSet = ir.f14478v;
            w wVar = f10.B;
            w wVar2 = f10.C;
            if (wVar == null) {
                if (wVar2 == null) {
                    g8 = "NONE";
                } else {
                    g8 = a.g(i, "CACHE ");
                }
            } else if (wVar2 == null) {
                g8 = a.g(i, "NETWORK ");
            } else {
                g8 = a.g(wVar.f18598w, "CONDITIONAL_CACHE ");
            }
            l.a("ObsoleteUrlFactory-Response-Source");
            l.b(g8, "ObsoleteUrlFactory-Response-Source");
            e.a("ObsoleteUrlFactory-Response-Source", g8);
            this.f14105d = new l(e);
        }
        return this.f14105d;
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.f14106f == null) {
            return;
        }
        this.f14103b.b();
        this.f14106f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Type inference failed for: r14v0, types: [f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u e() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.br.e():u");
    }

    public final w f(boolean z3) {
        w wVar;
        synchronized (this.f14108h) {
            try {
                w wVar2 = this.i;
                if (wVar2 != null) {
                    return wVar2;
                }
                Throwable th = this.f14109j;
                if (th != null) {
                    if (z3 && (wVar = this.f14110k) != null) {
                        return wVar;
                    }
                    ir.a(th);
                    throw null;
                }
                u e = e();
                this.f14103b.b();
                er erVar = (er) e.f18584y.e;
                if (erVar != null) {
                    erVar.f14270c.close();
                }
                if (this.e) {
                    Object obj = this.f14108h;
                    synchronized (obj) {
                        while (this.i == null && this.f14109j == null) {
                            try {
                                obj.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                } else {
                    this.e = true;
                    try {
                        b(e.b());
                    } catch (IOException e8) {
                        a(e8);
                    }
                }
                synchronized (this.f14108h) {
                    try {
                        Throwable th2 = this.f14109j;
                        if (th2 == null) {
                            w wVar3 = this.i;
                            if (wVar3 != null) {
                                return wVar3;
                            }
                            throw new AssertionError();
                        }
                        ir.a(th2);
                        throw null;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f14102a.P;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        long parseLong;
        try {
            w f10 = f(true);
            LinkedHashSet linkedHashSet = ir.f14478v;
            if (!f10.f18596u.f239b.equals("HEAD")) {
                int i = f10.f18598w;
                if ((i >= 100 && i < 200) || i == 204 || i == 304) {
                    String c10 = f10.f18601z.c("Content-Length");
                    if (c10 != null) {
                        try {
                            parseLong = Long.parseLong(c10);
                        } catch (NumberFormatException unused) {
                        }
                        if (parseLong == -1 && !"chunked".equalsIgnoreCase(f10.f("Transfer-Encoding"))) {
                            return null;
                        }
                    }
                    parseLong = -1;
                    if (parseLong == -1) {
                        return null;
                    }
                }
                if (f10.f18598w >= 400) {
                    return f10.A.j().U();
                }
                return null;
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            if (str == null) {
                return ir.b(f(true));
            }
            return d().c(str);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        try {
            l d2 = d();
            if (i >= 0 && i < d2.f()) {
                return d2.d(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            return ir.d(d(), ir.b(f(true)));
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        if (((HttpURLConnection) this).doInput) {
            w f10 = f(false);
            if (f10.f18598w < 400) {
                return f10.A.j().U();
            }
            throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
        }
        throw new ProtocolException("This protocol does not support input");
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f14102a.N;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        er erVar = (er) e().f18584y.e;
        if (erVar != null) {
            if (erVar instanceof fr) {
                connect();
                this.f14103b.b();
            }
            if (!erVar.f14271d) {
                return erVar.f14270c;
            }
            throw new ProtocolException("cannot write request body after response has been read");
        }
        throw new ProtocolException("method does not support a request body: ".concat(String.valueOf(((HttpURLConnection) this).method)));
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        int b10;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            b10 = url.getPort();
        } else {
            b10 = n.b(url.getProtocol());
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f14102a.f18565v.address();
            host = inetSocketAddress.getHostName();
            b10 = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + ":" + b10, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f14102a.Q;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (!((HttpURLConnection) this).connected) {
            h hVar = this.f14104c;
            hVar.getClass();
            return ir.d(new l(hVar), null);
        }
        x.o("Cannot access request header fields after connection is set");
        return null;
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.f14104c.c(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return f(true).f18598w;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return f(true).f18599x;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        q qVar = this.f14102a;
        qVar.getClass();
        p pVar = new p(qVar);
        pVar.f18561v = b.c(i);
        this.f14102a = new q(pVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j10) {
        if (!((HttpURLConnection) this).connected) {
            if (((HttpURLConnection) this).chunkLength <= 0) {
                if (j10 >= 0) {
                    this.f14107g = j10;
                    ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j10, 2147483647L);
                    return;
                } else {
                    x.n("contentLength < 0");
                    return;
                }
            }
            x.o("Already in chunked mode");
            return;
        }
        x.o("Already connected");
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j10) {
        super.setIfModifiedSince(j10);
        long j11 = ((HttpURLConnection) this).ifModifiedSince;
        h hVar = this.f14104c;
        if (j11 != 0) {
            hVar.f("If-Modified-Since", ((DateFormat) ir.f14480x.get()).format(new Date(((HttpURLConnection) this).ifModifiedSince)));
        } else {
            hVar.e("If-Modified-Since");
        }
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z3) {
        q qVar = this.f14102a;
        qVar.getClass();
        p pVar = new p(qVar);
        pVar.f18559t = z3;
        this.f14102a = new q(pVar);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        q qVar = this.f14102a;
        qVar.getClass();
        p pVar = new p(qVar);
        pVar.f18562w = b.c(i);
        this.f14102a = new q(pVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        LinkedHashSet linkedHashSet = ir.f14478v;
        if (linkedHashSet.contains(str)) {
            ((HttpURLConnection) this).method = str;
            return;
        }
        throw new ProtocolException(a.l("Expected one of ", String.valueOf(linkedHashSet), " but was ", str));
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (!((HttpURLConnection) this).connected) {
            if (str != null) {
                if (str2 == null) {
                    return;
                }
                this.f14104c.f(str, str2);
                return;
            }
            q.h("field == null");
            return;
        }
        x.o("Cannot set request property after connection is made");
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.f14112m != null) {
            return true;
        }
        Proxy proxy = this.f14102a.f18565v;
        if (proxy != null && proxy.type() != Proxy.Type.DIRECT) {
            return true;
        }
        return false;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        try {
            l d2 = d();
            if (i >= 0 && i < d2.f()) {
                return d2.g(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }
}
