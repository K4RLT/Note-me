package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.daren.scraply.R;
import java.util.HashMap;
import q.x;
import qb.d;
import qb.i;
import qb.q;
import qb.r;
import ya.la;

/* loaded from: classes.dex */
public class HsdpShimActivity extends Activity {

    /* renamed from: u, reason: collision with root package name */
    public String f15584u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15585v = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [qb.a, j6.i, java.lang.Object] */
    public final void a(boolean z3) {
        HashMap hashMap;
        i iVar;
        IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("target_package_name");
            if (stringExtra != null) {
                q a10 = r.a(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
                if (!z3 && stringExtra.equals(this.f15584u) && (iVar = (i) ((d) a10).f23628c.get(stringExtra)) != null && iVar.f23642a == 2) {
                    if (Log.isLoggable("HsdpShimActivity", 4)) {
                        Log.i("HsdpShimActivity", "HSDP is already showing for " + stringExtra + ", ignore.");
                        return;
                    }
                    return;
                }
                this.f15584u = stringExtra;
                this.f15585v = false;
                String stringExtra2 = intent.getStringExtra("referrer");
                if (stringExtra2 != null) {
                    String stringExtra3 = intent.getStringExtra("deeplink_url");
                    if (stringExtra3 != null) {
                        boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
                        Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
                        if (bundleExtra != null) {
                            hashMap = new HashMap();
                            for (String str : bundleExtra.keySet()) {
                                String string = bundleExtra.getString(str);
                                if (string == null) {
                                    string = "";
                                }
                                hashMap.put(str, string);
                            }
                        } else {
                            hashMap = null;
                        }
                        int a11 = la.a(this, getResources().getConfiguration().screenWidthDp);
                        int b10 = la.b(this);
                        Object obj = new Object();
                        obj.f18924u = stringExtra;
                        obj.f18925v = stringExtra2;
                        obj.f18926w = hashMap;
                        obj.f18927x = this;
                        ((d) a10).a(stringExtra, stringExtra3, windowToken, a11, b10, booleanExtra, obj);
                        return;
                    }
                    x.o("deeplinkUrl is null");
                    return;
                }
                x.o("referrer is null");
                return;
            }
            x.o("targetPackageName is null");
            return;
        }
        x.o("windowToken is null");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("HsdpShimActivity", "shim activity onAttachedToWindow");
        a(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.i("HsdpShimActivity", "shim activity onConfigurationChanged");
        a(true);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hsdp_shim_activity);
        Window window = getWindow();
        window.setLayout(-1, -1);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Log.i("HsdpShimActivity", "shim activity onDestroy");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("HsdpShimActivity", "shim activity onNewIntent");
        setIntent(intent);
        a(false);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        Log.i("HsdpShimActivity", "shim activity onPause");
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Log.i("HsdpShimActivity", "shim activity onResume");
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Log.i("HsdpShimActivity", "shim activity onStart");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        Log.i("HsdpShimActivity", "shim activity onStop");
    }
}