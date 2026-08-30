package pg;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class d extends h {
    /* JADX WARN: Type inference failed for: r1v2, types: [pg.d, java.lang.Object] */
    public static d p() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new Object();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider q() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // pg.h
    public final void e(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // pg.h
    public final void f(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) h.b(list).toArray(new String[0]));
        }
    }

    @Override // pg.h
    public final SSLContext h() {
        try {
            return SSLContext.getInstance("TLSv1.3", q());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", q());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // pg.h
    public final String i(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // pg.h
    public final X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.o(sSLSocketFactory);
        }
        try {
            Object n10 = h.n(Object.class, sSLSocketFactory, "sslParameters");
            if (n10 != null) {
                return (X509TrustManager) h.n(X509TrustManager.class, n10, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }
}
