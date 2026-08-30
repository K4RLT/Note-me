package c0;
import b0.p;

import t.z0;

/* loaded from: classes.dex */
public final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final d f3368a;

    public l(d dVar) {
        this.f3368a = dVar;
    }

    @Override // p
    public final int a() {
        return this.f3368a.m();
    }

    @Override // p
    public final int b() {
        return Math.min(r0.m() - 1, ((j) qe.l.C(this.f3368a.l().f3419a)).f3356a);
    }

    @Override // p
    public final int c() {
        long e;
        int i;
        d dVar = this.f3368a;
        if (dVar.l().f3419a.size() == 0) {
            return 0;
        }
        x l10 = dVar.l();
        if (l10.e == z0.f25597u) {
            e = l10.e() & 4294967295L;
        } else {
            e = l10.e() >> 32;
        }
        int i10 = (int) e;
        int i11 = dVar.l().f3420b + dVar.l().f3421c;
        if (i11 == 0 || (i = i10 / i11) < 1) {
            return 1;
        }
        return i;
    }

    @Override // p
    public final boolean d() {
        return !this.f3368a.l().f3419a.isEmpty();
    }

    @Override // p
    public final int e() {
        return Math.max(0, this.f3368a.e);
    }
}
