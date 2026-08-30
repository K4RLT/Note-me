package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zw {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13284a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13285b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f13286c;

    /* renamed from: d, reason: collision with root package name */
    public final x90 f13287d;

    public zw(Context context, x90 x90Var) {
        this.f13286c = context;
        this.f13287d = x90Var;
    }

    public final synchronized void a(String str) {
        SharedPreferences sharedPreferences;
        try {
            HashMap hashMap = this.f13284a;
            if (hashMap.containsKey(str)) {
                return;
            }
            boolean equals = Objects.equals(str, "__default__");
            Context context = this.f13286c;
            if (equals) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            } else {
                sharedPreferences = context.getSharedPreferences(str, 0);
            }
            xw xwVar = new xw(this, str);
            hashMap.put(str, xwVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(xwVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
