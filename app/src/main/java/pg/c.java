package pg;
import b.a;

import android.os.Build;
import android.util.Log;
import ig.r;
import j.a0;
import j.i0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ya.mb;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Class f22819c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f22820d;
    public final i0 e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f22821f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f22822g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f22823h;

    public c(Class cls, i0 i0Var, i0 i0Var2, i0 i0Var3, i0 i0Var4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f22823h = new a0(method3, method2, method);
        this.f22819c = cls;
        this.f22820d = i0Var;
        this.e = i0Var2;
        this.f22821f = i0Var3;
        this.f22822g = i0Var4;
    }

    public static boolean p(Class cls, Object obj, String str) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // pg.h
    public final mb c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // pg.h
    public final rg.d d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new rg.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.f, java.lang.Object] */
    @Override // pg.h
    public final void f(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f22820d.x(sSLSocket, Boolean.TRUE);
            this.e.x(sSLSocket, str);
        }
        i0 i0Var = this.f22822g;
        if (i0Var != null && i0Var.p(sSLSocket.getClass()) != null) {
            Object obj = new Object();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                r rVar = (r) list.get(i);
                if (rVar != r.HTTP_1_0) {
                    obj.H(rVar.f18575u.length());
                    String str2 = rVar.f18575u;
                    obj.N(str2, 0, str2.length());
                }
            }
            try {
                i0Var.w(sSLSocket, obj.o(obj.f25274v));
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
                AssertionError assertionError = new AssertionError("Unexpected exception");
                assertionError.initCause(targetException);
                throw assertionError;
            }
        }
    }

    @Override // pg.h
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (jg.b.n(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e8);
                throw iOException;
            }
            throw e8;
        } catch (SecurityException e10) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e10);
            throw iOException2;
        }
    }

    @Override // pg.h
    public final SSLContext h() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // pg.h
    public final String i(SSLSocket sSLSocket) {
        i0 i0Var = this.f22821f;
        if (i0Var == null || i0Var.p(sSLSocket.getClass()) == null) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) i0Var.w(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, jg.b.f19202d);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // pg.h
    public final Object j() {
        a0 a0Var = this.f22823h;
        Method method = a0Var.f18612a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                a0Var.f18613b.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // pg.h
    public final boolean k(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return p(cls, cls.getMethod("getInstance", null).invoke(null, null), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw jg.a(e, "unable to determine cleartext support");
        } catch (IllegalArgumentException e8) {
            e = e8;
            throw jg.a(e, "unable to determine cleartext support");
        } catch (InvocationTargetException e10) {
            e = e10;
            throw jg.a(e, "unable to determine cleartext support");
        }
    }

    @Override // pg.h
    public final void l(int i, String str, Throwable th) {
        int min;
        int i10 = 5;
        if (i != 5) {
            i10 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int indexOf = str.indexOf(10, i11);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i11 + 4000);
                Log.println(i10, "OkHttp", str.substring(i11, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i11 = min;
                }
            }
            i11 = min + 1;
        }
    }

    @Override // pg.h
    public final void m(Object obj, String str) {
        a0 a0Var = this.f22823h;
        a0Var.getClass();
        if (obj != null) {
            try {
                a0Var.f18614c.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        l(5, str, null);
    }

    @Override // pg.h
    public final X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        Object n10 = h.n(this.f22819c, sSLSocketFactory, "sslParameters");
        if (n10 == null) {
            try {
                n10 = h.n(Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), sSLSocketFactory, "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.o(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) h.n(X509TrustManager.class, n10, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) h.n(X509TrustManager.class, n10, "trustManager");
    }
}