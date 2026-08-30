package y2;
import p.a;

/* loaded from: classes.dex */
public final class k {
    public static final k e = new k(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f30809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30810b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30811c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30812d;

    public k(int i, int i10, int i11, int i12) {
        this.f30809a = i;
        this.f30810b = i10;
        this.f30811c = i11;
        this.f30812d = i12;
    }

    public final long a() {
        return (((b() / 2) + this.f30810b) & 4294967295L) | (((d() / 2) + this.f30809a) << 32);
    }

    public final int b() {
        return this.f30812d - this.f30810b;
    }

    public final long c() {
        return (this.f30809a << 32) | (this.f30810b & 4294967295L);
    }

    public final int d() {
        return this.f30811c - this.f30809a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f30809a == kVar.f30809a && this.f30810b == kVar.f30810b && this.f30811c == kVar.f30811c && this.f30812d == kVar.f30812d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30812d) + a.b(this.f30811c, a.b(this.f30810b, Integer.hashCode(this.f30809a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f30809a);
        sb2.append(", ");
        sb2.append(this.f30810b);
        sb2.append(", ");
        sb2.append(this.f30811c);
        sb2.append(", ");
        return a5.a.i(sb2, this.f30812d, ')');
    }
}
