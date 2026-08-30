package com.google.android.gms.internal.ads;
import p.a;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r41 implements Map.Entry {

    /* renamed from: u, reason: collision with root package name */
    public final Object f10083u;

    /* renamed from: v, reason: collision with root package name */
    public int f10084v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s41 f10085w;

    public r41(s41 s41Var, int i) {
        Objects.requireNonNull(s41Var);
        this.f10085w = s41Var;
        this.f10083u = s41Var.b()[i];
        this.f10084v = i;
    }

    public final void a() {
        int i = this.f10084v;
        Object obj = this.f10083u;
        s41 s41Var = this.f10085w;
        if (i != -1 && i < s41Var.size()) {
            if (Objects.equals(obj, s41Var.b()[this.f10084v])) {
                return;
            }
        }
        this.f10084v = s41Var.j(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10083u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        s41 s41Var = this.f10085w;
        Map f10 = s41Var.f();
        if (f10 != null) {
            return f10.get(this.f10083u);
        }
        a();
        int i = this.f10084v;
        if (i == -1) {
            return null;
        }
        return s41Var.c()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        s41 s41Var = this.f10085w;
        Map f10 = s41Var.f();
        Object obj2 = this.f10083u;
        if (f10 != null) {
            return f10.put(obj2, obj);
        }
        a();
        int i = this.f10084v;
        if (i == -1) {
            s41Var.put(obj2, obj);
            return null;
        }
        Object obj3 = s41Var.c()[i];
        s41Var.c()[this.f10084v] = obj;
        return obj3;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return a.o(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
