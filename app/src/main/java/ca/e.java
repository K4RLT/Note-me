package ca;
import p.a;
import p.b;
import p.c;
import p.d;
import p.e;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import ea.x;
import fa.y;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4033c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f4034d = new Object();

    public static AlertDialog e(Activity activity, int i, fa.q qVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(fa.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(com.daren.scraply.R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(com.daren.scraply.R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(com.daren.scraply.R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String c10 = fa.c(activity, i);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", g3.a.g(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.DialogFragment, ca.c] */
    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragment dialogFragment = new DialogFragment();
        y.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f4026u = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f4027v = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e = e(googleApiActivity, i, new fa.q(super.b(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (e == null) {
            return;
        }
        f(googleApiActivity, e, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [f3.j, f3.g] */
    public final void g(Context context, int i, PendingIntent pendingIntent) {
        String c10;
        String d2;
        int i10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", g3.a.i("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            c10 = fa.p.e(context, "common_google_play_services_resolution_required_title");
        } else {
            c10 = fa.c(context, i);
        }
        if (c10 == null) {
            c10 = context.getResources().getString(com.daren.scraply.R.string.common_google_play_services_notification_ticker);
        }
        if (i != 6 && i != 19) {
            d2 = fa.b(context, i);
        } else {
            d2 = fa.d(context, "common_google_play_services_resolution_required_text", fa.a(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        f3.i iVar = new f3.i(context, null);
        iVar.f16671m = true;
        iVar.c(16, true);
        iVar.e = f3.i.b(c10);
        f3.j jVar = new f3.j();
        jVar.f16660d = f3.i.b(d2);
        iVar.e(jVar);
        PackageManager packageManager = context.getPackageManager();
        if (la.b.f20065c == null) {
            la.b.f20065c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (la.b.f20065c.booleanValue()) {
            iVar.f16678t.icon = context.getApplicationInfo().icon;
            iVar.f16668j = 2;
            if (la.b.l(context)) {
                iVar.f16662b.add(new f3.c(resources.getString(com.daren.scraply.R.string.common_open_on_phone), pendingIntent));
            } else {
                iVar.f16666g = pendingIntent;
            }
        } else {
            iVar.f16678t.icon = R.drawable.stat_sys_warning;
            String string = resources.getString(com.daren.scraply.R.string.common_google_play_services_notification_ticker);
            iVar.f16678t.tickerText = f3.i.b(string);
            iVar.f16678t.when = System.currentTimeMillis();
            iVar.f16666g = pendingIntent;
            iVar.f16665f = f3.i.b(d2);
        }
        if (la.b.h()) {
            y.k(la.b.h());
            synchronized (f4033c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string2 = context.getResources().getString(com.daren.scraply.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(a7.a.f(string2));
            } else {
                name = notificationChannel.getName();
                if (!string2.contentEquals(name)) {
                    notificationChannel.setName(string2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            iVar.f16676r = "com.google.android.gms.availability";
        }
        Notification a10 = iVar.a();
        if (i != 1 && i != 2 && i != 3) {
            i10 = 39789;
        } else {
            h.f4037a.set(false);
            i10 = 10436;
        }
        notificationManager.notify(i10, a10);
    }

    public final void h(Activity activity, x xVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e = e(activity, i, new fa.q(super.b(activity, "d", i), xVar, 1), onCancelListener);
        if (e == null) {
            return;
        }
        f(activity, e, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}