package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ap extends ph implements qo {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zd1 f4567u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(zd1 zd1Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f4567u = zd1Var;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void N2(ko koVar) {
        hx0 hx0Var;
        String str;
        zd1 zd1Var = this.f4567u;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) zd1Var.f13142v;
        synchronized (zd1Var) {
            hx0Var = (hx0) zd1Var.f13144x;
            if (hx0Var == null) {
                hx0Var = new hx0(koVar);
                zd1Var.f13144x = hx0Var;
            }
        }
        hq0 hq0Var = (hq0) eVar.f4207v;
        hq0Var.getClass();
        fa.y.d("#008 Must be called on the main UI thread.");
        try {
            str = ((ko) hx0Var.f6914v).d();
        } catch (RemoteException e) {
            l9.i.d("", e);
            str = null;
        }
        l9.i.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        hq0Var.f6874x = hx0Var;
        try {
            ((as) hq0Var.f6872v).f();
        } catch (RemoteException e8) {
            l9.i.i(e8, "#007 Could not call remote method.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        ko joVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                joVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof ko) {
                    joVar = (ko) queryLocalInterface;
                } else {
                    joVar = new jo(readStrongBinder);
                }
            }
            qh.f(parcel);
            N2(joVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
