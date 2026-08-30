package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ml implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8369a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f8370b = null;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f8371c = new JSONObject();

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (this.f8369a) {
            try {
                if (this.f8370b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                s6 s6Var = g9.r.e.f17697b;
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException e) {
                    l9.i.g("", e);
                    sharedPreferences = null;
                }
                this.f8370b = sharedPreferences;
                if (sharedPreferences != null) {
                    try {
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        try {
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                            String string = sharedPreferences.getString("flag_configuration", "{}");
                            StrictMode.setThreadPolicy(threadPolicy);
                            this.f8371c = new JSONObject(string);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (!((Boolean) wm.f12282b.p()).booleanValue() && (sharedPreferences2 = this.f8370b) != null) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str) && sharedPreferences != null) {
            try {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                    String string = sharedPreferences.getString("flag_configuration", "{}");
                    StrictMode.setThreadPolicy(threadPolicy);
                    this.f8371c = new JSONObject(string);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (JSONException unused) {
            }
        }
    }
}
