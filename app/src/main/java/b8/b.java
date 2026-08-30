package b8;
import ga.a;
import ga.c;
import ia.b;
import q7.e;
import q7.f;
import u7.j7;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1861u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f1862v;

    public /* synthetic */ b(Context context, int i) {
        this.f1861u = i;
        this.f1862v = context;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        String str;
        int i = this.f1861u;
        Context context = this.f1862v;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                str2.getClass();
                String string = context.getString(j7.a(str2).f26340b);
                string.getClass();
                return string;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Activity b10 = f.b(context);
                if (b10 != null) {
                    sf.n0 n0Var = q7.b.f23563b;
                    sf.n0 n0Var2 = e.f23567a;
                    SharedPreferences sharedPreferences = b10.getApplicationContext().getSharedPreferences("scraply_notify", 0);
                    sharedPreferences.edit().putInt("perm_asked", sharedPreferences.getInt("perm_asked", 0) + 1).apply();
                    if (booleanValue) {
                        str = "accepted";
                    } else {
                        str = "denied";
                    }
                    FirebaseAnalytics a10 = ya.a(b10);
                    if (a10 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("outcome", str);
                        com.google.android.gms.internal.measurement.f1 f1Var = a10.f15587a;
                        f1Var.getClass();
                        f1Var.e(new com.google.android.gms.internal.measurement.h1(f1Var, null, "notif_permission", bundle, false, 2));
                    }
                    ya.c(b10);
                    if (booleanValue) {
                        Boolean bool = Boolean.FALSE;
                        n0Var.getClass();
                        n0Var.k(null, bool);
                        ya.ia.b(b10);
                        q7.b.c(b10);
                    } else {
                        if (Build.VERSION.SDK_INT < 33 || !b10.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            b10.getApplicationContext().getSharedPreferences("scraply_notify", 0).edit().putBoolean("perm_blocked", true).apply();
                            Log.d("Notify", "Permiso bloqueado a fondo: no se vuelve a pedir");
                        }
                        Boolean bool2 = Boolean.FALSE;
                        n0Var.getClass();
                        n0Var.k(null, bool2);
                    }
                }
                return pe.z.f22715a;
        }
    }
}
