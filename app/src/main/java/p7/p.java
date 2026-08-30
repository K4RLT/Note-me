package p7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f22548a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22549b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22550c;

    public p(int i, float f10, float f11) {
        this.f22548a = i;
        this.f22549b = f10;
        this.f22550c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f22548a == pVar.f22548a && Float.compare(this.f22549b, pVar.f22549b) == 0 && Float.compare(this.f22550c, pVar.f22550c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22550c) + a.a(Integer.hashCode(this.f22548a) * 31, 31, this.f22549b);
    }

    public final String toString() {
        return "Iv(idx=" + this.f22548a + ", wMin=" + this.f22549b + ", wMax=" + this.f22550c + ")";
    }
}
