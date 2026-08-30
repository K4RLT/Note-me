package com.google.android.gms.internal.consent_sdk;
import b2.l;
import b2.m;
import b2.n;
import b2.o;
import b2.p;
import b2.q;
import b2.r;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public final Application f13608b;

    /* renamed from: c, reason: collision with root package name */
    public final x f13609c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f13610d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f13611f = new AtomicReference(new ArrayDeque());

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f13612g = new AtomicReference(new ArrayDeque());

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f13613h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f13614j = new AtomicReference(new ArrayDeque());

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f13615k = new AtomicReference(new ArrayDeque());

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f13616l = new AtomicReference(new ArrayDeque());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f13607a = new AtomicReference(null);

    public y(Application application, Executor executor, x xVar, boolean z3) {
        this.e = z3;
        this.f13608b = application;
        this.f13609c = xVar;
        this.f13610d = executor;
    }

    public final void a(Queue queue, int i, int i10, String str) {
        Bundle bundle;
        long j10;
        Long l10 = (Long) queue.poll();
        if (l10 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l10.longValue();
            if (str != null) {
                i = i10;
            }
            AtomicReference atomicReference = this.f13615k;
            Queue queue2 = (Queue) atomicReference.get();
            x xVar = this.f13609c;
            Application application = xVar.f13597a;
            o2 l11 = p2.l();
            u1 l12 = l();
            x1 l13 = y1.l();
            l13.b();
            y1.o((y1) l13.f13523v, i);
            if (str != null) {
                l13.b();
                y1.m((y1) l13.f13523v, str);
            }
            if (currentTimeMillis > 0) {
                l13.b();
                y1.n((y1) l13.f13523v, currentTimeMillis);
            }
            y1 y1Var = (y1) l13.a();
            l12.b();
            q((b2) l12.f13523v, y1Var);
            String str2 = xVar.e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    xVar.e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(xVar.e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = xVar.e;
            }
            if (str2 != null) {
                l12.b();
                n((b2) l12.f13523v, str2);
            }
            a2 a2Var = xVar.f13598b;
            if (a2Var == null) {
                z1 l14 = a2.l();
                l14.b();
                a2.m((a2) l14.f13523v);
                a2Var = (a2) l14.a();
                xVar.f13598b = a2Var;
            }
            l12.b();
            r((b2) l12.f13523v, a2Var);
            w1 w1Var = xVar.f13600d;
            if (w1Var == null) {
                v1 l15 = w1.l();
                int i11 = Build.VERSION.SDK_INT;
                l15.b();
                w1.m((w1) l15.f13523v, i11);
                String str3 = Build.MODEL;
                l15.b();
                w1.n((w1) l15.f13523v);
                l15.b();
                w1.p((w1) l15.f13523v);
                String str4 = Build.VERSION.RELEASE;
                l15.b();
                w1.o((w1) l15.f13523v);
                w1Var = (w1) l15.a();
                xVar.f13600d = w1Var;
            }
            l12.b();
            p((b2) l12.f13523v, w1Var);
            t1 t1Var = xVar.f13599c;
            if (t1Var == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    s1 l16 = t1.l();
                    if (Build.VERSION.SDK_INT >= 28) {
                        j10 = packageInfo.getLongVersionCode();
                    } else {
                        j10 = packageInfo.versionCode;
                    }
                    String l17 = Long.toString(j10);
                    l16.b();
                    t1.n((t1) l16.f13523v, l17);
                    l16.b();
                    t1.m((t1) l16.f13523v, packageName);
                    xVar.f13599c = (t1) l16.a();
                }
                t1Var = xVar.f13599c;
            }
            if (t1Var != null) {
                l12.b();
                o((b2) l12.f13523v, t1Var);
            }
            String string = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string != null && !string.isEmpty()) {
                g0 g0Var = new g0(string);
                while (g0Var.hasNext()) {
                    String str5 = (String) g0Var.next();
                    l12.b();
                    m((b2) l12.f13523v, str5);
                }
            }
            b2 b2Var = (b2) l12.a();
            l11.b();
            p2.m((p2) l11.f13523v, b2Var);
            long currentTimeMillis2 = System.currentTimeMillis();
            l11.b();
            p2.n((p2) l11.f13523v, currentTimeMillis2);
            queue2.add((p2) l11.a());
            if (this.e) {
                ((ArrayDeque) this.f13616l.get()).addAll((Collection) atomicReference.get());
            }
            this.f13610d.execute(new h(1, this));
        }
    }
}
