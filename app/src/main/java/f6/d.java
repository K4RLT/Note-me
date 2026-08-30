package f6;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16759a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16760b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16761c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16762d;

    public d(boolean z3, boolean z9, boolean z10, boolean z11) {
        this.f16759a = z3;
        this.f16760b = z9;
        this.f16761c = z10;
        this.f16762d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16759a == dVar.f16759a && this.f16760b == dVar.f16760b && this.f16761c == dVar.f16761c && this.f16762d == dVar.f16762d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = 1;
        boolean z3 = this.f16759a;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = i10 * 31;
        boolean z9 = this.f16760b;
        int i12 = z9;
        if (z9 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z10 = this.f16761c;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z11 = this.f16762d;
        if (!z11) {
            i = z11 ? 1 : 0;
        }
        return i15 + i;
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f16759a + ", isValidated=" + this.f16760b + ", isMetered=" + this.f16761c + ", isNotRoaming=" + this.f16762d + ')';
    }
}
