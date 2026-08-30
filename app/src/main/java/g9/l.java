package g9;
import r.e;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.yo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f17669c;

    public l(n nVar, Context context) {
        this.f17668b = context;
        Objects.requireNonNull(nVar);
        this.f17669c = nVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17668b, "mobile_ads_settings");
        return new e1();
    }

    @Override // g9.o
    public final Object b() {
        g1 g1Var;
        Object d1Var;
        Context context = this.f17668b;
        sl.a(context);
        boolean booleanValue = ((Boolean) e.f17698c.a(sl.f10687cc)).booleanValue();
        n nVar = this.f17669c;
        if (booleanValue) {
            try {
                oa.b bVar = new oa.b(context);
                try {
                    IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                    if (b10 == null) {
                        g1Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof g1) {
                            g1Var = (g1) queryLocalInterface;
                        } else {
                            g1Var = new g1(b10);
                        }
                    }
                    Parcel g22 = g1Var.g2();
                    qh.e(g22, bVar);
                    g22.writeInt(ModuleDescriptor.MODULE_VERSION);
                    Parcel u22 = g1Var.u2(g22, 1);
                    IBinder readStrongBinder = u22.readStrongBinder();
                    u22.recycle();
                    if (readStrongBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    if (queryLocalInterface2 instanceof f1) {
                        return (f1) queryLocalInterface2;
                    }
                    return new d1(readStrongBinder);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException e8) {
                e = e8;
                qu a10 = pu.a(context);
                nVar.getClass();
                a10.c("ClientApiBroker.getMobileAdsSettingsManager", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                qu a102 = pu.a(context);
                nVar.getClass();
                a102.c("ClientApiBroker.getMobileAdsSettingsManager", e);
                return null;
            } catch (l9.j e11) {
                e = e11;
                qu a1022 = pu.a(context);
                nVar.getClass();
                a1022.c("ClientApiBroker.getMobileAdsSettingsManager", e);
                return null;
            }
        }
        yo yoVar = (yo) nVar.f17680x;
        try {
            oa.b bVar2 = new oa.b(context);
            g1 g1Var2 = (g1) yoVar.d(context);
            Parcel g23 = g1Var2.g2();
            qh.e(g23, bVar2);
            g23.writeInt(ModuleDescriptor.MODULE_VERSION);
            Parcel u23 = g1Var2.u2(g23, 1);
            IBinder readStrongBinder2 = u23.readStrongBinder();
            u23.recycle();
            if (readStrongBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface3 instanceof f1) {
                d1Var = (f1) queryLocalInterface3;
            } else {
                d1Var = new d1(readStrongBinder2);
            }
            return d1Var;
        } catch (RemoteException e12) {
            e = e12;
            l9.i.g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (oa.c e13) {
            e = e13;
            l9.i.g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.u1(new oa.b(this.f17668b), ModuleDescriptor.MODULE_VERSION);
    }
}
