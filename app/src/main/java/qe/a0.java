package qe;
import x.i;
import x.j;
import x.l;
import q.x;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import w7.i1;

/* loaded from: classes.dex */
public final class a0 extends e implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public final Object[] f24000u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24001v;

    /* renamed from: w, reason: collision with root package name */
    public int f24002w;

    /* renamed from: x, reason: collision with root package name */
    public int f24003x;

    public a0(Object[] objArr, int i) {
        this.f24000u = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.f24001v = objArr.length;
                this.f24003x = i;
                return;
            } else {
                x.i(objArr.length, g3.a.m("ring buffer filled size: ", i, " cannot be larger than the buffer size: "));
                throw null;
            }
        }
        x.j(g3.a.g(i, "ring buffer filled size should not be negative but it is "));
        throw null;
    }

    @Override // qe.a
    public final int a() {
        return this.f24003x;
    }

    public final void b(int i) {
        if (i >= 0) {
            if (i <= this.f24003x) {
                if (i > 0) {
                    int i10 = this.f24002w;
                    int i11 = this.f24001v;
                    int i12 = (i10 + i) % i11;
                    Object[] objArr = this.f24000u;
                    if (i10 > i12) {
                        Arrays.fill(objArr, i10, i11, (Object) null);
                        Arrays.fill(objArr, 0, i12, (Object) null);
                    } else {
                        Arrays.fill(objArr, i10, i12, (Object) null);
                    }
                    this.f24002w = i12;
                    this.f24003x -= i;
                    return;
                }
                return;
            }
            x.i(this.f24003x, g3.a.m("n shouldn't be greater than the buffer size: n = ", i, ", size = "));
            return;
        }
        x.j(g3.a.g(i, "n shouldn't be negative but it is "));
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i10 = this.f24003x;
        if (i >= 0 && i < i10) {
            return this.f24000u[(this.f24002w + i) % this.f24001v];
        }
        x.l(i1.c("index: ", i, i10, ", size: "));
        return null;
    }

    @Override // qe.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new z(this);
    }

    @Override // qe.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.f24003x;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i10 = this.f24003x;
        int i11 = this.f24002w;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr2 = this.f24000u;
            if (i13 >= i10 || i11 >= this.f24001v) {
                break;
            }
            objArr[i13] = objArr2[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            objArr[i13] = objArr2[i12];
            i13++;
            i12++;
        }
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // qe.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
