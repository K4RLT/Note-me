package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pe0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9507a;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f9508b;

    public /* synthetic */ pe0(tr1 tr1Var, int i) {
        this.f9507a = i;
        this.f9508b = tr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object wxVar;
        switch (this.f9507a) {
            case 0:
                return new tf(23, (yp) this.f9508b.f11431a);
            case 1:
                return new hx0(26, (h20) this.f9508b.f11431a);
            case 2:
                return new hl0(3, (qo0) this.f9508b.f11431a);
            case 3:
                return new on0((bp0) this.f9508b.f11431a);
            case 4:
                File dir = ((Context) this.f9508b.f11431a).getDir("yqzdkcache", 0);
                lo1.b(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) this.f9508b.f11431a;
                if (executorService instanceof wx) {
                    return (wx) executorService;
                }
                if (executorService instanceof ScheduledExecutorService) {
                    wxVar = new c91((ScheduledExecutorService) executorService);
                } else {
                    wxVar = new wx(executorService);
                }
                return wxVar;
            case 6:
                return new my0((ExecutorService) this.f9508b.f11431a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f9508b.f11431a).getResources().getDisplayMetrics();
                lo1.b(displayMetrics);
                return displayMetrics;
        }
    }
}
