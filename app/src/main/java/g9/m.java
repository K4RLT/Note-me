package g9;
import r.e;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.bo;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.ho;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.yo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q9.e f17673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f17674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f17675d;
    public final /* synthetic */ n e;

    public m(n nVar, q9.e eVar, FrameLayout frameLayout, Context context) {
        this.f17673b = eVar;
        this.f17674c = frameLayout;
        this.f17675d = context;
        Objects.requireNonNull(nVar);
        this.e = nVar;
    }

    @Override // g9.o
    public final Object a() {
        n.B(this.f17675d, "native_ad_view_delegate");
        return new co();
    }

    @Override // g9.o
    public final Object b() {
        io goVar;
        Object boVar;
        Context context = this.f17675d;
        sl.a(context);
        boolean booleanValue = ((Boolean) e.f17698c.a(sl.f10687cc)).booleanValue();
        n nVar = this.e;
        FrameLayout frameLayout = this.f17674c;
        q9.e eVar = this.f17673b;
        if (booleanValue) {
            try {
                oa.b bVar = new oa.b(context);
                oa.b bVar2 = new oa.b(eVar);
                oa.b bVar3 = new oa.b(frameLayout);
                try {
                    IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                    int i = ho.f6847u;
                    if (b10 == null) {
                        goVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                        if (queryLocalInterface instanceof io) {
                            goVar = (io) queryLocalInterface;
                        } else {
                            goVar = new go(b10);
                        }
                    }
                    go goVar2 = (go) goVar;
                    Parcel g22 = goVar2.g2();
                    qh.e(g22, bVar);
                    qh.e(g22, bVar2);
                    qh.e(g22, bVar3);
                    g22.writeInt(ModuleDescriptor.MODULE_VERSION);
                    Parcel u22 = goVar2.u2(g22, 1);
                    IBinder readStrongBinder = u22.readStrongBinder();
                    u22.recycle();
                    int i10 = co.f5136u;
                    if (readStrongBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    if (queryLocalInterface2 instanceof eo) {
                        return (eo) queryLocalInterface2;
                    }
                    return new bo(readStrongBinder);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException | NullPointerException | l9.j e8) {
                qu a10 = pu.a(context);
                nVar.getClass();
                a10.c("ClientApiBroker.createNativeAdViewDelegate", e8);
                return null;
            }
        }
        yo yoVar = (yo) nVar.f17681y;
        try {
            oa.b bVar4 = new oa.b(context);
            oa.b bVar5 = new oa.b(eVar);
            oa.b bVar6 = new oa.b(frameLayout);
            go goVar3 = (go) ((io) yoVar.d(context));
            Parcel g23 = goVar3.g2();
            qh.e(g23, bVar4);
            qh.e(g23, bVar5);
            qh.e(g23, bVar6);
            g23.writeInt(ModuleDescriptor.MODULE_VERSION);
            Parcel u23 = goVar3.u2(g23, 1);
            IBinder readStrongBinder2 = u23.readStrongBinder();
            u23.recycle();
            if (readStrongBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface3 instanceof eo) {
                boVar = (eo) queryLocalInterface3;
            } else {
                boVar = new bo(readStrongBinder2);
            }
            return boVar;
        } catch (RemoteException e10) {
            e = e10;
            l9.i.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (oa.c e11) {
            e = e11;
            l9.i.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // g9.o
    public final Object c(w0 w0Var) {
        return w0Var.C2(new oa.b(this.f17673b), new oa.b(this.f17674c));
    }
}
