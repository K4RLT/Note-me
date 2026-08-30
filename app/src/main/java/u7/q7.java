package u7;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import com.google.android.filament.Renderer;

/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f26762a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f26763b;

    /* renamed from: c, reason: collision with root package name */
    public Renderer f26764c;

    /* renamed from: d, reason: collision with root package name */
    public Display f26765d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final p7 f26766f;

    public q7(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        this.f26762a = (DisplayManager) systemService;
        this.f26763b = new Handler(Looper.getMainLooper());
        this.f26766f = new p7(this);
    }

    public final void a() {
        if (this.e) {
            this.f26762a.unregisterDisplayListener(this.f26766f);
            this.e = false;
        }
        this.f26764c = null;
        this.f26765d = null;
    }

    public final void b() {
        Display display;
        Renderer renderer = this.f26764c;
        if (renderer != null && (display = this.f26765d) != null) {
            try {
                if (renderer.f4227b == null) {
                    com.google.android.filament.g gVar = new com.google.android.filament.g(0);
                    gVar.f4247b = 60.0f;
                    renderer.f4227b = gVar;
                }
                com.google.android.filament.g gVar2 = renderer.f4227b;
                gVar2.getClass();
                gVar2.f4247b = display.getRefreshRate();
                display.getPresentationDeadlineNanos();
                display.getAppVsyncOffsetNanos();
                renderer.f(gVar2);
            } catch (Exception unused) {
            }
        }
    }
}
