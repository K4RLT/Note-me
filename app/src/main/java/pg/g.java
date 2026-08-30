package pg;
import b.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Method f22829c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22830d;
    public final Method e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f22831f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f22832g;

    public g(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f22829c = method;
        this.f22830d = method2;
        this.e = method3;
        this.f22831f = cls;
        this.f22832g = cls2;
    }

    @Override // pg.h
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw jg.a(e, "unable to remove alpn");
        }
    }

    @Override // pg.h
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f22829c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f22831f, this.f22832g}, new f(h.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw jg.a(e, "unable to set alpn");
        }
    }

    @Override // pg.h
    public final String i(SSLSocket sSLSocket) {
        try {
            f fVar = (f) Proxy.getInvocationHandler(this.f22830d.invoke(null, sSLSocket));
            boolean z3 = fVar.f22827b;
            if (!z3 && fVar.f22828c == null) {
                h.f22833a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z3) {
                return null;
            }
            return fVar.f22828c;
        } catch (IllegalAccessException e) {
            e = e;
            throw jg.a(e, "unable to get selected protocol");
        } catch (InvocationTargetException e8) {
            e = e8;
            throw jg.a(e, "unable to get selected protocol");
        }
    }
}
