package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tt;
import g9.f;
import g9.n;
import g9.p;
import l9.i;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            n nVar = p.f17688g.f17690b;
            tr trVar = new tr();
            nVar.getClass();
            ((tt) new f(nVar, this, trVar).d(this, false)).s0(intent);
        } catch (RemoteException e) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
