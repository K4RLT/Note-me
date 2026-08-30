package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class t41 extends x51 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        if (num2.intValue() == -1) {
            if (num.intValue() != -1) {
                return -1;
            }
            return 0;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t41) {
            Object obj2 = c.f4927z;
            return obj2.equals(obj2);
        }
        return false;
    }

    public final int hashCode() {
        return c.f4927z.hashCode();
    }

    public final String toString() {
        return c.f4927z.toString();
    }
}
