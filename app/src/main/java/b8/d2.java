package b8;
import g3.a;
import p.a;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1965b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1967d;

    public d2(int i, int i10, int i11, int i12) {
        this.f1964a = i;
        this.f1965b = i10;
        this.f1966c = i11;
        this.f1967d = i12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d2) {
                d2 d2Var = (d2) obj;
                if (this.f1964a != d2Var.f1964a || this.f1965b != d2Var.f1965b || this.f1966c != d2Var.f1966c || this.f1967d != d2Var.f1967d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1967d) + a.b(this.f1966c, a.b(this.f1965b, Integer.hashCode(this.f1964a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n10 = a.n("FactoryPalette(ink=", this.f1964a, ", soft=", ", accent=", this.f1965b);
        n10.append(this.f1966c);
        n10.append(", accent2=");
        n10.append(this.f1967d);
        n10.append(")");
        return n10.toString();
    }
}
