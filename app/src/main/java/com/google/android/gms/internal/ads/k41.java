package com.google.android.gms.internal.ads;
import eb.s;
import me.a;
import xa.b;
import xa.d;
import ya.eg;
import ya.me;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k41 extends AbstractCollection {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7649u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f7650v;

    public /* synthetic */ k41(int i, Serializable serializable) {
        this.f7649u = i;
        this.f7650v = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f7649u) {
            case 0:
                ((u51) this.f7650v).e();
                return;
            case 1:
                ((s41) this.f7650v).clear();
                return;
            case 2:
                ((a41) this.f7650v).clear();
                return;
            case 3:
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.w3) this.f7650v).clear();
                return;
            case 4:
                ((a41) this.f7650v).clear();
                return;
            case 5:
                ((xa.d) this.f7650v).clear();
                return;
            case 6:
                ((ya.d) this.f7650v).clear();
                return;
            default:
                ((a41) this.f7650v).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f7649u) {
            case 0:
                return ((u51) this.f7650v).c(obj);
            case 2:
                return ((a41) this.f7650v).containsValue(obj);
            case 4:
                return ((a41) this.f7650v).containsValue(obj);
            case 7:
                return ((a41) this.f7650v).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f7649u) {
            case 2:
                return ((a41) this.f7650v).isEmpty();
            case 4:
                return ((a41) this.f7650v).isEmpty();
            case 7:
                return ((a41) this.f7650v).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7649u) {
            case 0:
                u51 u51Var = (u51) this.f7650v;
                u51Var.getClass();
                return new x31(u51Var);
            case 1:
                s41 s41Var = (s41) this.f7650v;
                Map f10 = s41Var.f();
                if (f10 != null) {
                    return f10.values().iterator();
                }
                return new o41(s41Var, 2);
            case 2:
                return new k61(((a41) this.f7650v).entrySet().iterator());
            case 3:
                com.google.android.gms.internal.mlkit_vision_digital_ink.w3 w3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.w3) this.f7650v;
                Map e = w3Var.e();
                if (e != null) {
                    return e.values().iterator();
                }
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.s3(w3Var, 2);
            case 4:
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.j5(((a41) this.f7650v).entrySet().iterator());
            case 5:
                xa.d dVar = (xa.d) this.f7650v;
                Map c10 = dVar.c();
                if (c10 != null) {
                    return c10.values().iterator();
                }
                return new xa.b(dVar, 2);
            case 6:
                ya.d dVar2 = (ya.d) this.f7650v;
                Map a10 = dVar2.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new ya.a(dVar2, 2);
            default:
                return new eb.s(((a41) this.f7650v).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f7649u) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    a41 a41Var = (a41) this.f7650v;
                    for (Map.Entry entry : a41Var.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            a41Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 4:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    a41 a41Var2 = (a41) this.f7650v;
                    for (Map.Entry entry2 : a41Var2.entrySet()) {
                        if (Objects.equals(obj, entry2.getValue())) {
                            a41Var2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                a41 a41Var3 = (a41) this.f7650v;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : a41Var3.entrySet()) {
                        if (ya.me.a(obj, entry3.getValue())) {
                            a41Var3.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f7649u) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    a41 a41Var = (a41) this.f7650v;
                    for (Map.Entry entry : a41Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return a41Var.keySet().removeAll(hashSet);
                }
            case 4:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    a41 a41Var2 = (a41) this.f7650v;
                    for (Map.Entry entry2 : a41Var2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) a41Var2.f4359y).b().removeAll(hashSet2);
                }
            case 7:
                a41 a41Var3 = (a41) this.f7650v;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : a41Var3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((ya.eg) a41Var3.f4359y).b().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f7649u) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    a41 a41Var = (a41) this.f7650v;
                    for (Map.Entry entry : a41Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return a41Var.keySet().retainAll(hashSet);
                }
            case 4:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    a41 a41Var2 = (a41) this.f7650v;
                    for (Map.Entry entry2 : a41Var2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) a41Var2.f4359y).b().retainAll(hashSet2);
                }
            case 7:
                a41 a41Var3 = (a41) this.f7650v;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : a41Var3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((ya.eg) a41Var3.f4359y).b().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f7649u) {
            case 0:
                return ((u51) this.f7650v).f11553y;
            case 1:
                return ((s41) this.f7650v).size();
            case 2:
                return ((a41) this.f7650v).f4356v.size();
            case 3:
                return ((com.google.android.gms.internal.mlkit_vision_digital_ink.w3) this.f7650v).size();
            case 4:
                return ((a41) this.f7650v).f4356v.size();
            case 5:
                return ((xa.d) this.f7650v).size();
            case 6:
                return ((ya.d) this.f7650v).size();
            default:
                return ((a41) this.f7650v).f4356v.size();
        }
    }

    public /* synthetic */ k41(AbstractMap abstractMap, int i) {
        this.f7649u = i;
        this.f7650v = abstractMap;
    }
}
