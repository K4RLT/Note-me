package m3;

import android.os.Process;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: u, reason: collision with root package name */
    public final int f20609u;

    public h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f20609u = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f20609u);
        super.run();
    }
}
