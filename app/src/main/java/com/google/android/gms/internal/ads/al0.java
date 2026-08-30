package com.google.android.gms.internal.ads;
import g9.a;
import g9.u;
import k9.a0;
import l9.i;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class al0 implements a, f90 {

    /* renamed from: u, reason: collision with root package name */
    public u f4535u;

    @Override // a
    public final synchronized void L() {
        u uVar = this.f4535u;
        if (uVar != null) {
            try {
                uVar.l();
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.g("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final synchronized void M() {
        u uVar = this.f4535u;
        if (uVar != null) {
            try {
                uVar.l();
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.g("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final synchronized void Q() {
    }
}
