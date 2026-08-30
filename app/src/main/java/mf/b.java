package mf;

import df.p;
import java.util.Iterator;
import wa.b9;

/* loaded from: classes.dex */
public final class b implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public int f20800u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f20801v;

    /* renamed from: w, reason: collision with root package name */
    public int f20802w;

    /* renamed from: x, reason: collision with root package name */
    public jf.d f20803x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ af.j f20804y;

    public b(af.j jVar) {
        this.f20804y = jVar;
        int e = b9.e(0, 0, ((CharSequence) jVar.f377b).length());
        this.f20801v = e;
        this.f20802w = e;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [jf.b, jf.d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [jf.b, jf.d] */
    public final void a() {
        af.j jVar = this.f20804y;
        CharSequence charSequence = (CharSequence) jVar.f377b;
        int i = this.f20802w;
        int i10 = 0;
        if (i < 0) {
            this.f20800u = 0;
            this.f20803x = null;
            return;
        }
        if (i > charSequence.length()) {
            this.f20803x = new jf.b(this.f20801v, f.p(charSequence), 1);
            this.f20802w = -1;
        } else {
            pe.j jVar2 = (pe.j) ((p) jVar.f378c).invoke(charSequence, Integer.valueOf(this.f20802w));
            if (jVar2 == null) {
                this.f20803x = new jf.b(this.f20801v, f.p(charSequence), 1);
                this.f20802w = -1;
            } else {
                int intValue = ((Number) jVar2.f22693u).intValue();
                int intValue2 = ((Number) jVar2.f22694v).intValue();
                this.f20803x = b9.i(this.f20801v, intValue);
                int i11 = intValue + intValue2;
                this.f20801v = i11;
                if (intValue2 == 0) {
                    i10 = 1;
                }
                this.f20802w = i11 + i10;
            }
        }
        this.f20800u = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20800u == -1) {
            a();
        }
        if (this.f20800u == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20800u == -1) {
            a();
        }
        if (this.f20800u != 0) {
            jf.d dVar = this.f20803x;
            dVar.getClass();
            this.f20803x = null;
            this.f20800u = -1;
            return dVar;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
