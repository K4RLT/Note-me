package u7;
import g3.a;
import p.a;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26308c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26309d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26310f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26311g;

    public i2(int i, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f26306a = i;
        this.f26307b = i10;
        this.f26308c = i11;
        this.f26309d = i12;
        this.e = i13;
        this.f26310f = i14;
        this.f26311g = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        if (this.f26306a == i2Var.f26306a && this.f26307b == i2Var.f26307b && this.f26308c == i2Var.f26308c && this.f26309d == i2Var.f26309d && this.e == i2Var.e && this.f26310f == i2Var.f26310f && this.f26311g == i2Var.f26311g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26311g) + a.b(this.f26310f, a.b(this.e, a.b(this.f26309d, a.b(this.f26308c, a.b(this.f26307b, Integer.hashCode(this.f26306a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder n10 = a.n("CaseMeshKey(leftQ=", this.f26306a, ", rightQ=", ", widthQ=", this.f26307b);
        a5.a.n(this.f26308c, this.f26309d, ", leftOffQ=", ", rightOffQ=", n10);
        a5.a.n(this.e, this.f26310f, ", lzQ=", ", rzQ=", n10);
        return a.j(this.f26311g, ")", n10);
    }
}
