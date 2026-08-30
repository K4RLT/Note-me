package com.google.android.gms.internal.ads;
import l9.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vn {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11952a;

    public vn(un unVar, int i) {
        zn znVar;
        zn znVar2;
        switch (i) {
            case 1:
                this.f11952a = new ArrayList();
                try {
                    unVar.zza();
                } catch (RemoteException e) {
                    i.d("", e);
                }
                try {
                    ArrayList zzb = unVar.zzb();
                    int size = zzb.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = zzb.get(i10);
                        i10++;
                        if (obj instanceof IBinder) {
                            znVar = pn.v4((IBinder) obj);
                        } else {
                            znVar = null;
                        }
                        if (znVar != null) {
                            this.f11952a.add(new qt(znVar));
                        }
                    }
                    return;
                } catch (RemoteException e8) {
                    i.d("", e8);
                    return;
                }
            default:
                this.f11952a = new ArrayList();
                try {
                    unVar.zza();
                } catch (RemoteException e10) {
                    i.d("", e10);
                }
                try {
                    ArrayList zzb2 = unVar.zzb();
                    int size2 = zzb2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = zzb2.get(i11);
                        i11++;
                        if (obj2 instanceof IBinder) {
                            IBinder iBinder = (IBinder) obj2;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            if (queryLocalInterface instanceof zn) {
                                znVar2 = (zn) queryLocalInterface;
                            } else {
                                znVar2 = new yn(iBinder);
                            }
                        } else {
                            znVar2 = null;
                        }
                        if (znVar2 != null) {
                            this.f11952a.add(new ao(znVar2));
                        }
                    }
                    return;
                } catch (RemoteException e11) {
                    i.d("", e11);
                    return;
                }
        }
    }
}
