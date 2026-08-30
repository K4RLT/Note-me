package j3;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18877d;

    public c(int i, int i10, int i11, int i12) {
        this.f18874a = i;
        this.f18875b = i10;
        this.f18876c = i11;
        this.f18877d = i12;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f18874a, cVar2.f18874a), Math.max(cVar.f18875b, cVar2.f18875b), Math.max(cVar.f18876c, cVar2.f18876c), Math.max(cVar.f18877d, cVar2.f18877d));
    }

    public static c b(int i, int i10, int i11, int i12) {
        if (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return e;
        }
        return new c(i, i10, i11, i12);
    }

    public static c c(Insets insets) {
        int i;
        int i10;
        int i11;
        int i12;
        i = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i, i10, i11, i12);
    }

    public final Insets d() {
        return f2.a.j(this.f18874a, this.f18875b, this.f18876c, this.f18877d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f18877d == cVar.f18877d && this.f18874a == cVar.f18874a && this.f18876c == cVar.f18876c && this.f18875b == cVar.f18875b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f18874a * 31) + this.f18875b) * 31) + this.f18876c) * 31) + this.f18877d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f18874a);
        sb2.append(", top=");
        sb2.append(this.f18875b);
        sb2.append(", right=");
        sb2.append(this.f18876c);
        sb2.append(", bottom=");
        return a5.a.i(sb2, this.f18877d, '}');
    }
}
