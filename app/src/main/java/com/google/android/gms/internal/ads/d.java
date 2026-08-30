package com.google.android.gms.internal.ads;
import bc.g;
import c.a;
import dd.c;
import de.q;
import eb.q0;
import eb.y;
import fa.y;
import g.a;
import ic.l;
import j.m0;
import l4.a;
import m.g;
import m.j;
import pc.d;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements l, p2 {

    /* renamed from: u, reason: collision with root package name */
    public boolean f5229u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5230v;

    /* renamed from: w, reason: collision with root package name */
    public Object f5231w;

    /* renamed from: x, reason: collision with root package name */
    public Object f5232x;

    public d(int i) {
        switch (i) {
            case 7:
                this.f5230v = new Intent("android.intent.action.VIEW");
                this.f5231w = new eb.y(29);
                this.f5229u = true;
                return;
            case 10:
                this.f5230v = new Object();
                this.f5231w = new ArrayList();
                this.f5232x = new ArrayList();
                this.f5229u = true;
                return;
            default:
                this.f5230v = new Object();
                this.f5231w = new ArrayDeque();
                this.f5232x = new AtomicReference();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.p2
    public i3 A(int i, int i10) {
        p2 p2Var = (p2) this.f5230v;
        if (i10 != 3 && i10 != 5) {
            this.f5229u = true;
        }
        if (i10 != 3) {
            return p2Var.A(i, i10);
        }
        SparseArray sparseArray = (SparseArray) this.f5232x;
        s7 s7Var = (s7) sparseArray.get(i);
        if (s7Var != null) {
            return s7Var;
        }
        s7 s7Var2 = new s7(p2Var.A(i, 3), (o7) this.f5231w);
        sparseArray.put(i, s7Var2);
        return s7Var2;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public void B(a3 a3Var) {
        ((p2) this.f5230v).B(a3Var);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.iw a() {
        String str;
        Bundle bundle;
        Intent intent = (Intent) this.f5230v;
        Bundle bundle2 = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f5229u);
        ((eb.y) this.f5231w).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            str = adjustedDefault.get(0).toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                bundle = intent.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", str);
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.f5232x) == null) {
                this.f5232x = ActivityOptions.makeBasic();
            }
            c.a.i((ActivityOptions) this.f5232x);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.f5232x) == null) {
                this.f5232x = ActivityOptions.makeBasic();
            }
            m.g.a((ActivityOptions) this.f5232x, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f5232x;
        if (activityOptions != null) {
            bundle2 = activityOptions.toBundle();
        }
        return new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(intent, 17, bundle2);
    }

    public synchronized void b() {
        try {
            if (this.f5229u) {
                return;
            }
            Boolean d2 = d();
            this.f5231w = d2;
            if (d2 == null) {
                l4.a aVar = new l4.a(20);
                ic.l lVar = (ic.l) ((dd.c) this.f5230v);
                lVar.a(lVar.f18412c, aVar);
            }
            this.f5229u = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean c() {
        boolean h3;
        try {
            b();
            Boolean bool = (Boolean) this.f5231w;
            if (bool != null) {
                h3 = bool.booleanValue();
            } else {
                h3 = ((FirebaseMessaging) this.f5232x).f15598a.h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return h3;
    }

    public Boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        bc.g gVar = ((FirebaseMessaging) this.f5232x).f15598a;
        gVar.a();
        Context context = gVar.f3177a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void e(Runnable runnable, Executor executor) {
        synchronized (this.f5230v) {
            try {
                if (this.f5229u) {
                    ((ArrayDeque) this.f5231w).add(new de.q(runnable, executor));
                } else {
                    this.f5229u = true;
                    l(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.android.gms.internal.measurement.k4 f(long j10, String str) {
        Long valueOf = Long.valueOf(j10);
        Object obj = com.google.android.gms.internal.measurement.k4.f13797g;
        return new com.google.android.gms.internal.measurement.k4(this, str, valueOf, 1);
    }

    public com.google.android.gms.internal.measurement.k4 g(String str, String str2) {
        Object obj = com.google.android.gms.internal.measurement.k4.f13797g;
        return new com.google.android.gms.internal.measurement.k4(this, str, str2, 2);
    }

    public com.google.android.gms.internal.measurement.k4 h(String str, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        Object obj = com.google.android.gms.internal.measurement.k4.f13797g;
        return new com.google.android.gms.internal.measurement.k4(this, str, valueOf, 0);
    }

    public String i() {
        if (!this.f5229u) {
            this.f5229u = true;
            this.f5231w = ((eb.q0) this.f5232x).D().getString((String) this.f5230v, null);
        }
        return (String) this.f5231w;
    }

    public void j(String str) {
        SharedPreferences.Editor edit = ((eb.q0) this.f5232x).D().edit();
        edit.putString((String) this.f5230v, str);
        edit.apply();
        this.f5231w = str;
    }

    public void k() {
        synchronized (this.f5230v) {
            try {
                if (((ArrayDeque) this.f5231w).isEmpty()) {
                    this.f5229u = false;
                    return;
                }
                de.q qVar = (de.q) ((ArrayDeque) this.f5231w).remove();
                l(qVar.f15862b, qVar.f15861a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(new pu1(this, 7, runnable));
        } catch (RejectedExecutionException unused) {
            k();
        }
    }

    @Override // com.google.android.gms.internal.ads.l
    public y51 p(int i, hi hiVar, int[] iArr) {
        p pVar = (p) this.f5230v;
        j jVar = (j) this.f5231w;
        e eVar = new e(pVar, jVar);
        int i10 = ((int[]) this.f5232x)[i];
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < hiVar.f6819a) {
            int i13 = i;
            hi hiVar2 = hiVar;
            b bVar = new b(i13, hiVar2, i11, jVar, iArr[i11], this.f5229u, eVar);
            int length = objArr.length;
            int i14 = i12 + 1;
            int d2 = y41.d(length, i14);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i12] = bVar;
            i11++;
            i12 = i14;
            i = i13;
            hiVar = hiVar2;
        }
        return d51.w(objArr, i12);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public void z() {
        ((p2) this.f5230v).z();
        if (this.f5229u) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) this.f5232x;
                if (i < sparseArray.size()) {
                    ((s7) sparseArray.valueAt(i)).i = true;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public d(jb jbVar) {
        this.f5229u = false;
        this.f5230v = null;
        this.f5231w = null;
        this.f5232x = jbVar;
    }

    public d(Object obj, xa xaVar) {
        this.f5229u = false;
        this.f5230v = obj;
        this.f5231w = xaVar;
        this.f5232x = null;
    }

    public /* synthetic */ d(p pVar, j jVar, boolean z3, int[] iArr) {
        this.f5230v = pVar;
        this.f5231w = jVar;
        this.f5229u = z3;
        this.f5232x = iArr;
    }

    public d(p2 p2Var, o7 o7Var) {
        this.f5230v = p2Var;
        this.f5231w = o7Var;
        this.f5232x = new SparseArray();
    }

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager p10 = context == null ? null : xy.p(context);
        if (p10 != null && (bool == null || !bool.booleanValue())) {
            Spatializer c10 = l0.c(p10);
            this.f5230v = c10;
            this.f5229u = l0.a(c10) != 0;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.f5231w = handler;
            j0 j0Var = new j0(this, runnable);
            this.f5232x = j0Var;
            l0.h(c10, new k0(handler, 0), j0Var);
            return;
        }
        this.f5230v = null;
        this.f5229u = false;
        this.f5231w = null;
        this.f5232x = null;
    }

    public d(eb.q0 q0Var, String str) {
        this.f5232x = q0Var;
        fa.y.e(str);
        this.f5230v = str;
    }

    public d(Uri uri, String str, String str2, boolean z3, boolean z9) {
        this.f5230v = uri;
        this.f5231w = str;
        this.f5232x = str2;
        this.f5229u = z3;
    }

    public d(j.m0 m0Var, boolean z3) {
        this.f5232x = m0Var;
        this.f5231w = new AtomicReference(null);
        this.f5229u = z3;
        this.f5230v = new AtomicMarkableReference(new pc.d(z3 ? 8192 : 1024), false);
    }

    public d(FirebaseMessaging firebaseMessaging, dd.c cVar) {
        this.f5232x = firebaseMessaging;
        this.f5230v = cVar;
    }

    public d(m.j jVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f5230v = intent;
        this.f5231w = new eb.y(29);
        this.f5229u = true;
        if (jVar != null) {
            intent.setPackage(jVar.f20418d.getPackageName());
            IBinder asBinder = jVar.f20417c.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
            intent.putExtras(bundle);
        }
    }
}
