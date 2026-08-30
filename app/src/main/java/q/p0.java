package q;
import q.k;

import b8.u4;

/* loaded from: classes.dex */
public final class p0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f22970a;

    public p0(int i) {
        this.f22970a = i;
    }

    @Override // k
    public final p1 a(l1 l1Var) {
        return new u4(this.f22970a, 11);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p0) && ((p0) obj).f22970a == this.f22970a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22970a;
    }
}
