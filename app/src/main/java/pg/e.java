package pg;
import b.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Method f22824c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22825d;

    public e(Method method, Method method2) {
        this.f22824c = method;
        this.f22825d = method2;
    }

    @Override // pg.h
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b10 = h.b(list);
            this.f22824c.invoke(sSLParameters, b10.toArray(new String[b10.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw jg.a(e, "unable to set ssl parameters");
        }
    }

    @Override // pg.h
    public final String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f22825d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw jg.a(e, "unable to get selected protocols");
        }
    }

    @Override // pg.h
    public final X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
