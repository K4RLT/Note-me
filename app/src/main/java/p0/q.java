package p0;

import wa.b9;

/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: a, reason: collision with root package name */
    public final d1.f f22352a;

    public q(d1.f fVar) {
        this.f22352a = fVar;
    }

    @Override // p0.f
    public final int a(y2.k kVar, long j10, int i, y2.m mVar) {
        int i10 = (int) (j10 >> 32);
        if (i >= i10) {
            float f10 = (i10 - i) / 2.0f;
            float f11 = 0.0f;
            if (mVar != y2.m.f30814u) {
                f11 = 0.0f * (-1);
            }
            return Math.round((1 + f11) * f10);
        }
        return b9.e(this.f22352a.a(i, i10, mVar), 0, i10 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && this.f22352a.equals(((q) obj).f22352a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f22352a.f15676a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f22352a + ", margin=0)";
    }
}
