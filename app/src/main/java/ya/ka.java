package ya;
import bc.g;
import g7.b;
import ib.o;
import nd.m;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public abstract class ka {
    public static void a(String str, boolean z3) {
        FirebaseMessaging firebaseMessaging;
        o m4;
        try {
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(g.c());
            }
            firebaseMessaging.getClass();
            o oVar = firebaseMessaging.f15604h;
            if (z3) {
                m4 = oVar.m(new b(str, 2));
            } else {
                m4 = oVar.m(new b(str, 3));
            }
            m4.b(new m(z3, str));
        } catch (Exception e) {
            Log.e("ScraplyFCM", "No se pudo tocar el tema «" + str + "»", e);
        }
    }
}
