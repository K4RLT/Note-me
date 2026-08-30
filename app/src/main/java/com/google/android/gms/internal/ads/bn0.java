package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bn0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4843a;

    public /* synthetic */ bn0(int i) {
        this.f4843a = i;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.gms.internal.ads.mq0] */
    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object wxVar;
        switch (this.f4843a) {
            case 0:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new om0(wxVar2, 2);
            case 1:
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new om0(wxVar3, 5);
            case 2:
                return new Object();
            case 3:
                return new Object();
            case 4:
                Object obj = new Object();
                try {
                    ba1.a();
                } catch (GeneralSecurityException e) {
                    k9.a0.k("Failed to Configure Aead. ".concat(e.toString()));
                    f9.k.C.f16817h.d("CryptoUtils.registerAead", e);
                }
                return obj;
            case 5:
                return new gq0();
            case 6:
                return la.a.f20062a;
            case 7:
                Object obj2 = new Object();
                obj2.f8397a = null;
                return obj2;
            case 8:
                return new wq0();
            case 9:
                wx wxVar4 = xx.f12655f;
                lo1.b(wxVar4);
                return wxVar4;
            case 10:
                np0 np0Var = new np0();
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), np0Var);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (unconfigurableExecutorService instanceof wx) {
                    return (wx) unconfigurableExecutorService;
                }
                if (unconfigurableExecutorService instanceof ScheduledExecutorService) {
                    wxVar = new c91((ScheduledExecutorService) unconfigurableExecutorService);
                } else {
                    wxVar = new wx(unconfigurableExecutorService);
                }
                return wxVar;
            case 11:
                c91 c91Var = xx.e;
                lo1.b(c91Var);
                return c91Var;
            case 12:
                wx wxVar5 = xx.f12655f;
                lo1.b(wxVar5);
                return wxVar5;
            case 13:
                return new vw();
            case 14:
                return new Object();
            case 15:
                return new hy0();
            case 16:
                return new Object();
            case 17:
                return new dz0();
            case 18:
                return new Object();
            case 19:
                return new j11();
            default:
                return new c21();
        }
    }
}
