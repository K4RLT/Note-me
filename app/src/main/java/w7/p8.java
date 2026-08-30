package w7;

/* loaded from: classes.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    public final q8 f28913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28914b;

    public p8(q8 q8Var, String str) {
        q8Var.getClass();
        str.getClass();
        this.f28913a = q8Var;
        this.f28914b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        if (this.f28913a == p8Var.f28913a && kotlin.jvm.internal.l.a(this.f28914b, p8Var.f28914b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28914b.hashCode() + (this.f28913a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentItem(kind=" + this.f28913a + ", id=" + this.f28914b + ")";
    }
}
