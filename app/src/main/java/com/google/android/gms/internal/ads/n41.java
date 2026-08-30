package com.google.android.gms.internal.ads;
import p.a;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n41 extends x51 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        n41 n41Var = m50.f8250a;
        Integer valueOf = Integer.valueOf(((s40) obj).f10514p);
        n41 n41Var2 = m50.f8250a;
        return valueOf.compareTo(Integer.valueOf(((s40) obj2).f10514p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n41) {
                Object obj2 = i6.f7004h;
                if (obj2.equals(obj2)) {
                    Object obj3 = w51.f12146v;
                    if (obj3.equals(obj3)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(i6.f7004h, w51.f12146v);
    }

    public final String toString() {
        String obj = i6.f7004h.toString();
        return p.a.o(new StringBuilder(obj.length() + 31), "Ordering.natural().onResultOf(", obj, ")");
    }
}
