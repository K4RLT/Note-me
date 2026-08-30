package j4;

import android.hardware.SyncFence;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: u, reason: collision with root package name */
    public final SyncFence f18907u;

    public g(SyncFence syncFence) {
        this.f18907u = syncFence;
    }

    @Override // j4.f
    public final void close() {
        this.f18907u.close();
    }

    @Override // j4.f
    public final long f() {
        long signalTime;
        signalTime = this.f18907u.getSignalTime();
        return signalTime;
    }

    @Override // j4.f
    public final boolean j() {
        boolean awaitForever;
        awaitForever = this.f18907u.awaitForever();
        return awaitForever;
    }
}
