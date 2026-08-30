package yb;

import java.io.Serializable;
import java.util.Arrays;
import ya.se;

/* loaded from: classes.dex */
public final class g implements d, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Object f31638u;

    public g(Object obj) {
        this.f31638u = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return se.a(this.f31638u, ((g) obj).f31638u);
        }
        return false;
    }

    @Override // yb.d
    public final Object get() {
        return this.f31638u;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31638u});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31638u);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
