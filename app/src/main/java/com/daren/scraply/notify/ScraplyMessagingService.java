package com.daren.scraply.notify;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import mf.f;
import q7.b;

/* loaded from: classes.dex */
public final class ScraplyMessagingService extends FirebaseMessagingService {
    public static final /* synthetic */ int B = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c() {
        Log.w("ScraplyFCM", "FCM descartó mensajes pendientes para este dispositivo");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Type inference failed for: r3v18, types: [n.e, n.r0] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(nd.n r21) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daren.scraply.notify.ScraplyMessagingService.d(nd.n):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        str.getClass();
        Log.d("ScraplyFCM", "Token FCM nuevo (" + f.H(12, str) + "…) → resuscribiendo temas");
        boolean z3 = b.f23562a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        b.c(applicationContext);
    }
}
