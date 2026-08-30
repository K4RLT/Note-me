package ja;
import a.a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ib.h;
import q.x;
import wa.i6;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.play_billing.d implements IInterface {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f19098v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f19099w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 3);
        this.f19098v = i;
        this.f19099w = hVar;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean R0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    sa.a.b(parcel);
                    x.h();
                    return false;
                }
                sa.a.b(parcel);
                x.h();
                return false;
            }
            Status status = (Status) sa.a(parcel, Status.CREATOR);
            ia.c cVar = (ia.c) sa.a(parcel, ia.c.CREATOR);
            sa.a.b(parcel);
            switch (this.f19098v) {
                case 1:
                    i6.a(status, cVar, this.f19099w);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        Status status2 = (Status) sa.a(parcel, Status.CREATOR);
        ia.a aVar = (ia.a) sa.a(parcel, ia.a.CREATOR);
        sa.a.b(parcel);
        switch (this.f19098v) {
            case 0:
                i6.a(status2, aVar, this.f19099w);
                return true;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
