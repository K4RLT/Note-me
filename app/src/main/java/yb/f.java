package yb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: u, reason: collision with root package name */
    public volatile d f31635u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f31636v;

    /* renamed from: w, reason: collision with root package name */
    public Object f31637w;

    @Override // yb.d
    public final Object get() {
        if (!this.f31636v) {
            synchronized (this) {
                try {
                    if (!this.f31636v) {
                        d dVar = this.f31635u;
                        Objects.requireNonNull(dVar);
                        Object obj = dVar.get();
                        this.f31637w = obj;
                        this.f31636v = true;
                        this.f31635u = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f31637w;
    }

    public final String toString() {
        Object obj = this.f31635u;
        if (obj == null) {
            String valueOf = String.valueOf(this.f31637w);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
