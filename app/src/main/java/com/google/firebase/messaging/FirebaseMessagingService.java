package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import b6.f;
import ba.b;
import d5.c;
import e7.d;
import ib.h;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k6.i;
import ma.a;
import nd.n;
import nd.o;
import nd.v;
import nd.w;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque A = new ArrayDeque(10);

    /* renamed from: u, reason: collision with root package name */
    public final ExecutorService f15606u;

    /* renamed from: v, reason: collision with root package name */
    public w f15607v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f15608w;

    /* renamed from: x, reason: collision with root package name */
    public int f15609x;

    /* renamed from: y, reason: collision with root package name */
    public int f15610y;

    /* renamed from: z, reason: collision with root package name */
    public b f15611z;

    public FirebaseMessagingService() {
        a aVar = new a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15606u = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15608w = new Object();
        this.f15610y = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            v.c(intent);
        }
        synchronized (this.f15608w) {
            try {
                int i = this.f15610y - 1;
                this.f15610y = i;
                if (i == 0) {
                    stopSelfResult(this.f15609x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void c() {
    }

    public void e(String str) {
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f15607v == null) {
                this.f15607v = new w(new i(11, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15607v;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f15606u.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        synchronized (this.f15608w) {
            this.f15609x = i10;
            this.f15610y++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) o.j().f21274x).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        h hVar = new h();
        this.f15606u.execute(new f(2, this, intent2, hVar));
        ib.o oVar = hVar.f18363a;
        if (oVar.k()) {
            a(intent);
            return 2;
        }
        oVar.c(new c(0), new d(this, 4, intent));
        return 3;
    }

    public void d(n nVar) {
    }
}
