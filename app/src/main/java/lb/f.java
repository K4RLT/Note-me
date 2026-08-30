package lb;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class f extends mb.l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20125v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f20126w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ib.h f20127x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f20128y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ o f20129z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, ib.h hVar, int i, String str, ib.h hVar2, int i10) {
        super(hVar);
        this.f20125v = i;
        this.f20126w = str;
        this.f20127x = hVar2;
        this.f20128y = i10;
        this.f20129z = oVar;
    }

    @Override // mb.l
    public final void a() {
        o oVar = this.f20129z;
        try {
            mb.j jVar = oVar.f20218d.f20790m;
            String str = oVar.f20215a;
            int i = this.f20125v;
            String str2 = this.f20126w;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            jVar.T0(str, bundle, o.j(), new l(oVar, this.f20127x, this.f20125v, this.f20126w, this.f20128y));
        } catch (RemoteException e) {
            o.f20213g.d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
