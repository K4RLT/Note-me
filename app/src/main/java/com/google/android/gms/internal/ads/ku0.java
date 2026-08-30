package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class ku0 implements fu0 {

    /* renamed from: d, reason: collision with root package name */
    public static ku0 f7877d;

    /* renamed from: a, reason: collision with root package name */
    public float f7878a;

    /* renamed from: b, reason: collision with root package name */
    public bu0 f7879b;

    /* renamed from: c, reason: collision with root package name */
    public eu0 f7880c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.ku0, java.lang.Object] */
    public static ku0 b() {
        if (f7877d == null) {
            com.google.android.gms.internal.ads.ku0 obj = new Object();
            obj.f7878a = 0.0f;
            f7877d = obj;
        }
        return f7877d;
    }

    @Override // com.google.android.gms.internal.ads.fu0
    public final void a(boolean z3) {
        if (z3) {
            vu0.f12002f.getClass();
            vu0.b();
            return;
        }
        vu0.f12002f.getClass();
        Handler handler = vu0.f12004h;
        if (handler != null) {
            handler.removeCallbacks(vu0.f12005j);
            vu0.f12004h = null;
        }
    }
}
