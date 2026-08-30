package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.a41;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: u, reason: collision with root package name */
    public transient f3 f14455u;

    /* renamed from: v, reason: collision with root package name */
    public transient a41 f14456v;

    public final Map a() {
        a41 a41Var = this.f14456v;
        if (a41Var == null) {
            k3 k3Var = (k3) this;
            a41 a41Var2 = new a41(k3Var, k3Var.f14542w);
            this.f14456v = a41Var2;
            return a41Var2;
        }
        return a41Var;
    }

    public final Set b() {
        f3 f3Var = this.f14455u;
        if (f3Var == null) {
            k3 k3Var = (k3) this;
            f3 f3Var2 = new f3(k3Var, k3Var.f14542w);
            this.f14455u = f3Var2;
            return f3Var2;
        }
        return f3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        return a().equals(((i3) obj).a());
    }

    public final int hashCode() {
        return ((a41) a()).f4356v.hashCode();
    }

    public final String toString() {
        return ((a41) a()).f4356v.toString();
    }
}
