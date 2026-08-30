package q4;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Locale;
import q.x;
import w7.i1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f23449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23450b;

    /* renamed from: c, reason: collision with root package name */
    public final double[] f23451c;

    public b(int i, double[] dArr) {
        int length = ((dArr.length + i) - 1) / i;
        this.f23449a = length;
        this.f23450b = i;
        this.f23451c = dArr;
        if (dArr.length == length * i) {
            return;
        }
        Locale locale = Locale.ROOT;
        x.n(i1.c("Invalid number of elements in 'values' Expected:", dArr.length, i & length, " Actual:"));
        throw null;
    }

    public static void g(b bVar) {
        Arrays.fill(bVar.f23451c, 0.0d);
        int i = bVar.f23449a;
        int i10 = bVar.f23450b;
        if (i >= i10) {
            i = i10;
        }
        for (int i11 = 0; i11 < i; i11++) {
            bVar.f(i11, i11, 1.0d);
        }
    }

    public final void a(b bVar, b bVar2) {
        int i = bVar2.f23449a;
        int i10 = this.f23449a;
        if (i10 == i) {
            int i11 = bVar.f23449a;
            int i12 = bVar.f23450b;
            int i13 = this.f23450b;
            if (i13 == i11 && i12 == bVar2.f23450b) {
                for (int i14 = 0; i14 < i10; i14++) {
                    for (int i15 = 0; i15 < i12; i15++) {
                        double d2 = 0.0d;
                        for (int i16 = 0; i16 < i13; i16++) {
                            d2 += bVar.c(i16, i15) * c(i14, i16);
                        }
                        bVar2.f(i14, i15, d2);
                    }
                }
                return;
            }
        }
        Locale locale = Locale.ROOT;
        String h3 = h();
        String h10 = bVar.h();
        String h11 = bVar2.h();
        StringBuilder q10 = p.a.q("The matrices dimensions are not conformant for a dot matrix operation. this:", h3, " that:", h10, " result:");
        q10.append(h11);
        throw new IllegalArgumentException(q10.toString());
    }

    public final void b(b bVar, b bVar2) {
        int i = bVar2.f23449a;
        int i10 = this.f23449a;
        if (i10 == i) {
            int i11 = bVar.f23450b;
            int i12 = bVar.f23449a;
            int i13 = this.f23450b;
            if (i13 == i11 && i12 == bVar2.f23450b) {
                for (int i14 = 0; i14 < i10; i14++) {
                    for (int i15 = 0; i15 < i12; i15++) {
                        double d2 = 0.0d;
                        for (int i16 = 0; i16 < i13; i16++) {
                            d2 += bVar.c(i15, i16) * c(i14, i16);
                        }
                        bVar2.f(i14, i15, d2);
                    }
                }
                return;
            }
        }
        Locale locale = Locale.ROOT;
        String h3 = h();
        String h10 = bVar.h();
        String h11 = bVar2.h();
        StringBuilder q10 = p.a.q("The matrices dimensions are not conformant for a transpose operation. this:", h3, " that:", h10, " result:");
        q10.append(h11);
        throw new IllegalArgumentException(q10.toString());
    }

    public final double c(int i, int i10) {
        int i11;
        if (i >= 0 && i < this.f23449a && i10 >= 0 && i10 < (i11 = this.f23450b)) {
            return this.f23451c[(i * i11) + i10];
        }
        Locale locale = Locale.ROOT;
        String h3 = h();
        StringBuilder n10 = g3.a.n("Invalid matrix index value. i:", i, " j:", " not available in ", i10);
        n10.append(h3);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final void d(b bVar) {
        if (this.f23449a == bVar.f23449a && this.f23450b == bVar.f23450b) {
            int i = 0;
            while (true) {
                double[] dArr = this.f23451c;
                if (i < dArr.length) {
                    dArr[i] = dArr[i] - bVar.f23451c[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            Locale locale = Locale.ROOT;
            x.n(p.a.l("The matrix dimensions are not the same. this:", h(), " that:", bVar.h()));
        }
    }

    public final void e(b bVar) {
        if (this.f23449a == bVar.f23449a && this.f23450b == bVar.f23450b) {
            int i = 0;
            while (true) {
                double[] dArr = this.f23451c;
                if (i < dArr.length) {
                    dArr[i] = dArr[i] + bVar.f23451c[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            Locale locale = Locale.ROOT;
            x.n(p.a.l("The matrix dimensions are not the same. this:", h(), " that:", bVar.h()));
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f23449a == bVar.f23449a && this.f23450b == bVar.f23450b) {
                    int i = 0;
                    while (true) {
                        double[] dArr = this.f23451c;
                        if (i < dArr.length) {
                            if (dArr[i] != bVar.f23451c[i]) {
                                break;
                            }
                            i++;
                        } else {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i, int i10, double d2) {
        int i11;
        if (i >= 0 && i < this.f23449a && i10 >= 0 && i10 < (i11 = this.f23450b)) {
            this.f23451c[(i * i11) + i10] = d2;
            return;
        }
        Locale locale = Locale.ROOT;
        String h3 = h();
        StringBuilder n10 = g3.a.n("Invalid matrix index value. i:", i, " j:", " not available in ", i10);
        n10.append(h3);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f23449a);
        sb2.append("x");
        return p.a.j(this.f23450b, ")", sb2);
    }

    public final int hashCode() {
        int i = (this.f23449a * FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS) + this.f23450b;
        for (double d2 : this.f23451c) {
            i = (i * 37) + Double.hashCode(d2);
        }
        return i;
    }

    public final String toString() {
        String str;
        int i = this.f23449a;
        int i10 = this.f23450b;
        StringBuilder sb2 = new StringBuilder(i * i10 * 8);
        a5.a.n(i, i10, "x", " [", sb2);
        int i11 = 0;
        while (true) {
            double[] dArr = this.f23451c;
            if (i11 < dArr.length) {
                if (i11 > 0) {
                    if (i11 % i10 == 0) {
                        str = "; ";
                    } else {
                        str = ", ";
                    }
                    sb2.append(str);
                }
                sb2.append(dArr[i11]);
                i11++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }

    public b(int i, int i10) {
        this.f23449a = i;
        this.f23450b = i10;
        this.f23451c = new double[i * i10];
    }
}
