package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class nu0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8867a;

    /* renamed from: c, reason: collision with root package name */
    public long f8869c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f8870d = 1;

    /* renamed from: b, reason: collision with root package name */
    public av0 f8868b = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.ref.WeakReference, com.google.android.gms.internal.ads.av0] */
    public nu0(String str) {
        this.f8867a = str;
    }

    public void a() {
    }

    public void b() {
        this.f8868b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f8868b.get();
    }

    public void d(tt0 tt0Var, a8 a8Var) {
        e(tt0Var, a8Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.ads.tt0 r10, com.google.android.gms.internal.ads.a8 r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu0.e(com.google.android.gms.internal.ads.tt0, com.google.android.gms.internal.ads.a8, org.json.JSONObject):void");
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        su0.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        s6.A.C(c(), "setLastActivity", jSONObject);
    }
}
