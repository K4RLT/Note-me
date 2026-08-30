package fa;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class j0 implements Handler.Callback {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k0 f16879u;

    public /* synthetic */ j0(k0 k0Var) {
        this.f16879u = k0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            k0 k0Var = this.f16879u;
            synchronized (k0Var.f16888a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) k0Var.f16888a.get(h0Var);
                    if (i0Var != null && i0Var.f16871v == 3) {
                        String valueOf = String.valueOf(h0Var);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                        sb2.append("Timeout waiting for ServiceConnection callback ");
                        sb2.append(valueOf);
                        Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                        ComponentName componentName = i0Var.f16875z;
                        if (componentName == null) {
                            h0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = h0Var.f16868b;
                            y.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        i0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        k0 k0Var2 = this.f16879u;
        synchronized (k0Var2.f16888a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) k0Var2.f16888a.get(h0Var2);
                if (i0Var2 != null && i0Var2.f16870u.isEmpty()) {
                    if (i0Var2.f16872w) {
                        h0 h0Var3 = i0Var2.f16874y;
                        k0 k0Var3 = i0Var2.A;
                        k0Var3.f16890c.removeMessages(1, h0Var3);
                        k0Var3.f16891d.c(k0Var3.f16889b, i0Var2);
                        i0Var2.f16872w = false;
                        i0Var2.f16871v = 2;
                    }
                    k0Var2.f16888a.remove(h0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
