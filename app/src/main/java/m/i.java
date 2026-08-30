package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import q.x;

/* loaded from: classes.dex */
public abstract class i implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public Context f20414u;

    public abstract void a(h hVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.f, m.h] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f20414u != null) {
            a(new f(ICustomTabsService.Stub.asInterface(iBinder), componentName));
        } else {
            x.o("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }
}
