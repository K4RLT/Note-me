package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p41 extends AbstractSet {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9361u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s41 f9362v;

    public /* synthetic */ p41(s41 s41Var, int i) {
        this.f9361u = i;
        this.f9362v = s41Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9361u) {
            case 0:
                this.f9362v.clear();
                return;
            default:
                this.f9362v.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9361u) {
            case 0:
                s41 s41Var = this.f9362v;
                Map f10 = s41Var.f();
                if (f10 != null) {
                    return f10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int j10 = s41Var.j(entry.getKey());
                    if (j10 != -1 && Objects.equals(s41Var.c()[j10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f9362v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9361u) {
            case 0:
                s41 s41Var = this.f9362v;
                Map f10 = s41Var.f();
                if (f10 != null) {
                    return f10.entrySet().iterator();
                }
                return new o41(s41Var, 1);
            default:
                s41 s41Var2 = this.f9362v;
                Map f11 = s41Var2.f();
                if (f11 != null) {
                    return f11.keySet().iterator();
                }
                return new o41(s41Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9361u) {
            case 0:
                s41 s41Var = this.f9362v;
                Map f10 = s41Var.f();
                if (f10 != null) {
                    return f10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!s41Var.e()) {
                        int h3 = s41Var.h();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = s41Var.f10515u;
                        Objects.requireNonNull(obj2);
                        int J = an1.J(key, value, h3, obj2, s41Var.a(), s41Var.b(), s41Var.c());
                        if (J != -1) {
                            s41Var.g(J, h3);
                            s41Var.f10520z--;
                            s41Var.f10519y += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                s41 s41Var2 = this.f9362v;
                Map f11 = s41Var2.f();
                if (f11 != null) {
                    return f11.keySet().remove(obj);
                }
                if (s41Var2.k(obj) == s41.D) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9361u) {
            case 0:
                return this.f9362v.size();
            default:
                return this.f9362v.size();
        }
    }
}
