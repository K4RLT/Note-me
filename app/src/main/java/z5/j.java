package z5;
import k.a;

import ya.ee;

/* loaded from: classes.dex */
public final class j extends b {
    @Override // z5.c
    public final boolean b() {
        if (!super.b() || !ee.a("MULTI_PROCESS")) {
            return false;
        }
        int i = y5.b.f30913a;
        if (k.f31926c.b()) {
            return l.f31931a.getStatics().isMultiProcessEnabled();
        }
        throw a();
    }
}
