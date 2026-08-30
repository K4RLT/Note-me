package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zo extends ph implements oo {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zd1 f13218u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(zd1 zd1Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f13218u = zd1Var;
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void M3(ko koVar, String str) {
        hx0 hx0Var;
        zd1 zd1Var = this.f13218u;
        if (((com.google.ads.mediation.e) zd1Var.f13143w) == null) {
            return;
        }
        synchronized (zd1Var) {
            hx0Var = (hx0) zd1Var.f13144x;
            if (hx0Var == null) {
                hx0Var = new hx0(koVar);
                zd1Var.f13144x = hx0Var;
            }
        }
        hq0 hq0Var = (hq0) ((com.google.ads.mediation.e) zd1Var.f13143w).f4207v;
        hq0Var.getClass();
        try {
            ((as) hq0Var.f6872v).B3((ko) hx0Var.f6914v, str);
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
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
            String readString = parcel.readString();
            qh.f(parcel);
            M3(joVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
