package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class bj0 implements s90 {
    public final Object A;
    public Object B;
    public Object C;
    public Object D;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4804u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4805v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4806w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f4807x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4808y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f4809z;

    public bj0(int i) {
        switch (i) {
            case 3:
                this.f4805v = new AtomicBoolean();
                this.f4806w = null;
                this.f4807x = new HashMap(16, 1.0f);
                this.f4808y = new HashMap(16, 1.0f);
                this.f4809z = new HashMap(16, 1.0f);
                this.A = new HashMap(16, 1.0f);
                this.B = null;
                this.f4804u = false;
                this.C = new String[0];
                this.D = new com.google.android.gms.internal.measurement.c5(2);
                return;
            default:
                this.f4805v = new HashMap();
                this.f4806w = new HashMap();
                this.f4807x = new HashMap();
                this.f4808y = new HashSet();
                this.f4809z = new HashSet();
                this.A = new HashSet();
                this.B = new HashMap();
                this.C = new HashSet();
                this.D = new WeakHashMap();
                return;
        }
    }

    public void a(Runnable runnable) {
        ((Handler) ((r31) this.f4806w).zza()).post(new ac.a(this, 27, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // com.google.android.gms.internal.ads.s90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.y60 r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = r1.B
            r2 = r0
            com.google.android.gms.internal.ads.op r2 = (com.google.android.gms.internal.ads.op) r2
            java.lang.Object r0 = r1.f4807x
            com.google.android.gms.internal.ads.yx r0 = (com.google.android.gms.internal.ads.yx) r0
            java.lang.Object r0 = com.google.android.gms.internal.ads.ed1.k0(r0)
            com.google.android.gms.internal.ads.g20 r0 = (com.google.android.gms.internal.ads.g20) r0
            java.lang.Object r3 = r1.f4809z
            r6 = r3
            com.google.android.gms.internal.ads.h00 r6 = (com.google.android.gms.internal.ads.h00) r6
            r3 = 1
            r6.m1(r3)
            f9.f r7 = new f9.f
            boolean r4 = r1.f4804u
            r5 = 0
            if (r4 == 0) goto L26
            boolean r8 = r2.a(r5)
            goto L27
        L26:
            r8 = r5
        L27:
            f9.k r9 = f9.k.C
            k9.f0 r9 = r9.f16813c
            java.lang.Object r9 = r1.f4805v
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = k9.f0.i(r9)
            if (r4 == 0) goto L3c
            monitor-enter(r2)
            boolean r4 = r2.f9186b     // Catch: java.lang.Throwable -> L41
            monitor-exit(r2)
            if (r4 == 0) goto L3e
            r5 = r3
        L3c:
            r10 = r5
            goto L44
        L3e:
            r10 = r5
            r5 = r3
            goto L44
        L41:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r0
        L44:
            if (r5 == 0) goto L4f
            monitor-enter(r2)
            float r4 = r2.f9187c     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)
        L4a:
            r11 = r4
            goto L51
        L4c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r0
        L4f:
            r4 = 0
            goto L4a
        L51:
            java.lang.Object r2 = r1.f4808y
            com.google.android.gms.internal.ads.qp0 r2 = (com.google.android.gms.internal.ads.qp0) r2
            boolean r13 = r2.O
            r14 = 0
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L62
            r20.U1()
        L62:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.rr1 r0 = r0.m0
            java.lang.Object r0 = r0.zzb()
            r5 = r0
            com.google.android.gms.internal.ads.p90 r5 = (com.google.android.gms.internal.ads.p90) r5
            r10 = r7
            int r7 = r2.Q
            java.lang.Object r0 = r1.f4806w
            r8 = r0
            l9.a r8 = (l9.a) r8
            java.lang.String r9 = r2.B
            com.google.android.gms.internal.ads.up0 r0 = r2.f9956s
            java.lang.String r11 = r0.f11696b
            java.lang.String r12 = r0.f11695a
            java.lang.Object r0 = r1.A
            com.google.android.gms.internal.ads.aq0 r0 = (com.google.android.gms.internal.ads.aq0) r0
            boolean r2 = r2.b()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r1.C
            com.google.android.gms.internal.ads.wh0 r2 = (com.google.android.gms.internal.ads.wh0) r2
        L8b:
            r15 = r2
            goto L8f
        L8d:
            r2 = 0
            goto L8b
        L8f:
            java.lang.String r13 = r0.f4583g
            java.lang.String r16 = r6.n()
            r14 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.D
            com.google.android.gms.internal.ads.be0 r0 = (com.google.android.gms.internal.ads.be0) r0
            r2 = r19
            eb.y.c(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bj0.e(boolean, android.content.Context, com.google.android.gms.internal.ads.y60):void");
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f4808y;
    }

    public bj0(Context context, l9.a aVar, yx yxVar, qp0 qp0Var, h00 h00Var, aq0 aq0Var, boolean z3, op opVar, wh0 wh0Var, be0 be0Var) {
        this.f4805v = context;
        this.f4806w = aVar;
        this.f4807x = yxVar;
        this.f4808y = qp0Var;
        this.f4809z = h00Var;
        this.A = aq0Var;
        this.B = opVar;
        this.f4804u = z3;
        this.C = wh0Var;
        this.D = be0Var;
    }

    public bj0(Context context, w91 w91Var, Intent intent) {
        this.f4809z = new ArrayList();
        this.f4805v = context;
        this.f4807x = w91Var;
        this.f4808y = "OverlayDisplayService";
        this.A = intent;
        this.f4806w = x21.f(new ho0(11, (byte) 0));
        this.B = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.u21
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                bj0 bj0Var = bj0.this;
                ((w91) bj0Var.f4807x).b("%s : Binder has died.", (String) bj0Var.f4808y);
                ArrayList arrayList = (ArrayList) bj0Var.f4809z;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }
}
