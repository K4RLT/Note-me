package de;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.internal.ads.vl;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final vl f15834a = new vl("CommonUtils");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            vl vlVar = f15834a;
            if (Log.isLoggable(vlVar.f11932a, 6)) {
                Log.e("CommonUtils", vlVar.a(concat));
                return "";
            }
            return "";
        }
    }
}
