package com.google.android.gms.internal.play_billing;
import r.p;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class u extends o implements Set {

    /* renamed from: v, reason: collision with root package name */
    public transient r f15533v;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public r g() {
        r rVar = this.f15533v;
        if (rVar == null) {
            r o10 = o();
            this.f15533v = o10;
            return o10;
        }
        return rVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i10 += i;
        }
        return i10;
    }

    public r o() {
        Object[] array = toArray(o.f15496u);
        p pVar = r.f15518v;
        return p(array, array.length);
    }
}
