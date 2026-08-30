package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import vd.k0;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: u, reason: collision with root package name */
    public final HandlerThread f15621u = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: v, reason: collision with root package name */
    public k0 f15622v;

    /* renamed from: w, reason: collision with root package name */
    public Messenger f15623w;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            messenger = (Messenger) parcelableExtra;
        } else {
            messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            k0 k0Var = this.f15622v;
            if (k0Var != null) {
                k0Var.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f15623w;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f15621u;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.f15622v = new k0(looper);
        this.f15623w = new Messenger(this.f15622v);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f15621u.quit();
    }
}
