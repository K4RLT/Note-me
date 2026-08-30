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
public final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f17664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f17665d;

    public k(n nVar, Context context, tr trVar) {
        this.f17663b = context;
        this.f17664c = trVar;
        Objects.requireNonNull(nVar);
        this.f17665d = nVar;
    }

    @Override // g9.o
    public final /* bridge */ /* synthetic */ Object a() {
        n.B(this.f17663b, "ads_preloader");
        return null;
    }

    @Override // g9.o
    public final Object b() {
        Object q0Var;
        s0 s0Var;
        r0 q0Var2;
        Context context = this.f17663b;
        oa.b bVar = new oa.b(context);
        sl.a(context);
        boolean booleanValue = ((Boolean) e.f17698c.a(sl.f10687cc)).booleanValue();
        n nVar = this.f17665d;
        tr trVar = this.f17664c;
        if (booleanValue) {
            try {
                try {
                    IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                    if (b10 == null) {
                        s0Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                        if (queryLocalInterface instanceof s0) {
                            s0Var = (s0) queryLocalInterface;
                        } else {
                            s0Var = new s0(b10);
                        }
                    }
                    Parcel g22 = s0Var.g2();
                    qh.e(g22, bVar);
                    qh.e(g22, trVar);
                    g22.writeInt(ModuleDescriptor.MODULE_VERSION);
                    Parcel u22 = s0Var.u2(g22, 1);
                    IBinder readStrongBinder = u22.readStrongBinder();
                    u22.recycle();
                    if (readStrongBinder == null) {
                        q0Var2 = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                        if (queryLocalInterface2 instanceof r0) {
                            q0Var2 = (r0) queryLocalInterface2;
                        } else {
                            q0Var2 = new q0(readStrongBinder);
                        }
                    }
                    q0Var2.m1(trVar);
                    return q0Var2;
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException e8) {
                e = e8;
                qu a10 = pu.a(context);
                nVar.getClass();
                a10.c("ClientApiBroker.getAdPreloader", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                qu a102 = pu.a(context);
                nVar.getClass();
                a102.c("ClientApiBroker.getAdPreloader", e);
                return null;
            } catch (l9.j e11) {
                e = e11;
                qu a1022 = pu.a(context);
                nVar.getClass();
                a1022.c("ClientApiBroker.getAdPreloader", e);
                return null;
            }
        }
        yo yoVar = (yo) nVar.A;
        try {
            oa.b bVar2 = new oa.b(context);
            s0 s0Var2 = (s0) yoVar.d(context);
            Parcel g23 = s0Var2.g2();
            qh.e(g23, bVar2);
            qh.e(g23, trVar);
            g23.writeInt(ModuleDescriptor.MODULE_VERSION);
            Parcel u23 = s0Var2.u2(g23, 1);
            IBinder readStrongBinder2 = u23.readStrongBinder();
            u23.recycle();
            if (readStrongBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            if (queryLocalInterface3 instanceof r0) {
                q0Var = (r0) queryLocalInterface3;
            } else {
                q0Var = new q0(readStrongBinder2);
            }
            return q0Var;
        } catch (RemoteException e12) {
            e = e12;
            l9.i.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            l9.i.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (oa.c e14) {
            e = e14;
            l9.i.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.H2(new oa.b(this.f17663b), this.f17664c, ModuleDescriptor.MODULE_VERSION);
    }
}
