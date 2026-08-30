package c3;
import p.a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3803a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3804b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3806d;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f3805c = c0.f3757u;
    public final boolean e = true;

    /* renamed from: f, reason: collision with root package name */
    public final String f3807f = "";

    public u(boolean z3, boolean z9, boolean z10) {
        this.f3803a = z3;
        this.f3804b = z9;
        this.f3806d = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (this.f3803a != uVar.f3803a || this.f3804b != uVar.f3804b || this.f3805c != uVar.f3805c || this.f3806d != uVar.f3806d || this.e != uVar.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a.c((this.f3805c.hashCode() + a.c(Boolean.hashCode(this.f3803a) * 31, 31, this.f3804b)) * 31, 31, this.f3806d);
    }
}
