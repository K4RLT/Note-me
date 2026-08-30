package v0;

import ya.uc;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: w, reason: collision with root package name */
    public int f27283w;

    /* renamed from: x, reason: collision with root package name */
    public Object[] f27284x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27285y;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(Object[] objArr, int i, int i10, int i11) {
        super(i, i10);
        Object r52;
        this.f27283w = i11;
        Object[] objArr2 = new Object[i11];
        this.f27284x = objArr2;
        if (i == i10) {
            r52 = 1;
        } else {
            r52 = 0;
        }
        this.f27285y = r52;
        objArr2[0] = objArr;
        b(i - r52, 1);
    }

    public final Object a() {
        int i = this.f27261u & 31;
        Object obj = this.f27284x[this.f27283w - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i10) {
        int i11 = (this.f27283w - i10) * 5;
        while (i10 < this.f27283w) {
            Object[] objArr = this.f27284x;
            Object obj = objArr[i10 - 1];
            obj.getClass();
            objArr[i10] = ((Object[]) obj)[uc.a(i, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i) {
        int i10 = 0;
        while (uc.a(this.f27261u, i10) == i) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.f27261u, ((this.f27283w - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a10 = a();
            int i = this.f27261u + 1;
            this.f27261u = i;
            if (i == this.f27262v) {
                this.f27285y = true;
                return a10;
            }
            c(0);
            return a10;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.f27261u--;
            if (this.f27285y) {
                this.f27285y = false;
                return a();
            }
            c(31);
            return a();
        }
        l4.a.c();
        return null;
    }
}