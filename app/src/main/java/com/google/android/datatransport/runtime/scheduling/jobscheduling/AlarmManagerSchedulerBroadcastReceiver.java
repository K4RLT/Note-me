package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c2.m;
import com.google.android.gms.internal.consent_sdk.c;
import j.i0;
import java.util.concurrent.Executor;
import n8.i;
import n8.q;
import t8.d;
import x8.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4209a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        i0 a10 = i.a();
        a10.E(queryParameter);
        a10.f18638x = a.b(intValue);
        if (queryParameter2 != null) {
            a10.f18637w = Base64.decode(queryParameter2, 0);
        }
        c cVar = q.a().f21204d;
        ((Executor) cVar.f13375z).execute(new d(cVar, a10.d(), i, new m(5)));
    }
}
