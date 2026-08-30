package a0;
import w.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f19a;

    public b(int i) {
        boolean z3;
        this.f19a = i;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            a.a("Provided count should be larger than zero");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.f19a == ((b) obj).f19a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19a;
    }
}
