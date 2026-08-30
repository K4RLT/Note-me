package k9;
import f0.c;
import q.k;
import r.e;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.x00;

/* loaded from: classes.dex */
public class g0 extends eb.y {
    @Override // eb.y
    public final x00 f(q00 q00Var, jj jjVar, boolean z3, wh0 wh0Var) {
        return new x00(q00Var, jjVar, z3, wh0Var);
    }

    @Override // eb.y
    public final int h(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        f0 f0Var = f9.k.C.f16813c;
        if (c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    @Override // eb.y
    public final void i(Context context) {
        lb.k();
        NotificationChannel c10 = ed.h.c(((Integer) g9.e.f17698c.a(sl.H9)).intValue());
        c10.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(c10);
    }

    @Override // eb.y
    public final boolean j(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // eb.y
    public final Intent k(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
