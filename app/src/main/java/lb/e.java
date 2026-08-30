package lb;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e extends mb.l {
    public final /* synthetic */ ib.h A;
    public final /* synthetic */ o B;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20117v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f20118w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f20119x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f20120y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f20121z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, ib.h hVar, int i, String str, String str2, int i10, ib.h hVar2, int i11) {
        super(hVar);
        this.f20117v = i11;
        this.f20118w = i;
        this.f20119x = str;
        this.f20120y = str2;
        this.f20121z = i10;
        this.A = hVar2;
        this.B = oVar;
    }

    @Override // mb.l
    public final void a() {
        switch (this.f20117v) {
            case 0:
                o oVar = this.B;
                try {
                    mb.j jVar = oVar.f20218d.f20790m;
                    String str = oVar.f20215a;
                    int i = this.f20118w;
                    String str2 = this.f20119x;
                    String str3 = this.f20120y;
                    int i10 = this.f20121z;
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", i);
                    bundle.putString("module_name", str2);
                    bundle.putString("slice_id", str3);
                    bundle.putInt("chunk_number", i10);
                    jVar.D3(str, bundle, o.j(), new j(oVar, this.A, 2));
                    return;
                } catch (RemoteException e) {
                    o.f20213g.d(e, "notifyChunkTransferred", new Object[0]);
                    return;
                }
            default:
                ib.h hVar = this.A;
                int i11 = this.f20121z;
                String str4 = this.f20120y;
                String str5 = this.f20119x;
                int i12 = this.f20118w;
                o oVar2 = this.B;
                try {
                    mb.j jVar2 = oVar2.f20218d.f20790m;
                    String str6 = oVar2.f20215a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("session_id", i12);
                    bundle2.putString("module_name", str5);
                    bundle2.putString("slice_id", str4);
                    bundle2.putInt("chunk_number", i11);
                    jVar2.i1(str6, bundle2, o.j(), new j(oVar2, hVar, 1));
                    return;
                } catch (RemoteException e8) {
                    o.f20213g.c("getChunkFileDescriptor(%s, %s, %d, session=%d)", str5, str4, Integer.valueOf(i11), Integer.valueOf(i12));
                    hVar.c(new RuntimeException(e8));
                    return;
                }
        }
    }
}
