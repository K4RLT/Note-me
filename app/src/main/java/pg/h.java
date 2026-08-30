package pg;

import ig.q;
import ig.r;
import j.i0;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ya.mb;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f22833a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f22834b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [pg.h] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [pg.d] */
    static {
        Object r52;
        Class<?> cls;
        boolean equals;
        i0 i0Var;
        i0 i0Var2;
        Class<byte[]> cls2 = byte[].class;
        g gVar = null;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls3 = cls;
            int i = 13;
            i0 i0Var3 = new i0(i, gVar, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            i0 i0Var4 = new i0(i, gVar, "setHostname", new Class[]{String.class});
            if (Security.getProvider("GMSCore_OpenSSL") == null) {
                try {
                    Class.forName("android.net.Network");
                } catch (ClassNotFoundException unused2) {
                    i0Var = null;
                    i0Var2 = null;
                }
            }
            i0 i0Var5 = new i0(i, cls2, "getAlpnSelectedProtocol", new Class[0]);
            i0Var2 = new i0(i, gVar, "setAlpnProtocols", new Class[]{byte[].class});
            i0Var = i0Var5;
            r52 = new c(cls3, i0Var3, i0Var4, i0Var, i0Var2);
        } catch (ClassNotFoundException unused3) {
            r52 = 0;
        }
        if (r52 == 0) {
            if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
                equals = true;
            } else {
                equals = "Conscrypt".equals(Security.getProviders()[0].getName());
            }
            if (!equals || (r52 = d.p()) == 0) {
                try {
                    r52 = new e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused4) {
                    r52 = 0;
                }
                if (r52 == 0) {
                    try {
                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        gVar = new g(cls4.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls4.getMethod("get", SSLSocket.class), cls4.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    if (gVar != null) {
                        r52 = gVar;
                    } else {
                        r52 = new Object();
                    }
                }
            }
        }
        f22833a = r52;
        f22834b = Logger.getLogger(q.class.getName());
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r rVar = (r) list.get(i);
            if (rVar != r.HTTP_1_0) {
                arrayList.add(rVar.f18575u);
            }
        }
        return arrayList;
    }

    public static Object n(Class cls, Object obj, String str) {
        Object n10;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (!str.equals("delegate") && (n10 = n(Object.class, obj, "delegate")) != null) {
            return n(cls, n10, str);
        }
        return null;
    }

    public mb c(X509TrustManager x509TrustManager) {
        return new rg.a(d(x509TrustManager));
    }

    public rg.d d(X509TrustManager x509TrustManager) {
        return new rg.b(x509TrustManager.getAcceptedIssuers());
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext h() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public String i(SSLSocket sSLSocket) {
        return null;
    }

    public Object j() {
        if (f22834b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean k(String str) {
        return true;
    }

    public void l(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f22834b.log(level, str, th);
    }

    public void m(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        l(5, str, (Throwable) obj);
    }

    public X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        try {
            Object n10 = n(Class.forName("sun.security.ssl.SSLContextImpl"), sSLSocketFactory, "context");
            if (n10 != null) {
                return (X509TrustManager) n(X509TrustManager.class, n10, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public void f(SSLSocket sSLSocket, String str, List list) {
    }
}