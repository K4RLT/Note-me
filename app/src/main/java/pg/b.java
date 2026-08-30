package pg;
import b.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements rg.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f22817a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22818b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f22818b = method;
        this.f22817a = x509TrustManager;
    }

    @Override // rg.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f22818b.invoke(this.f22817a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e) {
            throw jg.a(e, "unable to get issues and signature");
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f22817a.equals(bVar.f22817a) && this.f22818b.equals(bVar.f22818b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f22818b.hashCode() * 31) + this.f22817a.hashCode();
    }
}
