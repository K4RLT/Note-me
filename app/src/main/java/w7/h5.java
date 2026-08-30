package w7;
import a5.a;
import p.a;

/* loaded from: classes.dex */
public final class h5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28354a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f28355b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28356c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28357d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28358f;

    public h5(String str, g5 g5Var, float f10, float f11, float f12, float f13) {
        str.getClass();
        g5Var.getClass();
        this.f28354a = str;
        this.f28355b = g5Var;
        this.f28356c = f10;
        this.f28357d = f11;
        this.e = f12;
        this.f28358f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        if (kotlin.jvm.internal.l.a(this.f28354a, h5Var.f28354a) && this.f28355b == h5Var.f28355b && Float.compare(this.f28356c, h5Var.f28356c) == 0 && Float.compare(this.f28357d, h5Var.f28357d) == 0 && Float.compare(this.e, h5Var.e) == 0 && Float.compare(this.f28358f, h5Var.f28358f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28358f) + a.a(a.a(a.a((this.f28355b.hashCode() + (this.f28354a.hashCode() * 31)) * 31, 31, this.f28356c), 31, this.f28357d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Start(id=");
        sb2.append(this.f28354a);
        sb2.append(", kind=");
        sb2.append(this.f28355b);
        sb2.append(", x=");
        a.s(sb2, this.f28356c, ", y=", this.f28357d, ", scale=");
        sb2.append(this.e);
        sb2.append(", rotation=");
        sb2.append(this.f28358f);
        sb2.append(")");
        return sb2.toString();
    }
}
