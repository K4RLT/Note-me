package d6;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import lb.w0;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15752u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15753v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f15754w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f15755x;

    public /* synthetic */ i(w0 w0Var, int i, String str) {
        this.f15752u = 3;
        this.f15754w = w0Var;
        this.f15753v = i;
        this.f15755x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15752u) {
            case 0:
                ((j) this.f15754w).a((Intent) this.f15755x, this.f15753v);
                return;
            case 1:
                ((SystemForegroundService) this.f15755x).f1131y.notify(this.f15753v, (Notification) this.f15754w);
                return;
            case 2:
                ((TextView) this.f15754w).setTypeface((Typeface) this.f15755x, this.f15753v);
                return;
            case 3:
                try {
                    ((w0) this.f15754w).k((String) this.f15755x, this.f15753v, 4);
                    return;
                } catch (ob.a e) {
                    w0.f20294h.g("notifyModuleCompleted failed", e);
                    return;
                }
            default:
                ((m.e) this.f15755x).f20411v.e(this.f15753v, (Bundle) this.f15754w);
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i, Parcelable parcelable, int i10) {
        this.f15752u = i10;
        this.f15755x = obj;
        this.f15753v = i;
        this.f15754w = parcelable;
    }

    public /* synthetic */ i(int i, int i10, Object obj, Object obj2) {
        this.f15752u = i10;
        this.f15754w = obj;
        this.f15755x = obj2;
        this.f15753v = i;
    }
}
