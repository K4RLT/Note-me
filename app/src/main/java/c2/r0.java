package c2;
import h2.a;
import q.b;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0 implements ComponentCallbacks2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Configuration f3632u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f3633v;

    public r0(Configuration configuration, a aVar) {
        this.f3632u = configuration;
        this.f3633v = aVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f3632u;
        configuration2.updateFrom(configuration);
        Iterator it = this.f3633v.f17829a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == null) {
                it.remove();
            } else {
                g5.b();
                return;
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f3633v.f17829a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f3633v.f17829a.clear();
    }
}
