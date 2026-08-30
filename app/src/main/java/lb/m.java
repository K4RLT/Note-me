package lb;
import z.a;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: x, reason: collision with root package name */
    public final n0 f20199x;

    /* renamed from: y, reason: collision with root package name */
    public final f1 f20200y;

    /* renamed from: z, reason: collision with root package name */
    public final ic.c f20201z;

    public m(o oVar, ib.h hVar, n0 n0Var, f1 f1Var, ic.c cVar) {
        super(oVar, hVar);
        this.f20199x = n0Var;
        this.f20200y = f1Var;
        this.f20201z = cVar;
    }

    @Override // lb.i
    public final void u2(Bundle bundle, Bundle bundle2) {
        super.u2(bundle, bundle2);
        this.f20157v.d(a(bundle, this.f20199x, this.f20200y, this.f20201z));
    }
}
