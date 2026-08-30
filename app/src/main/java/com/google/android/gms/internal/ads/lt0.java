package com.google.android.gms.internal.ads;
import g9.r;
import g9.v1;
import k9.f0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.io.IOException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lt0 implements s81, xk1, r31, ie0, uw1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8134u;

    /* renamed from: v, reason: collision with root package name */
    public Object f8135v;

    public lt0(int i) {
        this.f8134u = i;
        switch (i) {
            case 10:
                this.f8135v = j51.v(new Object[]{1, 5}, 2);
                return;
            case 11:
            default:
                this.f8135v = new int[2];
                return;
            case 12:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public void c(int i, cs1 cs1Var, long j10, int i10) {
        ((MediaCodec) this.f8135v).queueSecureInputBuffer(i, 0, cs1Var.i, j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public void d(Bundle bundle) {
        ((MediaCodec) this.f8135v).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public void f(int i, int i10, int i11, long j10) {
        ((MediaCodec) this.f8135v).queueInputBuffer(i, 0, i10, j10, i11);
    }

    public JSONObject g(View view) {
        if (view == null) {
            return su0.a(0, 0, 0, 0);
        }
        int[] iArr = (int[]) this.f8135v;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return su0.a(iArr[0], iArr[1], width, height);
    }

    public void h(Exception exc) {
        x21.P("MediaCodecAudioRenderer", "Audio sink error", exc);
        mu muVar = ((ew1) this.f8135v).Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new hv1(muVar, exc, 5));
        }
    }

    public void i(int i, Object obj, oo1 oo1Var) {
        um1 um1Var = (um1) this.f8135v;
        cm1 cm1Var = (cm1) obj;
        um1Var.a0(i, 2);
        um1Var.M1(cm1Var.d(oo1Var));
        oo1Var.g(cm1Var, this);
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        ((hu1) obj).n((IOException) this.f8135v);
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public Object o(String str) {
        return ((ck1) this.f8135v).e(str, null);
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        Object obj2;
        double d2;
        int i;
        switch (this.f8134u) {
            case 0:
                dt0 dt0Var = (dt0) this.f8135v;
                if (obj != null) {
                    dt0Var.f5502k.a();
                    v1 j10 = dt0Var.j(obj);
                    if (!(j10 instanceof p60)) {
                        d2 = 0.0d;
                    } else {
                        d2 = ((p60) j10).D;
                    }
                    double d10 = d2;
                    v1 j11 = dt0Var.j(obj);
                    if (j11 instanceof p60) {
                        i = ((p60) j11).E;
                    } else {
                        i = 2;
                    }
                    obj2 = obj;
                    kt0 kt0Var = new kt0(obj2, dt0Var.f5509r, d10, i);
                    Queue queue = dt0Var.f5501j;
                    synchronized (queue) {
                        queue.add(kt0Var);
                    }
                    v1 j12 = dt0Var.j(obj2);
                    dt0Var.f5509r.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (dt0Var.f5507p.get()) {
                        f0.f19676l.post(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(dt0Var, j12));
                    }
                    ScheduledExecutorService scheduledExecutorService = dt0Var.f5505n;
                    scheduledExecutorService.execute(new t1(dt0Var, currentTimeMillis, j12));
                    if (dt0Var.f5498f != null) {
                        if (((Boolean) r.e.f17698c.a(sl.I)).booleanValue()) {
                            dt0Var.f5506o.a(new mt0(dt0Var, 4), kt0Var.a());
                        } else {
                            scheduledExecutorService.schedule(new mt0(dt0Var, 3), kt0Var.a(), TimeUnit.MILLISECONDS);
                        }
                    } else {
                        if (((Boolean) r.e.f17698c.a(sl.I)).booleanValue()) {
                            dt0Var.f5506o.a(new mt0(dt0Var), kt0Var.a());
                        } else {
                            scheduledExecutorService.schedule(new mt0(dt0Var), kt0Var.a(), TimeUnit.MILLISECONDS);
                        }
                    }
                } else {
                    obj2 = obj;
                }
                boolean z3 = false;
                dt0Var.f5504m.set(false);
                if (obj2 == null || dt0Var.f5498f == null) {
                    if (obj2 == null) {
                        z3 = true;
                    }
                    dt0Var.d(z3);
                    return;
                }
                return;
            default:
                ((g21) this.f8135v).c();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f8134u) {
            case 0:
                dt0 dt0Var = (dt0) this.f8135v;
                dt0Var.f5504m.set(false);
                if ((th instanceof bt0) && ((bt0) th).f4874u == 0) {
                    throw null;
                }
                dt0Var.d(true);
                return;
            default:
                g21 g21Var = (g21) this.f8135v;
                g21Var.b(th);
                g21Var.c();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r31
    public /* synthetic */ Object zza() {
        int i = os1.A;
        return (hx0) this.f8135v;
    }

    @Override // com.google.android.gms.internal.ads.uw1
    /* renamed from: zza, reason: collision with other method in class */
    public void mo209zza() {
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public void a() {
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public void b() {
    }

    @Override // com.google.android.gms.internal.ads.uw1
    public void e() {
    }

    public /* synthetic */ lt0(int i, Object obj) {
        this.f8134u = i;
        this.f8135v = obj;
    }

    public /* synthetic */ lt0(gu1 gu1Var, qx1 qx1Var, vx1 vx1Var, IOException iOException, boolean z3) {
        this.f8134u = 11;
        this.f8135v = iOException;
    }

    public lt0(Matcher matcher) {
        this.f8134u = 4;
        matcher.getClass();
        this.f8135v = matcher;
    }

    public lt0(h21 h21Var, g21 g21Var) {
        this.f8134u = 3;
        this.f8135v = g21Var;
        Objects.requireNonNull(h21Var);
    }

    public lt0(um1 um1Var) {
        this.f8134u = 7;
        this.f8135v = um1Var;
        um1Var.f11688u = this;
    }
}
