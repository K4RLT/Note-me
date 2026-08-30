package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class j41 extends AbstractCollection implements List {
    public final /* synthetic */ Serializable A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7316u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f7317v;

    /* renamed from: w, reason: collision with root package name */
    public Collection f7318w;

    /* renamed from: x, reason: collision with root package name */
    public final Collection f7319x;

    /* renamed from: y, reason: collision with root package name */
    public final AbstractCollection f7320y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Serializable f7321z;

    public j41(u51 u51Var, Object obj, List list, j41 j41Var) {
        Collection collection;
        this.A = u51Var;
        this.f7321z = u51Var;
        this.f7317v = obj;
        this.f7318w = list;
        this.f7320y = j41Var;
        if (j41Var == null) {
            collection = null;
        } else {
            collection = j41Var.f7318w;
        }
        this.f7319x = collection;
    }

    public final void a() {
        switch (this.f7316u) {
            case 0:
                j41 j41Var = (j41) this.f7320y;
                if (j41Var != null) {
                    j41Var.a();
                    return;
                }
                u51 u51Var = (u51) this.f7321z;
                u51Var.f11552x.put(this.f7317v, this.f7318w);
                return;
            case 1:
                j41 j41Var2 = (j41) this.f7320y;
                if (j41Var2 != null) {
                    j41Var2.a();
                    return;
                } else {
                    if (this.f7318w.isEmpty()) {
                        com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z;
                        k3Var.f14542w.remove(this.f7317v);
                        return;
                    }
                    return;
                }
            default:
                j41 j41Var3 = (j41) this.f7320y;
                if (j41Var3 != null) {
                    j41Var3.a();
                    return;
                } else {
                    if (this.f7318w.isEmpty()) {
                        ya.eg egVar = (ya.eg) this.f7321z;
                        egVar.f31286w.remove(this.f7317v);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                boolean isEmpty = this.f7318w.isEmpty();
                boolean add = this.f7318w.add(obj);
                if (add) {
                    ((u51) this.f7321z).f11553y++;
                    if (isEmpty) {
                        a();
                        return true;
                    }
                    return add;
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.f7318w.isEmpty();
                boolean add2 = this.f7318w.add(obj);
                if (add2) {
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).getClass();
                    if (isEmpty2) {
                        zza();
                        return true;
                    }
                    return add2;
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.f7318w.isEmpty();
                boolean add3 = this.f7318w.add(obj);
                if (add3 && isEmpty3) {
                    zza();
                    return true;
                }
                return add3;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f7316u) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.f7318w).addAll(i, collection);
                if (addAll) {
                    int size2 = this.f7318w.size();
                    ((u51) this.A).f11553y += size2 - size;
                    if (size == 0) {
                        a();
                        return true;
                    }
                    return addAll;
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.f7318w).addAll(i, collection);
                if (addAll2) {
                    this.f7318w.size();
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.A).getClass();
                    if (size3 == 0) {
                        zza();
                        return true;
                    }
                    return addAll2;
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = ((List) this.f7318w).addAll(i, collection);
                if (addAll3) {
                    this.f7318w.size();
                    if (size4 == 0) {
                        zza();
                        return true;
                    }
                    return addAll3;
                }
                return addAll3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.f7316u) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f7318w.clear();
                    ((u51) this.f7321z).f11553y -= size;
                    zzb();
                    return;
                }
                return;
            case 1:
                if (size() != 0) {
                    this.f7318w.clear();
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).getClass();
                    a();
                    return;
                }
                return;
            default:
                if (size() != 0) {
                    this.f7318w.clear();
                    a();
                    return;
                }
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                return this.f7318w.contains(obj);
            case 1:
                zzb();
                return this.f7318w.contains(obj);
            default:
                zzb();
                return this.f7318w.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.f7316u) {
            case 0:
                zza();
                return this.f7318w.containsAll(collection);
            case 1:
                zzb();
                return this.f7318w.containsAll(collection);
            default:
                zzb();
                return this.f7318w.containsAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.f7316u) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zza();
                return this.f7318w.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f7318w.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.f7318w.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f7316u) {
            case 0:
                zza();
                return ((List) this.f7318w).get(i);
            case 1:
                zzb();
                return ((List) this.f7318w).get(i);
            default:
                zzb();
                return ((List) this.f7318w).get(i);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.f7316u) {
            case 0:
                zza();
                return this.f7318w.hashCode();
            case 1:
                zzb();
                return this.f7318w.hashCode();
            default:
                zzb();
                return this.f7318w.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                return ((List) this.f7318w).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.f7318w).indexOf(obj);
            default:
                zzb();
                return ((List) this.f7318w).indexOf(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f7316u) {
            case 0:
                zza();
                return new z31(this);
            case 1:
                zzb();
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.e3(this);
            default:
                zzb();
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.e3(this, (byte) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                return ((List) this.f7318w).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.f7318w).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.f7318w).lastIndexOf(obj);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f7316u) {
            case 0:
                zza();
                return new i41(this);
            case 1:
                zzb();
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.h3(this);
            default:
                zzb();
                return new ya.tf(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f7316u) {
            case 0:
                zza();
                Object remove = ((List) this.f7318w).remove(i);
                u51 u51Var = (u51) this.A;
                u51Var.f11553y--;
                zzb();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.f7318w).remove(i);
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.A).getClass();
                a();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.f7318w).remove(i);
                a();
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.f7316u) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.f7318w.removeAll(collection);
                if (removeAll) {
                    int size2 = this.f7318w.size();
                    ((u51) this.f7321z).f11553y += size2 - size;
                    zzb();
                    return removeAll;
                }
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll2 = this.f7318w.removeAll(collection);
                if (removeAll2) {
                    this.f7318w.size();
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).getClass();
                    a();
                    return removeAll2;
                }
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll3 = this.f7318w.removeAll(collection);
                if (removeAll3) {
                    this.f7318w.size();
                    a();
                    return removeAll3;
                }
                return removeAll3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.f7316u) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.f7318w.retainAll(collection);
                if (retainAll) {
                    int size2 = this.f7318w.size();
                    ((u51) this.f7321z).f11553y += size2 - size;
                    zzb();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.f7318w.retainAll(collection);
                if (retainAll2) {
                    this.f7318w.size();
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).getClass();
                    a();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.f7318w.retainAll(collection);
                if (retainAll3) {
                    this.f7318w.size();
                    a();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                return ((List) this.f7318w).set(i, obj);
            case 1:
                zzb();
                return ((List) this.f7318w).set(i, obj);
            default:
                zzb();
                return ((List) this.f7318w).set(i, obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f7316u) {
            case 0:
                zza();
                return this.f7318w.size();
            case 1:
                zzb();
                return this.f7318w.size();
            default:
                zzb();
                return this.f7318w.size();
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        switch (this.f7316u) {
            case 0:
                zza();
                List subList = ((List) this.f7318w).subList(i, i10);
                j41 j41Var = (j41) this.f7320y;
                if (j41Var == null) {
                    j41Var = this;
                }
                u51 u51Var = (u51) this.A;
                u51Var.getClass();
                boolean z3 = subList instanceof RandomAccess;
                Object obj = this.f7317v;
                if (z3) {
                    return new j41(u51Var, obj, subList, j41Var);
                }
                return new j41(u51Var, obj, subList, j41Var);
            case 1:
                zzb();
                List subList2 = ((List) this.f7318w).subList(i, i10);
                j41 j41Var2 = (j41) this.f7320y;
                if (j41Var2 == null) {
                    j41Var2 = this;
                }
                com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.A;
                k3Var.getClass();
                boolean z9 = subList2 instanceof RandomAccess;
                Object obj2 = this.f7317v;
                if (z9) {
                    return new j41(k3Var, obj2, subList2, j41Var2);
                }
                return new j41(k3Var, obj2, subList2, j41Var2);
            default:
                zzb();
                List subList3 = ((List) this.f7318w).subList(i, i10);
                j41 j41Var3 = (j41) this.f7320y;
                if (j41Var3 == null) {
                    j41Var3 = this;
                }
                ya.eg egVar = (ya.eg) this.A;
                boolean z10 = subList3 instanceof RandomAccess;
                Object obj3 = this.f7317v;
                if (z10) {
                    return new j41(egVar, obj3, subList3, j41Var3);
                }
                return new j41(egVar, obj3, subList3, j41Var3);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.f7316u) {
            case 0:
                zza();
                return this.f7318w.toString();
            case 1:
                zzb();
                return this.f7318w.toString();
            default:
                zzb();
                return this.f7318w.toString();
        }
    }

    public final void zza() {
        switch (this.f7316u) {
            case 0:
                j41 j41Var = (j41) this.f7320y;
                if (j41Var != null) {
                    j41Var.zza();
                    if (j41Var.f7318w != this.f7319x) {
                        l4.a.m();
                        return;
                    }
                    return;
                }
                if (this.f7318w.isEmpty()) {
                    u51 u51Var = (u51) this.f7321z;
                    Collection collection = (Collection) u51Var.f11552x.get(this.f7317v);
                    if (collection != null) {
                        this.f7318w = collection;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j41 j41Var2 = (j41) this.f7320y;
                if (j41Var2 != null) {
                    j41Var2.zza();
                    return;
                }
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).f14542w.put(this.f7317v, this.f7318w);
                return;
            default:
                j41 j41Var3 = (j41) this.f7320y;
                if (j41Var3 != null) {
                    j41Var3.zza();
                    return;
                }
                ((ya.eg) this.f7321z).f31286w.put(this.f7317v, this.f7318w);
                return;
        }
    }

    public final void zzb() {
        switch (this.f7316u) {
            case 0:
                j41 j41Var = (j41) this.f7320y;
                if (j41Var != null) {
                    j41Var.zzb();
                    return;
                } else {
                    if (this.f7318w.isEmpty()) {
                        u51 u51Var = (u51) this.f7321z;
                        u51Var.f11552x.remove(this.f7317v);
                        return;
                    }
                    return;
                }
            case 1:
                j41 j41Var2 = (j41) this.f7320y;
                if (j41Var2 != null) {
                    j41Var2.zzb();
                    if (j41Var2.f7318w != this.f7319x) {
                        l4.a.m();
                        return;
                    }
                    return;
                }
                if (this.f7318w.isEmpty()) {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z;
                    Collection collection = (Collection) k3Var.f14542w.get(this.f7317v);
                    if (collection != null) {
                        this.f7318w = collection;
                        return;
                    }
                    return;
                }
                return;
            default:
                j41 j41Var3 = (j41) this.f7320y;
                if (j41Var3 != null) {
                    j41Var3.zzb();
                    if (j41Var3.f7318w != this.f7319x) {
                        l4.a.m();
                        return;
                    }
                    return;
                }
                if (this.f7318w.isEmpty()) {
                    ya.eg egVar = (ya.eg) this.f7321z;
                    Collection collection2 = (Collection) egVar.f31286w.get(this.f7317v);
                    if (collection2 != null) {
                        this.f7318w = collection2;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j41(com.google.android.gms.internal.mlkit_vision_digital_ink.k3 k3Var, Object obj, List list, j41 j41Var) {
        this.A = k3Var;
        this.f7321z = k3Var;
        this.f7317v = obj;
        this.f7318w = list;
        this.f7320y = j41Var;
        this.f7319x = j41Var == null ? null : j41Var.f7318w;
    }

    public j41(ya.eg egVar, Object obj, List list, j41 j41Var) {
        this.A = egVar;
        this.f7321z = egVar;
        this.f7317v = obj;
        this.f7318w = list;
        this.f7320y = j41Var;
        this.f7319x = j41Var == null ? null : j41Var.f7318w;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f7316u) {
            case 0:
                zza();
                return new i41(this, i);
            case 1:
                zzb();
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.h3(this, i);
            default:
                zzb();
                return new ya.tf(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                boolean remove = this.f7318w.remove(obj);
                if (remove) {
                    u51 u51Var = (u51) this.f7321z;
                    u51Var.f11553y--;
                    zzb();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.f7318w.remove(obj);
                if (remove2) {
                    ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).getClass();
                    a();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.f7318w.remove(obj);
                if (remove3) {
                    a();
                }
                return remove3;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.f7316u) {
            case 0:
                zza();
                boolean isEmpty = this.f7318w.isEmpty();
                ((List) this.f7318w).add(i, obj);
                ((u51) this.A).f11553y++;
                if (isEmpty) {
                    a();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.f7318w.isEmpty();
                ((List) this.f7318w).add(i, obj);
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.A).getClass();
                if (isEmpty2) {
                    zza();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty3 = this.f7318w.isEmpty();
                ((List) this.f7318w).add(i, obj);
                if (isEmpty3) {
                    zza();
                    return;
                }
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.f7316u) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.f7318w.addAll(collection);
                if (!addAll) {
                    return addAll;
                }
                int size2 = this.f7318w.size();
                ((u51) this.f7321z).f11553y += size2 - size;
                if (size != 0) {
                    return addAll;
                }
                a();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.f7318w.addAll(collection);
                if (!addAll2) {
                    return addAll2;
                }
                this.f7318w.size();
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.k3) this.f7321z).getClass();
                if (size3 != 0) {
                    return addAll2;
                }
                zza();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = this.f7318w.addAll(collection);
                if (!addAll3) {
                    return addAll3;
                }
                this.f7318w.size();
                if (size4 != 0) {
                    return addAll3;
                }
                zza();
                return true;
        }
    }
}
