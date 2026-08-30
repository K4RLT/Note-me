package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class pw implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9621a;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f9622b;

    /* renamed from: c, reason: collision with root package name */
    public final tr1 f9623c;

    public /* synthetic */ pw(tr1 tr1Var, tr1 tr1Var2, int i) {
        this.f9621a = i;
        this.f9622b = tr1Var;
        this.f9623c = tr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f9621a) {
            case 0:
                return new ow((Context) this.f9622b.f11431a, (k9.c0) this.f9623c.f11431a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f9622b.f11431a;
                rx0 rx0Var = (rx0) this.f9623c.f11431a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                g3.a.t(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb2.append(")");
                return new cy0(executorService, sb2.toString(), rx0Var.Z());
            case 2:
                return new b21((Context) this.f9622b.f11431a, (ExecutorService) this.f9623c.f11431a);
            default:
                return new e21((Context) this.f9622b.f11431a, (ExecutorService) this.f9623c.f11431a);
        }
    }
}
