package yb;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements d, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final d f31632u;

    /* renamed from: v, reason: collision with root package name */
    public volatile transient boolean f31633v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object f31634w;

    public e(d dVar) {
        this.f31632u = dVar;
    }

    @Override // yb.d
    public final Object get() {
        if (!this.f31633v) {
            synchronized (this) {
                try {
                    if (!this.f31633v) {
                        Object obj = this.f31632u.get();
                        this.f31634w = obj;
                        this.f31633v = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f31634w;
    }

    public final String toString() {
        Object obj;
        if (this.f31633v) {
            String valueOf = String.valueOf(this.f31634w);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f31632u;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
