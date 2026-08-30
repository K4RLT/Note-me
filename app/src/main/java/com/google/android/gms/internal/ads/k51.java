package com.google.android.gms.internal.ads;
import p.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k51 extends j51 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7661x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object f7662y;

    public k51(Object obj) {
        obj.getClass();
        this.f7662y = obj;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final m61 a() {
        switch (this.f7661x) {
            case 0:
                return new f51((l51) this.f7662y);
            default:
                return new p51(this.f7662y);
        }
    }

    @Override // com.google.android.gms.internal.ads.z41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7661x) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    l51 l51Var = (l51) this.f7662y;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((d61) l51Var.d()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f7662y.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.j51, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f7661x) {
            case 1:
                return this.f7662y.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f7661x) {
            case 0:
                return new f51((l51) this.f7662y);
            default:
                return new p51(this.f7662y);
        }
    }

    @Override // com.google.android.gms.internal.ads.j51, com.google.android.gms.internal.ads.z41
    public d51 k() {
        switch (this.f7661x) {
            case 1:
                return d51.q(this.f7662y);
            default:
                return super.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        switch (this.f7661x) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.z41
    public int o(Object[] objArr, int i) {
        switch (this.f7661x) {
            case 1:
                objArr[i] = this.f7662y;
                return i + 1;
            default:
                return super.o(objArr, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7661x) {
            case 0:
                return ((l51) this.f7662y).f7951y;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f7661x) {
            case 1:
                String obj = this.f7662y.toString();
                return p.a.o(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
            default:
                return super.toString();
        }
    }

    public k51(l51 l51Var) {
        this.f7662y = l51Var;
    }
}
