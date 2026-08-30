package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l41 {

    /* renamed from: u, reason: collision with root package name */
    public transient Set f7938u;

    /* renamed from: v, reason: collision with root package name */
    public transient Collection f7939v;

    /* renamed from: w, reason: collision with root package name */
    public transient Map f7940w;

    public abstract Collection a();

    public abstract Map b();

    public boolean c(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        Map map = this.f7940w;
        if (map == null) {
            Map b10 = b();
            this.f7940w = b10;
            return b10;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l41)) {
            return false;
        }
        return d().equals(((l41) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
