package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class o6 extends AbstractMap {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f13513u;

    /* renamed from: v, reason: collision with root package name */
    public int f13514v;

    /* renamed from: w, reason: collision with root package name */
    public Map f13515w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13516x;

    /* renamed from: y, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h1 f13517y;

    /* renamed from: z, reason: collision with root package name */
    public Map f13518z;

    public o6() {
        Map map = Collections.EMPTY_MAP;
        this.f13515w = map;
        this.f13518z = map;
    }

    public final Set a() {
        Set entrySet;
        if (this.f13515w.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.f13515w.entrySet();
        }
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int e = e(comparable);
        if (e >= 0) {
            return ((p6) this.f13513u[e]).setValue(obj);
        }
        h();
        if (this.f13513u == null) {
            this.f13513u = new Object[16];
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f13514v == 16) {
            p6 p6Var = (p6) this.f13513u[15];
            this.f13514v = 15;
            g().put(p6Var.f13524u, p6Var.f13525v);
        }
        Object[] objArr = this.f13513u;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f13513u[i] = new p6(this, comparable, obj);
        this.f13514v++;
        return null;
    }

    public final p6 c(int i) {
        if (i < this.f13514v) {
            return (p6) this.f13513u[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f13514v != 0) {
            this.f13513u = null;
            this.f13514v = 0;
        }
        if (!this.f13515w.isEmpty()) {
            this.f13515w.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.f13515w.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int e(Comparable comparable) {
        int i = this.f13514v;
        int i10 = i - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((p6) this.f13513u[i10]).f13524u);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((p6) this.f13513u[i12]).f13524u);
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
        if (this.f13517y == null) {
            this.f13517y = new androidx.datastore.preferences.protobuf.h1(2, this);
        }
        return this.f13517y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof o6)) {
                return super.equals(obj);
            }
            o6 o6Var = (o6) obj;
            int size = size();
            if (size == o6Var.size()) {
                int i = this.f13514v;
                if (i == o6Var.f13514v) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (c(i10).equals(o6Var.c(i10))) {
                        }
                    }
                    if (i != size) {
                        return this.f13515w.equals(o6Var.f13515w);
                    }
                    return true;
                }
                return entrySet().equals(o6Var.entrySet());
            }
            return false;
        }
        return true;
    }

    public final Object f(int i) {
        h();
        Object[] objArr = this.f13513u;
        Object obj = ((p6) objArr[i]).f13525v;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f13514v - i) - 1);
        this.f13514v--;
        if (!this.f13515w.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f13513u;
            int i10 = this.f13514v;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new p6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f13514v++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f13515w.isEmpty() && !(this.f13515w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13515w = treeMap;
            this.f13518z = treeMap.descendingMap();
        }
        return (SortedMap) this.f13515w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return ((p6) this.f13513u[e]).f13525v;
        }
        return this.f13515w.get(comparable);
    }

    public final void h() {
        if (!this.f13516x) {
            return;
        }
        q.x.h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f13514v;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += this.f13513u[i11].hashCode();
        }
        if (this.f13515w.size() > 0) {
            return this.f13515w.hashCode() + i10;
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
        if (this.f13515w.isEmpty()) {
            return null;
        }
        return this.f13515w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13515w.size() + this.f13514v;
    }
}
