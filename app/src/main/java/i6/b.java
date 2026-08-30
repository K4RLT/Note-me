package i6;
import c.a;
import d.a;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import m.e;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18324u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18325v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f18326w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Parcelable f18327x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f18328y;

    public b(SystemForegroundService systemForegroundService, int i, Notification notification, int i10) {
        this.f18328y = systemForegroundService;
        this.f18325v = i;
        this.f18327x = notification;
        this.f18326w = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18324u) {
            case 0:
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f18328y;
                Notification notification = (Notification) this.f18327x;
                int i = Build.VERSION.SDK_INT;
                int i10 = this.f18326w;
                int i11 = this.f18325v;
                if (i >= 31) {
                    a(systemForegroundService, i11, notification, i10);
                    return;
                } else if (i >= 29) {
                    a(systemForegroundService, i11, notification, i10);
                    return;
                } else {
                    systemForegroundService.startForeground(i11, notification);
                    return;
                }
            default:
                ((e) this.f18328y).f20411v.c(this.f18325v, this.f18326w, (Bundle) this.f18327x);
                return;
        }
    }

    public b(e eVar, int i, int i10, Bundle bundle) {
        this.f18328y = eVar;
        this.f18325v = i;
        this.f18326w = i10;
        this.f18327x = bundle;
    }
}
