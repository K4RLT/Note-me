package i8;

import android.os.RemoteException;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.lx0;
import java.util.ArrayList;
import l9.i;

/* loaded from: classes.dex */
public final class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f18344d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18345a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18346b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18347c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        int i = 0;
        this.f18345a = false;
        this.f18346b = initResult.isSuccess();
        ArrayList arrayList = this.f18347c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar = (b) obj;
            if (initResult.isSuccess()) {
                lx0 lx0Var = (lx0) bVar.f18348a;
                lx0Var.getClass();
                try {
                    ((gq) lx0Var.f8177v).a();
                } catch (RemoteException e) {
                    i.d("", e);
                }
            } else {
                String message = initResult.getMessage();
                lx0 lx0Var2 = (lx0) bVar.f18348a;
                lx0Var2.getClass();
                try {
                    ((gq) lx0Var2.f8177v).l3(message);
                } catch (RemoteException e8) {
                    i.d("", e8);
                }
            }
        }
        arrayList.clear();
    }
}
