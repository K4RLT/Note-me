package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mg0 extends pg0 {
    public final Context A;
    public final l9.a B;
    public final jk0 C;

    public mg0(Context context, l9.a aVar, jk0 jk0Var) {
        this.A = context;
        this.B = aVar;
        this.C = jk0Var;
    }

    @Override // com.google.android.gms.internal.ads.pg0, fa.b
    public final void R(int i) {
        int i10 = k9.a0.f19634b;
        l9.i.a("Cannot connect to remote service, fallback to local instance.");
        this.C.F(new RemoteException(a5.a.f(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }

    @Override // fa.b
    public final void g0() {
        synchronized (this.f9515v) {
            if (!this.f9517x) {
                this.f9517x = true;
                try {
                    ((wu) this.f9519z.t()).y0(this.B.f20029u);
                    this.C.mo212zza();
                } catch (RemoteException e) {
                    this.C.F(e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pg0, fa.c
    public final void r0(ca.b bVar) {
        super.r0(bVar);
        this.C.F(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f4024x))));
    }
}
