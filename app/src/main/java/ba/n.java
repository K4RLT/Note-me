package ba;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import fa.y;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public int f3145u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Messenger f3146v;

    /* renamed from: w, reason: collision with root package name */
    public j6.l f3147w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f3148x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f3149y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ q f3150z;

    public n(q qVar) {
        this.f3150z = qVar;
        bb.a aVar = new bb.a(Looper.getMainLooper(), new Handler.Callback() { // from class: ba.m
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                n nVar = n.this;
                synchronized (nVar) {
                    try {
                        o oVar = (o) nVar.f3149y.get(i);
                        if (oVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        nVar.f3149y.remove(i);
                        nVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            oVar.b(new p("Not supported by GmsCore", (Throwable) null));
                            return true;
                        }
                        switch (oVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    oVar.c(null);
                                    return true;
                                }
                                oVar.b(new p("Invalid response to one way request", (Throwable) null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                oVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        }, 4);
        Looper.getMainLooper();
        this.f3146v = new Messenger(aVar);
        this.f3148x = new ArrayDeque();
        this.f3149y = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f3145u;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.f3145u = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f3145u = 4;
                ka.a.b().c((Context) this.f3150z.f3158v, this);
                p pVar = new p(str, securityException);
                Iterator it = this.f3148x.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).b(pVar);
                }
                this.f3148x.clear();
                int i10 = 0;
                while (true) {
                    int size = this.f3149y.size();
                    SparseArray sparseArray = this.f3149y;
                    if (i10 < size) {
                        ((o) sparseArray.valueAt(i10)).b(pVar);
                        i10++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f3145u == 2 && this.f3148x.isEmpty() && this.f3149y.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f3145u = 3;
                ka.a.b().c((Context) this.f3150z.f3158v, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(o oVar) {
        int i = this.f3145u;
        boolean z3 = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.f3148x.add(oVar);
                ((ScheduledExecutorService) this.f3150z.f3159w).execute(new l(this, 0));
                return true;
            }
            this.f3148x.add(oVar);
            return true;
        }
        this.f3148x.add(oVar);
        if (this.f3145u == 0) {
            z3 = true;
        }
        y.k(z3);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f3145u = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!ka.a.b().a((Context) this.f3150z.f3158v, intent, this, 1)) {
                a("Unable to bind to service");
            } else {
                ((ScheduledExecutorService) this.f3150z.f3159w).schedule(new l(this, 1), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f3150z.f3159w).execute(new ac.a(this, 2, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f3150z.f3159w).execute(new l(this, 2));
    }
}
