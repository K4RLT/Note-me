package lg;
import c.a;
import c.c;
import d.b;

import b2.t;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import ig.g;
import ig.i;
import ig.k;
import ig.l;
import ig.q;
import ig.r;
import ig.v;
import ig.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import og.f;
import og.n;
import og.w;
import pg.h;
import q.x;
import sg.m;
import sg.s;

/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: b, reason: collision with root package name */
    public final g f20372b;

    /* renamed from: c, reason: collision with root package name */
    public final z f20373c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f20374d;
    public Socket e;

    /* renamed from: f, reason: collision with root package name */
    public k f20375f;

    /* renamed from: g, reason: collision with root package name */
    public r f20376g;

    /* renamed from: h, reason: collision with root package name */
    public og.r f20377h;
    public sg.n i;

    /* renamed from: j, reason: collision with root package name */
    public m f20378j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20379k;

    /* renamed from: l, reason: collision with root package name */
    public int f20380l;

    /* renamed from: m, reason: collision with root package name */
    public int f20381m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f20382n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f20383o = Long.MAX_VALUE;

    public b(g gVar, z zVar) {
        this.f20372b = gVar;
        this.f20373c = zVar;
    }

    @Override // og.n
    public final void a(og.r rVar) {
        synchronized (this.f20372b) {
            this.f20381m = rVar.m();
        }
    }

    @Override // og.n
    public final void b(w wVar) {
        wVar.c(5);
    }

    public final void c(int i, int i10, int i11, boolean z3, ig.b bVar) {
        boolean z9;
        if (this.f20376g == null) {
            ig.a aVar = this.f20373c.f18605a;
            List list = aVar.f18449f;
            js jsVar = new js(list);
            if (aVar.i == null) {
                if (list.contains(i.f18507f)) {
                    String str = this.f20373c.f18605a.f18445a.f18538d;
                    if (!h.f22833a.k(str)) {
                        throw new c(new UnknownServiceException(p.a.k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new c(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (aVar.e.contains(r.H2_PRIOR_KNOWLEDGE)) {
                throw new c(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            c cVar = null;
            while (true) {
                try {
                    z zVar = this.f20373c;
                    if (zVar.f18605a.i != null && zVar.f18606b.type() == Proxy.Type.HTTP) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        e(i, i10, i11, bVar);
                        if (this.f20374d == null) {
                            break;
                        }
                    } else {
                        d(i, i10, bVar);
                    }
                    f(jsVar, bVar);
                    InetSocketAddress inetSocketAddress = this.f20373c.f18607c;
                    bVar.getClass();
                    break;
                } catch (IOException e) {
                    jg.b.e(this.e);
                    jg.b.e(this.f20374d);
                    this.e = null;
                    this.f20374d = null;
                    this.i = null;
                    this.f20378j = null;
                    this.f20375f = null;
                    this.f20376g = null;
                    this.f20377h = null;
                    InetSocketAddress inetSocketAddress2 = this.f20373c.f18607c;
                    bVar.getClass();
                    if (cVar == null) {
                        cVar = new c(e);
                    } else {
                        IOException iOException = cVar.f20384u;
                        Method method = jg.b.f19204g;
                        if (method != null) {
                            try {
                                method.invoke(iOException, e);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                        cVar.f20385v = e;
                    }
                    if (z3) {
                        jsVar.f7522c = true;
                        if (jsVar.f7521b) {
                            if (!(e instanceof ProtocolException)) {
                                if (!(e instanceof InterruptedIOException)) {
                                    boolean z10 = e instanceof SSLHandshakeException;
                                    if (!z10 || !(e.getCause() instanceof CertificateException)) {
                                        if (!(e instanceof SSLPeerUnverifiedException)) {
                                            if (!z10) {
                                                if (e instanceof SSLProtocolException) {
                                                    continue;
                                                } else if (!(e instanceof SSLException)) {
                                                    throw cVar;
                                                }
                                            }
                                        } else {
                                            throw cVar;
                                        }
                                    } else {
                                        throw cVar;
                                    }
                                } else {
                                    throw cVar;
                                }
                            } else {
                                throw cVar;
                            }
                        } else {
                            throw cVar;
                        }
                    } else {
                        throw cVar;
                    }
                }
            }
            z zVar2 = this.f20373c;
            if (zVar2.f18605a.i != null && zVar2.f18606b.type() == Proxy.Type.HTTP && this.f20374d == null) {
                throw new c(new ProtocolException("Too many tunnel connections attempted: 21"));
            }
            if (this.f20377h != null) {
                synchronized (this.f20372b) {
                    this.f20381m = this.f20377h.m();
                }
                return;
            }
            return;
        }
        x.o("already connected");
    }

    public final void d(int i, int i10, ig.b bVar) {
        Socket createSocket;
        z zVar = this.f20373c;
        Proxy proxy = zVar.f18606b;
        InetSocketAddress inetSocketAddress = zVar.f18607c;
        ig.a aVar = zVar.f18605a;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = aVar.f18447c.createSocket();
        }
        this.f20374d = createSocket;
        bVar.getClass();
        this.f20374d.setSoTimeout(i10);
        try {
            h.f22833a.g(this.f20374d, inetSocketAddress, i);
            try {
                Socket socket = this.f20374d;
                socket.getClass();
                s sVar = new s(socket);
                InputStream inputStream = socket.getInputStream();
                inputStream.getClass();
                this.i = new sg.n(new sg.c(sVar, new sg.c(inputStream, sVar)));
                Socket socket2 = this.f20374d;
                socket2.getClass();
                s sVar2 = new s(socket2);
                OutputStream outputStream = socket2.getOutputStream();
                outputStream.getClass();
                this.f20378j = new m(new sg.b(sVar2, new sg.b(outputStream, sVar2)));
            } catch (NullPointerException e) {
                if (!"throw with null exception".equals(e.getMessage())) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e8);
            throw connectException;
        }
    }

    public final void e(int i, int i10, int i11, ig.b bVar) {
        u0 u0Var = new u0();
        z zVar = this.f20373c;
        ig.a aVar = zVar.f18605a;
        ig.a aVar2 = zVar.f18605a;
        ig.n nVar = aVar.f18445a;
        if (nVar != null) {
            u0Var.f15036v = nVar;
            u0Var.m("CONNECT", null);
            ((f4.h) u0Var.f15038x).f("Host", jg.b.k(aVar2.f18445a, true));
            ((f4.h) u0Var.f15038x).f("Proxy-Connection", "Keep-Alive");
            ((f4.h) u0Var.f15038x).f("User-Agent", "okhttp/3.12.1");
            a4.b f10 = u0Var.f();
            v vVar = new v();
            vVar.f18586a = f10;
            vVar.f18587b = r.HTTP_1_1;
            vVar.f18588c = 407;
            vVar.f18589d = "Preemptive Authenticate";
            vVar.f18591g = jg.b.f19201c;
            vVar.f18594k = -1L;
            vVar.f18595l = -1L;
            vVar.f18590f.f("Proxy-Authenticate", "OkHttp-Preemptive");
            vVar.a();
            aVar2.f18448d.getClass();
            ig.n nVar2 = (ig.n) f10.f240c;
            d(i, i10, bVar);
            String str = "CONNECT " + jg.b.k(nVar2, true) + " HTTP/1.1";
            sg.n nVar3 = this.i;
            m2.a aVar3 = new m2.a((q) null, (e) null, nVar3, this.f20378j);
            nVar3.f25297w.a().g(i10);
            this.f20378j.f25294w.a().g(i11);
            aVar3.p((l) f10.f241d, str);
            aVar3.a();
            v d2 = aVar3.d(false);
            d2.f18586a = f10;
            ig.w a10 = d2.a();
            int i12 = a10.f18598w;
            long a11 = mg.a(a10);
            if (a11 == -1) {
                a11 = 0;
            }
            ng.e k3 = aVar3.k(a11);
            jg.b.p(k3, Integer.MAX_VALUE);
            k3.close();
            if (i12 != 200) {
                if (i12 == 407) {
                    aVar2.f18448d.getClass();
                    x.p("Failed to authenticate with proxy");
                    return;
                } else {
                    x.p(g3.a.g(i12, "Unexpected response code for CONNECT: "));
                    return;
                }
            }
            if (this.i.f25296v.j() && this.f20378j.f25292u.j()) {
                return;
            }
            x.p("TLS tunnel buffered too many bytes!");
            return;
        }
        g5.q.h("url == null");
    }

    public final void f(js jsVar, ig.b bVar) {
        String str;
        SSLSocket sSLSocket;
        z zVar = this.f20373c;
        ig.a aVar = zVar.f18605a;
        SSLSocketFactory sSLSocketFactory = aVar.i;
        r rVar = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.e;
            r rVar2 = r.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(rVar2);
            Socket socket = this.f20374d;
            if (contains) {
                this.e = socket;
                this.f20376g = rVar2;
                i();
                return;
            } else {
                this.e = socket;
                this.f20376g = rVar;
                return;
            }
        }
        bVar.getClass();
        ig.a aVar2 = zVar.f18605a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.i;
        ig.n nVar = aVar2.f18445a;
        SSLSocket sSLSocket2 = null;
        String str2 = null;
        try {
            try {
                Socket socket2 = this.f20374d;
                str = nVar.f18538d;
                sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(socket2, str, nVar.e, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (AssertionError e) {
            e = e;
        }
        try {
            boolean z3 = jsVar.e(sSLSocket).f18509b;
            if (z3) {
                h.f22833a.f(sSLSocket, str, aVar2.e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            k a10 = k.a(session);
            List list2 = a10.f18525c;
            if (aVar2.f18452j.verify(str, session)) {
                aVar2.f18453k.a(str, list2);
                if (z3) {
                    str2 = h.f22833a.i(sSLSocket);
                }
                this.e = sSLSocket;
                s sVar = new s(sSLSocket);
                InputStream inputStream = sSLSocket.getInputStream();
                inputStream.getClass();
                this.i = new sg.n(new sg.c(sVar, new sg.c(inputStream, sVar)));
                Socket socket3 = this.e;
                socket3.getClass();
                s sVar2 = new s(socket3);
                OutputStream outputStream = socket3.getOutputStream();
                outputStream.getClass();
                this.f20378j = new m(new sg.b(sVar2, new sg.b(outputStream, sVar2)));
                this.f20375f = a10;
                if (str2 != null) {
                    rVar = r.a(str2);
                }
                this.f20376g = rVar;
                h.f22833a.a(sSLSocket);
                if (this.f20376g == r.HTTP_2) {
                    i();
                    return;
                }
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + ig.d.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + rg.a(x509Certificate));
        } catch (AssertionError e8) {
            e = e8;
            if (jg.b.n(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                h.f22833a.a(sSLSocket2);
            }
            jg.b.e(sSLSocket2);
            throw th;
        }
    }

    public final boolean g(ig.a aVar, z zVar) {
        if (this.f20382n.size() < this.f20381m && !this.f20379k) {
            ig.b bVar = ig.b.e;
            z zVar2 = this.f20373c;
            ig.a aVar2 = zVar2.f18605a;
            bVar.getClass();
            boolean a10 = aVar2.a(aVar);
            ig.n nVar = aVar.f18445a;
            if (a10) {
                if (nVar.f18538d.equals(zVar2.f18605a.f18445a.f18538d)) {
                    return true;
                }
                if (this.f20377h != null && zVar != null) {
                    Proxy.Type type = zVar.f18606b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && zVar2.f18606b.type() == type2 && zVar2.f18607c.equals(zVar.f18607c) && zVar.f18605a.f18452j == rg.c.f24824a && j(nVar)) {
                        try {
                            aVar.f18453k.a(nVar.f18538d, this.f20375f.f18525c);
                            return true;
                        } catch (SSLPeerUnverifiedException unused) {
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final mg.b h(q qVar, mg.e eVar, e eVar2) {
        int i = eVar.f20823j;
        if (this.f20377h != null) {
            return new og.h(qVar, eVar, eVar2, this.f20377h);
        }
        this.e.setSoTimeout(i);
        this.i.f25297w.a().g(i);
        this.f20378j.f25294w.a().g(eVar.f20824k);
        return new m2.a(qVar, eVar2, this.i, this.f20378j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c0.z, java.lang.Object] */
    public final void i() {
        boolean z3;
        int i;
        this.e.setSoTimeout(0);
        Object obj = new Object();
        obj.f3441z = n.f22029a;
        obj.f3436u = true;
        Socket socket = this.e;
        String str = this.f20373c.f18605a.f18445a.f18538d;
        sg.n nVar = this.i;
        m mVar = this.f20378j;
        obj.f3437v = socket;
        obj.f3438w = str;
        obj.f3439x = nVar;
        obj.f3440y = mVar;
        obj.f3441z = this;
        og.r rVar = new og.r(obj);
        this.f20377h = rVar;
        og.x xVar = rVar.L;
        synchronized (xVar) {
            try {
                if (!xVar.f22078y) {
                    if (xVar.f22075v) {
                        Logger logger = og.x.A;
                        if (logger.isLoggable(Level.FINE)) {
                            String c10 = f.f22002a.c();
                            byte[] bArr = jg.b.f19199a;
                            Locale locale = Locale.US;
                            logger.fine(">> CONNECTION " + c10);
                        }
                        sg.g gVar = xVar.f22074u;
                        sg.h hVar = f.f22002a;
                        hVar.getClass();
                        char[] cArr = tg.a.f25759a;
                        byte[] bArr2 = hVar.f25279w;
                        gVar.write(Arrays.copyOf(bArr2, bArr2.length));
                        xVar.f22074u.flush();
                    }
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        og.x xVar2 = rVar.L;
        t tVar = rVar.H;
        synchronized (xVar2) {
            try {
                if (!xVar2.f22078y) {
                    xVar2.k(0, Integer.bitCount(tVar.f1592a) * 6, (byte) 4, (byte) 0);
                    for (int i10 = 0; i10 < 10; i10++) {
                        if (((1 << i10) & tVar.f1592a) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i10 == 4) {
                                i = 3;
                            } else if (i10 == 7) {
                                i = 4;
                            } else {
                                i = i10;
                            }
                            xVar2.f22074u.writeShort(i);
                            xVar2.f22074u.writeInt(tVar.f1593b[i10]);
                        }
                    }
                    xVar2.f22074u.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        if (rVar.H.b() != 65535) {
            rVar.L.w(0, r0 - 65535);
        }
        new Thread(rVar.M).start();
    }

    public final boolean j(ig.n nVar) {
        int i = nVar.e;
        String str = nVar.f18538d;
        ig.n nVar2 = this.f20373c.f18605a.f18445a;
        if (i == nVar2.e) {
            if (!str.equals(nVar2.f18538d)) {
                k kVar = this.f20375f;
                if (kVar != null && rg.c(str, (X509Certificate) kVar.f18525c.get(0))) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        z zVar = this.f20373c;
        sb2.append(zVar.f18605a.f18445a.f18538d);
        sb2.append(":");
        sb2.append(zVar.f18605a.f18445a.e);
        sb2.append(", proxy=");
        sb2.append(zVar.f18606b);
        sb2.append(" hostAddress=");
        sb2.append(zVar.f18607c);
        sb2.append(" cipherSuite=");
        k kVar = this.f20375f;
        if (kVar != null) {
            obj = kVar.f18524b;
        } else {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f20376g);
        sb2.append('}');
        return sb2.toString();
    }
}