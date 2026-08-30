package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;

/* loaded from: classes.dex */
public final class q extends ph implements u {

    /* renamed from: u, reason: collision with root package name */
    public final a f17695u;

    public q(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f17695u = aVar;
    }

    @Override // g9.u
    public final void l() {
        this.f17695u.L();
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            l();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
