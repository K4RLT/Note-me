package com.google.android.gms.internal.ads;
import a9.d;
import f9.k;
import g9.a;
import g9.y1;
import k9.a0;
import l9.i;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ke0 implements d, a80, a, s60, b70, c70, k70, v60, lr0 {

    /* renamed from: u, reason: collision with root package name */
    public final List f7722u;

    /* renamed from: v, reason: collision with root package name */
    public final he0 f7723v;

    /* renamed from: w, reason: collision with root package name */
    public long f7724w;

    public ke0(he0 he0Var, y10 y10Var) {
        this.f7723v = he0Var;
        this.f7722u = Collections.singletonList(y10Var);
    }

    public final void B(Class cls, String str, Object... objArr) {
        String str2;
        String simpleName = cls.getSimpleName();
        List list = this.f7722u;
        String concat = "Event-".concat(simpleName);
        he0 he0Var = this.f7723v;
        he0Var.getClass();
        if (!((Boolean) ym.f12911a.p()).booleanValue()) {
            return;
        }
        he0Var.f6701a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(currentTimeMillis);
            jsonWriter.name("source").value(concat);
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next().toString());
            }
            jsonWriter.endArray();
            jsonWriter.name("params").beginArray();
            for (Object obj : objArr) {
                if (obj != null) {
                    str2 = obj.toString();
                } else {
                    str2 = null;
                }
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            int i = a0.f19634b;
            i.d("unable to log", e);
        }
        String valueOf = String.valueOf(stringWriter.toString());
        int i10 = a0.f19634b;
        i.e("AD-DBG ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
        B(s60.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
        B(s60.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
        B(s60.class, "onAdOpened", new Object[0]);
    }

    @Override // a
    public final void L() {
        B(a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
        B(s60.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
        B(s60.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void c(Context context) {
        B(c70.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        k.C.f16819k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7724w;
        StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(elapsedRealtime);
        a0.k(sb2.toString());
        B(k70.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void k(String str) {
        B(jr0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void l(ir0 ir0Var, String str, Throwable th) {
        B(jr0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void o(Context context) {
        B(c70.class, "onPause", context);
    }

    @Override // d
    public final void p(String str, String str2) {
        B(d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
        k.C.f16819k.getClass();
        this.f7724w = SystemClock.elapsedRealtime();
        B(a80.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void t(ir0 ir0Var, String str) {
        B(jr0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
        B(s60.class, "onRewarded", ivVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void w(Context context) {
        B(c70.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(y1 y1Var) {
        B(v60.class, "onAdFailedToLoad", Integer.valueOf(y1Var.f17714u), y1Var.f17715v, y1Var.f17716w);
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        B(b70.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.lr0
    public final void z(ir0 ir0Var, String str) {
        B(jr0.class, "onTaskSucceeded", str);
    }
}
