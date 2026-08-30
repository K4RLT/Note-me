package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nl {

    /* renamed from: a, reason: collision with root package name */
    public final int f8748a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8749b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8750c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8751d;
    public final /* synthetic */ int e;

    public nl(int i, Object obj, Object obj2, String str) {
        this.f8748a = i;
        this.f8749b = str;
        this.f8750c = obj;
        this.f8751d = obj2;
        ((ArrayList) g9.r.e.f17696a.f6872v).add(this);
    }

    public static nl e(String str, int i, int i10) {
        return new nl(1, 1, Integer.valueOf(i), Integer.valueOf(i10), str);
    }

    public static nl f(long j10, long j11, String str) {
        return new nl(1, 2, Long.valueOf(j10), Long.valueOf(j11), str);
    }

    public static nl g(String str, float f10, float f11) {
        return new nl(1, 3, Float.valueOf(f10), Float.valueOf(f11), str);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) g9.r.e.f17696a.f6873w).add(new nl(1, 4, obj, obj, "gads:sdk_core_constants:experiment_id"));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) g9.r.e.f17696a.f6874x).add(new nl(1, 4, obj, obj, "gads:sdk_core_constants_service:experiment_id"));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f8749b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f8749b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f8749b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f8749b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f8749b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f8749b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f8749b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f8749b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f8749b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f8749b, (String) c());
        }
    }

    public final Object c() {
        if (g9.r.e.f17698c.i) {
            return this.f8751d;
        }
        return this.f8750c;
    }

    public final Object d() {
        return g9.r.e.f17698c.a(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl(int i, int i10, Object obj, Object obj2, String str) {
        this(i, obj, obj2, str);
        this.e = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nl(String str, String str2, String str3) {
        this(1, str2, str3, str);
        this.e = 4;
    }
}
