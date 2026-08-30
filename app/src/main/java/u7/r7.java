package u7;
import g3.a;

/* loaded from: classes.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26797a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26798b;

    public r7(int i, int i10) {
        this.f26797a = i;
        this.f26798b = i10;
    }

    public final int a() {
        return this.f26798b;
    }

    public final int b() {
        return this.f26797a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.f26797a == r7Var.f26797a && this.f26798b == r7Var.f26798b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26798b) + (Integer.hashCode(this.f26797a) * 31);
    }

    public final String toString() {
        return a.j("SheetPair(front=", this.f26797a, ", back=", ")", this.f26798b);
    }
}
