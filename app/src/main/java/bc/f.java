package bc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f3173b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3174a;

    public f(Context context) {
        this.f3174a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f3175k) {
            try {
                Iterator it = ((n.d) g.f3176l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3174a.unregisterReceiver(this);
    }
}
