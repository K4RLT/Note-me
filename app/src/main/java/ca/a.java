package ca;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import fa.y;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q.x;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public boolean f4018u = false;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedBlockingQueue f4019v = new LinkedBlockingQueue();

    public final IBinder a() {
        y.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f4018u) {
            this.f4018u = true;
            IBinder iBinder = (IBinder) this.f4019v.poll(10000L, TimeUnit.MILLISECONDS);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        x.o("Cannot call get on this connection more than once");
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4019v.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
