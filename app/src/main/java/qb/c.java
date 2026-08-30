package qb;
import a.a;
import d.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ml;

/* loaded from: classes.dex */
public final class c extends com.google.android.gms.internal.play_billing.d {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f23623v = 1;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f23624w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f23625x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener", 6);
        this.f23625x = dVar;
        this.f23624w = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean t1(Parcel parcel, int i) {
        switch (this.f23623v) {
            case 0:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    za.a.b(parcel);
                    l lVar = this.f23624w.f23627b;
                    lVar.getClass();
                    lVar.c(new k(lVar, 0));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle = (Bundle) za.a(parcel);
                za.a.b(parcel);
                h9.e eVar = (h9.e) ((z5.h) this.f23625x).f31922v;
                int i10 = bundle.getInt("hsdpPrewarmStatusCode", 1);
                if (!bundle.containsKey("hsdpPrewarmStatusCode")) {
                    Log.w("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: cannot find status code");
                }
                if (Log.isLoggable("HsdpClientImpl", 3)) {
                    Log.d("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: " + i10);
                }
                String string = bundle.getString("errorMessage", "");
                if (i10 == 2) {
                    return true;
                }
                if (i10 != 6) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("errorCode", i10);
                    bundle2.putString("errorMessage", string);
                    if (eVar == null) {
                        return true;
                    }
                    try {
                        eVar.K(bundle2);
                        return true;
                    } catch (RemoteException e) {
                        l9.i.d("RemoteException in HsdpPrewarmListener.onError", e);
                        return true;
                    }
                }
                Bundle bundle3 = new Bundle();
                if (eVar == null) {
                    return true;
                }
                try {
                    eVar.Y2(bundle3);
                    return true;
                } catch (RemoteException e8) {
                    l9.i.d("RemoteException in HsdpPrewarmListener.onCompleted", e8);
                    return true;
                }
            default:
                boolean z3 = true;
                if (i != 1) {
                    if (i != 2) {
                        z3 = false;
                    } else {
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        za.a.b(parcel);
                        l lVar2 = this.f23624w.f23627b;
                        lVar2.getClass();
                        lVar2.c(new k(lVar2, 0));
                    }
                } else {
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle bundle4 = (Bundle) za.a(parcel);
                    za.a.b(parcel);
                    d dVar = (d) this.f23625x;
                    int i11 = bundle4.getInt("hsdpStatusCode", 1);
                    if (!bundle4.containsKey("hsdpStatusCode")) {
                        Log.w("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find status code");
                    }
                    String string2 = bundle4.getString("targetPackage", "");
                    if (Log.isLoggable("HsdpClientImpl", 4)) {
                        Log.i("HsdpClientImpl", "HsdpServiceListener.onStateChange: " + i11 + " for target package: " + string2);
                    }
                    if (string2.isEmpty()) {
                        Log.e("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find target package");
                    } else {
                        switch (i11) {
                            case 1:
                                b(dVar, string2, 4, new ml(i11, 3, this, bundle4.getString("errorMessage", "HSDP service unknown status"), string2));
                                break;
                            case 2:
                                break;
                            case 3:
                                b(dVar, string2, 2, null);
                                break;
                            case 4:
                                b(dVar, string2, 3, null);
                                break;
                            case 5:
                                b(dVar, string2, 4, new pu1(this, 23, string2));
                                break;
                            case 6:
                                b(dVar, string2, 4, new ml(i11, 3, this, bundle4.getString("errorMessage", "HSDP service error"), string2));
                                break;
                            case 7:
                                b(dVar, string2, 5, new iv1(this, 24, string2));
                                break;
                            case 8:
                                b(dVar, string2, 4, new ml(i11, 3, this, bundle4.getString("errorMessage", "HSDP service cancelled"), string2));
                                break;
                            default:
                                Log.w("HsdpClientImpl", "Ignoring HSDP service unsupported status code: " + i11 + " for target package: " + string2);
                                break;
                        }
                        return z3;
                    }
                }
                return z3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, z5.h hVar) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener", 6);
        this.f23625x = hVar;
        this.f23624w = dVar;
    }
}
