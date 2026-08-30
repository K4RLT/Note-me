package fa;
import g.a;
import l.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.internal.play_billing.d {

    /* renamed from: v, reason: collision with root package name */
    public e f16838v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16839w;

    public c0(e eVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.f16838v = eVar;
        this.f16839w = i;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean o1(int i, Parcel parcel, Parcel parcel2) {
        m mVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                g0 g0Var = (g0) ua.a(parcel, g0.CREATOR);
                ua.g.c(parcel);
                e eVar = this.f16838v;
                y.i(eVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                y.h(g0Var);
                eVar.P = g0Var;
                if (eVar.x()) {
                    f fVar = g0Var.f16866x;
                    l b10 = b();
                    if (fVar == null) {
                        mVar = null;
                    } else {
                        mVar = fVar.f16850u;
                    }
                    synchronized (b10) {
                        if (mVar == null) {
                            mVar = l.f16894w;
                        } else {
                            m mVar2 = (m) b10.f16895u;
                            if (mVar2 != null) {
                                if (mVar2.f16898u < mVar.f16898u) {
                                }
                            }
                        }
                        b10.f16895u = mVar;
                    }
                }
                Bundle bundle = g0Var.f16863u;
                y.i(this.f16838v, "onPostInitComplete can be called only once per call to getRemoteService");
                e eVar2 = this.f16838v;
                int i10 = this.f16839w;
                eVar2.getClass();
                e0 e0Var = new e0(eVar2, readInt, readStrongBinder, bundle);
                b0 b0Var = eVar2.f16847z;
                b0Var.sendMessage(b0Var.obtainMessage(1, i10, -1, e0Var));
                this.f16838v = null;
            } else {
                parcel.readInt();
                ua.g.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) ua.a(parcel, Bundle.CREATOR);
            ua.g.c(parcel);
            y.i(this.f16838v, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.f16838v;
            int i11 = this.f16839w;
            eVar3.getClass();
            e0 e0Var2 = new e0(eVar3, readInt2, readStrongBinder2, bundle2);
            b0 b0Var2 = eVar3.f16847z;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i11, -1, e0Var2));
            this.f16838v = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
