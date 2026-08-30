package u7;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
public final class p7 implements DisplayManager.DisplayListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q7 f26733u;

    public p7(q7 q7Var) {
        this.f26733u = q7Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        q7 q7Var = this.f26733u;
        Display display = q7Var.f26765d;
        if (display != null && i == display.getDisplayId()) {
            q7Var.b();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
