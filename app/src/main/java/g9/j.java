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
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.yo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr f17662d;
    public final /* synthetic */ n e;

    public j(n nVar, Context context, String str, tr trVar) {
        this.f17660b = context;
        this.f17661c = str;
        this.f17662d = trVar;
        Objects.requireNonNull(nVar);
        this.e = nVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17660b, "native_ad");
        return new f0();
    }

    @Override // g9.o
    public final Object b() {
        h0 h0Var;
        Object e0Var;
        Context context = this.f17660b;
        sl.a(context);
        boolean booleanValue = ((Boolean) e.f17698c.a(sl.f10687cc)).booleanValue();
        n nVar = this.e;
        tr trVar = this.f17662d;
        String str = this.f17661c;
        if (booleanValue) {
            try {
                oa.b bVar = new oa.b(context);
                try {
                    IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                    if (b10 == null) {
                        h0Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof h0) {
                            h0Var = (h0) queryLocalInterface;
                        } else {
                            h0Var = new h0(b10);
                        }
                    }
                    Parcel g22 = h0Var.g2();
                    qh.e(g22, bVar);
                    g22.writeString(str);
                    qh.e(g22, trVar);
                    g22.writeInt(ModuleDescriptor.MODULE_VERSION);
                    Parcel u22 = h0Var.u2(g22, 1);
                    IBinder readStrongBinder = u22.readStrongBinder();
                    u22.recycle();
                    if (readStrongBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (queryLocalInterface2 instanceof g0) {
                        return (g0) queryLocalInterface2;
                    }
                    return new e0(readStrongBinder);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException e8) {
                e = e8;
                qu a10 = pu.a(context);
                nVar.getClass();
                a10.c("ClientApiBroker.createAdLoaderBuilder", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                qu a102 = pu.a(context);
                nVar.getClass();
                a102.c("ClientApiBroker.createAdLoaderBuilder", e);
                return null;
            } catch (l9.j e11) {
                e = e11;
                qu a1022 = pu.a(context);
                nVar.getClass();
                a1022.c("ClientApiBroker.createAdLoaderBuilder", e);
                return null;
            }
        }
        yo yoVar = (yo) nVar.f17679w;
        try {
            oa.b bVar2 = new oa.b(context);
            h0 h0Var2 = (h0) yoVar.d(context);
            Parcel g23 = h0Var2.g2();
            qh.e(g23, bVar2);
            g23.writeString(str);
            qh.e(g23, trVar);
            g23.writeInt(ModuleDescriptor.MODULE_VERSION);
            Parcel u23 = h0Var2.u2(g23, 1);
            IBinder readStrongBinder2 = u23.readStrongBinder();
            u23.recycle();
            if (readStrongBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface3 instanceof g0) {
                e0Var = (g0) queryLocalInterface3;
            } else {
                e0Var = new e0(readStrongBinder2);
            }
            return e0Var;
        } catch (RemoteException e12) {
            e = e12;
            l9.i.g("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (oa.c e13) {
            e = e13;
            l9.i.g("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.A3(new oa.b(this.f17660b), this.f17661c, this.f17662d, ModuleDescriptor.MODULE_VERSION);
    }
}
