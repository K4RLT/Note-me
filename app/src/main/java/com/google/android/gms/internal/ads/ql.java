package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ql implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f9871g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9866a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f9867b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9868c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f9869d = false;
    public SharedPreferences e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f9870f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f9872h = new JSONObject();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9873j = false;

    public final Object a(nl nlVar) {
        if (!this.f9867b.block(5000L)) {
            synchronized (this.f9866a) {
                try {
                    if (!this.f9869d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f9868c || this.e == null || this.f9873j) {
            synchronized (this.f9866a) {
                if (this.f9868c && this.e != null && !this.f9873j) {
                }
                return nlVar.c();
            }
        }
        int i = nlVar.f8748a;
        if (i == 2) {
            Bundle bundle = this.f9870f;
            if (bundle == null) {
                return nlVar.c();
            }
            switch (nlVar.e) {
                case 0:
                    String str = nlVar.f8749b;
                    if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(str))) {
                        return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str)));
                    }
                    return (Boolean) nlVar.c();
                case 1:
                    String str2 = nlVar.f8749b;
                    if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2))) {
                        return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2)));
                    }
                    return (Integer) nlVar.c();
                case 2:
                    String str3 = nlVar.f8749b;
                    if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3))) {
                        return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3)));
                    }
                    return (Long) nlVar.c();
                case 3:
                    String str4 = nlVar.f8749b;
                    if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4))) {
                        return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4)));
                    }
                    return (Float) nlVar.c();
                default:
                    String str5 = nlVar.f8749b;
                    if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5))) {
                        return bundle.getString("com.google.android.gms.ads.flag.".concat(str5));
                    }
                    return (String) nlVar.c();
            }
        }
        if (i == 1 && this.f9872h.has(nlVar.f8749b)) {
            return nlVar.a(this.f9872h);
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return nlVar.b(this.e);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final Object b(nl nlVar) {
        if (!this.f9868c && !this.f9869d) {
            return nlVar.c();
        }
        return a(nlVar);
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
                    this.f9872h = new JSONObject(string);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (JSONException unused) {
            }
        }
    }
}
