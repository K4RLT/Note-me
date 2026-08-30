package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class vl1 implements Map.Entry {
    public Object A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public vl1 f11935u;

    /* renamed from: v, reason: collision with root package name */
    public vl1 f11936v;

    /* renamed from: w, reason: collision with root package name */
    public vl1 f11937w;

    /* renamed from: x, reason: collision with root package name */
    public vl1 f11938x;

    /* renamed from: y, reason: collision with root package name */
    public vl1 f11939y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f11940z;

    public vl1(vl1 vl1Var, Object obj, vl1 vl1Var2, vl1 vl1Var3) {
        this.f11935u = vl1Var;
        this.f11940z = obj;
        this.B = 1;
        this.f11938x = vl1Var2;
        this.f11939y = vl1Var3;
        vl1Var3.f11938x = this;
        vl1Var2.f11939y = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f11940z;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.A;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11940z;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.f11940z;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj != null) {
            Object obj2 = this.A;
            this.A = obj;
            return obj2;
        }
        g5.q.h("value == null");
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11940z);
        String valueOf2 = String.valueOf(this.A);
        return p.a.o(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public vl1() {
        this.f11940z = null;
        this.f11939y = this;
        this.f11938x = this;
    }
}
