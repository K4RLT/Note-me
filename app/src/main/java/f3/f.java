package f3;
import d.a;
import q.p;

import a0.f0;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: d, reason: collision with root package name */
    public IconCompat f16658d;
    public IconCompat e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16659f;

    @Override // f3.j
    public final void a(f0 f0Var) {
        Bitmap a10;
        Notification.Builder builder = (Notification.Builder) f0Var.f49d;
        Context context = (Context) f0Var.f48c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f16658d;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                e.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f16658d;
                int i = iconCompat2.f663a;
                if (i == -1) {
                    Object obj = iconCompat2.f664b;
                    if (obj instanceof Bitmap) {
                        a10 = (Bitmap) obj;
                    } else {
                        a10 = null;
                    }
                } else if (i == 1) {
                    a10 = (Bitmap) iconCompat2.f664b;
                } else if (i == 5) {
                    a10 = IconCompat.a((Bitmap) iconCompat2.f664b, true);
                } else {
                    g5.p(iconCompat2, "called getBitmap() on ");
                    return;
                }
                bigContentTitle = bigContentTitle.bigPicture(a10);
            }
        }
        if (this.f16659f) {
            IconCompat iconCompat3 = this.e;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (this.f16683c) {
            bigContentTitle.setSummaryText(this.f16682b);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(bigContentTitle, false);
            e.b(bigContentTitle, null);
        }
    }

    @Override // f3.j
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
