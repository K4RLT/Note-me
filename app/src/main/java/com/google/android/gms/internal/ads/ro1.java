package com.google.android.gms.internal.ads;
import a5.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class ro1 implements Map.Entry, Comparable {

    /* renamed from: u, reason: collision with root package name */
    public Object f10265u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ qo1 f10266v;

    public ro1(qo1 qo1Var, Object obj) {
        this.f10266v = qo1Var;
        this.f10265u = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ((ro1) obj).getClass();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    return false;
                }
                Object obj2 = this.f10265u;
                Object value = entry.getValue();
                if (obj2 == null) {
                    if (value != null) {
                        equals = false;
                    } else {
                        equals = true;
                    }
                } else {
                    equals = obj2.equals(value);
                }
                if (equals) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10265u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f10265u;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10266v.f();
        Object obj2 = this.f10265u;
        this.f10265u = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10265u);
        return a5.a.k(new StringBuilder("null".length() + 1 + valueOf.length()), "null=", valueOf);
    }
}
