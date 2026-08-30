package m;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20415a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f20416b;

    /* renamed from: c, reason: collision with root package name */
    public final e f20417c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f20418d;

    public j(ICustomTabsService iCustomTabsService, e eVar, ComponentName componentName) {
        this.f20416b = iCustomTabsService;
        this.f20417c = eVar;
        this.f20418d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f20415a) {
            try {
                try {
                    this.f20416b.postMessage(this.f20417c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
