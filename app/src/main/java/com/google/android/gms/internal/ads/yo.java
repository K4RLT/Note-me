package com.google.android.gms.internal.ads;
import c2.b;
import g9.c3;
import g9.g1;
import g9.h0;
import g9.i0;
import g9.k0;
import g9.l0;
import g9.r;
import g9.s0;
import l9.i;
import l9.j;
import oa.b;
import oa.c;
import ya.m0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class yo extends b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo(String str, int i) {
        super(str);
        this.f12925d = i;
    }

    @Override // b
    public final /* synthetic */ Object c(IBinder iBinder) {
        switch (this.f12925d) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                if (queryLocalInterface instanceof io) {
                    return (io) queryLocalInterface;
                }
                return new go(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                if (queryLocalInterface2 instanceof cu) {
                    return (cu) queryLocalInterface2;
                }
                return new au(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                if (queryLocalInterface3 instanceof g1) {
                    return (g1) queryLocalInterface3;
                }
                return new g1(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                if (queryLocalInterface4 instanceof h0) {
                    return (h0) queryLocalInterface4;
                }
                return new h0(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                if (queryLocalInterface5 instanceof l0) {
                    return (l0) queryLocalInterface5;
                }
                return new l0(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                if (queryLocalInterface6 instanceof s0) {
                    return (s0) queryLocalInterface6;
                }
                return new s0(iBinder);
        }
    }

    public k0 l(Context context, c3 c3Var, String str, vr vrVar, int i) {
        l0 l0Var;
        c3 c3Var2;
        String str2;
        vr vrVar2;
        int i10;
        sl.a(context);
        if (((Boolean) r.e.f17698c.a(sl.f10687cc)).booleanValue()) {
            try {
                b bVar = new b(context);
                try {
                    IBinder b10 = m0.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b10 == null) {
                        c3Var2 = c3Var;
                        str2 = str;
                        vrVar2 = vrVar;
                        i10 = i;
                        l0Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof l0) {
                            l0Var = (l0) queryLocalInterface;
                        } else {
                            l0Var = new l0(b10);
                        }
                        c3Var2 = c3Var;
                        str2 = str;
                        vrVar2 = vrVar;
                        i10 = i;
                    }
                    IBinder u42 = l0Var.u4(bVar, c3Var2, str2, vrVar2, i10);
                    if (u42 != null) {
                        IInterface queryLocalInterface2 = u42.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        if (queryLocalInterface2 instanceof k0) {
                            return (k0) queryLocalInterface2;
                        }
                        return new i0(u42);
                    }
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException e8) {
                e = e8;
                Exception exc = e;
                pu.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                i.i(exc, "#007 Could not call remote method.");
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                Exception exc2 = e;
                pu.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                i.i(exc2, "#007 Could not call remote method.");
                return null;
            } catch (j e11) {
                e = e11;
                Exception exc22 = e;
                pu.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                i.i(exc22, "#007 Could not call remote method.");
                return null;
            }
        } else {
            try {
                IBinder u43 = ((l0) d(context)).u4(new b(context), c3Var, str, vrVar, i);
                if (u43 != null) {
                    IInterface queryLocalInterface3 = u43.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (queryLocalInterface3 instanceof k0) {
                        return (k0) queryLocalInterface3;
                    }
                    return new i0(u43);
                }
            } catch (RemoteException e12) {
                e = e12;
                i.b("Could not create remote AdManager.", e);
                return null;
            } catch (c e13) {
                e = e13;
                i.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
