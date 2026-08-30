package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class j31 implements Serializable, i31 {

    /* renamed from: u, reason: collision with root package name */
    public final List f7310u;

    public final boolean equals(Object obj) {
        if (obj instanceof j31) {
            return this.f7310u.equals(((j31) obj).f7310u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7310u.hashCode() + 306654252;
    }

    @Override // com.google.android.gms.internal.ads.i31
    public final boolean l(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f7310u;
            if (i < list.size()) {
                if (!((i31) list.get(i)).l(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z3 = true;
        for (Object obj : this.f7310u) {
            if (!z3) {
                sb2.append(',');
            }
            sb2.append(obj);
            z3 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
