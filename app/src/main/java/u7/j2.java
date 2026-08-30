package u7;
import g3.a;
import p.a;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26360c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26361d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26362f;

    public j2(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f26358a = i;
        this.f26359b = i10;
        this.f26360c = i11;
        this.f26361d = i12;
        this.e = i13;
        this.f26362f = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (this.f26358a == j2Var.f26358a && this.f26359b == j2Var.f26359b && this.f26360c == j2Var.f26360c && this.f26361d == j2Var.f26361d && this.e == j2Var.e && this.f26362f == j2Var.f26362f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26362f) + a.b(this.e, a.b(this.f26361d, a.b(this.f26360c, a.b(this.f26359b, Integer.hashCode(this.f26358a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder n10 = a.n("CreaseKey(l=", this.f26358a, ", r=", ", d=", this.f26359b);
        a5.a.n(this.f26360c, this.f26361d, ", o=", ", c=", n10);
        n10.append(this.e);
        n10.append(", f=");
        n10.append(this.f26362f);
        n10.append(")");
        return n10.toString();
    }
}
