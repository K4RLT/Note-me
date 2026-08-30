package com.google.android.gms.internal.ads;
import g9.y1;
import l9.i;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class dl0 implements v60 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ yk0 f5453u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ oq f5454v;

    public /* synthetic */ dl0(yk0 yk0Var, oq oqVar) {
        this.f5453u = yk0Var;
        this.f5454v = oqVar;
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(g9.y1 y1Var) {
        this.f5453u.x(y1Var);
        oq oqVar = this.f5454v;
        if (oqVar != null) {
            try {
                Parcel g22 = oqVar.g2();
                qh.c(g22, y1Var);
                oqVar.v2(g22, 3);
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
        if (oqVar != null) {
            try {
                int i = y1Var.f17714u;
                Parcel g23 = oqVar.g2();
                g23.writeInt(i);
                oqVar.v2(g23, 2);
            } catch (RemoteException e8) {
                l9.i.i(e8, "#007 Could not call remote method.");
            }
        }
    }
}
