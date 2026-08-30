package com.google.android.gms.internal.ads;
import g9.a;
import g9.u;
import k9.a0;
import l9.i;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class al0 implements g9.a, f90 {

    /* renamed from: u, reason: collision with root package name */
    public g9.u f4535u;

    @Override // g9.a
    public final synchronized void L() {
        g9.u uVar = this.f4535u;
        if (uVar != null) {
            try {
                uVar.l();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.g("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final synchronized void M() {
        g9.u uVar = this.f4535u;
        if (uVar != null) {
            try {
                uVar.l();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.g("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final synchronized void Q() {
    }
}
