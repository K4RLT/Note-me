package nd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public u f21293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f21294b;

    public t(u uVar, u uVar2) {
        this.f21294b = uVar;
        this.f21293a = uVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f21294b.f21296u.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            u uVar = this.f21293a;
            if (uVar == null) {
                return;
            }
            if (!uVar.d()) {
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            u uVar2 = this.f21293a;
            uVar2.f21299x.f21290f.schedule(uVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f21293a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
