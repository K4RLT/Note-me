package t0;

import n.d0;
import n.i0;
import n.n0;
import qe.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f25610a;

    public /* synthetic */ a(i0 i0Var) {
        this.f25610a = i0Var;
    }

    public static final Object a(i0 i0Var) {
        Object g8 = i0Var.g(null);
        if (g8 == null) {
            return null;
        }
        if (g8 instanceof d0) {
            d0 d0Var = (d0) g8;
            if (!d0Var.g()) {
                int i = d0Var.f20856b - 1;
                Object e = d0Var.e(i);
                d0Var.j(i);
                e.getClass();
                if (d0Var.g()) {
                    i0Var.k(null);
                }
                if (d0Var.f20856b == 1) {
                    i0Var.m(null, d0Var.d());
                }
                return e;
            }
            l4.a.h("List is empty.");
            return null;
        }
        i0Var.k(null);
        return g8;
    }

    public static final d0 b(i0 i0Var) {
        if (i0Var.i()) {
            d0 d0Var = n0.f20919b;
            d0Var.getClass();
            return d0Var;
        }
        d0 d0Var2 = new d0();
        Object[] objArr = i0Var.f20894c;
        long[] jArr = i0Var.f20892a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i << 3) + i11];
                            if (obj instanceof d0) {
                                d0 d0Var3 = (d0) obj;
                                if (!d0Var3.g()) {
                                    int i12 = d0Var2.f20856b + d0Var3.f20856b;
                                    Object[] objArr2 = d0Var2.f20855a;
                                    if (objArr2.length < i12) {
                                        d0Var2.l(objArr2, i12);
                                    }
                                    k.d(d0Var2.f20856b, 0, d0Var3.f20856b, d0Var3.f20855a, d0Var2.f20855a);
                                    d0Var2.f20856b += d0Var3.f20856b;
                                }
                            } else {
                                obj.getClass();
                                d0Var2.a(obj);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return d0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!this.f25610a.equals(((a) obj).f25610a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25610a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f25610a + ')';
    }
}
