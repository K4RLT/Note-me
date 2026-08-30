package zb;

import java.util.Iterator;
import ya.cf;

/* loaded from: classes.dex */
public final class h extends e {
    public static final Object[] C;
    public static final h D;
    public final transient int A;
    public final transient int B;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f32037x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f32038y;

    /* renamed from: z, reason: collision with root package name */
    public final transient Object[] f32039z;

    static {
        Object[] objArr = new Object[0];
        C = objArr;
        D = new h(0, 0, 0, objArr, objArr);
    }

    public h(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f32037x = objArr;
        this.f32038y = i;
        this.f32039z = objArr2;
        this.A = i10;
        this.B = i11;
    }

    @Override // zb.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f32037x;
        int i = this.B;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // zb.a
    public final Object[] b() {
        return this.f32037x;
    }

    @Override // zb.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int hashCode;
        if (obj != null) {
            Object[] objArr = this.f32039z;
            if (objArr.length != 0) {
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                int a10 = cf.a(hashCode);
                while (true) {
                    int i = a10 & this.A;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a10 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // zb.a
    public final int d() {
        return this.B;
    }

    @Override // zb.a
    public final int g() {
        return 0;
    }

    @Override // zb.e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32038y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.f32031v;
        if (dVar == null) {
            dVar = d.k(this.f32037x, this.B);
            this.f32031v = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B;
    }
}
