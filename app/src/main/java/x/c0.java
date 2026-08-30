package x;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29950c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29951d;

    public c0(int i, int i10, int i11, int i12) {
        this.f29948a = i;
        this.f29949b = i10;
        this.f29950c = i11;
        this.f29951d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f29948a == c0Var.f29948a && this.f29949b == c0Var.f29949b && this.f29950c == c0Var.f29950c && this.f29951d == c0Var.f29951d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f29948a * 31) + this.f29949b) * 31) + this.f29950c) * 31) + this.f29951d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f29948a);
        sb2.append(", top=");
        sb2.append(this.f29949b);
        sb2.append(", right=");
        sb2.append(this.f29950c);
        sb2.append(", bottom=");
        return a5.a.i(sb2, this.f29951d, ')');
    }
}
