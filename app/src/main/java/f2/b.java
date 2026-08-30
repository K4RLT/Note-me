package f2;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public abstract class b {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Intent f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 0);
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 2);
    }

    public static void h(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void i(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    public static void j(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void k(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void l(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void m(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
