package gb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.ads.oh;
import da.g;
import fa.h;
import g9.n;

/* loaded from: classes.dex */
public final class a extends h {
    public final boolean T;
    public final n U;
    public final Bundle V;
    public final Integer W;

    public a(Context context, Looper looper, n nVar, Bundle bundle, g gVar, da.h hVar) {
        super(context, looper, 44, nVar, gVar, hVar);
        this.T = true;
        this.U = nVar;
        this.V = bundle;
        this.W = (Integer) nVar.A;
    }

    @Override // fa.e
    public final int i() {
        return 12451000;
    }

    @Override // fa.e, da.c
    public final boolean l() {
        return this.T;
    }

    @Override // fa.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.signin.internal.ISignInService", 4);
    }

    @Override // fa.e
    public final Bundle r() {
        n nVar = this.U;
        boolean equals = this.f16844w.getPackageName().equals((String) nVar.f17680x);
        Bundle bundle = this.V;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) nVar.f17680x);
        }
        return bundle;
    }

    @Override // fa.e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // fa.e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
