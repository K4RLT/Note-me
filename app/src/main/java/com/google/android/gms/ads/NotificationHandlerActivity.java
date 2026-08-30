package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tt;
import g9.f;
import g9.n;
import g9.p;
import l9.i;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            n nVar = p.f17688g.f17690b;
            tr trVar = new tr();
            nVar.getClass();
            tt ttVar = (tt) new f(nVar, this, trVar).d(this, false);
            if (ttVar == null) {
                i.c("OfflineUtils is null");
            } else {
                ttVar.s0(getIntent());
            }
        } catch (RemoteException e) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
