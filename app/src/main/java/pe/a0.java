package pe;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a0 implements g, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public df.a f22683u;

    /* renamed from: v, reason: collision with root package name */
    public Object f22684v;

    @Override // pe.g
    public final Object getValue() {
        if (this.f22684v == w.f22712a) {
            df.a aVar = this.f22683u;
            aVar.getClass();
            this.f22684v = aVar.invoke();
            this.f22683u = null;
        }
        return this.f22684v;
    }

    public final String toString() {
        if (this.f22684v != w.f22712a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
