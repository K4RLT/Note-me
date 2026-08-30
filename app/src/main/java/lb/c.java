package lb;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends mb.l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20094v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HashMap f20095w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ib.h f20096x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f20097y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, ib.h hVar, ArrayList arrayList, HashMap hashMap, ib.h hVar2) {
        super(hVar);
        this.f20094v = arrayList;
        this.f20095w = hashMap;
        this.f20096x = hVar2;
        this.f20097y = oVar;
    }

    @Override // mb.l
    public final void a() {
        ib.h hVar = this.f20096x;
        o oVar = this.f20097y;
        ArrayList arrayList = this.f20094v;
        try {
            oVar.f20218d.f20790m.g1(oVar.f20215a, o.n(arrayList), o.m(this.f20095w), new n(oVar, hVar, oVar.f20216b, oVar.f20217c));
        } catch (RemoteException e) {
            o.f20213g.d(e, "startDownload(%s)", arrayList);
            hVar.c(new RuntimeException(e));
        }
    }
}
