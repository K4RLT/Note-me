package v0;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: w, reason: collision with root package name */
    public final Object[] f27275w;

    /* renamed from: x, reason: collision with root package name */
    public final i f27276x;

    public f(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        super(i, i10);
        this.f27275w = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f27276x = new i(objArr, i > i12 ? i12 : i, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            i iVar = this.f27276x;
            if (iVar.hasNext()) {
                this.f27261u++;
                return iVar.next();
            }
            int i = this.f27261u;
            this.f27261u = i + 1;
            return this.f27275w[i - iVar.f27262v];
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f27261u;
            i iVar = this.f27276x;
            int i10 = iVar.f27262v;
            if (i > i10) {
                int i11 = i - 1;
                this.f27261u = i11;
                return this.f27275w[i11 - i10];
            }
            this.f27261u = i - 1;
            return iVar.previous();
        }
        l4.a.c();
        return null;
    }
}
