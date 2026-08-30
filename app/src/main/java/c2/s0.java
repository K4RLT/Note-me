package c2;
import h2.b;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class s0 implements ComponentCallbacks2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f3637u;

    public s0(b bVar) {
        this.f3637u = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b bVar = this.f3637u;
        synchronized (bVar) {
            bVar.f17830a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        b bVar = this.f3637u;
        synchronized (bVar) {
            bVar.f17830a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        b bVar = this.f3637u;
        synchronized (bVar) {
            bVar.f17830a.c();
        }
    }
}
