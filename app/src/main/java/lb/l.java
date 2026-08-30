package lb;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class l extends i {
    public final /* synthetic */ o A;

    /* renamed from: x, reason: collision with root package name */
    public final int f20180x;

    /* renamed from: y, reason: collision with root package name */
    public final String f20181y;

    /* renamed from: z, reason: collision with root package name */
    public final int f20182z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, ib.h hVar, int i, String str, int i10) {
        super(oVar, hVar);
        this.A = oVar;
        this.f20180x = i;
        this.f20181y = str;
        this.f20182z = i10;
    }

    @Override // lb.i
    public final void v1(Bundle bundle) {
        o oVar = this.A;
        oVar.f20218d.d(this.f20157v);
        o.f20213g.c("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.f20182z;
        if (i > 0) {
            oVar.l(this.f20181y, this.f20180x, i - 1);
        }
    }
}
