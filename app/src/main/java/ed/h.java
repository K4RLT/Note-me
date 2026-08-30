package ed;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import android.util.DisplayMetrics;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ Bitmap.Config A() {
        return Bitmap.Config.RGBA_F16;
    }

    public static /* synthetic */ NotificationChannel c(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* bridge */ /* synthetic */ Bitmap.Config e() {
        return Bitmap.Config.HARDWARE;
    }

    public static /* bridge */ /* synthetic */ Bitmap f(int i, int i10, Bitmap.Config config, ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, i, i10, config, true, colorSpace);
    }

    public static /* bridge */ /* synthetic */ HardwareBuffer k(Object obj) {
        return (HardwareBuffer) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId m(Object obj) {
        return (AutofillId) obj;
    }
}
