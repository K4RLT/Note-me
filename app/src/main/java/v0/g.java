package v0;

import g5.q;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: w, reason: collision with root package name */
    public final e f27277w;

    /* renamed from: x, reason: collision with root package name */
    public int f27278x;

    /* renamed from: y, reason: collision with root package name */
    public i f27279y;

    /* renamed from: z, reason: collision with root package name */
    public int f27280z;

    public g(e eVar, int i) {
        super(i, eVar.B);
        this.f27277w = eVar;
        this.f27278x = eVar.n();
        this.f27280z = -1;
        b();
    }

    public final void a() {
        if (this.f27278x == this.f27277w.n()) {
            return;
        }
        l4.a.m();
    }

    @Override // v0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.f27261u;
        e eVar = this.f27277w;
        eVar.add(i, obj);
        this.f27261u++;
        this.f27262v = eVar.a();
        this.f27278x = eVar.n();
        this.f27280z = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        e eVar = this.f27277w;
        Object[] objArr = eVar.f27274z;
        if (objArr == null) {
            this.f27279y = null;
            return;
        }
        int i = (eVar.B - 1) & (-32);
        int i10 = this.f27261u;
        if (i10 > i) {
            i10 = i;
        }
        int i11 = (eVar.f27272x / 5) + 1;
        i iVar = this.f27279y;
        if (iVar == null) {
            this.f27279y = new i(objArr, i10, i, i11);
            return;
        }
        iVar.f27261u = i10;
        iVar.f27262v = i;
        iVar.f27283w = i11;
        if (iVar.f27284x.length < i11) {
            iVar.f27284x = new Object[i11];
        }
        Object r62 = 0;
        iVar.f27284x[0] = objArr;
        if (i10 == i) {
            r62 = 1;
        }
        iVar.f27285y = r62;
        iVar.b(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.f27261u;
            this.f27280z = i;
            i iVar = this.f27279y;
            e eVar = this.f27277w;
            if (iVar == null) {
                Object[] objArr = eVar.A;
                this.f27261u = i + 1;
                return objArr[i];
            }
            if (iVar.hasNext()) {
                this.f27261u++;
                return iVar.next();
            }
            Object[] objArr2 = eVar.A;
            int i10 = this.f27261u;
            this.f27261u = i10 + 1;
            return objArr2[i10 - iVar.f27262v];
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.f27261u;
            this.f27280z = i - 1;
            i iVar = this.f27279y;
            e eVar = this.f27277w;
            if (iVar == null) {
                Object[] objArr = eVar.A;
                int i10 = i - 1;
                this.f27261u = i10;
                return objArr[i10];
            }
            int i11 = iVar.f27262v;
            if (i > i11) {
                Object[] objArr2 = eVar.A;
                int i12 = i - 1;
                this.f27261u = i12;
                return objArr2[i12 - i11];
            }
            this.f27261u = i - 1;
            return iVar.previous();
        }
        l4.a.c();
        return null;
    }

    @Override // v0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f27280z;
        if (i != -1) {
            e eVar = this.f27277w;
            eVar.b(i);
            int i10 = this.f27280z;
            if (i10 < this.f27261u) {
                this.f27261u = i10;
            }
            this.f27262v = eVar.a();
            this.f27278x = eVar.n();
            this.f27280z = -1;
            b();
            return;
        }
        q.l();
    }

    @Override // v0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f27280z;
        if (i != -1) {
            e eVar = this.f27277w;
            eVar.set(i, obj);
            this.f27278x = eVar.n();
            b();
            return;
        }
        q.l();
    }
}