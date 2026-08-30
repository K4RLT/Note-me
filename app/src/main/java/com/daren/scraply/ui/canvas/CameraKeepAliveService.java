package com.daren.scraply.ui.canvas;

import a6.e;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.daren.scraply.R;
import f3.i;
import lb.q;

/* loaded from: classes.dex */
public final class CameraKeepAliveService extends Service {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f4158v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f4159u = new Handler(Looper.getMainLooper());

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f4159u.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            q.k();
            notificationManager.createNotificationChannel(q.D(getString(R.string.camera_keepalive_channel)));
        }
        i iVar = new i(this, "camera_keepalive");
        iVar.f16678t.icon = R.drawable.ic_notification;
        iVar.e = i.b(getString(R.string.camera_keepalive_title));
        iVar.f16679u = true;
        iVar.c(2, true);
        Notification a10 = iVar.a();
        a10.getClass();
        if (i11 >= 34) {
            startForeground(4271, a10, 2048);
        } else {
            startForeground(4271, a10);
        }
        Handler handler = this.f4159u;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new e(28, this), 170000L);
        return 2;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        stopSelf();
    }
}
