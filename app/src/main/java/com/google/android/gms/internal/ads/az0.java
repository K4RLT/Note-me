package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class az0 implements wy0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4638a;

    /* renamed from: b, reason: collision with root package name */
    public final pr1 f4639b;

    /* renamed from: c, reason: collision with root package name */
    public final pr1 f4640c;

    /* renamed from: d, reason: collision with root package name */
    public final x11 f4641d;
    public final pr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final sx0 f4642f;

    /* renamed from: g, reason: collision with root package name */
    public final rx0 f4643g;

    public az0(ExecutorService executorService, pr1 pr1Var, pr1 pr1Var2, x11 x11Var, pr1 pr1Var3, sx0 sx0Var, rx0 rx0Var) {
        this.f4638a = executorService;
        this.f4639b = pr1Var;
        this.f4640c = pr1Var2;
        this.f4641d = x11Var;
        this.e = pr1Var3;
        this.f4642f = sx0Var;
        this.f4643g = rx0Var;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final ac.b a(Context context, View view, Activity activity) {
        String str;
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f4642f.zzb();
        context.getClass();
        cVar.f13373x = context;
        cVar.f13374y = view;
        cVar.f13375z = activity;
        if (true != this.f4643g.T()) {
            str = "";
        } else {
            str = null;
        }
        cVar.A = str;
        cVar.B = this.f4641d.b(context, view);
        wd B0 = je.B0();
        B0.getClass();
        cVar.C = B0;
        cVar.D = yx0.f13000v;
        return ((fz0) cVar.c().f6968a.zzb()).a();
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final void b(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            dz0 dz0Var = (dz0) this.e.zzb();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (dz0Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        dz0Var.f5561b = MotionEvent.obtain(motionEvent);
                    }
                    dz0Var.f5562c.a(motionEvent);
                    ArrayDeque arrayDeque = dz0Var.f5560a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new cz0(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final ac.b c(Context context) {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f4642f.zzb();
        cVar.f13373x = context;
        cVar.B = this.f4641d.a();
        wd B0 = je.B0();
        B0.getClass();
        cVar.C = B0;
        cVar.D = yx0.f12999u;
        return ((fz0) cVar.c().f6968a.zzb()).a();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.bz0, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wy0
    public final ac.b d(Context context, String str, View view) {
        pr1 pr1Var = this.e;
        HashMap c10 = this.f4641d.c();
        dz0 dz0Var = (dz0) pr1Var.zzb();
        synchronized (dz0Var) {
            try {
                MotionEvent motionEvent = dz0Var.f5561b;
                if (motionEvent != null) {
                    c10.put("nv", motionEvent);
                }
                c10.put("oe", dz0Var.f5562c);
                ArrayDeque arrayDeque = dz0Var.f5560a;
                c10.put("ro", arrayDeque.toArray(new cz0[arrayDeque.size()]));
                dz0Var.f5562c = new Object();
                arrayDeque.clear();
                MotionEvent motionEvent2 = dz0Var.f5561b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    dz0Var.f5561b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f4642f.zzb();
        context.getClass();
        cVar.f13373x = context;
        cVar.f13374y = view;
        cVar.f13375z = null;
        cVar.A = str;
        cVar.B = c10;
        cVar.D = yx0.f13001w;
        wd B0 = je.B0();
        B0.getClass();
        cVar.C = B0;
        return ((fz0) cVar.c().f6968a.zzb()).a();
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final String zza() {
        return "1.904631200";
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final ac.b zzb() {
        return ed1.E(new bo0(5, this), this.f4638a);
    }
}
