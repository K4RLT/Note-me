package fa;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f16886g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static k0 f16887h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16888a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f16889b;

    /* renamed from: c, reason: collision with root package name */
    public volatile bb.a f16890c;

    /* renamed from: d, reason: collision with root package name */
    public final ka.a f16891d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16892f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f16889b = context.getApplicationContext();
        bb.a aVar = new bb.a(looper, j0Var, 5);
        Looper.getMainLooper();
        this.f16890c = aVar;
        this.f16891d = ka.a.b();
        this.e = 5000L;
        this.f16892f = 300000L;
    }

    public static k0 a(Context context) {
        synchronized (f16886g) {
            try {
                if (f16887h == null) {
                    f16887h = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f16887h;
    }

    public final ca.b b(h0 h0Var, d0 d0Var, String str, Executor executor) {
        ca.b bVar;
        HashMap hashMap = this.f16888a;
        synchronized (hashMap) {
            try {
                i0 i0Var = (i0) hashMap.get(h0Var);
                if (executor == null) {
                    executor = null;
                }
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f16870u.put(d0Var, d0Var);
                    bVar = i0Var.a(str, executor);
                    hashMap.put(h0Var, i0Var);
                } else {
                    this.f16890c.removeMessages(0, h0Var);
                    if (!i0Var.f16870u.containsKey(d0Var)) {
                        i0Var.f16870u.put(d0Var, d0Var);
                        int i10 = i0Var.f16871v;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                bVar = i0Var.a(str, executor);
                            }
                        } else {
                            d0Var.onServiceConnected(i0Var.f16875z, i0Var.f16873x);
                        }
                        bVar = null;
                    } else {
                        String h0Var2 = h0Var.toString();
                        StringBuilder sb2 = new StringBuilder(h0Var2.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(h0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                if (i0Var.f16872w) {
                    return ca.b.f4020z;
                }
                if (bVar == null) {
                    bVar = new ca.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z3) {
        h0 h0Var = new h0(str, z3);
        y.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f16888a;
        synchronized (hashMap) {
            try {
                i0 i0Var = (i0) hashMap.get(h0Var);
                if (i0Var != null) {
                    if (i0Var.f16870u.containsKey(serviceConnection)) {
                        i0Var.f16870u.remove(serviceConnection);
                        if (i0Var.f16870u.isEmpty()) {
                            this.f16890c.sendMessageDelayed(this.f16890c.obtainMessage(0, h0Var), this.e);
                        }
                    } else {
                        String h0Var2 = h0Var.toString();
                        StringBuilder sb2 = new StringBuilder(h0Var2.length() + 76);
                        sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                        sb2.append(h0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    String h0Var3 = h0Var.toString();
                    StringBuilder sb3 = new StringBuilder(h0Var3.length() + 50);
                    sb3.append("Nonexistent connection status for service config: ");
                    sb3.append(h0Var3);
                    throw new IllegalStateException(sb3.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
