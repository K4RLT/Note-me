package wa;
import z5.h;

import android.content.Context;
import com.daren.scraply.MainActivity;

/* loaded from: classes.dex */
public abstract class a9 {
    public static jb.e a(MainActivity mainActivity) {
        h hVar;
        synchronized (jb.b.class) {
            try {
                if (jb.b.f19103a == null) {
                    Context applicationContext = mainActivity.getApplicationContext();
                    if (applicationContext != null) {
                        mainActivity = applicationContext;
                    }
                    jb.b.f19103a = new h(new jb.f(mainActivity, 0));
                }
                hVar = jb.b.f19103a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (jb.e) ((kb.c) hVar.f31922v).mo207zza();
    }
}
