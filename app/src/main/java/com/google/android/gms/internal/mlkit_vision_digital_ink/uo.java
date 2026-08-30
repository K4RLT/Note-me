package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.wd0;
import java.util.Map;

/* loaded from: classes.dex */
public final class uo implements Map.Entry, Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final Comparable f15065u;

    /* renamed from: v, reason: collision with root package name */
    public Object f15066v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ to f15067w;

    public uo(to toVar, Comparable comparable, Object obj) {
        this.f15067w = toVar;
        this.f15065u = comparable;
        this.f15066v = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15065u.compareTo(((uo) obj).f15065u);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f15065u;
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
                    Object obj2 = this.f15066v;
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
        return this.f15065u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15066v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Comparable comparable = this.f15065u;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f15066v;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f15067w.h();
        Object obj2 = this.f15066v;
        this.f15066v = obj;
        return obj2;
    }

    public final String toString() {
        return wd0.n(String.valueOf(this.f15065u), "=", String.valueOf(this.f15066v));
    }
}
