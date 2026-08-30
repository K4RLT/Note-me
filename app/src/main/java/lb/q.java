package lb;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ boolean A(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel B(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannel D(String str) {
        return new NotificationChannel("camera_keepalive", str, 1);
    }

    public static /* synthetic */ Notification.Builder b(Context context) {
        return new Notification.Builder(context, "playcore-assetpacks-service-notification-channel");
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2);
    }

    public static /* synthetic */ NotificationChannel f(String str, int i, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* synthetic */ void k() {
    }
}
