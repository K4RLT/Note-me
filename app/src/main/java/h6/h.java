package h6;
import j.a;
import j.b;

import a6.q;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import k6.k;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17863a = q.f("NetworkStateTracker");

    public static final f6.d a(ConnectivityManager connectivityManager) {
        boolean z3;
        boolean z9;
        NetworkCapabilities a10;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z3 = true;
        } else {
            z3 = false;
        }
        try {
            a10 = k6.a(connectivityManager, k.a(connectivityManager));
        } catch (SecurityException e) {
            q.d().c(f17863a, "Unable to validate active network", e);
        }
        if (a10 != null) {
            z9 = k6.b(a10, 16);
            boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                z10 = false;
            }
            return new f6.d(z3, z9, isActiveNetworkMetered, z10);
        }
        z9 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z10 = false;
        return new f6.d(z3, z9, isActiveNetworkMetered2, z10);
    }
}
