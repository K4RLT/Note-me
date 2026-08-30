package w0;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final l[] f27662u;

    /* renamed from: v, reason: collision with root package name */
    public int f27663v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27664w = true;

    public c(k kVar, l[] lVarArr) {
        this.f27662u = lVarArr;
        lVarArr[0].a(kVar.f27682d, Integer.bitCount(kVar.f27679a) * 2, 0);
        this.f27663v = 0;
        a();
    }

    public final void a() {
        int i = this.f27663v;
        l[] lVarArr = this.f27662u;
        l lVar = lVarArr[i];
        if (lVar.f27685w < lVar.f27684v) {
            return;
        }
        while (-1 < i) {
            int b10 = b(i);
            if (b10 == -1) {
                l lVar2 = lVarArr[i];
                int i10 = lVar2.f27685w;
                Object[] objArr = lVar2.f27683u;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    lVar2.f27685w = i10 + 1;
                    b10 = b(i);
                }
            }
            if (b10 != -1) {
                this.f27663v = b10;
                return;
            }
            if (i > 0) {
                l lVar3 = lVarArr[i - 1];
                int i11 = lVar3.f27685w;
                int length2 = lVar3.f27683u.length;
                lVar3.f27685w = i11 + 1;
            }
            lVarArr[i].a(k.e.f27682d, 0, 0);
            i--;
        }
        this.f27664w = false;
    }

    public final int b(int i) {
        l[] lVarArr = this.f27662u;
        l lVar = lVarArr[i];
        int i10 = lVar.f27685w;
        if (i10 < lVar.f27684v) {
            return i;
        }
        Object[] objArr = lVar.f27683u;
        if (i10 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i10];
            obj.getClass();
            k kVar = (k) obj;
            if (i == 6) {
                l lVar2 = lVarArr[i + 1];
                Object[] objArr2 = kVar.f27682d;
                lVar2.a(objArr2, objArr2.length, 0);
            } else {
                lVarArr[i + 1].a(kVar.f27682d, Integer.bitCount(kVar.f27679a) * 2, 0);
            }
            return b(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27664w;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f27664w) {
            Object next = this.f27662u[this.f27663v].next();
            a();
            return next;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
