package com.google.android.gms.internal.ads;
import c7.a;
import g9.k1;
import g9.k2;
import g9.v1;
import l9.i;
import oa.a;
import z8.q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class rt extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final xo f10283a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10284b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10285c = new ArrayList();

    public rt(xo xoVar) {
        g9.k1 k1Var;
        zn znVar;
        new AtomicLong();
        this.f10283a = xoVar;
        try {
            List b10 = xoVar.b();
            if (b10 != null) {
                for (Object obj : b10) {
                    if (obj instanceof IBinder) {
                        znVar = pn.v4((IBinder) obj);
                    } else {
                        znVar = null;
                    }
                    if (znVar != null) {
                        this.f10284b.add(new qt(znVar));
                    }
                }
            }
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        try {
            List s10 = this.f10283a.s();
            if (s10 != null) {
                for (Object obj2 : s10) {
                    if (obj2 instanceof IBinder) {
                        k1Var = g9.k2.v4((IBinder) obj2);
                    } else {
                        k1Var = null;
                    }
                    if (k1Var != null) {
                        this.f10285c.add(new c7.a(k1Var));
                    }
                }
            }
        } catch (RemoteException e8) {
            l9.i.d("", e8);
        }
        try {
            zn d2 = this.f10283a.d();
            if (d2 != null) {
                new qt(d2);
            }
        } catch (RemoteException e10) {
            l9.i.d("", e10);
        }
        try {
            if (this.f10283a.j() != null) {
                new vn(this.f10283a.j(), 1);
            }
        } catch (RemoteException e11) {
            l9.i.d("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f10283a.e();
        } catch (RemoteException e) {
            l9.i.d("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f10283a.a();
        } catch (RemoteException e) {
            l9.i.d("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final z8.q c() {
        g9.v1 v1Var;
        try {
            v1Var = this.f10283a.l0();
        } catch (RemoteException e) {
            l9.i.d("", e);
            v1Var = null;
        }
        if (v1Var == null) {
            return null;
        }
        return new z8.q(v1Var);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ oa.a d() {
        try {
            return this.f10283a.x();
        } catch (RemoteException e) {
            l9.i.d("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f10283a.U2(bundle);
        } catch (RemoteException e) {
            l9.i.d("Failed to record native event", e);
        }
    }
}
