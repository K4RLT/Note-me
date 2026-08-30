package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t3 extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14999u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w3 f15000v;

    public /* synthetic */ t3(w3 w3Var, int i) {
        this.f14999u = i;
        this.f15000v = w3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f14999u) {
            case 0:
                this.f15000v.clear();
                return;
            default:
                this.f15000v.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f14999u) {
            case 0:
                w3 w3Var = this.f15000v;
                Map e = w3Var.e();
                if (e != null) {
                    return e.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i = w3Var.i(entry.getKey());
                    if (i != -1 && Objects.equals(w3Var.c()[i], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f15000v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f14999u) {
            case 0:
                w3 w3Var = this.f15000v;
                Map e = w3Var.e();
                if (e != null) {
                    return e.entrySet().iterator();
                }
                return new s3(w3Var, 1);
            default:
                w3 w3Var2 = this.f15000v;
                Map e8 = w3Var2.e();
                if (e8 != null) {
                    return e8.keySet().iterator();
                }
                return new s3(w3Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f14999u) {
            case 0:
                w3 w3Var = this.f15000v;
                Map e = w3Var.e();
                if (e != null) {
                    return e.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!w3Var.g()) {
                        int h3 = w3Var.h();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = w3Var.f15171u;
                        Objects.requireNonNull(obj2);
                        int e8 = f7.e(key, value, h3, obj2, w3Var.a(), w3Var.b(), w3Var.c());
                        if (e8 != -1) {
                            w3Var.f(e8, h3);
                            w3Var.f15176z--;
                            w3Var.f15175y += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                w3 w3Var2 = this.f15000v;
                Map e10 = w3Var2.e();
                if (e10 != null) {
                    return e10.keySet().remove(obj);
                }
                if (w3Var2.k(obj) == w3.D) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f14999u) {
            case 0:
                return this.f15000v.size();
            default:
                return this.f15000v.size();
        }
    }
}
