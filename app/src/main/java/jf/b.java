package jf;

import java.util.Iterator;
import q.x;
import ya.nd;

/* loaded from: classes.dex */
public class b implements Iterable, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f19189u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19190v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19191w;

    public b(int i, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f19189u = i;
                this.f19190v = nd.a(i, i10, i11);
                this.f19191w = i11;
                return;
            }
            x.n("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        x.n("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.f19189u == bVar.f19189u && this.f19190v == bVar.f19190v && this.f19191w == bVar.f19191w) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19189u * 31) + this.f19190v) * 31) + this.f19191w;
    }

    public boolean isEmpty() {
        int i = this.f19190v;
        int i10 = this.f19191w;
        int i11 = this.f19189u;
        if (i10 > 0) {
            if (i11 <= i) {
                return false;
            }
            return true;
        }
        if (i11 >= i) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f19189u, this.f19190v, this.f19191w);
    }

    public String toString() {
        StringBuilder sb2;
        int i = this.f19190v;
        int i10 = this.f19191w;
        int i11 = this.f19189u;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }
}
