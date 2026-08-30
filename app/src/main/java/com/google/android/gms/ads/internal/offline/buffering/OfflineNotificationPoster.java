package com.google.android.gms.ads.internal.offline.buffering;

import a6.l;
import a6.o;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tt;
import g9.f;
import g9.n;
import g9.p;
import i9.a;
import oa.b;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: z, reason: collision with root package name */
    public final tt f4261z;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        n nVar = p.f17688g.f17690b;
        tr trVar = new tr();
        nVar.getClass();
        this.f4261z = (tt) new f(nVar, context, trVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final o doWork() {
        try {
            this.f4261z.I1(new b(getApplicationContext()), new a(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return o.a();
        } catch (RemoteException unused) {
            return new l();
        }
    }
}
