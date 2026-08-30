package g9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.uv;
import com.google.android.gms.internal.ads.wv;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17572c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr f17573d;

    public b(n nVar, Context context, String str, tr trVar) {
        this.f17571b = context;
        this.f17572c = str;
        this.f17573d = trVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17571b, "rewarded");
        return new uv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g9.o
    public final Object b() {
        aw awVar;
        String str = this.f17572c;
        tr trVar = this.f17573d;
        Context context = this.f17571b;
        oa.b bVar = new oa.b(context);
        try {
            try {
                IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b10 == null) {
                    awVar = 0;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof aw) {
                        awVar = (aw) queryLocalInterface;
                    } else {
                        awVar = new oh(b10, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 0);
                    }
                }
                IBinder u42 = awVar.u4(bVar, str, trVar);
                if (u42 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = u42.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                if (queryLocalInterface2 instanceof wv) {
                    return (wv) queryLocalInterface2;
                }
                return new tv(u42);
            } catch (Exception e) {
                throw new Exception(e);
            }
        } catch (RemoteException e8) {
            e = e8;
            l9.i.i(e, "#007 Could not call remote method.");
            return null;
        } catch (l9.j e10) {
            e = e10;
            l9.i.i(e, "#007 Could not call remote method.");
            return null;
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.O2(new oa.b(this.f17571b), this.f17572c, this.f17573d, ModuleDescriptor.MODULE_VERSION);
    }
}
