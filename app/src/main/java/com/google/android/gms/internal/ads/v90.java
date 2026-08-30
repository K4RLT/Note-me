package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v90 implements s60, w80 {
    public final qp0 A;

    /* renamed from: u, reason: collision with root package name */
    public final uw f11858u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f11859v;

    /* renamed from: w, reason: collision with root package name */
    public final ww f11860w;

    /* renamed from: x, reason: collision with root package name */
    public final View f11861x;

    /* renamed from: y, reason: collision with root package name */
    public String f11862y;

    /* renamed from: z, reason: collision with root package name */
    public final kj f11863z;

    public v90(uw uwVar, Context context, ww wwVar, WebView webView, kj kjVar, qp0 qp0Var) {
        this.f11858u = uwVar;
        this.f11859v = context;
        this.f11860w = wwVar;
        this.f11861x = webView;
        this.f11863z = kjVar;
        this.A = qp0Var;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
        if (this.A.G0) {
            this.f11858u.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
        if (this.A.G0) {
            View view = this.f11861x;
            if (view != null && this.f11862y != null) {
                Context context = view.getContext();
                String str = this.f11862y;
                ww wwVar = this.f11860w;
                AtomicReference atomicReference = wwVar.f12347h;
                if (wwVar.a(context) && (context instanceof Activity) && wwVar.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = wwVar.i;
                    Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            wwVar.l("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        wwVar.l("setCurrentScreen", false);
                    }
                }
            }
            this.f11858u.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void d() {
        String str;
        kj kjVar = kj.APP_OPEN;
        kj kjVar2 = this.f11863z;
        if (kjVar2 != kjVar && this.A.G0) {
            ww wwVar = this.f11860w;
            Context context = this.f11859v;
            String str2 = "";
            if (wwVar.a(context)) {
                AtomicReference atomicReference = wwVar.f12346g;
                if (wwVar.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str3 = (String) wwVar.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str3 == null) {
                            str3 = (String) wwVar.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str3 != null) {
                            str2 = str3;
                        }
                    } catch (Exception unused) {
                        wwVar.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f11862y = str2;
            if (kjVar2 == kj.REWARD_BASED_VIDEO_AD) {
                str = "/Rewarded";
            } else {
                str = "/Interstitial";
            }
            this.f11862y = str2.concat(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
        ww wwVar = this.f11860w;
        Context context = this.f11859v;
        if (wwVar.a(context) && this.A.G0) {
            try {
                wwVar.e(context, wwVar.d(context), this.f11858u.f11735w, ivVar.f7231u, ivVar.f7232v);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.g("Remote Exception to get reward item.", e);
            }
        }
    }
}
