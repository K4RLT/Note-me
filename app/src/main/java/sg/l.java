package sg;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class l extends AbstractList implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f25289w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final h[] f25290u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f25291v;

    public l(h[] hVarArr, int[] iArr) {
        this.f25290u = hVarArr;
        this.f25291v = iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z3;
        if (obj != null) {
            z3 = obj instanceof h;
        } else {
            z3 = true;
        }
        if (z3) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f25290u[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z3;
        if (obj != null) {
            z3 = obj instanceof h;
        } else {
            z3 = true;
        }
        if (z3) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z3;
        if (obj != null) {
            z3 = obj instanceof h;
        } else {
            z3 = true;
        }
        if (z3) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        boolean z3;
        if (obj != null) {
            z3 = obj instanceof h;
        } else {
            z3 = true;
        }
        if (z3) {
            return super.remove((h) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25290u.length;
    }
}
