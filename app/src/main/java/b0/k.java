package b0;
import a.a;
import w.a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1222a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1223b;

    public k(int i, int i10) {
        boolean z3;
        this.f1222a = i;
        this.f1223b = i10;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            a.a("negative start index");
        }
        if (!(i10 >= i)) {
            a.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f1222a == kVar.f1222a && this.f1223b == kVar.f1223b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1223b) + (Integer.hashCode(this.f1222a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f1222a);
        sb2.append(", end=");
        return a5.a.i(sb2, this.f1223b, ')');
    }
}
