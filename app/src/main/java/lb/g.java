package lb;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class g extends mb.l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20137v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ib.h f20138w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f20139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, ib.h hVar, int i, ib.h hVar2) {
        super(hVar);
        this.f20137v = i;
        this.f20138w = hVar2;
        this.f20139x = oVar;
    }

    @Override // mb.l
    public final void a() {
        o oVar = this.f20139x;
        try {
            mb.j jVar = oVar.f20218d.f20790m;
            String str = oVar.f20215a;
            int i = this.f20137v;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            jVar.I2(str, bundle, o.j(), new j(oVar, this.f20138w, 3));
        } catch (RemoteException e) {
            o.f20213g.d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
