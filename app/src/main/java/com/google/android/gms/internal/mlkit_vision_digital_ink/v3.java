package com.google.android.gms.internal.mlkit_vision_digital_ink;
import xa.d;

import com.google.android.gms.internal.ads.wd0;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v3 implements Map.Entry {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15114u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f15115v;

    /* renamed from: w, reason: collision with root package name */
    public int f15116w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f15117x;

    public v3(w3 w3Var, int i) {
        Objects.requireNonNull(w3Var);
        this.f15117x = w3Var;
        this.f15115v = w3Var.b()[i];
        this.f15116w = i;
    }

    public final void a() {
        int i = this.f15114u;
        AbstractMap abstractMap = this.f15117x;
        Object obj = this.f15115v;
        switch (i) {
            case 0:
                w3 w3Var = (w3) abstractMap;
                int i10 = this.f15116w;
                if (i10 != -1 && i10 < w3Var.size()) {
                    if (Objects.equals(obj, w3Var.b()[this.f15116w])) {
                        return;
                    }
                }
                Object obj2 = w3.D;
                this.f15116w = w3Var.i(obj);
                return;
            default:
                xa.d dVar = (xa.d) abstractMap;
                int i11 = this.f15116w;
                if (i11 != -1 && i11 < dVar.size()) {
                    if (Objects.equals(obj, dVar.a()[this.f15116w])) {
                        return;
                    }
                }
                Object obj3 = xa.d.D;
                this.f15116w = dVar.h(obj);
                return;
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f15114u) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!Objects.equals(getKey(), entry.getKey()) || !Objects.equals(getValue(), entry.getValue())) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!Objects.equals(getKey(), entry2.getKey()) || !Objects.equals(getValue(), entry2.getValue())) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f15114u) {
            case 0:
                return this.f15115v;
            default:
                return this.f15115v;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.f15114u) {
            case 0:
                w3 w3Var = (w3) this.f15117x;
                Map e = w3Var.e();
                if (e != null) {
                    return e.get(this.f15115v);
                }
                a();
                int i = this.f15116w;
                if (i == -1) {
                    return null;
                }
                return w3Var.c()[i];
            default:
                xa.d dVar = (xa.d) this.f15117x;
                Map c10 = dVar.c();
                if (c10 != null) {
                    return c10.get(this.f15115v);
                }
                a();
                int i10 = this.f15116w;
                if (i10 == -1) {
                    return null;
                }
                return dVar.b()[i10];
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        switch (this.f15114u) {
            case 0:
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
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                int i10 = 0;
                if (key2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = key2.hashCode();
                }
                if (value2 != null) {
                    i10 = value2.hashCode();
                }
                return hashCode2 ^ i10;
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.f15114u) {
            case 0:
                w3 w3Var = (w3) this.f15117x;
                Map e = w3Var.e();
                Object obj2 = this.f15115v;
                if (e != null) {
                    return e.put(obj2, obj);
                }
                a();
                int i = this.f15116w;
                if (i == -1) {
                    w3Var.put(obj2, obj);
                    return null;
                }
                Object obj3 = w3Var.c()[i];
                w3Var.c()[this.f15116w] = obj;
                return obj3;
            default:
                xa.d dVar = (xa.d) this.f15117x;
                Map c10 = dVar.c();
                Object obj4 = this.f15115v;
                if (c10 != null) {
                    return c10.put(obj4, obj);
                }
                a();
                int i10 = this.f15116w;
                if (i10 == -1) {
                    dVar.put(obj4, obj);
                    return null;
                }
                Object obj5 = dVar.b()[i10];
                dVar.b()[this.f15116w] = obj;
                return obj5;
        }
    }

    public final String toString() {
        String valueOf;
        String valueOf2;
        String str;
        switch (this.f15114u) {
            case 0:
                valueOf = String.valueOf(getKey());
                valueOf2 = String.valueOf(getValue());
                str = "=";
                break;
            default:
                valueOf = String.valueOf(getKey());
                valueOf2 = String.valueOf(getValue());
                str = "=";
                break;
        }
        return wd0.n(valueOf, str, valueOf2);
    }

    public v3(xa.d dVar, int i) {
        Objects.requireNonNull(dVar);
        this.f15117x = dVar;
        this.f15115v = dVar.a()[i];
        this.f15116w = i;
    }
}
