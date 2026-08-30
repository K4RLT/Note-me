package v0;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27263w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final Object f27264x;

    public c(Object[] objArr, int i, int i10) {
        super(i, i10);
        this.f27264x = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f27263w) {
            case 0:
                if (hasNext()) {
                    Object[] objArr = (Object[]) this.f27264x;
                    int i = this.f27261u;
                    this.f27261u = i + 1;
                    return objArr[i];
                }
                l4.a.c();
                return null;
            default:
                if (hasNext()) {
                    this.f27261u++;
                    return this.f27264x;
                }
                l4.a.c();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f27263w) {
            case 0:
                if (hasPrevious()) {
                    Object[] objArr = (Object[]) this.f27264x;
                    int i = this.f27261u - 1;
                    this.f27261u = i;
                    return objArr[i];
                }
                l4.a.c();
                return null;
            default:
                if (hasPrevious()) {
                    this.f27261u--;
                    return this.f27264x;
                }
                l4.a.c();
                return null;
        }
    }

    public c(int i, Object obj) {
        super(i, 1);
        this.f27264x = obj;
    }
}
