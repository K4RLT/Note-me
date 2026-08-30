package nd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final Context f21306u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f21307v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f21308w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f21309x;

    /* renamed from: y, reason: collision with root package name */
    public w f21310y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21311z;

    public y(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ma.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f21309x = new ArrayDeque();
        this.f21311z = false;
        Context applicationContext = context.getApplicationContext();
        this.f21306u = applicationContext;
        this.f21307v = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f21308w = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f21309x.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                w wVar = this.f21310y;
                if (wVar != null && wVar.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f21310y.a((x) this.f21309x.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ib.o b(Intent intent) {
        x xVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            xVar = new x(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f21308w;
            xVar.f21305b.f18363a.c(scheduledThreadPoolExecutor, new b1.h(16, scheduledThreadPoolExecutor.schedule(new a6.e(21, xVar), 20L, TimeUnit.SECONDS)));
            this.f21309x.add(xVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return xVar.f21305b.f18363a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f21311z);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f21311z) {
            this.f21311z = true;
            try {
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
            if (!ka.a.b().a(this.f21306u, this.f21307v, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.f21311z = false;
                while (true) {
                    ArrayDeque arrayDeque = this.f21309x;
                    if (!arrayDeque.isEmpty()) {
                        ((x) arrayDeque.poll()).f21305b.d(null);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f21311z = false;
            if (!(iBinder instanceof w)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                ArrayDeque arrayDeque = this.f21309x;
                while (!arrayDeque.isEmpty()) {
                    ((x) arrayDeque.poll()).f21305b.d(null);
                }
                return;
            }
            this.f21310y = (w) iBinder;
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
