package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.daren.scraply.MainActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import ya.da;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements xb.b, e7 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f13487u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f13488v;

    public /* synthetic */ m(Object obj, Object obj2) {
        this.f13487u = obj;
        this.f13488v = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.consent_sdk.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [j6.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.consent_sdk.v, java.lang.Object] */
    public c a(MainActivity mainActivity, n8.m mVar) {
        boolean z3;
        Bundle bundle;
        String str;
        Collection collection;
        PackageInfo packageInfo;
        long j10;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        Application application = (Application) this.f13487u;
        ArrayList arrayList = new ArrayList();
        Context applicationContext = application.getApplicationContext();
        if (z.d() || arrayList.contains(z.a(applicationContext))) {
            z3 = true;
        } else {
            z3 = false;
        }
        c cVar = new c(3);
        cVar.f13375z = Collections.EMPTY_MAP;
        cVar.D = Collections.EMPTY_LIST;
        String str2 = null;
        if (!TextUtils.isEmpty(null)) {
            str = null;
        } else {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                throw new l1(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        cVar.f13371v = str;
        if (!z3) {
            collection = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(u.f13573u);
            collection = arrayList2;
        }
        cVar.D = collection;
        cVar.f13375z = ((g) this.f13488v).a();
        cVar.f13374y = Boolean.FALSE;
        cVar.f13373x = Locale.getDefault().toLanguageTag();
        b0.e1 e1Var = new b0.e1(4, (char) 0);
        e1Var.f1179b = 1;
        int i = Build.VERSION.SDK_INT;
        e1Var.f1181d = Integer.valueOf(i);
        e1Var.f1180c = Build.MODEL;
        e1Var.f1179b = 2;
        cVar.f13372w = e1Var;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        ?? obj = new Object();
        Object obj2 = Collections.EMPTY_LIST;
        obj.f18927x = obj2;
        obj.f18924u = Integer.valueOf(configuration.screenWidthDp);
        obj.f18925v = Integer.valueOf(configuration.screenHeightDp);
        obj.f18926w = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i >= 28) {
            Window window = mainActivity.getWindow();
            if (window == null) {
                decorView = null;
            } else {
                decorView = window.getDecorView();
            }
            if (decorView == null) {
                rootWindowInsets = null;
            } else {
                rootWindowInsets = decorView.getRootWindowInsets();
            }
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                obj2 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        ?? obj3 = new Object();
                        obj3.f13578b = Integer.valueOf(rect.left);
                        obj3.f13579c = Integer.valueOf(rect.right);
                        obj3.f13577a = Integer.valueOf(rect.top);
                        obj3.f13580d = Integer.valueOf(rect.bottom);
                        obj2.add(obj3);
                    }
                }
            }
        }
        obj.f18927x = obj2;
        cVar.A = obj;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        ?? obj4 = new Object();
        obj4.f13569a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        if (applicationLabel != null) {
            str2 = applicationLabel.toString();
        }
        obj4.f13570b = str2;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = packageInfo.getLongVersionCode();
            } else {
                j10 = packageInfo.versionCode;
            }
            obj4.f13571c = Long.toString(j10);
        }
        cVar.B = obj4;
        cVar.C = new j4(23);
        return cVar;
    }

    @Override // xb.b
    public void c(k kVar) {
        String str;
        MainActivity mainActivity = (MainActivity) this.f13487u;
        e7.e eVar = (e7.e) this.f13488v;
        kVar.getClass();
        d0.a();
        ((Queue) kVar.f13465f.f13613h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!kVar.i.compareAndSet(false, true)) {
            if (true != kVar.f13471m) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            l1 l1Var = new l1(3, str);
            kVar.c(l1Var);
            eVar.a(l1Var.a());
            return;
        }
        q qVar = kVar.f13467h;
        b6.u uVar = qVar.f13529v;
        Objects.requireNonNull(uVar);
        qVar.f13528u.post(new p(uVar, 0));
        i iVar = new i(kVar, mainActivity);
        kVar.f13461a.registerActivityLifecycleCallbacks(iVar);
        kVar.f13470l.set(iVar);
        kVar.f13462b.f13534a = mainActivity;
        Dialog dialog = new Dialog(mainActivity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(kVar.f13467h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            l1 l1Var2 = new l1(3, "Activity with null windows is passed in.");
            kVar.c(l1Var2);
            eVar.a(l1Var2.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        da.a(window, false);
        kVar.f13469k.set(eVar);
        dialog.show();
        kVar.f13466g = dialog;
        kVar.f13467h.a("UMP_messagePresented", "");
        kVar.c(null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public Object zzb() {
        r rVar = (r) ((d7) this.f13487u).zzb();
        Handler handler = d0.f13387a;
        f0.c(handler);
        return new q(rVar, handler, ((g9.n) this.f13488v).zzb());
    }
}
