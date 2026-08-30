package nd;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public final class w extends Binder {

    /* renamed from: u, reason: collision with root package name */
    public final k6.i f21303u;

    public w(k6.i iVar) {
        this.f21303u = iVar;
    }

    public final void a(x xVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = xVar.f21304a;
            FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f21303u.f19569v;
            ib.h hVar = new ib.h();
            firebaseMessagingService.f15606u.execute(new b6.f(2, firebaseMessagingService, intent, hVar));
            hVar.f18363a.c(new d5.c(0), new b1.h(15, xVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
