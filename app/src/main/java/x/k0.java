package x;
import f.a;
import f.b;
import p.a;
import x.j0;
import y.a;

/* loaded from: classes.dex */
public final class k0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f29969a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29970b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29971c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29972d;

    public k0(float f10, float f11, float f12, float f13) {
        boolean z3;
        boolean z9;
        boolean z10;
        this.f29969a = f10;
        this.f29970b = f11;
        this.f29971c = f12;
        this.f29972d = f13;
        if (f10 >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f11 >= 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z3 & z9;
        if (f12 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(z11 & z10 & (f13 >= 0.0f))) {
            a.a("Padding must be non-negative");
        }
    }

    @Override // j0
    public final float a(y2.m mVar) {
        if (mVar == y2.m.f30814u) {
            return this.f29971c;
        }
        return this.f29969a;
    }

    @Override // j0
    public final float b(y2.m mVar) {
        if (mVar == y2.m.f30814u) {
            return this.f29969a;
        }
        return this.f29971c;
    }

    @Override // j0
    public final float c() {
        return this.f29972d;
    }

    @Override // j0
    public final float d() {
        return this.f29970b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (y2.a(this.f29969a, k0Var.f29969a) && y2.a(this.f29970b, k0Var.f29970b) && y2.a(this.f29971c, k0Var.f29971c) && y2.a(this.f29972d, k0Var.f29972d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29972d) + a.a(a.a(Float.hashCode(this.f29969a) * 31, 31, this.f29970b), 31, this.f29971c);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) y2.b(this.f29969a)) + ", top=" + ((Object) y2.b(this.f29970b)) + ", end=" + ((Object) y2.b(this.f29971c)) + ", bottom=" + ((Object) y2.b(this.f29972d)) + ')';
    }
}
