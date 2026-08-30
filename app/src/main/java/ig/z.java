package ig;
import q.h;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final a f18605a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f18606b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f18607c;

    public z(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar != null) {
            if (inetSocketAddress != null) {
                this.f18605a = aVar;
                this.f18606b = proxy;
                this.f18607c = inetSocketAddress;
                return;
            }
            g5.h("inetSocketAddress == null");
            throw null;
        }
        g5.h("address == null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (zVar.f18605a.equals(this.f18605a) && zVar.f18606b.equals(this.f18606b) && zVar.f18607c.equals(this.f18607c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18607c.hashCode() + ((this.f18606b.hashCode() + ((this.f18605a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f18607c + "}";
    }
}
