package pg;

import g5.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import ya.mb;

/* loaded from: classes.dex */
public final class a extends mb {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22815a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22816b;

    public a(Object obj, Method method) {
        this.f22815a = obj;
        this.f22816b = method;
    }

    @Override // ya.mb
    public final List a(String str, List list) {
        try {
            return (List) this.f22816b.invoke(this.f22815a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            q.f(e);
            return null;
        } catch (InvocationTargetException e8) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e8.getMessage());
            sSLPeerUnverifiedException.initCause(e8);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return 0;
    }
}
