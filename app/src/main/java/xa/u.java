package xa;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u extends l {
    public static final Object[] C;
    public static final u D;
    public final transient int A;
    public final transient int B;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f30682x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f30683y;

    /* renamed from: z, reason: collision with root package name */
    public final transient Object[] f30684z;

    static {
        Object[] objArr = new Object[0];
        C = objArr;
        D = new u(0, 0, 0, objArr, objArr);
    }

    public u(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f30682x = objArr;
        this.f30683y = i;
        this.f30684z = objArr2;
        this.A = i10;
        this.B = i11;
    }

    @Override // xa.f
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f30682x;
        int i = this.B;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // xa.f
    public final int b() {
        return this.B;
    }

    @Override // xa.f, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f30684z;
            if (objArr.length != 0) {
                int l10 = u0.l(obj);
                while (true) {
                    int i = l10 & this.A;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    l10 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // xa.f
    public final int d() {
        return 0;
    }

    @Override // xa.f
    public final boolean g() {
        return false;
    }

    @Override // xa.l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30683y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.f30453v;
        if (iVar == null) {
            g gVar = i.f30429v;
            int i = this.B;
            if (i == 0) {
                iVar = o.f30481y;
            } else {
                iVar = new o(this.f30682x, i);
            }
            this.f30453v = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override // xa.f
    public final Object[] k() {
        return this.f30682x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B;
    }
}
