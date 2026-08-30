package com.google.android.gms.internal.ads;
import ya.d;
import ya.eg;
import ya.j9;
import ya.yc;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public class a41 extends AbstractMap {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4355u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final transient Map f4356v;

    /* renamed from: w, reason: collision with root package name */
    public transient AbstractSet f4357w;

    /* renamed from: x, reason: collision with root package name */
    public transient AbstractCollection f4358x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Serializable f4359y;

    public a41(u51 u51Var, Map map) {
        Objects.requireNonNull(u51Var);
        this.f4359y = u51Var;
        this.f4356v = map;
    }

    public AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        j41 j41Var;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        u51 u51Var = (u51) this.f4359y;
        u51Var.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            j41Var = new j41(u51Var, key, list, (j41) null);
        } else {
            j41Var = new j41(u51Var, key, list, (j41) null);
        }
        return new AbstractMap.SimpleImmutableEntry(key, j41Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f4355u) {
            case 0:
                u51 u51Var = (u51) this.f4359y;
                if (this.f4356v == u51Var.f11552x) {
                    u51Var.e();
                    return;
                }
                z31 z31Var = new z31(this);
                while (z31Var.hasNext()) {
                    z31Var.next();
                    z31Var.remove();
                }
                return;
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.w3 w3Var = ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f4359y).f14542w;
                if (this.f4356v == w3Var) {
                    Iterator it = w3Var.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    w3Var.clear();
                    return;
                }
                com.google.android.gms.internal.mlkit_vision_digital_ink.e3 e3Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.e3(this);
                while (e3Var.hasNext()) {
                    e3Var.next();
                    e3Var.remove();
                }
                return;
            default:
                ya.d dVar = ((ya.eg) this.f4359y).f31286w;
                if (this.f4356v == dVar) {
                    Iterator it2 = dVar.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    dVar.clear();
                    return;
                }
                com.google.android.gms.internal.mlkit_vision_digital_ink.e3 e3Var2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.e3(this, (byte) 0);
                while (e3Var2.hasNext()) {
                    e3Var2.next();
                    e3Var2.remove();
                }
                return;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f4355u) {
            case 0:
                Map map = this.f4356v;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.f4356v;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.f4356v;
                map3.getClass();
                try {
                    return map3.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f4355u) {
            case 0:
                y31 y31Var = (y31) this.f4357w;
                if (y31Var == null) {
                    y31 y31Var2 = new y31(this);
                    this.f4357w = y31Var2;
                    return y31Var2;
                }
                return y31Var;
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.d3 d3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.d3) this.f4357w;
                if (d3Var == null) {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.d3 d3Var2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.d3(this);
                    this.f4357w = d3Var2;
                    return d3Var2;
                }
                return d3Var;
            default:
                ya.j9 j9Var = (ya.j9) this.f4357w;
                if (j9Var == null) {
                    ya.j9 j9Var2 = new ya.j9(this);
                    this.f4357w = j9Var2;
                    return j9Var2;
                }
                return j9Var;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f4355u) {
            case 0:
                if (this != obj && !this.f4356v.equals(obj)) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj && !this.f4356v.equals(obj)) {
                    return false;
                }
                return true;
            default:
                if (this != obj && !this.f4356v.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        j41 j41Var;
        Object obj3;
        j41 j41Var2;
        Object obj4;
        j41 j41Var3;
        switch (this.f4355u) {
            case 0:
                Map map = this.f4356v;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                u51 u51Var = (u51) this.f4359y;
                u51Var.getClass();
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    j41Var = new j41(u51Var, obj, list, (j41) null);
                } else {
                    j41Var = new j41(u51Var, obj, list, (j41) null);
                }
                return j41Var;
            case 1:
                Map map2 = this.f4356v;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f4359y;
                k3Var.getClass();
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    j41Var2 = new j41(k3Var, obj, list2, (j41) null);
                } else {
                    j41Var2 = new j41(k3Var, obj, list2, (j41) null);
                }
                return j41Var2;
            default:
                Map map3 = this.f4356v;
                map3.getClass();
                try {
                    obj4 = map3.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                ya.eg egVar = (ya.eg) this.f4359y;
                egVar.getClass();
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    j41Var3 = new j41(egVar, obj, list3, (j41) null);
                } else {
                    j41Var3 = new j41(egVar, obj, list3, (j41) null);
                }
                return j41Var3;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f4355u) {
            case 0:
                return this.f4356v.hashCode();
            case 1:
                return this.f4356v.hashCode();
            default:
                return this.f4356v.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set b41Var;
        switch (this.f4355u) {
            case 0:
                u51 u51Var = (u51) this.f4359y;
                Set set = u51Var.f7938u;
                if (set == null) {
                    Map map = u51Var.f11552x;
                    if (map instanceof NavigableMap) {
                        b41Var = new d41(u51Var, (NavigableMap) map);
                    } else if (map instanceof SortedMap) {
                        b41Var = new g41(u51Var, (SortedMap) map);
                    } else {
                        b41Var = new b41(u51Var, map);
                    }
                    set = b41Var;
                    u51Var.f7938u = set;
                }
                return set;
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f4359y;
                com.google.android.gms.internal.mlkit_vision_digital_ink.f3 f3Var = k3Var.f14455u;
                if (f3Var == null) {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.f3 f3Var2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.f3(k3Var, k3Var.f14542w);
                    k3Var.f14455u = f3Var2;
                    return f3Var2;
                }
                return f3Var;
            default:
                ya.eg egVar = (ya.eg) this.f4359y;
                ya.yc ycVar = egVar.f31203u;
                if (ycVar == null) {
                    ya.yc ycVar2 = new ya.yc(egVar, egVar.f31286w);
                    egVar.f31203u = ycVar2;
                    return ycVar2;
                }
                return ycVar;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        switch (this.f4355u) {
            case 0:
                Collection collection = (Collection) this.f4356v.remove(obj);
                if (collection == null) {
                    return null;
                }
                u51 u51Var = (u51) this.f4359y;
                List list = (List) u51Var.f11554z.zza();
                list.addAll(collection);
                u51Var.f11553y -= collection.size();
                collection.clear();
                return list;
            case 1:
                Collection collection2 = (Collection) this.f4356v.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f4359y).getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
            default:
                ya.eg egVar = (ya.eg) this.f4359y;
                Collection collection3 = (Collection) this.f4356v.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                egVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f4355u) {
            case 0:
                return this.f4356v.size();
            case 1:
                return this.f4356v.size();
            default:
                return this.f4356v.size();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f4355u) {
            case 0:
                return this.f4356v.toString();
            case 1:
                return this.f4356v.toString();
            default:
                return this.f4356v.toString();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f4355u) {
            case 0:
                k41 k41Var = (k41) this.f4358x;
                if (k41Var == null) {
                    k41 k41Var2 = new k41(this, 2);
                    this.f4358x = k41Var2;
                    return k41Var2;
                }
                return k41Var;
            case 1:
                k41 k41Var3 = (k41) this.f4358x;
                if (k41Var3 == null) {
                    k41 k41Var4 = new k41(this, 4);
                    this.f4358x = k41Var4;
                    return k41Var4;
                }
                return k41Var3;
            default:
                k41 k41Var5 = (k41) this.f4358x;
                if (k41Var5 == null) {
                    k41 k41Var6 = new k41(this, 7);
                    this.f4358x = k41Var6;
                    return k41Var6;
                }
                return k41Var5;
        }
    }

    public a41(com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var, Map map) {
        Objects.requireNonNull(k3Var);
        this.f4359y = k3Var;
        this.f4356v = map;
    }

    public a41(ya.eg egVar, Map map) {
        this.f4359y = egVar;
        this.f4356v = map;
    }
}
