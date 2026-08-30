package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes.dex */
public final class f71 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final int[] f5960u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5961v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5962w;

    public f71(int[] iArr, int i, int i10) {
        this.f5960u = iArr;
        this.f5961v = i;
        this.f5962w = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f5961v;
            while (true) {
                if (i < this.f5962w) {
                    if (this.f5960u[i] == intValue) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f71) {
            f71 f71Var = (f71) obj;
            int i = f71Var.f5962w;
            int i10 = f71Var.f5961v;
            int i11 = i - i10;
            int i12 = this.f5962w;
            int i13 = this.f5961v;
            int i14 = i12 - i13;
            if (i11 != i14) {
                return false;
            }
            for (int i15 = 0; i15 < i14; i15++) {
                if (this.f5960u[i13 + i15] != f71Var.f5960u[i10 + i15]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i10 = this.f5962w;
        int i11 = this.f5961v;
        b80.N(i, i10 - i11);
        return Integer.valueOf(this.f5960u[i11 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = this.f5961v; i10 < this.f5962w; i10++) {
            i = (i * 31) + Integer.hashCode(this.f5960u[i10]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f5961v;
            int i10 = i;
            while (true) {
                if (i10 < this.f5962w) {
                    if (this.f5960u[i10] == intValue) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f5962w - 1;
            while (true) {
                i = this.f5961v;
                if (i10 >= i) {
                    if (this.f5960u[i10] == intValue) {
                        break;
                    }
                    i10--;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i10 = this.f5962w;
        int i11 = this.f5961v;
        Integer num = (Integer) obj;
        b80.N(i, i10 - i11);
        int i12 = i11 + i;
        int[] iArr = this.f5960u;
        int i13 = iArr[i12];
        num.getClass();
        iArr[i12] = num.intValue();
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5962w - this.f5961v;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f5960u, this.f5961v, this.f5962w, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        int i11 = this.f5962w;
        int i12 = this.f5961v;
        b80.P(i, i10, i11 - i12);
        if (i == i10) {
            return Collections.EMPTY_LIST;
        }
        return new f71(this.f5960u, i + i12, i12 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f5962w;
        int i10 = this.f5961v;
        StringBuilder sb2 = new StringBuilder((i - i10) * 5);
        sb2.append('[');
        int[] iArr = this.f5960u;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < i) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
