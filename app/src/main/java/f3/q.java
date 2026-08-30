package f3;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static String f16698d;

    /* renamed from: g, reason: collision with root package name */
    public static p f16700g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16701a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f16702b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16697c = new Object();
    public static HashSet e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f16699f = new Object();

    public q(Context context) {
        this.f16701a = context;
        this.f16702b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            m mVar = new m(this.f16701a.getPackageName(), i, notification);
            synchronized (f16699f) {
                try {
                    if (f16700g == null) {
                        f16700g = new p(this.f16701a.getApplicationContext());
                    }
                    f16700g.f16694v.obtainMessage(0, mVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f16702b.cancel(null, i);
            return;
        }
        this.f16702b.notify(null, i, notification);
    }
}
