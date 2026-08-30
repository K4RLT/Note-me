package lb;
import g.a;
import g.b;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends com.google.android.gms.internal.play_billing.d implements IInterface {

    /* renamed from: v, reason: collision with root package name */
    public final ib.h f20157v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f20158w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, ib.h hVar) {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback", 2);
        this.f20158w = oVar;
        this.f20157v = hVar;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean M0(Parcel parcel, int i) {
        ib.h hVar = this.f20157v;
        o oVar = this.f20158w;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) mb.a(parcel);
                mb.b(parcel);
                v2(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onCancelDownload(%d)", Integer.valueOf(readInt2));
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onGetSession(%d)", Integer.valueOf(readInt3));
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                mb.b(parcel);
                T1(createTypedArrayList);
                return true;
            case 6:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle2.getString("module_name"), bundle2.getString("slice_id"), Integer.valueOf(bundle2.getInt("chunk_number")), Integer.valueOf(bundle2.getInt("session_id")));
                return true;
            case 7:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                v1(bundle3);
                return true;
            case 8:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onNotifyModuleCompleted(%s, sessionId=%d)", bundle4.getString("module_name"), Integer.valueOf(bundle4.getInt("session_id")));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onNotifySessionFailed(%d)", Integer.valueOf(bundle5.getInt("session_id")));
                return true;
            case 11:
                Parcelable.Creator creator8 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) mb.a(parcel);
                Bundle bundle7 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                g2(bundle6, bundle7);
                return true;
            case 12:
                Parcelable.Creator creator9 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) mb.a(parcel);
                Bundle bundle9 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                z1(bundle8, bundle9);
                return true;
            case 13:
                Parcelable.Creator creator10 = Bundle.CREATOR;
                Bundle bundle10 = (Bundle) mb.a(parcel);
                Bundle bundle11 = (Bundle) mb.a(parcel);
                mb.b(parcel);
                u2(bundle10, bundle11);
                return true;
            case 14:
                Parcelable.Creator creator11 = Bundle.CREATOR;
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onRemoveModule()", new Object[0]);
                return true;
            case 15:
                Parcelable.Creator creator12 = Bundle.CREATOR;
                mb.b(parcel);
                oVar.f20218d.d(hVar);
                o.f20213g.e("onCancelDownloads()", new Object[0]);
                return true;
        }
    }

    public void T1(List list) {
        this.f20158w.f20218d.d(this.f20157v);
        o.f20213g.e("onGetSessionStates", new Object[0]);
    }

    public void g2(Bundle bundle, Bundle bundle2) {
        this.f20158w.e.d(this.f20157v);
        o.f20213g.e("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public void u2(Bundle bundle, Bundle bundle2) {
        this.f20158w.f20218d.d(this.f20157v);
        o.f20213g.e("onRequestDownloadInfo()", new Object[0]);
    }

    public void v1(Bundle bundle) {
        mb.n nVar = this.f20158w.f20218d;
        ib.h hVar = this.f20157v;
        nVar.d(hVar);
        int i = bundle.getInt("error_code");
        o.f20213g.c("onError(%d)", Integer.valueOf(i));
        hVar.c(new da.k(i, 1));
    }

    public void v2(int i, Bundle bundle) {
        this.f20158w.f20218d.d(this.f20157v);
        o.f20213g.e("onStartDownload(%d)", Integer.valueOf(i));
    }

    public void z1(Bundle bundle, Bundle bundle2) {
        this.f20158w.f20218d.d(this.f20157v);
        o.f20213g.e("onGetChunkFileDescriptor", new Object[0]);
    }
}
