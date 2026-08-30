package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class yf0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12864a;

    /* renamed from: b, reason: collision with root package name */
    public u f12865b;

    public yf0(Context context) {
        this.f12864a = context;
    }

    public final void a(tf tfVar) {
        ServiceInfo serviceInfo;
        u uVar = this.f12865b;
        Context context = (Context) uVar.f11498v;
        if (uVar.a()) {
            an1.k("Service connection is valid. No need to re-initialize.");
            tfVar.i(0);
            return;
        }
        int i = uVar.f11497u;
        if (i == 1) {
            an1.u("Client is already in the process of connecting to the service.");
            tfVar.i(3);
            return;
        }
        if (i == 3) {
            an1.u("Client was already closed and can't be reused. Please create another instance.");
            tfVar.i(3);
            return;
        }
        an1.k("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null) {
                try {
                    if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent2 = new Intent(intent);
                        oa oaVar = new oa(uVar, tfVar);
                        uVar.f11501y = oaVar;
                        try {
                            if (context.bindService(intent2, oaVar, 1)) {
                                an1.k("Service was bonded successfully.");
                                return;
                            }
                            an1.u("Connection to service is blocked.");
                            uVar.f11497u = 0;
                            tfVar.i(1);
                            return;
                        } catch (SecurityException unused) {
                            an1.u("No permission to connect to service.");
                            uVar.f11497u = 0;
                            tfVar.i(4);
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            an1.u("Play Store missing or incompatible. Version 8.3.73 or later required.");
            uVar.f11497u = 0;
            tfVar.i(2);
            return;
        }
        uVar.f11497u = 0;
        an1.k("Install Referrer service unavailable on device.");
        tfVar.i(2);
    }
}
