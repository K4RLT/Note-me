package wa;
import f7.a;
import f7.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class m6 {
    public static void a(a aVar) {
        aVar.getClass();
        Context context = c.f16779a;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_funnel", 0);
            if (sharedPreferences.getBoolean(aVar.getPrefKey(), false)) {
                return;
            }
            sharedPreferences.edit().putBoolean(aVar.getPrefKey(), true).apply();
            c.i(aVar.getEventName(), null);
            c.m();
            Log.d("Funnel", "Escalón alcanzado: " + aVar.getEventName());
        }
    }
}
