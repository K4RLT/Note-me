package ca;
import b.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4038b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4039c = false;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f4037a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f4040d = new AtomicBoolean();

    public static boolean a(Context context) {
        int i;
        try {
            if (!f4039c) {
                try {
                    c4.n a10 = na.a(context);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = 134217792;
                    } else {
                        i = 64;
                    }
                    PackageInfo c10 = a10.c(i, "com.google.android.gms");
                    i.b(context);
                    if (c10 != null && !i.d(c10, false) && i.d(c10, true)) {
                        f4038b = true;
                    } else {
                        f4038b = false;
                    }
                    f4039c = true;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                    f4039c = true;
                }
            }
            if (!f4038b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            f4039c = true;
            throw th;
        }
    }
}
