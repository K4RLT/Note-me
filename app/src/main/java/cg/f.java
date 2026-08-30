package cg;

import eg.t;
import java.util.Iterator;
import pe.q;
import pe.s;
import pe.u;
import pe.x;
import qe.m;
import qe.v;

/* loaded from: classes.dex */
public class f implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4127u;

    /* renamed from: v, reason: collision with root package name */
    public int f4128v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4129w;

    public f(d dVar) {
        this.f4127u = 0;
        this.f4129w = dVar;
        this.f4128v = dVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4127u) {
            case 0:
                if (this.f4128v > 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f4128v > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.f4128v < ((Object[]) this.f4129w).length) {
                    return true;
                }
                return false;
            case 3:
                if (this.f4128v < ((byte[]) this.f4129w).length) {
                    return true;
                }
                return false;
            case 4:
                if (this.f4128v < ((int[]) this.f4129w).length) {
                    return true;
                }
                return false;
            case 5:
                if (this.f4128v < ((long[]) this.f4129w).length) {
                    return true;
                }
                return false;
            case 6:
                if (this.f4128v < ((short[]) this.f4129w).length) {
                    return true;
                }
                return false;
            case 7:
                if (this.f4128v < ((qe.e) this.f4129w).a()) {
                    return true;
                }
                return false;
            default:
                return ((Iterator) this.f4129w).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4127u) {
            case 0:
                d dVar = (d) this.f4129w;
                int f10 = dVar.f();
                int i = this.f4128v;
                this.f4128v = i - 1;
                return dVar.i(f10 - i);
            case 1:
                t tVar = (t) this.f4129w;
                int i10 = tVar.f16571c;
                int i11 = this.f4128v;
                this.f4128v = i11 - 1;
                return tVar.e[i10 - i11];
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f4129w;
                    int i12 = this.f4128v;
                    this.f4128v = i12 + 1;
                    return objArr[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f4128v--;
                    l4.a.h(e.getMessage());
                    return null;
                }
            case 3:
                int i13 = this.f4128v;
                byte[] bArr = (byte[]) this.f4129w;
                if (i13 < bArr.length) {
                    this.f4128v = i13 + 1;
                    return new q(bArr[i13]);
                }
                l4.a.h(String.valueOf(i13));
                return null;
            case 4:
                int i14 = this.f4128v;
                int[] iArr = (int[]) this.f4129w;
                if (i14 < iArr.length) {
                    this.f4128v = i14 + 1;
                    return new s(iArr[i14]);
                }
                l4.a.h(String.valueOf(i14));
                return null;
            case 5:
                int i15 = this.f4128v;
                long[] jArr = (long[]) this.f4129w;
                if (i15 < jArr.length) {
                    this.f4128v = i15 + 1;
                    return new u(jArr[i15]);
                }
                l4.a.h(String.valueOf(i15));
                return null;
            case 6:
                int i16 = this.f4128v;
                short[] sArr = (short[]) this.f4129w;
                if (i16 < sArr.length) {
                    this.f4128v = i16 + 1;
                    return new x(sArr[i16]);
                }
                l4.a.h(String.valueOf(i16));
                return null;
            case 7:
                if (hasNext()) {
                    qe.e eVar = (qe.e) this.f4129w;
                    int i17 = this.f4128v;
                    this.f4128v = i17 + 1;
                    return eVar.get(i17);
                }
                l4.a.c();
                return null;
            default:
                int i18 = this.f4128v;
                this.f4128v = i18 + 1;
                if (i18 >= 0) {
                    return new v(i18, ((Iterator) this.f4129w).next());
                }
                m.l();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4127u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Object[] objArr) {
        this.f4127u = 2;
        objArr.getClass();
        this.f4129w = objArr;
    }

    public f(Iterator it) {
        this.f4127u = 8;
        it.getClass();
        this.f4129w = it;
    }

    public /* synthetic */ f(int i, Object obj) {
        this.f4127u = i;
        this.f4129w = obj;
    }

    public f(t tVar) {
        this.f4127u = 1;
        this.f4129w = tVar;
        this.f4128v = tVar.f16571c;
    }
}
