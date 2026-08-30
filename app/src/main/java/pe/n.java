package pe;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n implements g, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public df.a f22700u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f22701v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f22702w;

    public n(df.a aVar) {
        aVar.getClass();
        this.f22700u = aVar;
        this.f22701v = w.f22712a;
        this.f22702w = this;
    }

    @Override // pe.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f22701v;
        w wVar = w.f22712a;
        if (obj2 != wVar) {
            return obj2;
        }
        synchronized (this.f22702w) {
            obj = this.f22701v;
            if (obj == wVar) {
                df.a aVar = this.f22700u;
                aVar.getClass();
                obj = aVar.invoke();
                this.f22701v = obj;
                this.f22700u = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f22701v != w.f22712a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
