package fa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class d0 implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final int f16840u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f16841v;

    public d0(e eVar, int i) {
        this.f16841v = eVar;
        this.f16840u = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u uVar;
        int i;
        int i10;
        e eVar = this.f16841v;
        if (iBinder == null) {
            synchronized (eVar.A) {
                i = eVar.H;
            }
            if (i == 3) {
                eVar.O = true;
                i10 = 5;
            } else {
                i10 = 4;
            }
            b0 b0Var = eVar.f16847z;
            b0Var.sendMessage(b0Var.obtainMessage(i10, eVar.Q.get(), 16));
            return;
        }
        synchronized (eVar.B) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof u)) {
                    uVar = (u) queryLocalInterface;
                } else {
                    uVar = new u(iBinder);
                }
                eVar.C = uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = this.f16841v;
        int i11 = this.f16840u;
        eVar2.getClass();
        f0 f0Var = new f0(eVar2, 0, null);
        b0 b0Var2 = eVar2.f16847z;
        b0Var2.sendMessage(b0Var2.obtainMessage(7, i11, -1, f0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f16841v;
        synchronized (eVar.B) {
            eVar.C = null;
        }
        e eVar2 = this.f16841v;
        int i = this.f16840u;
        b0 b0Var = eVar2.f16847z;
        b0Var.sendMessage(b0Var.obtainMessage(6, i, 1));
    }
}
