package o4;
import a.a;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.Display;
import android.view.WindowManager;
import f2.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f21772a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final float f21773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21774c;

    public b(Context context) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = c.b(context);
        } else {
            defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        }
        Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
        float refreshRate = supportedModes[0].getRefreshRate();
        for (int i = 1; i < supportedModes.length; i++) {
            float refreshRate2 = supportedModes[i].getRefreshRate();
            if (refreshRate2 > refreshRate) {
                refreshRate = refreshRate2;
            }
        }
        this.f21773b = 1000.0f / refreshRate;
        this.f21774c = a().f21770c;
    }

    public final int a() {
        long j10 = this.f21772a;
        int i = this.f21774c;
        float f10 = this.f21773b;
        if (j10 <= 0) {
            return ((int) f10) + i;
        }
        return Math.min(32, ((int) (((float) (SystemClock.uptimeMillis() - this.f21772a)) + f10)) + i);
    }
}
