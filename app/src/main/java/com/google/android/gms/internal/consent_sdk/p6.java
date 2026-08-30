package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.wd0;
import java.util.Map;

/* loaded from: classes.dex */
public final class p6 implements Map.Entry, Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final Comparable f13524u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13525v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o6 f13526w;

    public p6(o6 o6Var, Comparable comparable, Object obj) {
        this.f13526w = o6Var;
        this.f13524u = comparable;
        this.f13525v = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f13524u.compareTo(((p6) obj).f13524u);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f13524u;
                if (comparable == null) {
                    if (key != null) {
                        equals = false;
                    } else {
                        equals = true;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.f13525v;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value != null) {
                            equals2 = false;
                        } else {
                            equals2 = true;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f13524u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13525v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Comparable comparable = this.f13524u;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f13525v;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13526w.h();
        Object obj2 = this.f13525v;
        this.f13525v = obj;
        return obj2;
    }

    public final String toString() {
        return wd0.n(String.valueOf(this.f13524u), "=", String.valueOf(this.f13525v));
    }
}
