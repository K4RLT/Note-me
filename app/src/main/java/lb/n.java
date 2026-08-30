package lb;
import z.a;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: x, reason: collision with root package name */
    public final n0 f20209x;

    /* renamed from: y, reason: collision with root package name */
    public final f1 f20210y;

    public n(o oVar, ib.h hVar, n0 n0Var, f1 f1Var) {
        super(oVar, hVar);
        this.f20209x = n0Var;
        this.f20210y = f1Var;
    }

    @Override // lb.i
    public final void v2(int i, Bundle bundle) {
        super.v2(i, bundle);
        this.f20157v.d(a(bundle, this.f20209x, this.f20210y, t.f20275w));
    }
}
