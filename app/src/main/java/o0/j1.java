package o0;
import b2.j;
import f.a;
import k1.r;
import p.a;
import r.q0;
import u.a;
import v.i;

/* loaded from: classes.dex */
public final class j1 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21530a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21531b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21532c;

    public j1(float f10, long j10, boolean z3) {
        this.f21530a = z3;
        this.f21531b = f10;
        this.f21532c = j10;
    }

    @Override // q0
    public final j a(i iVar) {
        return new t(iVar, this.f21530a, this.f21531b, new r(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f21530a != j1Var.f21530a || !y2.a(this.f21531b, j1Var.f21531b)) {
                return false;
            }
            long j10 = j1Var.f21532c;
            int i = r.f19522m;
            return pe.a(this.f21532c, j10);
        }
        return false;
    }

    @Override // q0
    public final int hashCode() {
        int a10 = a.a(Boolean.hashCode(this.f21530a) * 31, 961, this.f21531b);
        int i = r.f19522m;
        return Long.hashCode(this.f21532c) + a10;
    }
}
