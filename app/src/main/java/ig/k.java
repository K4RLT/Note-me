package ig;
import x.o;
import x.p;
import a0.a;
import q.x;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f18523a;

    /* renamed from: b, reason: collision with root package name */
    public final f f18524b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18525c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18526d;

    public k(a0 a0Var, f fVar, List list, List list2) {
        this.f18523a = a0Var;
        this.f18524b = fVar;
        this.f18525c = list;
        this.f18526d = list2;
    }

    public static k a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                f a10 = a(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        a0 a11 = a(protocol);
                        try {
                            certificateArr = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                            certificateArr = null;
                        }
                        if (certificateArr != null) {
                            list = jg.b.l(certificateArr);
                        } else {
                            list = Collections.EMPTY_LIST;
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            list2 = jg.b.l(localCertificates);
                        } else {
                            list2 = Collections.EMPTY_LIST;
                        }
                        return new k(a11, a10, list, list2);
                    }
                    x.p("tlsVersion == NONE");
                    return null;
                }
                x.o("tlsVersion == null");
                return null;
            }
            x.p("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            return null;
        }
        x.o("cipherSuite == null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f18523a.equals(kVar.f18523a) && this.f18524b.equals(kVar.f18524b) && this.f18525c.equals(kVar.f18525c) && this.f18526d.equals(kVar.f18526d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18526d.hashCode() + ((this.f18525c.hashCode() + ((this.f18524b.hashCode() + ((this.f18523a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
