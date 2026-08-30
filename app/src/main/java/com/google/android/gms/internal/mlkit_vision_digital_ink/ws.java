package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ba.j;
import q1.b;
import r0.b;
import r0.i;
import r2.g;
import r2.h;
import r2.i;
import r3.l;

import android.os.SystemClock;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final /* synthetic */ class ws implements Runnable {
    public final /* synthetic */ int A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ dt f15192u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f15193v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r8 f15194w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ya f15195x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ jm f15196y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ct f15197z;

    public /* synthetic */ ws(dt dtVar, long j10, r8 r8Var, ya yaVar, jm jmVar, ct ctVar, int i) {
        this.f15192u = dtVar;
        this.f15193v = j10;
        this.f15194w = r8Var;
        this.f15195x = yaVar;
        this.f15196y = jmVar;
        this.f15197z = ctVar;
        this.A = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long elapsedRealtime;
        if (tv.f15034a) {
            elapsedRealtime = SystemClock.elapsedRealtimeNanos();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() * 1000000;
        }
        final long j10 = elapsedRealtime - this.f15193v;
        final r8 r8Var = this.f15194w;
        final ya yaVar = this.f15195x;
        final jm jmVar = this.f15196y;
        final ct ctVar = this.f15197z;
        final int i = this.A;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.zs
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
            
                if (((java.lang.Boolean) r0).booleanValue() != false) goto L8;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000a. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r5 = this;
                    com.google.android.gms.internal.mlkit_vision_digital_ink.ya r0 = r2
                    com.google.android.gms.internal.mlkit_vision_digital_ink.jm r1 = r3
                    java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.r(r0)     // Catch: java.lang.Throwable -> L1e
                    int r1 = r1.f14516u     // Catch: java.lang.Throwable -> L18
                    switch(r1) {
                        case 24: goto L1a;
                        default: goto Ld;
                    }     // Catch: java.lang.Throwable -> L18
                Ld:
                    r1 = r0
                    java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L18
                    boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L18
                    if (r1 == 0) goto L56
                L16:
                    r1 = 3
                    goto L57
                L18:
                    r1 = move-exception
                    goto L20
                L1a:
                    r1 = r0
                    com.google.android.gms.internal.mlkit_vision_digital_ink.m r1 = (com.google.android.gms.internal.mlkit_vision_digital_ink.m) r1     // Catch: java.lang.Throwable -> L18
                    goto L16
                L1e:
                    r1 = move-exception
                    r0 = 0
                L20:
                    boolean r2 = r1 instanceof java.util.concurrent.ExecutionException
                    if (r2 == 0) goto L28
                    java.lang.Throwable r1 = r1.getCause()
                L28:
                    boolean r2 = r1 instanceof java.util.concurrent.CancellationException
                    if (r2 == 0) goto L2e
                    r1 = 5
                    goto L57
                L2e:
                    boolean r2 = r1 instanceof java.lang.InterruptedException
                    if (r2 == 0) goto L34
                    r1 = 6
                    goto L57
                L34:
                    boolean r2 = r1 instanceof java.io.IOException
                    if (r2 == 0) goto L3a
                    r1 = 7
                    goto L57
                L3a:
                    boolean r2 = r1 instanceof java.lang.IllegalStateException
                    if (r2 == 0) goto L41
                    r1 = 8
                    goto L57
                L41:
                    boolean r2 = r1 instanceof java.lang.IllegalArgumentException
                    if (r2 == 0) goto L48
                    r1 = 9
                    goto L57
                L48:
                    boolean r2 = r1 instanceof java.lang.UnsupportedOperationException
                    if (r2 == 0) goto L4f
                    r1 = 10
                    goto L57
                L4f:
                    boolean r1 = r1 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.jr
                    if (r1 == 0) goto L56
                    r1 = 11
                    goto L57
                L56:
                    r1 = 4
                L57:
                    com.google.android.gms.internal.mlkit_vision_digital_ink.r8 r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.r8.this
                    if (r0 == 0) goto L71
                    com.google.android.gms.internal.mlkit_vision_digital_ink.hn r2 = r2.g()
                    com.google.android.gms.internal.mlkit_vision_digital_ink.q8 r2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.q8) r2
                    com.google.android.gms.internal.mlkit_vision_digital_ink.ct r3 = r4
                    com.google.android.gms.internal.mlkit_vision_digital_ink.r8 r0 = r3.l(r0)
                    r2.h(r0)
                    com.google.android.gms.internal.mlkit_vision_digital_ink.nn r0 = r2.i()
                    r2 = r0
                    com.google.android.gms.internal.mlkit_vision_digital_ink.r8 r2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.r8) r2
                L71:
                    com.google.android.gms.internal.mlkit_vision_digital_ink.x8 r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.y8.t()
                    r0.b()
                    com.google.android.gms.internal.mlkit_vision_digital_ink.nn r3 = r0.f14430v
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8 r3 = (com.google.android.gms.internal.mlkit_vision_digital_ink.y8) r3
                    int r4 = r5
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8.w(r3, r4)
                    r0.b()
                    com.google.android.gms.internal.mlkit_vision_digital_ink.nn r3 = r0.f14430v
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8 r3 = (com.google.android.gms.internal.mlkit_vision_digital_ink.y8) r3
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8.x(r3, r1)
                    r0.b()
                    com.google.android.gms.internal.mlkit_vision_digital_ink.nn r1 = r0.f14430v
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8 r1 = (com.google.android.gms.internal.mlkit_vision_digital_ink.y8) r1
                    long r3 = r6
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8.v(r1, r3)
                    r0.b()
                    com.google.android.gms.internal.mlkit_vision_digital_ink.nn r1 = r0.f14430v
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8 r1 = (com.google.android.gms.internal.mlkit_vision_digital_ink.y8) r1
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8.u(r1, r2)
                    com.google.android.gms.internal.mlkit_vision_digital_ink.nn r0 = r0.i()
                    com.google.android.gms.internal.mlkit_vision_digital_ink.y8 r0 = (com.google.android.gms.internal.mlkit_vision_digital_ink.y8) r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.zs.run():void");
            }
        };
        int i10 = g2.f14354a;
        int i11 = 8;
        this.f15192u.f14218g.execute(new hb(Executors.callable(new ba.j(i11, new Object(), q1.b(), runnable), null)));
    }
}
