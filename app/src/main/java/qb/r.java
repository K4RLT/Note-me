package qb;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static d f23667a;

    public static synchronized q a(Context context, Intent intent) {
        d dVar;
        synchronized (r.class) {
            try {
                if (f23667a == null) {
                    d dVar2 = new d(context.getApplicationContext(), intent);
                    dVar2.f23629d = new c(dVar2);
                    dVar2.f23627b.e.add(dVar2);
                    f23667a = dVar2;
                }
                dVar = f23667a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
