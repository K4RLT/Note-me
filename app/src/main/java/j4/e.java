package j4;

import android.hardware.SyncFence;
import androidx.hardware.SyncFenceV19;

/* loaded from: classes.dex */
public final class e implements AutoCloseable {

    /* renamed from: u, reason: collision with root package name */
    public final f f18906u;

    public e(SyncFence syncFence) {
        this.f18906u = new g(syncFence);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f18906u.close();
    }

    public final void f() {
        this.f18906u.j();
    }

    public e(SyncFenceV19 syncFenceV19) {
        this.f18906u = syncFenceV19;
    }
}
