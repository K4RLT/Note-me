package qb;
import a.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;
import java.util.HashMap;
import java.util.Objects;
import ya.ma;

/* loaded from: classes.dex */
public final class o extends com.google.android.gms.internal.play_billing.d {
    public final /* synthetic */ pd.c A;
    public final /* synthetic */ HashMap B;
    public final /* synthetic */ p C;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f23660v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f23661w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ IBinder f23662x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f23663y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f23664z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, String str2, IBinder iBinder, int i, int i10, pd.c cVar, HashMap hashMap) {
        super("com.google.android.play.core.hsdp.protocol.IHpoaServiceListener", 6);
        this.f23660v = str;
        this.f23661w = str2;
        this.f23662x = iBinder;
        this.f23663y = i;
        this.f23664z = i10;
        this.A = cVar;
        this.B = hashMap;
        Objects.requireNonNull(pVar);
        this.C = pVar;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean t1(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) za.a(parcel);
        za.a.b(parcel);
        int i10 = bundle.getInt("statusCode", 9270);
        if (i10 != 9281) {
            String str = this.f23661w;
            String str2 = this.f23660v;
            p pVar = this.C;
            if (i10 != 9282) {
                switch (i10) {
                    case 9271:
                        Log.i("HpoaClientImpl", "HPOA session started");
                        l lVar = pVar.f23665a;
                        if (lVar == null) {
                            Log.e("HpoaClientImpl", "HPOA service is not available");
                            return true;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("appId", str2);
                        bundle2.putString("callerId", str);
                        bundle2.putBinder("windowToken", this.f23662x);
                        bundle2.putInt("clientWindowWidthPx", this.f23663y);
                        bundle2.putInt("clientWindowHeightPx", this.f23664z);
                        lVar.a(new ou1(pVar, 27, bundle2));
                        return true;
                    case 9272:
                        Log.i("HpoaClientImpl", "HPOA session ended");
                        l lVar2 = pVar.f23665a;
                        if (lVar2 != null) {
                            lVar2.c(new k(lVar2, 0));
                        }
                        return true;
                    case 9273:
                        Log.i("HpoaClientImpl", "HPOA UI to be added");
                        return true;
                    case 9274:
                        Log.i("HpoaClientImpl", "HPOA UI attached");
                        return true;
                    case 9275:
                        Log.i("HpoaClientImpl", "HPOA UI to be removed");
                        return true;
                    case 9276:
                        Log.i("HpoaClientImpl", "HPOA UI detached");
                        return true;
                    case 9277:
                        Log.i("HpoaClientImpl", "HPOA service requests to be disconnected");
                        l lVar3 = pVar.f23665a;
                        if (lVar3 == null) {
                            Log.e("HpoaClientImpl", "HPOA service is not available");
                            return true;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("appId", str2);
                        bundle3.putString("callerId", str);
                        lVar3.a(new pu1(pVar, 25, bundle3));
                        return true;
                    default:
                        Log.e("HpoaClientImpl", "HPOA error: " + i10);
                        Bundle bundle4 = new Bundle();
                        if (i10 == 9278) {
                            bundle4.putString("errorMessage", "HPOA internal error");
                        } else if (i10 == 9279) {
                            bundle4.putString("errorMessage", "HPOA authentication error");
                        } else if (i10 == 9280) {
                            bundle4.putString("errorMessage", "HPOA invalid parameter");
                        } else {
                            bundle4.putString("errorMessage", "HPOA unknown error");
                        }
                        this.A.K(bundle4);
                        l lVar4 = pVar.f23665a;
                        if (lVar4 != null) {
                            lVar4.c(new k(lVar4, 0));
                            return true;
                        }
                        return true;
                }
            }
            Activity activity = pVar.f23666b;
            String packageName = activity.getPackageName();
            HashMap hashMap = this.B;
            Intent b10 = ma.b(str2, str, packageName, hashMap);
            b10.addFlags(536870912);
            if (activity.getPackageManager().resolveActivity(b10, 65536) != null) {
                activity.startActivityForResult(b10, 0);
                return true;
            }
            activity.startActivity(ma.a(str2, str, hashMap));
            return true;
        }
        Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
        return true;
    }
}
