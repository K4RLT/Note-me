package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class yo extends c2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo(String str, int i) {
        super(str);
        this.f12925d = i;
    }

    @Override // c2.b
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
                if (queryLocalInterface3 instanceof g9.g1) {
                    return (g9.g1) queryLocalInterface3;
                }
                return new g9.g1(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                if (queryLocalInterface4 instanceof g9.h0) {
                    return (g9.h0) queryLocalInterface4;
                }
                return new g9.h0(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                if (queryLocalInterface5 instanceof g9.l0) {
                    return (g9.l0) queryLocalInterface5;
                }
                return new g9.l0(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                if (queryLocalInterface6 instanceof g9.s0) {
                    return (g9.s0) queryLocalInterface6;
                }
                return new g9.s0(iBinder);
        }
    }

    public g9.k0 l(Context context, g9.c3 c3Var, String str, vr vrVar, int i) {
        g9.l0 l0Var;
        g9.c3 c3Var2;
        String str2;
        vr vrVar2;
        int i10;
        sl.a(context);
        if (((Boolean) g9.r.e.f17698c.a(sl.f10687cc)).booleanValue()) {
            try {
                oa.b bVar = new oa.b(context);
                try {
                    IBinder b10 = ya.m0.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b10 == null) {
                        c3Var2 = c3Var;
                        str2 = str;
                        vrVar2 = vrVar;
                        i10 = i;
                        l0Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof g9.l0) {
                            l0Var = (g9.l0) queryLocalInterface;
                        } else {
                            l0Var = new g9.l0(b10);
                        }
                        c3Var2 = c3Var;
                        str2 = str;
                        vrVar2 = vrVar;
                        i10 = i;
                    }
                    IBinder u42 = l0Var.u4(bVar, c3Var2, str2, vrVar2, i10);
                    if (u42 != null) {
                        IInterface queryLocalInterface2 = u42.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        if (queryLocalInterface2 instanceof g9.k0) {
                            return (g9.k0) queryLocalInterface2;
                        }
                        return new g9.i0(u42);
                    }
                } catch (Exception e) {
                    throw new Exception(e);
                }
            } catch (RemoteException e8) {
                e = e8;
                Exception exc = e;
                pu.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                l9.i.i(exc, "#007 Could not call remote method.");
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                Exception exc2 = e;
                pu.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                l9.i.i(exc2, "#007 Could not call remote method.");
                return null;
            } catch (l9.j e11) {
                e = e11;
                Exception exc22 = e;
                pu.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                l9.i.i(exc22, "#007 Could not call remote method.");
                return null;
            }
        } else {
            try {
                IBinder u43 = ((g9.l0) d(context)).u4(new oa.b(context), c3Var, str, vrVar, i);
                if (u43 != null) {
                    IInterface queryLocalInterface3 = u43.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (queryLocalInterface3 instanceof g9.k0) {
                        return (g9.k0) queryLocalInterface3;
                    }
                    return new g9.i0(u43);
                }
            } catch (RemoteException e12) {
                e = e12;
                l9.i.b("Could not create remote AdManager.", e);
                return null;
            } catch (oa.c e13) {
                e = e13;
                l9.i.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
