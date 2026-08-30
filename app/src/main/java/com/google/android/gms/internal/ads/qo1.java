package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class qo1 extends AbstractMap {

    /* renamed from: u, reason: collision with root package name */
    public Object[] f9917u;

    /* renamed from: v, reason: collision with root package name */
    public int f9918v;

    /* renamed from: w, reason: collision with root package name */
    public Map f9919w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9920x;

    /* renamed from: y, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h1 f9921y;

    /* renamed from: z, reason: collision with root package name */
    public Map f9922z;

    public qo1() {
        Map map = Collections.EMPTY_MAP;
        this.f9919w = map;
        this.f9922z = map;
    }

    public final ro1 a(int i) {
        if (i < this.f9918v) {
            return (ro1) this.f9917u[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        Set entrySet;
        if (this.f9919w.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.f9919w.entrySet();
        }
        return entrySet;
    }

    public final void c(Object obj) {
        f();
        e();
        f();
        if (this.f9917u == null) {
            this.f9917u = new Object[16];
        }
        if (this.f9918v == 16) {
            ro1 ro1Var = (ro1) this.f9917u[15];
            this.f9918v = 15;
            SortedMap g8 = g();
            ro1Var.getClass();
            g8.put(null, ro1Var.f10265u);
        }
        Object[] objArr = this.f9917u;
        int length = objArr.length;
        System.arraycopy(objArr, 0, objArr, 1, 15);
        this.f9917u[0] = new ro1(this, obj);
        this.f9918v++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f9918v != 0) {
            this.f9917u = null;
            this.f9918v = 0;
        }
        if (!this.f9919w.isEmpty()) {
            this.f9919w.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            e();
            if (this.f9919w.containsKey(null)) {
                return true;
            }
            return false;
        }
        g5.q.b();
        return false;
    }

    public final void e() {
        int i = this.f9918v - 1;
        if (i < 0) {
            if (i < 0) {
                return;
            }
            ((ro1) this.f9917u[i / 2]).getClass();
            throw null;
        }
        ((ro1) this.f9917u[i]).getClass();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9921y == null) {
            this.f9921y = new androidx.datastore.preferences.protobuf.h1(1, this);
        }
        return this.f9921y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qo1)) {
                return super.equals(obj);
            }
            qo1 qo1Var = (qo1) obj;
            int size = size();
            if (size == qo1Var.size()) {
                int i = this.f9918v;
                if (i == qo1Var.f9918v) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (a(i10).equals(qo1Var.a(i10))) {
                        }
                    }
                    if (i != size) {
                        return this.f9919w.equals(qo1Var.f9919w);
                    }
                    return true;
                }
                return entrySet().equals(qo1Var.entrySet());
            }
            return false;
        }
        return true;
    }

    public final void f() {
        if (!this.f9920x) {
            return;
        }
        q.x.h();
    }

    public final SortedMap g() {
        f();
        if (this.f9919w.isEmpty() && !(this.f9919w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9919w = treeMap;
            this.f9922z = treeMap.descendingMap();
        }
        return (SortedMap) this.f9919w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            e();
            return this.f9919w.get(null);
        }
        g5.q.b();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f9918v;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += this.f9917u[i11].hashCode();
        }
        if (this.f9919w.size() > 0) {
            return this.f9919w.hashCode() + i10;
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            c(obj2);
            return null;
        }
        g5.q.b();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        if (obj == null) {
            e();
            if (this.f9919w.isEmpty()) {
                return null;
            }
            return this.f9919w.remove(null);
        }
        g5.q.b();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9919w.size() + this.f9918v;
    }
}
