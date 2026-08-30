package g9;
import r.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.au;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.cu;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xt;
import com.google.android.gms.internal.ads.yo;
import com.google.android.gms.internal.ads.yt;
import com.google.android.gms.internal.ads.zt;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f17576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f17577c;

    public c(n nVar, AdActivity adActivity) {
        this.f17576b = adActivity;
        Objects.requireNonNull(nVar);
        this.f17577c = nVar;
    }

    @Override // g9.o
    public final /* bridge */ /* synthetic */ Object a() {
        n.B(this.f17576b, "ad_overlay");
        return null;
    }

    @Override // g9.o
    public final Object b() {
        IInterface auVar;
        Object xtVar;
        AdActivity adActivity = this.f17576b;
        sl.a(adActivity);
        boolean booleanValue = ((Boolean) e.f17698c.a(sl.f10687cc)).booleanValue();
        n nVar = this.f17577c;
        if (booleanValue) {
            try {
                oa.b bVar = new oa.b(adActivity);
                try {
                    IBinder b10 = ya.m0.a(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                    int i = bu.f4875u;
                    if (b10 == null) {
                        auVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                        if (queryLocalInterface instanceof cu) {
                            auVar = (cu) queryLocalInterface;
                        } else {
                            auVar = new au(b10);
                        }
                    }
                    au auVar2 = (au) auVar;
                    Parcel g22 = auVar2.g2();
                    qh.e(g22, bVar);
                    Parcel u22 = auVar2.u2(g22, 1);
                    IBinder readStrongBinder = u22.readStrongBinder();
                    u22.recycle();
                    int i10 = yt.f12962u;
                    if (readStrongBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    if (queryLocalInterface2 instanceof zt) {
                        return (zt) queryLocalInterface2;
                    }
                    return new xt(readStrongBinder);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException | NullPointerException | l9.j e8) {
                qu a10 = pu.a(adActivity.getApplicationContext());
                nVar.getClass();
                a10.c("ClientApiBroker.createAdOverlay", e8);
                return null;
            }
        }
        yo yoVar = (yo) nVar.f17682z;
        try {
            oa.b bVar2 = new oa.b(adActivity);
            au auVar3 = (au) ((cu) yoVar.d(adActivity));
            Parcel g23 = auVar3.g2();
            qh.e(g23, bVar2);
            Parcel u23 = auVar3.u2(g23, 1);
            IBinder readStrongBinder2 = u23.readStrongBinder();
            u23.recycle();
            if (readStrongBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface3 instanceof zt) {
                xtVar = (zt) queryLocalInterface3;
            } else {
                xtVar = new xt(readStrongBinder2);
            }
            return xtVar;
        } catch (RemoteException e10) {
            l9.i.g("Could not create remote AdOverlay.", e10);
            return null;
        } catch (oa.c e11) {
            l9.i.g("Could not create remote AdOverlay.", e11);
            return null;
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.zzf(new oa.b(this.f17576b));
    }
}
