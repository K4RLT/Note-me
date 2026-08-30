package z;

import b0.p;
import java.util.Collection;
import t.z0;
import ya.ye;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final m f31665a;

    public c(m mVar) {
        this.f31665a = mVar;
    }

    @Override // b0.p
    public final int a() {
        return this.f31665a.i().f31700n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // b0.p
    public final int b() {
        return Math.min(a() - 1, ((j) qe.l.C(this.f31665a.i().f31697k)).f31704a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // b0.p
    public final int c() {
        long e;
        int i;
        m mVar = this.f31665a;
        if (mVar.i().f31697k.isEmpty()) {
            return 0;
        }
        i i10 = mVar.i();
        if (i10.f31701o == z0.f25597u) {
            e = i10.e() & 4294967295L;
        } else {
            e = i10.e() >> 32;
        }
        int i11 = (int) e;
        int a10 = ye.a(mVar.i());
        if (a10 == 0 || (i = i11 / a10) < 1) {
            return 1;
        }
        return i;
    }

    @Override // b0.p
    public final boolean d() {
        return !((Collection) this.f31665a.i().f31697k).isEmpty();
    }

    @Override // b0.p
    public final int e() {
        return Math.max(0, this.f31665a.g());
    }
}
