package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import x.h;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class to extends AbstractMap {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f15014u;

    /* renamed from: v, reason: collision with root package name */
    public int f15015v;

    /* renamed from: w, reason: collision with root package name */
    public Map f15016w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15017x;

    /* renamed from: y, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h1 f15018y;

    /* renamed from: z, reason: collision with root package name */
    public Map f15019z;

    public to() {
        Map map = Collections.EMPTY_MAP;
        this.f15016w = map;
        this.f15019z = map;
    }

    public final Set a() {
        Set entrySet;
        if (this.f15016w.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.f15016w.entrySet();
        }
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int e = e(comparable);
        if (e >= 0) {
            return ((uo) this.f15014u[e]).setValue(obj);
        }
        h();
        if (this.f15014u == null) {
            this.f15014u = new Object[16];
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f15015v == 16) {
            uo uoVar = (uo) this.f15014u[15];
            this.f15015v = 15;
            g().put(uoVar.f15065u, uoVar.f15066v);
        }
        Object[] objArr = this.f15014u;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f15014u[i] = new uo(this, comparable, obj);
        this.f15015v++;
        return null;
    }

    public final uo c(int i) {
        if (i < this.f15015v) {
            return (uo) this.f15014u[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f15015v != 0) {
            this.f15014u = null;
            this.f15015v = 0;
        }
        if (!this.f15016w.isEmpty()) {
            this.f15016w.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.f15016w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int e(Comparable comparable) {
        int i = this.f15015v;
        int i10 = i - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((uo) this.f15014u[i10]).f15065u);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((uo) this.f15014u[i12]).f15065u);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f15018y == null) {
            this.f15018y = new androidx.datastore.preferences.protobuf.h1(4, this);
        }
        return this.f15018y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof to)) {
                return super.equals(obj);
            }
            to toVar = (to) obj;
            int size = size();
            if (size == toVar.size()) {
                int i = this.f15015v;
                if (i == toVar.f15015v) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (c(i10).equals(toVar.c(i10))) {
                        }
                    }
                    if (i != size) {
                        return this.f15016w.equals(toVar.f15016w);
                    }
                    return true;
                }
                return entrySet().equals(toVar.entrySet());
            }
            return false;
        }
        return true;
    }

    public final Object f(int i) {
        h();
        Object[] objArr = this.f15014u;
        Object obj = ((uo) objArr[i]).f15066v;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f15015v - i) - 1);
        this.f15015v--;
        if (!this.f15016w.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f15014u;
            int i10 = this.f15015v;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new uo(this, (Comparable) entry.getKey(), entry.getValue());
            this.f15015v++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f15016w.isEmpty() && !(this.f15016w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15016w = treeMap;
            this.f15019z = treeMap.descendingMap();
        }
        return (SortedMap) this.f15016w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return ((uo) this.f15014u[e]).f15066v;
        }
        return this.f15016w.get(comparable);
    }

    public final void h() {
        if (!this.f15017x) {
            return;
        }
        q.x.h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f15015v;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += this.f15014u[i11].hashCode();
        }
        if (this.f15016w.size() > 0) {
            return this.f15016w.hashCode() + i10;
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return f(e);
        }
        if (this.f15016w.isEmpty()) {
            return null;
        }
        return this.f15016w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15016w.size() + this.f15015v;
    }
}
