package p0;

import wa.b9;

/* loaded from: classes.dex */
public final class r implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d1.i f22353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22354b;

    public r(d1.i iVar, int i) {
        this.f22353a = iVar;
        this.f22354b = i;
    }

    @Override // p0.g
    public final int a(y2.k kVar, long j10, int i) {
        int i10 = (int) (j10 & 4294967295L);
        int i11 = this.f22354b;
        if (i >= i10 - (i11 * 2)) {
            return Math.round((1 + 0.0f) * ((i10 - i) / 2.0f));
        }
        return b9.e(this.f22353a.a(i, i10), i11, (i10 - i11) - i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!this.f22353a.equals(rVar.f22353a) || this.f22354b != rVar.f22354b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22354b) + (Float.hashCode(this.f22353a.f15679a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f22353a);
        sb2.append(", margin=");
        return a5.a.i(sb2, this.f22354b, ')');
    }
}
