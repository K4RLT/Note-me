package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zk0 implements t70 {

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f13180u = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.t70
    public final void c(g9.d3 d3Var) {
        Object obj = this.f13180u.get();
        if (obj != null) {
            try {
                ((g9.q1) obj).y1(d3Var);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }
}
