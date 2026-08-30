package ya;
import q7.e;
import wa.u6;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.ads.wd0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ga {
    public static FirebaseAnalytics a(Context context) {
        try {
            return FirebaseAnalytics.getInstance(context.getApplicationContext());
        } catch (Exception e) {
            wd0.o("Analytics no disponible: ", e.getMessage(), "NotifyAnalytics");
            return null;
        }
    }

    public static void b(Context context, String str) {
        FirebaseAnalytics a10 = a(context);
        if (a10 != null) {
            Bundle bundle = new Bundle();
            if (str == null) {
                str = "unknown";
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            bundle.putString("kind", lowerCase);
            com.google.android.gms.internal.measurement.f1 f1Var = a10.f15587a;
            f1Var.getClass();
            f1Var.e(new com.google.android.gms.internal.measurement.h1(f1Var, null, "notif_opened", bundle, false, 2));
        }
    }

    public static void c(Context context) {
        boolean z3;
        String str;
        if ((Build.VERSION.SDK_INT < 33 || u6.a(context, "android.permission.POST_NOTIFICATIONS") == 0) && e.c(context).f23569a) {
            z3 = true;
        } else {
            z3 = false;
        }
        FirebaseAnalytics a10 = a(context);
        if (a10 != null) {
            if (z3) {
                str = "yes";
            } else {
                str = "no";
            }
            String str2 = str;
            com.google.android.gms.internal.measurement.f1 f1Var = a10.f15587a;
            f1Var.getClass();
            f1Var.e(new com.google.android.gms.internal.measurement.h1(f1Var, null, "notif_optin", str2, false, 0));
        }
    }
}
