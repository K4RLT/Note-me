package com.daren.scraply.notify;

import a6.g;
import a6.o;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import pe.k;
import q7.a;
import q7.d;
import te.c;

/* loaded from: classes.dex */
public final class DeferredPushWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredPushWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(c cVar) {
        Object kVar;
        String str;
        String str2;
        try {
            String b10 = getInputData().b("kind");
            if (b10 == null) {
                b10 = "";
            }
            kVar = d.valueOf(b10);
        } catch (Throwable th) {
            kVar = new k(th);
        }
        if (kVar instanceof k) {
            kVar = null;
        }
        d dVar = (d) kVar;
        if (dVar == null) {
            return o.a();
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        String b11 = getInputData().b("title");
        if (b11 == null) {
            str = "";
        } else {
            str = b11;
        }
        String b12 = getInputData().b("body");
        if (b12 == null) {
            str2 = "";
        } else {
            str2 = b12;
        }
        String b13 = getInputData().b("link");
        String b14 = getInputData().b("image");
        g inputData = getInputData();
        int notificationId = dVar.getNotificationId();
        Object obj = inputData.f274a.get(FacebookMediationAdapter.KEY_ID);
        if (obj instanceof Integer) {
            notificationId = ((Integer) obj).intValue();
        }
        a.c(applicationContext, dVar, str, str2, b13, b14, notificationId, 128);
        return o.a();
    }
}
