package com.google.android.gms.internal.ads;
import g9.a2;
import g9.z1;
import k9.a0;
import l9.i;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class wc0 {

    /* renamed from: a, reason: collision with root package name */
    public final ra0 f12214a;

    public wc0(ra0 ra0Var) {
        this.f12214a = ra0Var;
    }

    public final void a() {
        z1 r8 = this.f12214a.r();
        a2 a2Var = null;
        if (r8 != null) {
            try {
                a2Var = r8.p();
            } catch (RemoteException unused) {
            }
        }
        if (a2Var != null) {
            try {
                a2Var.a();
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.g("Unable to call onVideoEnd()", e);
            }
        }
    }
}
