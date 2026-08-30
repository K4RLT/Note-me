package mg;
import f.c;
import f.d;

import ig.n;
import ig.o;
import ig.q;
import ig.u;
import ig.v;
import ig.w;
import java.io.IOException;
import java.net.ProtocolException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import q.x;

/* loaded from: classes.dex */
public final class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final q f20826a;

    /* renamed from: b, reason: collision with root package name */
    public volatile lg.e f20827b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20828c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f20829d;

    public f(q qVar) {
        this.f20826a = qVar;
    }

    public static boolean e(w wVar, n nVar) {
        n nVar2 = (n) wVar.f18596u.f240c;
        if (nVar2.f18538d.equals(nVar.f18538d) && nVar2.e == nVar.e && nVar2.f18535a.equals(nVar.f18535a)) {
            return true;
        }
        return false;
    }

    @Override // ig.o
    public final w a(e eVar) {
        w b10;
        b bVar;
        a4.b bVar2 = eVar.f20820f;
        u uVar = eVar.f20821g;
        ig.b bVar3 = eVar.f20822h;
        lg.e eVar2 = new lg.e(this.f20826a.K, b((n) bVar2.f240c), uVar, bVar3, this.f20828c);
        this.f20827b = eVar2;
        lg.e eVar3 = eVar2;
        int i = 0;
        w wVar = null;
        a4.b bVar4 = bVar2;
        while (!this.f20829d) {
            try {
                try {
                    try {
                        b10 = eVar.b(bVar4, eVar3, null, null);
                        if (wVar != null) {
                            v j10 = b10.j();
                            v j11 = wVar.j();
                            j11.f18591g = null;
                            w a10 = j11.a();
                            if (a10.A == null) {
                                j10.f18593j = a10;
                                b10 = j10.a();
                            } else {
                                x.n("priorResponse.body != null");
                                return null;
                            }
                        }
                    } catch (IOException e) {
                        if (!d(e, eVar3, !(e instanceof og.a), bVar4)) {
                            throw e;
                        }
                    }
                } catch (lg.c e8) {
                    if (!d(e8.f20385v, eVar3, false, bVar4)) {
                        throw e8.f20384u;
                    }
                }
                try {
                    a4.b c10 = c(b10, eVar3.f20389c);
                    if (c10 == null) {
                        eVar3.f();
                        return b10;
                    }
                    jg.b.d(b10.A);
                    int i10 = i + 1;
                    if (i10 <= 20) {
                        if (!e(b10, (n) c10.f240c)) {
                            eVar3.f();
                            lg.e eVar4 = new lg.e(this.f20826a.K, b((n) c10.f240c), uVar, bVar3, this.f20828c);
                            this.f20827b = eVar4;
                            eVar3 = eVar4;
                        } else {
                            synchronized (eVar3.f20390d) {
                                bVar = eVar3.f20398n;
                            }
                            if (bVar != null) {
                                l4.a.j("Closing the body of ", b10, " didn't close its backing stream. Bad interceptor?");
                                return null;
                            }
                        }
                        wVar = b10;
                        bVar4 = c10;
                        i = i10;
                    } else {
                        eVar3.f();
                        throw new ProtocolException(g3.a.g(i10, "Too many follow-up requests: "));
                    }
                } catch (IOException e10) {
                    eVar3.f();
                    throw e10;
                }
            } catch (Throwable th) {
                eVar3.g(null);
                eVar3.f();
                throw th;
            }
        }
        eVar3.f();
        x.p("Canceled");
        return null;
    }

    public final ig.a b(n nVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ig.d dVar;
        boolean equals = nVar.f18535a.equals("https");
        q qVar = this.f20826a;
        if (equals) {
            sSLSocketFactory = qVar.E;
            hostnameVerifier = qVar.G;
            dVar = qVar.H;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            dVar = null;
        }
        return new ig.a(nVar.f18538d, nVar.e, qVar.L, qVar.D, sSLSocketFactory, hostnameVerifier, dVar, qVar.I, qVar.f18565v, qVar.f18566w, qVar.f18567x, qVar.B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ae, code lost:
    
        if (r3.equals("HEAD") == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a4.b c(ig.w r13, ig.z r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c(ig.w, ig.z):a4.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r4 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.io.IOException r2, lg.e r3, boolean r4, a4.b r5) {
        /*
            r1 = this;
            r3.g(r2)
            ig.q r5 = r1.f20826a
            boolean r5 = r5.O
            r0 = 0
            if (r5 != 0) goto Lb
            goto L27
        Lb:
            boolean r5 = r2 instanceof java.net.ProtocolException
            if (r5 == 0) goto L10
            return r0
        L10:
            boolean r5 = r2 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L1b
            boolean r2 = r2 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto L27
            if (r4 != 0) goto L27
            goto L2d
        L1b:
            boolean r4 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L28
            java.lang.Throwable r4 = r2.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L28
        L27:
            return r0
        L28:
            boolean r2 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L2d
            return r0
        L2d:
            ig.z r2 = r3.f20389c
            if (r2 != 0) goto L5b
            com.google.android.gms.internal.ads.ad r2 = r3.f20388b
            if (r2 == 0) goto L40
            int r4 = r2.f4459b
            java.util.ArrayList r2 = r2.f4458a
            int r2 = r2.size()
            if (r4 >= r2) goto L40
            goto L5b
        L40:
            com.google.android.gms.internal.ads.dr r2 = r3.f20393h
            int r3 = r2.f5483b
            java.lang.Object r4 = r2.e
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            if (r3 >= r4) goto L4f
            goto L5b
        L4f:
            java.lang.Object r2 = r2.f5487g
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5a
            goto L5b
        L5a:
            return r0
        L5b:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d(java.io.IOException, lg.e, boolean, a4.b):boolean");
    }
}
