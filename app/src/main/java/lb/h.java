package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.oh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends mb.l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20149v = 1;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f20150w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f20151x;

    public h(c7.a0 a0Var, IBinder iBinder) {
        this.f20150w = iBinder;
        this.f20151x = a0Var;
    }

    @Override // mb.l
    public final void a() {
        IInterface ohVar;
        int i = this.f20149v;
        Object obj = this.f20150w;
        Object obj2 = this.f20151x;
        int i10 = 0;
        switch (i) {
            case 0:
                o oVar = (o) obj2;
                try {
                    oVar.e.f20790m.O1(oVar.f20215a, o.j(), new k(oVar, (ib.h) obj, 1));
                    return;
                } catch (RemoteException e) {
                    o.f20213g.d(e, "keepAlive", new Object[0]);
                    return;
                }
            default:
                mb.n nVar = (mb.n) ((c7.a0) obj2).f3898v;
                IBinder iBinder = (IBinder) obj;
                int i11 = mb.i.f20775v;
                if (iBinder == null) {
                    ohVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    if (queryLocalInterface instanceof mb.j) {
                        ohVar = (mb.j) queryLocalInterface;
                    } else {
                        ohVar = new oh(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService", 3);
                    }
                }
                nVar.f20790m = (mb.j) ohVar;
                nVar.f20781b.e("linkToDeath", new Object[0]);
                try {
                    nVar.f20790m.asBinder().linkToDeath(nVar.f20787j, 0);
                } catch (RemoteException e8) {
                    nVar.f20781b.d(e8, "linkToDeath failed", new Object[0]);
                }
                nVar.f20785g = false;
                ArrayList arrayList = nVar.f20783d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                nVar.f20783d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, ib.h hVar, ib.h hVar2) {
        super(hVar);
        this.f20150w = hVar2;
        this.f20151x = oVar;
    }
}
