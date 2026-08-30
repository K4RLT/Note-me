package re;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;
import q.x;

/* loaded from: classes.dex */
public final class d implements Map.Entry, ef.c {

    /* renamed from: u, reason: collision with root package name */
    public final e f24754u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24755v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24756w;

    public d(e eVar, int i) {
        eVar.getClass();
        this.f24754u = eVar;
        this.f24755v = i;
        this.f24756w = eVar.B;
    }

    public final void a() {
        if (this.f24754u.B == this.f24756w) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f24754u.f24757u[this.f24755v];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f24754u.f24758v;
        objArr.getClass();
        return objArr[this.f24755v];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        Object key = getKey();
        int i10 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i10 = value.hashCode();
        }
        return i ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f24754u;
        eVar.c();
        Object[] objArr = eVar.f24758v;
        if (objArr == null) {
            int length = eVar.f24757u.length;
            if (length >= 0) {
                objArr = new Object[length];
                eVar.f24758v = objArr;
            } else {
                x.n("capacity must be non-negative.");
                return null;
            }
        }
        int i = this.f24755v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
