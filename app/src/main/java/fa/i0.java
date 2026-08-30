package fa;
import a0.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i0 implements ServiceConnection {
    public final /* synthetic */ k0 A;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f16870u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public int f16871v = 2;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16872w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f16873x;

    /* renamed from: y, reason: collision with root package name */
    public final h0 f16874y;

    /* renamed from: z, reason: collision with root package name */
    public ComponentName f16875z;

    public i0(k0 k0Var, h0 h0Var) {
        this.A = k0Var;
        this.f16874y = h0Var;
    }

    public final ca.b a(String str, Executor executor) {
        try {
            Intent a10 = a(this.A.f16889b, this.f16874y);
            this.f16871v = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(la.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = this.A;
                ka.a aVar = k0Var.f16891d;
                Context context = k0Var.f16889b;
                h0 h0Var = this.f16874y;
                try {
                    boolean d2 = aVar.d(context, str, a10, this, 4225, executor);
                    this.f16872w = d2;
                    if (d2) {
                        k0Var.f16890c.sendMessageDelayed(k0Var.f16890c.obtainMessage(1, h0Var), k0Var.f16892f);
                        ca.b bVar = ca.b.f4020z;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f16871v = 2;
                    try {
                        k0Var.f16891d.c(k0Var.f16889b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ca.b bVar2 = new ca.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (z e) {
            return e.f16931u;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k0 k0Var = this.A;
        synchronized (k0Var.f16888a) {
            try {
                k0Var.f16890c.removeMessages(1, this.f16874y);
                this.f16873x = iBinder;
                this.f16875z = componentName;
                Iterator it = this.f16870u.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f16871v = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k0 k0Var = this.A;
        synchronized (k0Var.f16888a) {
            try {
                k0Var.f16890c.removeMessages(1, this.f16874y);
                this.f16873x = null;
                this.f16875z = componentName;
                Iterator it = this.f16870u.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f16871v = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
