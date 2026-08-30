package i6;

import a6.q;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i, Notification notification, int i10) {
        try {
            service.startForeground(i, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e) {
            q d2 = q.d();
            String str = SystemForegroundService.f1127z;
            if (d2.f288a <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e8) {
            q d10 = q.d();
            String str2 = SystemForegroundService.f1127z;
            if (d10.f288a <= 5) {
                Log.w(str2, "Unable to start foreground service", e8);
            }
        }
    }
}
