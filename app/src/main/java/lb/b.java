package lb;
import n.b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends mb.l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20083v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ib.h f20084w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f20085x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f20086y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mb.n nVar, ib.h hVar, ib.h hVar2, mb.l lVar) {
        super(hVar);
        this.f20083v = 3;
        this.f20084w = hVar2;
        this.f20086y = lVar;
        this.f20085x = nVar;
    }

    @Override // mb.l
    public final void a() {
        switch (this.f20083v) {
            case 0:
                String str = (String) this.f20086y;
                o oVar = (o) this.f20085x;
                try {
                    mb.j jVar = oVar.f20218d.f20790m;
                    String str2 = oVar.f20215a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", 0);
                    bundle.putString("module_name", str);
                    jVar.A2(str2, bundle, o.j(), new j(oVar, this.f20084w, 4));
                    return;
                } catch (RemoteException e) {
                    o.f20213g.d(e, "removePack(%s)", str);
                    return;
                }
            case 1:
                o oVar2 = (o) this.f20085x;
                List list = (List) this.f20086y;
                try {
                    oVar2.f20218d.f20790m.N1(oVar2.f20215a, o.n(list), o.j(), new j(oVar2, this.f20084w, 0));
                    return;
                } catch (RemoteException e8) {
                    o.f20213g.d(e8, "cancelDownloads(%s)", list);
                    return;
                }
            case 2:
                ib.h hVar = this.f20084w;
                o oVar3 = (o) this.f20085x;
                try {
                    oVar3.f20218d.f20790m.Z0(oVar3.f20215a, o.m((HashMap) this.f20086y), new k(oVar3, hVar, 0));
                    return;
                } catch (RemoteException e10) {
                    o.f20213g.d(e10, "syncPacks", new Object[0]);
                    hVar.c(new RuntimeException(e10));
                    return;
                }
            default:
                synchronized (((mb.n) this.f20085x).f20784f) {
                    try {
                        mb.n nVar = (mb.n) this.f20085x;
                        ib.h hVar2 = this.f20084w;
                        nVar.e.add(hVar2);
                        hVar2.f18363a.b(new j6.e(nVar, hVar2));
                        if (((mb.n) this.f20085x).f20788k.getAndIncrement() > 0) {
                            ((mb.n) this.f20085x).f20781b.e("Already connected to the service.", new Object[0]);
                        }
                        mb.n.b((mb.n) this.f20085x, (mb.l) this.f20086y);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, ib.h hVar, Object obj, ib.h hVar2, int i) {
        super(hVar);
        this.f20083v = i;
        this.f20086y = obj;
        this.f20084w = hVar2;
        this.f20085x = oVar;
    }
}
