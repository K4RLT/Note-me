package ig;
import x.n;
import b.b;
import n.g;
import q.h;
import q.x;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n f18445a;

    /* renamed from: b, reason: collision with root package name */
    public final b f18446b;

    /* renamed from: c, reason: collision with root package name */
    public final SocketFactory f18447c;

    /* renamed from: d, reason: collision with root package name */
    public final b f18448d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18449f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f18450g;

    /* renamed from: h, reason: collision with root package name */
    public final Proxy f18451h;
    public final SSLSocketFactory i;

    /* renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f18452j;

    /* renamed from: k, reason: collision with root package name */
    public final d f18453k;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        m mVar = new m();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (str2.equalsIgnoreCase("http")) {
            mVar.f18528a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            mVar.f18528a = "https";
        } else {
            x.n("unexpected scheme: ".concat(str2));
            throw null;
        }
        if (str != null) {
            String b10 = jg.b(g(str, false, 0, str.length()));
            if (b10 != null) {
                mVar.f18531d = b10;
                if (i > 0 && i <= 65535) {
                    mVar.e = i;
                    this.f18445a = mVar.a();
                    if (bVar != null) {
                        this.f18446b = bVar;
                        if (socketFactory != null) {
                            this.f18447c = socketFactory;
                            if (bVar2 != null) {
                                this.f18448d = bVar2;
                                if (list != null) {
                                    this.e = Collections.unmodifiableList(new ArrayList(list));
                                    if (list2 != null) {
                                        this.f18449f = Collections.unmodifiableList(new ArrayList(list2));
                                        if (proxySelector != null) {
                                            this.f18450g = proxySelector;
                                            this.f18451h = proxy;
                                            this.i = sSLSocketFactory;
                                            this.f18452j = hostnameVerifier;
                                            this.f18453k = dVar;
                                            return;
                                        }
                                        g5.h("proxySelector == null");
                                        throw null;
                                    }
                                    g5.h("connectionSpecs == null");
                                    throw null;
                                }
                                g5.h("protocols == null");
                                throw null;
                            }
                            g5.h("proxyAuthenticator == null");
                            throw null;
                        }
                        g5.h("socketFactory == null");
                        throw null;
                    }
                    g5.h("dns == null");
                    throw null;
                }
                x.n(g3.a.g(i, "unexpected port: "));
                throw null;
            }
            x.n("unexpected host: ".concat(str));
            throw null;
        }
        g5.h("host == null");
        throw null;
    }

    public final boolean a(a aVar) {
        if (this.f18446b.equals(aVar.f18446b) && this.f18448d.equals(aVar.f18448d) && this.e.equals(aVar.e) && this.f18449f.equals(aVar.f18449f) && this.f18450g.equals(aVar.f18450g) && jg.b.j(this.f18451h, aVar.f18451h) && jg.b.j(this.i, aVar.i) && jg.b.j(this.f18452j, aVar.f18452j) && jg.b.j(this.f18453k, aVar.f18453k) && this.f18445a.e == aVar.f18445a.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f18445a.equals(aVar.f18445a) && a(aVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10;
        int i11;
        int hashCode = (this.f18450g.hashCode() + ((this.f18449f.hashCode() + ((this.e.hashCode() + ((this.f18448d.hashCode() + ((this.f18446b.hashCode() + g3.a.e(this.f18445a.f18541h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i12 = 0;
        Proxy proxy = this.f18451h;
        if (proxy != null) {
            i = proxy.hashCode();
        } else {
            i = 0;
        }
        int i13 = (hashCode + i) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        if (sSLSocketFactory != null) {
            i10 = sSLSocketFactory.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        HostnameVerifier hostnameVerifier = this.f18452j;
        if (hostnameVerifier != null) {
            i11 = hostnameVerifier.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        d dVar = this.f18453k;
        if (dVar != null) {
            i12 = dVar.hashCode();
        }
        return i15 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        n nVar = this.f18445a;
        sb2.append(nVar.f18538d);
        sb2.append(":");
        sb2.append(nVar.e);
        Proxy proxy = this.f18451h;
        if (proxy != null) {
            sb2.append(", proxy=");
            sb2.append(proxy);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f18450g);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
