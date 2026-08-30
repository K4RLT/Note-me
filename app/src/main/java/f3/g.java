package f3;

import a0.f0;
import android.app.Notification;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f16660d;

    @Override // f3.j
    public final void a(f0 f0Var) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) f0Var.f49d).setBigContentTitle(null).bigText(this.f16660d);
        if (this.f16683c) {
            bigText.setSummaryText(this.f16682b);
        }
    }

    @Override // f3.j
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
