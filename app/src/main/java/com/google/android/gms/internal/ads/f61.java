package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class f61 extends x51 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return p.f9291k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f61) {
            t41 t41Var = p.f9291k;
            return t41Var.equals(t41Var);
        }
        return false;
    }

    public final int hashCode() {
        return -p.f9291k.hashCode();
    }

    public final String toString() {
        return p.f9291k.toString().concat(".reverse()");
    }
}
