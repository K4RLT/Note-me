package lb;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends mb.l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20102v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HashMap f20103w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ib.h f20104x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ic.c f20105y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ o f20106z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, ib.h hVar, ArrayList arrayList, HashMap hashMap, ib.h hVar2, ic.c cVar) {
        super(hVar);
        this.f20102v = arrayList;
        this.f20103w = hashMap;
        this.f20104x = hVar2;
        this.f20105y = cVar;
        this.f20106z = oVar;
    }

    @Override // mb.l
    public final void a() {
        ib.h hVar = this.f20104x;
        o oVar = this.f20106z;
        ArrayList arrayList = this.f20102v;
        try {
            oVar.f20218d.f20790m.o2(oVar.f20215a, o.n(arrayList), o.m(this.f20103w), new m(oVar, hVar, oVar.f20216b, oVar.f20217c, this.f20105y));
        } catch (RemoteException e) {
            o.f20213g.d(e, "getPackStates(%s)", arrayList);
            hVar.c(new RuntimeException(e));
        }
    }
}
