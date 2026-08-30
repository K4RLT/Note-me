package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y2 extends a5 {
    public final void d(b3 b3Var) {
        b();
        z2.v((z2) this.f13639v, (c3) b3Var.a());
    }

    public final void e(c3 c3Var) {
        b();
        z2.v((z2) this.f13639v, c3Var);
    }

    public final long f() {
        return ((z2) this.f13639v).A();
    }

    public final c3 g(int i) {
        return ((z2) this.f13639v).q(i);
    }

    public final void h(long j10) {
        b();
        z2.s(j10, (z2) this.f13639v);
    }

    public final long i() {
        return ((z2) this.f13639v).B();
    }

    public final String j() {
        return ((z2) this.f13639v).D();
    }

    public final List k() {
        return Collections.unmodifiableList(((z2) this.f13639v).E());
    }
}
