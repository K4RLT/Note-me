package ig;
import b.a;
import q.m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ya.mb;

/* loaded from: classes.dex */
public final class q implements Cloneable {
    public static final List S = jg.b.l(r.HTTP_2, r.HTTP_1_1);
    public static final List T = jg.b.l(i.e, i.f18507f);
    public final b A;
    public final ProxySelector B;
    public final b C;
    public final SocketFactory D;
    public final SSLSocketFactory E;
    public final mb F;
    public final HostnameVerifier G;
    public final d H;
    public final b I;
    public final b J;
    public final g K;
    public final b L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int P;
    public final int Q;
    public final int R;

    /* renamed from: u, reason: collision with root package name */
    public final nd.o f18564u;

    /* renamed from: v, reason: collision with root package name */
    public final Proxy f18565v;

    /* renamed from: w, reason: collision with root package name */
    public final List f18566w;

    /* renamed from: x, reason: collision with root package name */
    public final List f18567x;

    /* renamed from: y, reason: collision with root package name */
    public final List f18568y;

    /* renamed from: z, reason: collision with root package name */
    public final List f18569z;

    /* JADX WARN: Type inference failed for: r0v6, types: [ig.b, java.lang.Object] */
    static {
        b.e = new Object();
    }

    public q(p pVar) {
        boolean z3;
        this.f18564u = pVar.f18542a;
        this.f18565v = pVar.f18543b;
        this.f18566w = pVar.f18544c;
        List list = pVar.f18545d;
        this.f18567x = list;
        this.f18568y = Collections.unmodifiableList(new ArrayList(pVar.e));
        this.f18569z = Collections.unmodifiableList(new ArrayList(pVar.f18546f));
        this.A = pVar.f18547g;
        this.B = pVar.f18548h;
        this.C = pVar.i;
        this.D = pVar.f18549j;
        Iterator it = list.iterator();
        loop0: while (true) {
            z3 = false;
            while (it.hasNext()) {
                z3 = (z3 || ((i) it.next()).f18508a) ? true : z3;
            }
        }
        SSLSocketFactory sSLSocketFactory = pVar.f18550k;
        if (sSLSocketFactory == null && z3) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            pg.h hVar = pg.h.f22833a;
                            SSLContext h3 = hVar.h();
                            h3.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.E = h3.getSocketFactory();
                            this.F = hVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw jg.a(e, "No System TLS");
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e8) {
                throw jg.a(e8, "No System TLS");
            }
        }
        this.E = sSLSocketFactory;
        this.F = pVar.f18551l;
        SSLSocketFactory sSLSocketFactory2 = this.E;
        if (sSLSocketFactory2 != null) {
            pg.h.f22833a.e(sSLSocketFactory2);
        }
        this.G = pVar.f18552m;
        d dVar = pVar.f18553n;
        mb mbVar = this.F;
        this.H = jg.b.j(dVar.f18477b, mbVar) ? dVar : new d(dVar.f18476a, mbVar);
        this.I = pVar.f18554o;
        this.J = pVar.f18555p;
        this.K = pVar.f18556q;
        this.L = pVar.f18557r;
        this.M = pVar.f18558s;
        this.N = pVar.f18559t;
        this.O = pVar.f18560u;
        this.P = pVar.f18561v;
        this.Q = pVar.f18562w;
        this.R = pVar.f18563x;
        if (!this.f18568y.contains(null)) {
            if (!this.f18569z.contains(null)) {
                return;
            }
            g5.m(this.f18569z, "Null network interceptor: ");
            throw null;
        }
        g5.m(this.f18568y, "Null interceptor: ");
        throw null;
    }
}
